package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class Test {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autowireconfig.xml");
		Emp emp1 = (Emp) context.getBean("emp1", Emp.class);

		System.out.println(emp1);
	}
}
