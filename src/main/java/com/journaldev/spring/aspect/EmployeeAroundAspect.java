package com.journaldev.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAroundAspect {
	//Around advice: Chạy khi method được thực thi (Bao gồm cả 3 loại advice trên)
	@Around("execution(* com.journaldev.spring.model.Employee.getName())")
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("Before invoking getName() method");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After invoking getName() method. Return value="+value);
		return value;
	}
}
