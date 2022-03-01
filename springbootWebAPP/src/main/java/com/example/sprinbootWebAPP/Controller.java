package com.example.sprinbootWebAPP;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

	
	/*
	 * @RequestMapping("home") public String home() { System.out.println("HI");
	 * return "home.jsp"; }
	 */
	 
	
	  @RequestMapping("securehome") 
	  public String securehome() {
	  System.out.println("HI");  
		/*
		 * Here scurehome is securehome.jsp page defined inside /webapp/pages Suffix
		 * /.jsp and prefix /pages configured in appliaction.properties
		 */
	       return "securehome"; 
	  }
	 

}
