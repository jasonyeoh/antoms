package com.ant.oms.web.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ant.oms.service.UIService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	UIService uiservice;
	@PostConstruct
	public void runMe(){
		System.out.println("Running UI Admin");
	}
	@RequestMapping("/main")
	public ModelAndView mainPage(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("uiadmin/main");
		mav.addObject("ui", uiservice);
		return mav;
	}
}
