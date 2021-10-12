package com.cg.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Phone iPhone=(Phone)context.getBean("phone");
        iPhone.makeACall();
        iPhone.sendText();
        iPhone.showSimSupportedNetworks();
    }
}
