package com.telusko.springCompletlyAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	 * @Class AnnotationConfigApplicationContext will take configuration class as an argument
    	 */
        ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);
        
        /*
         * In this Annoation based we use pas class name as parameter to getBean() method
         */
        GooglePixel g=factory.getBean(GooglePixel.class);
        g.config();
    }
}
