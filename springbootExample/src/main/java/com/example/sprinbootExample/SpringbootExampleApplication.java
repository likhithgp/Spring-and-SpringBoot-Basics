package com.example.sprinbootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootExampleApplication {

	public static void main(String[] args) {
		/*
		 * This responsiable for Creating object of all @Component with
		 *  @SCope type "Singleton when apllication is satrted
		 */
		 ConfigurableApplicationContext cont= SpringApplication.run(SpringbootExampleApplication.class, args);
		
		 
		 
		 /*
		  * In @SCope type "Singleton"  Below getBean() is not reponsiable for object creation
		  * It will just get Bean from IOC container, To verify Comment below line
		  * still you can see "Company Object created" in console from constructor
		  * 
		  * If @Scope type is "Prototype" then object is created at every getBean()  call
		  */
		 
		  Company c=cont.getBean(Company.class);
		   c.name();
		 
		   /*
		    * IN @SCope type "Singleton" The getBean() will not create object thus You can see "Company Object created" constructor call
		    *  oncein console eventhrough You calling getBean() twice.
		    *  
		    *  If @Scope type is "Prototype" then object is created at every getBean()  call
		    *  
 		    */
		 Company c2=cont.getBean(Company.class);
		 c2.name();
		 
		 /*
		  * To show  @Scope type is "Prototype" Example
		  * 
		  */
		 
		 Student s=cont.getBean(Student.class);
		 s.name();
		 Student s1=cont.getBean(Student.class);
		 s1.name();
	}

}
