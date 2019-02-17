package com.lexicon.emil.WebSchoolManager;

import javax.validation.Valid;

import org.hibernate.Session;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/test")
	public String test(Model model) {
		
		Student student;
		Session session = StartupSetup.sessionFactory.openSession();
		try {
			session.beginTransaction();
			student = session.get(Student.class, 1);
			session.getTransaction().commit();
		} finally {
			session.close();
		}
		
		model.addAttribute("student", student);

		return "student-confirmation";
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		model.addAttribute("student", new Student());
		
		return "student-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors())
			return "student-form";
		else
			return "student-confirmation";
	}

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
}
