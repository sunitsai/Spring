package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Person;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		Person p=(Person) a.getBean("person");
		p.callPhone();
	}
}
