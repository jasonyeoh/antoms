package com.ant.oms.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ant.oms.entity.Forum;
import com.ant.oms.entity.ForumThread;
import com.ant.oms.service.ForumService;

@RequestMapping("/forum")
@Controller
public class ForumController {
	@Autowired
	ForumService service;

	@RequestMapping("/post/{id}")
	public ModelAndView getPost(@PathVariable("id") long id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("post", service.getPostById(id));
		mav.setViewName("forum/post");
		return mav;
	}

	@RequestMapping("/thread/{id}")
	public ModelAndView getThread(
			@PathVariable("id") long id,
			@RequestParam(defaultValue = "0", required = false, value = "offset") int offset,
			@RequestParam(defaultValue = "-1", required = false, value = "size") int size) {
		ModelAndView mav = new ModelAndView();
		ForumThread thread = service.getThread(id);
		mav.addObject("thread", thread);
		mav.addObject("posts", service.getPostsForThread(thread, offset, size));
		mav.setViewName("forum/thread");
		return mav;
	}

	@RequestMapping("/view/{id}")
	public ModelAndView getForum(@PathVariable("id") long id,
			@RequestParam(defaultValue = "0", required = false, value = "offset") int offset,
			@RequestParam(defaultValue = "-1", required = false, value = "size") int size) {

		ModelAndView mav = new ModelAndView();
		Forum f = service.getForum(id);
		mav.addObject("threads", service.getThreadsForForum(f, offset, size));
		mav.setViewName("forum/list");
		return mav;
	}
}