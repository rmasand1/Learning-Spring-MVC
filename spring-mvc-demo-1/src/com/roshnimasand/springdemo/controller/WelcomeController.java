package com.roshnimasand.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.roshni.service.demo.GenericWelcomeService;
import com.roshni.service.demo.WelcomeService;

@Controller
public class WelcomeController {

	@Autowired
	private GenericWelcomeService welcomeService;
	@RequestMapping("/")
	public String doWelcome(Model model){
		
		//1. Retrieving the process data
		//WelcomeService welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Roshni");
		
		//2. Add data to model
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		//3. Return the logical view
		return "welcomeNew";
		
	}
}
