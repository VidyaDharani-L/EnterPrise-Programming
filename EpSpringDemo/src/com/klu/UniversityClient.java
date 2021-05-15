package com.klu;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UniversityClient {
	public static void main(String args[]) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext1.xml");
		University university = (University)context.getBean("university");
		System.out.println(university);
	}

}
