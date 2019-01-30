package com.sau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;  
import com.dao.*;

@Controller
public class CheckData {

	@Autowired
	UserDao dao;
	
	@RequestMapping(value = "/loginProcess", method = RequestMethod.GET)
	public ModelAndView login()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("validate");
		return mav;
	}
}
