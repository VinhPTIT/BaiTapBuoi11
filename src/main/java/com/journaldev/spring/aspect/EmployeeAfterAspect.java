package com.journaldev.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component // là một annotation đánh dấu trên các class để spring biết nó là bean
@Aspect
public class EmployeeAfterAspect {

	// After là chạy advice sau khi thực hiện phương thức bất kể kết quả là gì
	@After("args(name)")
	public void logStringArguments(String name){
		System.out.println("Running After Advice. String argument passed="+name);
	}

	//After throwing adivce: Chạy khi method ném ra một exception
	@AfterThrowing("within(com.journaldev.spring.model.Employee)")
	public void logExceptions(JoinPoint joinPoint){
		System.out.println("Exception thrown in Employee Method="+joinPoint.toString());
	}
	//After returning advice: Chạy sau khi method trả về một kết quả
	@AfterReturning(pointcut="execution(* getName())", returning="returnString")
	public void getNameReturningAdvice(String returnString){
		System.out.println("getNameReturningAdvice executed. Returned String="+returnString);
	}
	
}
