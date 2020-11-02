package jp.co.emozon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TopPageController{
	
	   @RequestMapping(value = "message", method = RequestMethod.GET)
	   
       public ModelAndView messages() {
		   
		   
           ModelAndView modelAndView = new ModelAndView("top_page");
           modelAndView.addObject("messages","Hello");
           
           return modelAndView;
       }
		
}