package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/refconfig.xml");
		A anew = (A) context.getBean("aref");
		System.out.println(anew.getX()); 
		System.out.println(anew.getOb().getY());
		System.out.println(anew);
	}

}
