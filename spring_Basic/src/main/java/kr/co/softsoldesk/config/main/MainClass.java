package kr.co.softsoldesk.config.main;

import java.beans.Beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldek.beans.HelloWorld;
import kr.co.softsoldek.beans.SamsungTV;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/main/beans.xml");

		HelloWorld hello1 =(HelloWorld)ctx.getBean("hello1");
		callhello(hello1);
		ctx.close();
	}

	public static void callhello(HelloWorld hello) {
		hello.sayHello();
	}
	
	public static void Samsungtv() {
		Beans beans = new Beans();
		
	}
	
	public static void Soldesktv() {
		Beans beans = new Beans();
		
	}
	
}


/* ClassPathXmlApplicationContext : 인스턴스변수(객체)를 편리하게생성하는클래스 */
