package com.hiber.second;
 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("motor.xml");
    	Motors mymotor = (Motors)context.getBean("car");
        mymotor.drive();
    	
       
    }
}
