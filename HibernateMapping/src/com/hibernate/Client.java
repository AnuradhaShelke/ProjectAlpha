package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		

		System.out.println("Step-1");
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.configure().addAnnotatedClass(Student.class);
		cfg.configure().addAnnotatedClass(Country.class);
		System.out.println("step-2");
		SessionFactory sf=cfg.buildSessionFactory();
		System.out.println("step-3");
		Session ss=sf.openSession();
		
		
		Student student=ss.load(Student.class,1);
		//System.out.println(stud.toString());
		System.out.println(student.getSname());
		System.out.println(student.getSgrade());
		System.out.println(student.getCountry());
		Country country=student.getCountry();
		System.out.println(country.getCname());
		
	}

}
