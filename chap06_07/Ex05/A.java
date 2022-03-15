package chap06_07.Ex05;

	// 접근 제어자(캡슐화 : 데어터를 외부로부터 보호) : public, protected, default(생략해서사용), private
		// 클래스이름, 필드명, 메소드명, 생성자명 <== 접근 제어자가 반드시 할당 되어있다.
		// 클래스이름 : public, default

public class A {
	
	int m = 3;		// 필드의 기본 접근제어자는 default : 생략됨 , 같은패키지에서만 접근
	int n = 4;			// default : 다른패키지의 클래스에서는 접근 불가.
						// private : 외부 클래스에서 접근 불가
	
	public int k = 10; // public : 다른 패키지에서 접근가능
	void print() {
		System.out.println("임포트 성공 " + m + " , " + n);
	}
	public void print2() {
		System.out.println("외부 패키지의 다른 클래스에서 접근 가능" + k);
	}
	
	public static void main(String[] args) {
		

	}

}
