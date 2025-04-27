package com.kavita.basic.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kavita.basic.model.Employee;

public class EmployeeTest {

	public static void main(String args[])
	{
		
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("EmployeeCfg.xml");
		
		Employee e = applicationContext.getBean("employee" ,Employee.class);
		System.out.println(e);
	}
}
