package chap06_07.Ex03;

// 생성자 오버로딩 : 하나의 생성자 명에 데이터타입, 갯수에 따라 다른 생성자가 호출
	// 주의 ) 데이터타입도 같고, 갯수도 같은 경우 두개이상 있으면 오류
class Abc{
	int a, b, c;
	String d;
	
	Abc(){System.out.println(a + " , " + b + " , " + c);}	// 기본생성자
	Abc(int a){					// 매개변수 1개인 생성자
		this.a=a;
		System.out.println(a);
	}
	Abc(String d){
		this.d = d;
		System.out.println(d);
	}
	Abc(int a, int b){			// 매개변수 2개인 생성자
		this.a=a;
		this.b=b;
		System.out.print(a + " , " + b);
		System.out.println();
	}
	Abc(int a, int b, int c){	// 매개변수 3개인 생성자
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.print(a + " , " + b + " , " + c);
		System.out.println();
	}
}


public class ConstructorOverloding {

	public static void main(String[] args) {
		Abc abc = new Abc();        // 기본생성자 호출
		Abc abc1 = new Abc(30);		// 매개변수 1개인 생성자 호출
		Abc abc11 = new Abc("현대자동차"); // 매개변수의 갯수가 같더라도 타입이 다르면 해당 메소드 호출
		Abc abc2 = new Abc(10,20);	// 매개변수 2개인 생성자 호출
		Abc abc3 = new Abc(10,20,30);	// 매개변수 3개인 생성자 호출
	}

}
