package kr.co.softsoldesk.config.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.softsoldek.beans.TV;

public class TVMain {

	public static void main(String[] args) {
		
		//Spring 컨테이너 구동
		//AbstractApplicationContext  :BeanFactory + ApplicationContext > 파워up
		//GenericXmlApplicationContext 파일과 클래스 관리 설정(xml)
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("kr/co/softdesk/config/beans.xml");
		//컨테이너로부터 필요한 객체를 요청
		TV tv = (TV)ctx.getBean("tv1");//tv2
		tv.powerOn();
		tv.powerOff();
		tv.volumeDown();
		tv.volumeUp();
		
		ctx.close();
	}

}
