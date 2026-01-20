package com.example.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class App {
public static void main(String[] args){
    ApplicationContext context=new ClassPathXmlApplicationContext("componentScanDemo.xml");
    Employee emp=context.getBean("employee",Employee.class);
    System.out.println(emp.toString());
}
}
