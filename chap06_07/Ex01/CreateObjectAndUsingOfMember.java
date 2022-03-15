package chap06_07.Ex01;

// 클래스(class) : 설계도, 붕어빵의 틀
// 객체(object) : 클래스를 복사해서 RAM에서 작동되는 실행코드 (집, 붕어빵)
	// 객체 == 인스턴스
	// 인스턴스화(객체화) 시킨다. (메인 메서드에서 객체를 인스턴스화 시켜 줘야한다.)
	// A a = new A();  <== 클래스를 객체화시켜서 메모리에 로드
class A {        // 외부 클래스
	int m = 3;			// 필드(변수) : 클래스블락에서 선언된 변수를 필드로 호칭
						// 필드는 인스턴스화(객체화) 시켜야 사용가능
						// 필드는 메모리의  Heap 영역에 생성
	
	void print() {		//메소드 : 절차지향언어에서의 함수
		System.out.println("객체생성 및 활용");
	}
}
class B {        // 외부 클래스
	String name = "홍길동";
	int age = 24;
	String phone = "010-1111-1111";
	
	void printName() {
		System.out.println(name);
	}
	void printAge() {
		System.out.println(age);
	}
	void printPhone() {
		System.out.println(phone);
	}
	void printAll() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
	}
}

public class CreateObjectAndUsingOfMember {

	public static void main(String[] args) {
		A a = new A();            // Class A를 객체화(인스턴스화) 시킨다. (RAM에 로드시킨다.)
		System.out.println(a.m);
		a.print();
		System.out.println("================");
		
		A b = new A();            // Class A를 객체화(인스턴스화) 시킨다. (RAM에 로드시킨다.)
		System.out.println(b.m);
		b.print();
		System.out.println("================");
		
		A c = new A();
		System.out.println(c.m);
		c.print();
		
		System.out.println("================");
		B bb = new B();           // Class B를 bb라는 이름으로 객체화 시킨다.
		System.out.println(bb.name);
		System.out.println(bb.age);
		System.out.println(bb.phone);
		bb.printName();          // bb 객체의 메소드를 호출
		bb.printAge();           // bb 객체의 메소드를 호출
		bb.printPhone(); 		 // bb 객체의 메소드를 호출
		bb.printAll();
		System.out.println("=================");
		B cc = new B();
		cc.printAll();
		
	}

}
