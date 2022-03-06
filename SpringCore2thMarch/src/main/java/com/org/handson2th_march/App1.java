package com.org.handson2th_march;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

		public class App1 {

			public static void main(String[] args) {
			
	
		        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		        System.out.println("---------------------------------------");

		       

		             Student student = (Student) context.getBean("student");

		             student.getAge();  

		    }

		}

		
