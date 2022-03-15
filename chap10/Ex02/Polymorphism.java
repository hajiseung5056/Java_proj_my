package chap10.Ex02;

// 다형성(polymorphism) : 객체의 상속 관계에서 여러 데이터 타입으로 변환 가능

class A {}
class B extends A {}
class C extends B {}
class D extends C {}


public class Polymorphism {

	public static void main(String[] args) {
		
		// 1. 업캐스팅 (자동으로 변환) : 생략시 컴파일러가 자동으로 추가
		A ac = new C();	//	C => A : C는 A다.
		A ab = new B(); //  B => A : B는 A다.
		B bd = new D(); //  D => B : D는 B다.
		C c = new C();	//  C => C : C는 C다.
		
		// 객체생성을 할 수 없는 경우 (상속)
		// B b = new A();	// 오류
		
		// 3. 다운캐스팅 : 부모 => 자식 (수동변환) : 캐스팅이 불가능하면 실행시 오류발생(런타임 오류)
		A aa = new A();	// aa 는 A 타입만 내포하고 있다.
		// B b1 = (B) aa;	// A => B 다운캐스팅(수동변환) : 문법오류는 없으나 실행시 오류발생
				// java.lang.ClassCastException : 다운 캐스팅시 객체 내에 해당 타입이 존재하지 않는 경우
		
		// 4. 다운캐스팅 가능한경우 (수동변환) : 객체 내부에 자식 데이터타입을 가지고 있으면 캐스팅가능
		A ac3 = new C();
		
		B ac5 = (B) ac3;
		C ac6 = (C) ac3;
		
		A ad2 = new D();
		D ad3 = (D) ad2;
		
	}

}
