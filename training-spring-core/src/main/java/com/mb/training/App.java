package com.mb.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mb.training.bean.Employee;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration.xml");

		withoutSpring();
		
		Employee emp = (Employee) context.getBean("employee");
		
		System.out.println(emp);

	}

	private static void withoutSpring() {
		
		Employee emp = new Employee();
		emp.setAge(5);
		emp.setName("Manoj");
		
		System.out.println(emp);
		
	}
}
