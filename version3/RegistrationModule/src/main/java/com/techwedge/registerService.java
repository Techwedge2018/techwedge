package com.techwedge;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class registerService {
	//User user= new User();
	
	/*String username="";
	public String disp(HttpServletRequest request, HttpServletResponse response) {
		//ModelAndView mv=new ModelAndView();
		username=request.getParameter("userName");
		return username;*/
	
	public User addRecord(HttpServletRequest request, HttpServletResponse response,User user) {
		
		int return_value=0;
	registerDAO dao=new registerDAO();
	//User user=new User();

	
	String userName=request.getParameter("userName");
	String userEmail=request.getParameter("userEmail");
	String userPassword=request.getParameter("userPassword");
	
	
	user.setName(userName);
	user.setUsername(userEmail);
	user.setPassword(userPassword);
	
	User usr=dao.addToDB(user);
	/*if(f==false) throw new Exception();
	}catch(Exception e) {
		return_value=1;
		
	}*/
	return usr;
	
	

	
	
	

}
}
