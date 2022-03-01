package com.telusko.springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	/*
    	 * Application context is an superset of Beanfactory.
    	 * Appliaction contex is responsiable creting bean for dependency injection
    	 */
    	//BeanFactory or
       ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
       
       /*
        * Below two are XML based configuration
        * 
        */
       //getBean() parameter is taken form spring.xml -->bean tag-->id value
       Vechical v=(Vechical)context.getBean("vechical");
       v.drive();    
       
       //In XML car Model class is made as Bean using <bean id="v" class="com.telusko.springDemo.Car"></bean>
       Vechical v1=(Vechical)context.getBean("v");
       v1.drive();
       
       
       /*
        * Below are Annotation based Configuration
        */
       
       Vechical v2=(Vechical) context.getBean("aeroplane");
       v2.drive();
       Vechical v3=(Vechical) context.getBean("train");
       v3.drive();
       
       /*
        * Model class with Variable getting value from XML from Property Tag
        * which is inside bean tag of respective class value
        */
       
       Tyre t=(Tyre) context.getBean("tyre");
       /*
        * It will print Tyre [brand=MRF] where outPut MRF came form XML file atribute
        * <property name="brand" value="MRF"></property> getter based injection
        * 
        * It will print Tyre [brand=Ceat] when constructor based XML tag is defined 
        * <constructor-arg value="Ceat"></constructor-arg>
        */
       System.out.println(t);
       
       
       
       /*
        * I want to use Bean in another class;
        * For Example I want to use Tyre in Car class
        */
       Car c=(Car) context.getBean("v");
       c.checkTyre();
       
    }
}
