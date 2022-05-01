package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	// 1)
//	@RequestMapping("home")
//	public void home() {
//		System.out.println("hi");
//	}
	
	// 2)
//	@RequestMapping("home")									// whenever a request is made for localhost:8080/home
//	public String home() {
//		return "home.jsp";
//	}
	
	// 4)
//	@RequestMapping("home")									
//	public String home(HttpServletRequest req) {
//	
//		HttpSession session = req.getSession();					// 4.f)
//		
//		String name = req.getParameter("name");
//		System.out.println("hi " + name);
//		
//		session.setAttribute("name", name);														// 4.f)
//		
//		
//		return "home.jsp";
//	}
	
	// 5)
//	@RequestMapping("home")									
//	public String home(@RequestParam("name") String name,HttpSession session	) {
//		
//		System.out.println("hi " + name);			
//		session.setAttribute("name", name);														
//		return "home.jsp";
//		
//	}
	
	// 5.c)
//	@RequestMapping("home")									
//	public ModelAndView home(@RequestParam("name") String name) {
//		
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name",name);
//		mv.setViewName("home.jsp");												// if application.properties has suffix declared don't write .jsp in this line
//		return mv;
//		
//	}
	
	// 6)
	@RequestMapping("home")									
	public ModelAndView home(Student student) {
			
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",student);
		mv.setViewName("home.jsp");												
		return mv;
			
		}
	
}
