package com.ant.oms.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ant.oms.entity.Catalog;
import com.ant.oms.service.CatalogService;
import com.ant.oms.service.UIService;

@Controller
@RequestMapping("catalog")
public class CatalogController {
	@Autowired
	private CatalogService catalogService;
	@Autowired
	private UIService uiService;
	
	public void setCatalogService(CatalogService catalogService) {
		this.catalogService = catalogService;
	}
	@RequestMapping("list")
	public ModelAndView list(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("ui", uiService);
		mav.addObject("catalogs",catalogService.getAll());
		mav.setViewName("catalog/list");
		return mav;
	}
	@RequestMapping("new")
	public ModelAndView create(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("ui", uiService);
		mav.addObject("catalog", new Catalog());
		mav.setViewName("catalog/new");
		return mav;
	}
	@RequestMapping("view/{id}")
	public ModelAndView view(@RequestParam(value="id", defaultValue="0") long id ){
		ModelAndView mav = new ModelAndView();
		mav.addObject("ui", uiService);
		mav.addObject("catalog", catalogService.get(id));
		mav.setViewName("catalog/view");
		return mav;
	}
	@RequestMapping("view")
	public ModelAndView processCreate(@RequestParam Catalog catalog){
		ModelAndView mav = new ModelAndView();
		mav.addObject("ui", uiService);
		catalogService.save(catalog); 
		
		mav.addObject("catalog", catalog);
		mav.setViewName("redirect:catalog/view/" + catalog.getId());
		return mav;
		
		
	}
	
}
