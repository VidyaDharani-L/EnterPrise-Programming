package com.klu;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmployeeClient {
	public static void main(String args[]) {
		//Resource resource=new ClassPathResource("applicationcontext.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		//Employee emp = (Employee)factory.getBean("emp");
		Employee emp = (Employee)context.getBean("emp");

		System.out.println(emp);
	}

}
