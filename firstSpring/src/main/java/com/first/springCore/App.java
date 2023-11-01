package com.first.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"config.xml"});
//		Student sahid =(Student) context.getBean("sahid");
		Student sonu =(Student) context.getBean("sonu");
		
//		System.out.println(sahid);
		System.out.println(sonu);
		
	}
}
