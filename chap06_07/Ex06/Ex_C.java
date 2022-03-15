package chap06_07.Ex06;

import chap06_07.Ex05.C;

public class Ex_C {

	public static void main(String[] args) {
		
		
		// 다른 패키지에 존재함 / public 만 접근 / model,color 메모리로 접근 불가
		// model과 color는 setter 를 public 통해서 할당 후 출력
		C c = new C();
		c.maxSpeed = 300;
		
		c.setModel("에쿠스");
		c.setColor("검은색");
		c.setMaxSpeed(300);
		c.print();
	}
}
