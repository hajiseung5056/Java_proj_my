package chap10.Ex04;

class Human {		// 부모클래스
	String name;	// 인스턴스 필드 : 객체화 시켜야 사용, Heap에저장
	int age;
	
	void eat() {	// 인스턴스 메소드 : 객체화 시켜야 사용, Heap에 주소값(pointer)만 저장, 클래스 영역 내의 인스턴스 메소드 영역에 실제 메소드코드가 저장
		System.out.println("사람이 먹습니다.");
	}
	void sleep() {
		System.out.println("사람이 잠을 잡니다.");
	}
}
class Student extends Human{
	int sutdentID;
	void goToSchool() {
		System.out.println("학생은 학교에 갑니다.");
	}
}
class Worker extends Human{
	int workerID;
	void goToCompany() {
		System.out.println("회사원은 직장에 갑니다.");
	}
}


public class Test01 {

	public static void main(String[] args) {
		Human h = new Human();	// 부모클래스
		h.name = "홍길동";
		h.age = 30;
		h.eat();
		h.sleep();
		
		Student s = new Student();	// 자식클래스
		s.name = "신사임당";		// 부모클래스 필드
		s.eat();				// 부모클래스 메소드
		s.sutdentID = 1111;		// 자식클래스 필드
		s.goToSchool();			// 자식클래스 메소드
		
		Worker w = new Worker();
		w.name = "BTS";			// 부모클래스 필드
		w.eat();				// 부모클래스 메소드
		w.workerID = 2222;				// 자식클래스 필드
		w.goToCompany();		// 자식클래스 메소드
		
		// 업캐스팅 : 자식 ==> 부모로 타입변환
		Human h1 = new Student();	// h1 : Human,Student타입이 모두저장, Human만 접근가능
		h.name = "이순신";
		h.eat();
		
		// 다운캐스팅 : 부모 ==> 자식으로 타입변환 (런타임 오류 방지 : if조건문에 instanceof 키워드를 사용해서 처리)
		System.out.println(h1 instanceof Human); 	// true
		System.out.println(h1 instanceof Student);	// true
		
		if ( h1 instanceof Student) {
			Student s2 = (Student)h1;
			s2.sutdentID = 3333;
			s2.goToSchool();
		}
		
		if (h1 instanceof Worker) {
			Worker w2 = (Worker)h1;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
