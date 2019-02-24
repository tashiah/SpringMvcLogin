package com.program.demo.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.context.annotation.Scope;

import com.program.demo.delegate.LoginDelegate;
import com.program.demo.model.LoginBean;

@Controller
public class LoginController {
	
	@Autowired
	private LoginDelegate loginDelegate;
	

	@GetMapping("/")
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("login2");
		LoginBean loginbean=new LoginBean();
		model.addObject("loginBean", loginbean);
		return model;
	}
	
	@GetMapping("/admin")
    public String adminPanel(HttpSession session)
	{
		if(session.getAttribute("user") == null)
			return "redirect:/";
		return "welcome";
	}
	
	@PostMapping("/login")
	public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("loginBean")LoginBean loginBean)
	{
			ModelAndView model= null;
			try
			{
					boolean isValidUser = loginDelegate.isValidUser(loginBean.getUsername(), loginBean.getPassword());
					if(isValidUser)
					{
							System.out.println("User Login Successful");
							//request.setAttribute("loggedInUser", loginBean.getUsername());
						
							HttpSession session=request.getSession();
//							request.getSession().setAttribute("user", loginBean.getUsername());
							session.setAttribute("user", loginBean.getUsername());
							
							model = new ModelAndView("welcome");
					}
					else
					{
							model = new ModelAndView("login2");
							request.setAttribute("message", "Invalid credentials!!");
					}

			}
			catch(Exception e)
			{
					e.printStackTrace();
			}

			return model;
	}
	
	@GetMapping("/logout")
	public String loggingout(HttpSession session ) {
		System.out.println("logging out...");
		session.removeAttribute("user");
	    session.invalidate();
	    return "redirect:/";
	} 
	
}
