package chap06_07.Ex05;

public class Ex_C {

	public static void main(String[] args) {

		
		// 같은 클래스에 존재
		C c = new C();
		c.model = "그랜져";	// default
		c.color = "검정";		// protected
		c.maxSpeed = 250;	// public
		c.print();
	}

}
