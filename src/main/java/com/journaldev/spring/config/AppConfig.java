package com.journaldev.spring.config;

import com.journaldev.spring.aspect.*;
import com.journaldev.spring.model.Customer;
import com.journaldev.spring.model.Employee;
import com.journaldev.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.journaldev.spring.aspect")
public class AppConfig {
    @Bean("vanvinh")
    public Employee getEmployee () {
        System.out.println("create employee");
        Employee e = new Employee();
        e.setName("Vinh");
        return e;
    }

    @Bean
    public EmployeeService getEmployeeService (@Qualifier("vanvinh") Employee employee) {
        System.out.println("create employee service");
        EmployeeService employeeService = new EmployeeService();
        employeeService.setEmployee(employee);
        return employeeService;
    }
//    @Bean
//    public EmployeeAfterAspect employeeAfterAspect(){
//        EmployeeAfterAspect employeeAfterAspect = new EmployeeAfterAspect();
//        return employeeAfterAspect;
//    }
//
//    @Bean
//    public EmployeeAnnotationAspect employeeAnnotationAspect(){
//        EmployeeAnnotationAspect employeeAnnotationAspect = new EmployeeAnnotationAspect();
//        return employeeAnnotationAspect;
//    }
//
//    @Bean
//    public EmployeeAroundAspect employeeAroundAspect(){
//        EmployeeAroundAspect employeeAroundAspect = new EmployeeAroundAspect();
//        return employeeAroundAspect;
//    }
//
//    @Bean
//    public EmployeeAspect employeeAspect(){
//        EmployeeAspect employeeAspect = new EmployeeAspect();
//        return employeeAspect;
//    }
//
//    @Bean
//    public EmployeeAspectJoinPoint employeeAspectJoinPoint(){
//        EmployeeAspectJoinPoint employeeAspectJoinPoint = new EmployeeAspectJoinPoint();
//        return employeeAspectJoinPoint;
//    }
//
//    @Bean
//    public EmployeeAspectPointcut employeeAspectPointcut(){
//        EmployeeAspectPointcut employeeAspectPointcut = new EmployeeAspectPointcut();
//        return employeeAspectPointcut;
//    }
//
//    @Bean
//    public EmployeeXMLConfigAspect employeeXMLConfigAspect(){
//        EmployeeXMLConfigAspect employeeXMLConfigAspect = new EmployeeXMLConfigAspect();
//        return employeeXMLConfigAspect;
//    }
}
