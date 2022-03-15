package chap06_07.Ex02;

class B {
	static String name = "BTS";
	static void print() {
		System.out.println(name);
		System.out.println("static이 붙은 메소드 입니다.");
	}
}

public class MethodOverLoading {

	public static void main(String[] args) {
		// 메소드 오버로딩 : 하나의 메소드명에 메개 변수타입, 갯수에 따라서 각각 다른 메소드가 호출됨
		// 메소드 오버라이딩 : 상속에서 부모 클래스의 메소드를 재정의 해서 사용
		
		// static : 객체 생성 없이 바로 호출 해서 사용가능하도록 해주는 키워드
			// 객체이름이 아니라 클래스 이름으로 호출 사용가능
		
		B.print();
		System.out.println(B.name);  // 객체이름이 아닌 클래스 이름으로 호출이 가능
		
		print1();
		
		print1(3);
		
		print1(3.0);
		
		print1(3,3);
	}

	// 메소드 오버로딩 : 메소드 이름은 동일 , 매개변수타입, 매개변수 갯수에 따라 해당 메소드를 호출 
		// JVM 이 동일한 메소드 이름의 데이터 타입이나 갯수에 따라서 해당 메소드를 작동
	public static void print1(){
		System.out.println("데이터가 없습니다.");
	}
	public static void print1(int a){
		System.out.println("int" + a);
	}
	public static void print1(double a){
		System.out.println("double" + a);
	}
	/* 오류발생 : 동일한 데이터타입, 동일한 갯수의 메소드가 존재하는 경우
	 * public static void print1(double k){
		System.out.println("double" + k);
	}
	*/
	
	public static void print1(int a, int b){
		System.out.println("a : " + a + " b : " + b);
	}
	
	
}
