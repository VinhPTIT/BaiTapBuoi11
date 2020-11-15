package com.journaldev.spring.main;

import com.journaldev.spring.config.AppConfig;
import com.journaldev.spring.service.CustomerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
//		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
//
//		System.out.println(employeeService.getEmployee().getName());
//		System.out.println("vinh123");
//
//		employeeService.getEmployee().setName("Pankaj");
//
//		employeeService.getEmployee().throwException();
//
//		ctx.close();

//		AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext("spring.xml");
//		ctx1.register(AppConfig.class);
//		System.out.println();
//		//ctx1.refresh();
//		ctx1.close();
		AnnotationConfigApplicationContext ctx1 =
				new AnnotationConfigApplicationContext(new String[] {"com.journaldev.spring.config"});
		System.out.println("----------------------------------------------");
		EmployeeService employeeService = ctx1.getBean(EmployeeService.class);

		System.out.println(employeeService.getEmployee().getName());

		employeeService.getEmployee().setName("Nguyen Van Vinh");

		employeeService.getEmployee().throwException();

		ctx1.close();
	}

}
