package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String home(Model model) {

		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user(Employee e, Model model) {
		System.out.println(e.getUserName());
		model.addAttribute("userName", e.getUserName());
		return "user";
	}
}
