package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext co= new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		
		Student student = co.getBean("obj",Student.class);
		System.out.println(student);
	}
	
}
