package com.techwedge;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;

@Controller
public class registerController {
	public volatile static User user=new User();
	
	@RequestMapping("/fpwd")
	 public ModelAndView fpwd(HttpServletRequest req,HttpServletResponse res) {
		 ModelAndView mv=new ModelAndView();
	       try{
	           String host ="smtp.gmail.com" ;
	           String user = "autostore3019@gmail.com";
	           String pass = "kklmn2020";
	           String to = "shastrykrithi2197@gmail.com";
	           String from = "autostore3019@gmail.com";
	           String subject = "This is confirmation number for your expertprogramming account. Please insert this number to activate your account.";
	           String messageText = "Your Is Test Email :";
	           boolean sessionDebug = false;

	           Properties props = System.getProperties();

	           props.put("mail.smtp.starttls.enable", "true");
	           props.put("mail.smtp.host", host);
	           props.put("mail.smtp.port", "587");
	           props.put("mail.smtp.auth", "true");
	           props.put("mail.smtp.starttls.required", "true");

	           java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
	           Session mailSession = Session.getDefaultInstance(props, null);
	           mailSession.setDebug(sessionDebug);
	           Message msg = new MimeMessage(mailSession);
	           msg.setFrom(new InternetAddress(from));
	           InternetAddress[] address = {new InternetAddress(to)};
	           msg.setRecipients(Message.RecipientType.TO, address);
	           msg.setSubject(subject); msg.setSentDate(new Date());
	           msg.setText(messageText);

	          Transport transport=mailSession.getTransport("smtp");
	          transport.connect(host, user, pass);
	          transport.sendMessage(msg, msg.getAllRecipients());
	          transport.close();
	          System.out.println("message send successfully");
	       }catch(Exception ex)
	       {
	           System.out.println(ex);
	       }

	       return mv;
	   }
	
	@RequestMapping("/login")
	public ModelAndView doPost(HttpServletRequest req,HttpServletResponse res) {
		
		ModelAndView mv=new ModelAndView();
		
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		/*
		  String passw=req.getParameter("pass");
		EncrytPwd paw= new EncrytPwd();
		String pass = null;
		try {
			pass = paw.encrypt(passw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		LoginDto1 logindto=new LoginDto1();
	    logindto.setUsername(uname);
	    logindto.setPassword(pass);
	    LoginDao1 ob=new LoginDao1();  
		if(ob.validatelogin(logindto)){
			
			mv.setViewName("success.jsp");
			mv.addObject("name",uname);
			return mv;
		}
		else
			mv.setViewName("errorForm.jsp");
		
		return mv;
	}
	
	@RequestMapping("/func")
	public ModelAndView func(HttpServletRequest request, HttpServletResponse response) {
		//System.out.println("HERE");
		//return "respForm.jsp";
		ModelAndView mv=new ModelAndView();
		
		registerService service=new registerService();
		
		User x=service.addRecord(request, response,user);                                        //add return value
		if(x!=null) {
			mv.setViewName("respForm.jsp");
		}
		else {
			mv.setViewName("errorForm.jsp");
		}
		return mv;
	}
	
	
	
	@RequestMapping("/registered")
	public ModelAndView registered(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mvp=new ModelAndView();
		String value=request.getParameter("submit");
		if(value.equals("Later")) {
			mvp.setViewName("success.jsp");
		}else {
		mvp.setViewName("Profile.jsp");
		}
		return mvp;
	}
	
		@RequestMapping("/concDetails")
		public ModelAndView concDetails(HttpServletRequest request, HttpServletResponse response) {
			//System.out.println("HERE");
			//return "respForm.jsp";
			ModelAndView mvd=new ModelAndView();
			mvd.setViewName("success.jsp");
			
			profileService pservice=new profileService();
			System.out.println("Called"+user);
			System.out.println("Called uname"+user.getUsername());
		
			pservice.updateProfie(request, response, user);
			return mvd;
		
	}
		
		
 
}
