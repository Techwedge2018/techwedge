package com.techwedge;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import com.techwedge.services.makeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class addMake 
{
	@RequestMapping("/indexmake")
	public ModelAndView indexmake()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("indexmake.jsp");
		return mv;	
	}
	
	@RequestMapping("/addmake")
	public ModelAndView addmake()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("addmake.jsp");
		return mv;	
	}
	
	@RequestMapping("/addm")
	public ModelAndView addm(HttpServletRequest request, HttpServletResponse response)
	{
		String makename=request.getParameter("makename");
		makeService ms=new makeService();
		ms.makeser(makename);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("addm.jsp");
		return mv;	
	}

}
