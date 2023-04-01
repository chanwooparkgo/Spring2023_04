package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldek.beans2.TestBean1;

public class MainClass2 {

	public static void main(String[] args) {
		
		
		
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
		//#1 
		TestBean1 t1= ctx.getBean("t1", TestBean1.class);
		System.out.println("t1"+ t1);
		ctx.close();

	}

}
