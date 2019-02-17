package com.lexicon.emil.WebSchoolManager;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/course")
public class CourseController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		model.addAttribute("course", new Course());
		
		return "course-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("course") Course course, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors())
			return "course-form";
		else
			return "course-confirmation";
	}

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
}
