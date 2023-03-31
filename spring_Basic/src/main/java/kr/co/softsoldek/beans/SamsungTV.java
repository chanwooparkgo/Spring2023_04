package kr.co.softsoldek.beans;

public class SamsungTV implements TV {
	
	
	public SamsungTV() {
		System.out.println("==> Samsung TV객체생성");
	}

	public void powerOn() {
		System.out.println("==> Samsung TV키기");
		
	}

	public void powerOff() {
		System.out.println("==> Samsung TV끄기");
		
	}

	public void volumeUp() {
		System.out.println("==> Samsung 볼륨업");
		
	}

	public void volumeDown() {
		System.out.println("==> Samsung 볼륨다운");
		
	}

	
}
