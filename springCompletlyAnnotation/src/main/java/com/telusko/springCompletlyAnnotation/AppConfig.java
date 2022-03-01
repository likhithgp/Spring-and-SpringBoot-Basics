package com.telusko.springCompletlyAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*
 * @Configuration is used to make this class to do the work of .XMl file
 * To create dependency injectable Bean
 */
@Configuration

/*
 * No need to menation @Bean seprately for all classes just @ComponentScan will scan
 *  all @component classes from path com.telusko.springCompletlyAnnoation and will
 *  make them as bean
 */
@ComponentScan("com.telusko.springCompletlyAnnotation")
public class AppConfig {

	/*
	 *@Bean to Make retuable abject as an Bean
	 */
	/*
	 * @Bean public GooglePixel getPhone() { return new GooglePixel(); }
	 * 
	 * @Bean public MobileProcessor getcpu() { return new SnapDragon(); }
	 */
}
