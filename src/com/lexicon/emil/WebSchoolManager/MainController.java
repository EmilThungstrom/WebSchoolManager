package com.lexicon.emil.WebSchoolManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String mainMenu() {
		return "main-menu";
	}
}
