package chap06_07.Ex04;

// Aaa 클래스는 여러개의 생성자를 사용할 경우 this(); 없이 사용한 경우 : 중복된 값을 매번 입력
class Aaa{		
	int m1, m2, m3, m4;		// 필드 4개 선언
	Aaa(){		// 생성자 : 매개변수가 없는 생성자
		m1 = 1;		m2 = 2;		m3 = 3;		m4 = 4;
	}
	Aaa(int a){
		m1 = a;		m2 = 2;		m3 = 3;		m4 = 4;
	}
	Aaa(int a, int b){
		m1 = a;		m2 = b;		m3 = 3;		m4 = 4;
	}
	Aaa(int a, int b, int c){
		m1 = a;		m2 = b;		m3 = c;		m4 = 4;
	}
	Aaa(int a, int b, int c, int d){
		m1 = a;		m2 = b;		m3 = c;		m4 = d;
	}
	
	void print() {		// 각 메모리의 값을 출력
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	}
}


// this(); 를 사용하는 경우
class Bbb{
	int m1, m2, m3, m4;
	Bbb(){
		m1 = 1;		m2 = 2;		m3 = 3;		m4 = 4;
	}
	Bbb(int a){
		this();
		m1 = a;
	}
	Bbb(int a, int b){
		this(a);
		m2 = b;
	}
	Bbb(int a, int b, int c){
		this(a,b);
		m3 = c;
	}
	Bbb(int a,int b, int c, int d){
		this(a,b,c);
		m4 = d;
	}
	
	void print() {		// 각 메모리의 값을 출력
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	}
}



public class ThisMethod_2 {
	public static void main(String[] args) {
		// 1. 객체 생성 ( this 미사용)
		Aaa aaa1 = new Aaa();
		Aaa aaa2 = new Aaa(10);
		Aaa aaa3 = new Aaa(10,20);
		Aaa aaa4 = new Aaa(10,20,30);
		Aaa aaa5 = new Aaa(10,20,30,40);
		aaa1.print();
		aaa2.print();
		aaa3.print();
		aaa4.print();
		aaa5.print();
		System.out.println("===============");
		Bbb bbb1 = new Bbb();
		Bbb bbb2 = new Bbb(10);
		Bbb bbb3 = new Bbb(10,20);
		Bbb bbb4 = new Bbb(10,20,30);
		Bbb bbb5 = new Bbb(10,20,30,40);
		bbb1.print();
		bbb2.print();
		bbb3.print();
		bbb4.print();
		bbb5.print();
		
	}

}
