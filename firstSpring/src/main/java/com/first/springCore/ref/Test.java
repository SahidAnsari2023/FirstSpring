package com.first.springCore.ref;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext(new String[] {"com/first/springCore/ref/refconfig.xml"});
		A name = (A) con.getBean("aref");
		System.out.println("name.getX(): "+name.getX());
		System.out.println("name.getOb().getY(): "+name.getOb().getY());
		
		B name2 = (B) con.getBean("bref");
		System.out.println("name2.getY(): "+name2.getY());
		System.out.println("name2.toString(): "+name2.toString());
	}

}
