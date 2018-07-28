package com.techwedge;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class registerController {
	User user=new User();
	
	
	@RequestMapping("/func")
	public ModelAndView func(HttpServletRequest request, HttpServletResponse response) {
		//System.out.println("HERE");
		//return "respForm.jsp";
		ModelAndView mv=new ModelAndView();
		mv.setViewName("respForm.jsp");
		
		registerService service=new registerService();
		service.addRecord(request, response,user);
		
		/*String sum=rs.disp(request,response);
		mv.addObject("result",sum);*/
		return mv;
	}
	
	
		@RequestMapping("/concDetails")
		public ModelAndView concDetails(HttpServletRequest request, HttpServletResponse response) {
			//System.out.println("HERE");
			//return "respForm.jsp";
			ModelAndView mvd=new ModelAndView();
			mvd.setViewName("success.jsp");
			
			profileService pservice=new profileService();
			pservice.updateProfie(request, response, user);
			return mvd;
		
	}
		
		
 
}
