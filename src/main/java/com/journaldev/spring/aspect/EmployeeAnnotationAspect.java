package com.journaldev.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAnnotationAspect {
	//Before advice: chạy trước khi method được thực thi
	@Before("@annotation(com.journaldev.spring.aspect.Loggable)")
	public void myAdvice(){
		System.out.println("Executing myAdvice!!");
	}
}
