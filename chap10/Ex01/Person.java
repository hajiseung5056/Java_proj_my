package chap10.Ex01;

class Student_Sub extends Student{
	// Student_Sub 는 Student를 상속받고 있다. Student 의 필드와 메소드를 상속받는다.
	// Student 는 Person을 상속 받고 있다. Student 는 Person 의 필드와 메소드를 상속 받고 있다.
	// Student_Sub 는 Person 의 필드와 메소드, Student 의 필드와 메소드 모두를 상속 받고 있다.
	
	String sub1;
	void sub1() {
		
	}
	
}


class Student extends Person{		// 대학생 클래스 , Person : 부모, Student 자식
	// 자식클래스는 부모 클래스의 필드, 메소드, 이너클래스를 그대로 상속받는다.

	int studentID;
	void goToScool() {
		System.out.println("자식 클래스 Student의 매소드 goToSchool 호출");
	}
}

class Worker extends Person{		// 직장인 클래스
	int workerID;	// 사번
	void goToWork() {
		System.out.println("자식 클래스 worker의 메소드 goToWork 호출 ");
	}
}


public class Person {		// 상속 : 부모클래스의 (필드, 메소드, 내부클래스)를 자식클래스에게 상속해준다.
							/* 상속의 이점 : 1. 중복된 코드의 제거(코드의 재사용)
							 *			  2. 코드가 간결해짐
							 *			  3. 다형성 구현가능(메소드 오버라이딩)
							 *					다형성 : 하나의 메소드를 여려형식으로 구현 
							 */
	String name;
	int age;
	
	void eat() {
		System.out.println("부모 클래스의 eat() 메소드");
	}
	void sleep() {
		System.out.println("부모 클래스의 sleep() 메소드");
	}


	
	public static void main(String[] args) {
		
		// 1. person 객체 생성
		Person p = new Person();
		p.name = "홍길동";
		p.age = 1;
		p.eat();
		p.sleep();
		
		// 2. student 객체 생성
		Student s = new Student();	// Person 클래스를 상속 한다. Person클래스의 필드와 메소드 사용
			// 자식 클래스는 부모 클래스의 선언된 필드와 메소드를 사용할 수 있다.
		
		//Person 클래스의 필드
		s.name = "이순신";
		s.age = 50;
		//Student 클래스의 필드
		s.studentID = 20200310;
		
		//Person 클래스의 메소드
		s.eat();
		s.sleep();
		
		//Student 클래스의 메소드
		s.goToScool();
		
		
		// 3. worker 객체 생성
		Worker w = new Worker();	// Person 클래스를 상속 한다. Person클래스의 필드와 메소드 사용
		// 부모 클래스의 필드
		w.name = "name";
		w.age = 0;
		
		// 자식 클래스의 필드
		w.workerID = 20200310;	// 사번
		
		// 부모 클래스의 메소드
		w.eat();
		w.sleep();
		
		// 자식 클래스의 메소드
		w.goToWork();
		
		System.out.println("===객체생성시 타입변환===");
		
		Person p1 = new Person();	// Person()은 Person 이다(자식은 부모다)
		Person ps = new Student();	// 업캐스팅, student는 person이다.
		// Student sp = new Person();	// Person은 Student 이다. (x)
		Person pw = new Worker();	// 업캐스팅, Worker는 Person이다.
		// Worker wp = new Person(); // Person은 Worker이다 (x)
		
		System.out.println("====Person <==Student <==Student_Sub=======");
		
		Student_Sub sub1 = new Student_Sub();
		// 클래스타입  객체명      자식클래스
		
		// Person 클래스의 필드와 메소드 사용 가능
		sub1.name = "신사임당";
		sub1.age = 50;
		sub1.eat();
		sub1.sleep();
		// Student 클래스의 필드와 메소드 사용 가능
		sub1.studentID = 20200310;
		sub1.goToScool();
		// Student_Sub 의 필드와 메소드
		sub1.sub1 = "자식의 자식 클래스";
		sub1.sub1();
		
		Person ps1 = new Student_Sub();	// 업캐스팅 : Student_Sub 객체를 생성시 부모 데이터 타입으로 형변환
			// Student_Sub는 Person 타입으로 업캐스팅, Person 클래스의 멤버만 사용가능
		
			// Person 클래스의 필드와 메소드만 접근
			ps1.name = "BTS";	
			ps1.age = 30;
			ps1.eat();
			ps1.sleep();
			
			
		Student ss1 = new Student_Sub();	// 업캐스팅 : Student 타입으로 업캐스팅, Student 클래스의 멤버만 사용 가능
			
			// Student,Person 클래스의 필드와 메소드 접근
			
			// Person클래스의 필드와 메소드
			ss1.name = "SES";
			ss1.age = 30;
			ss1.eat();
			ss1.sleep();
			
			// Student 클래스의 필드와 메소드
			ss1.studentID = 20220310;
			ss1.goToScool();
			
			
		Student_Sub ss2 = new Student_Sub();	// Person, Student, Student_Sub 의 필드와 메소드 모두 사용
			
			// Person 의 필드와 메소드
			ss2.name = "봄여름가을겨울";
			ss2.age = 40;
			ss2.eat();
			ss2.sleep();
			
			// Student 의 필드와 메소드
			ss2.studentID = 20220310;
			ss2.goToScool();
			
			// Student_Sub 의 필드와 메소드
			ss2.sub1 = "자식의 자식클래스";
			ss2.sub1();
			
		// 상속 관계에서 객체 생성시 부모 데이터 타입으로 업캐스팅 가능.
			// 부모 데이터 타입으로 업캐스팅 된 경우 부모의 필드와 메소드만 사용가능.
			// Person <== Student <== Student_sub
			
			Person ps4 = new Student_Sub();
				// Student_Sub 객체 생성시 Person 타입으로 업캐스팅
				// Student_Sub 는 Person과 Student 와 Student_Sub 의 모든 필드와 메소드를 포함하고 있다.
				// 그중에서 Person 클래스의 필드와 메소드만 접근 가능
			
			Student ss4 = new Student_Sub();
			// Student_Sub 객체 생성시 Student 타입으로 업캐스팅
			// Student_Sub 는 Person과 Student 와 Student_Sub 의 모든 필드와 메소드를 포함하고 있다.
			// 그중에서 Person과 Student 클래스의 필드와 메소드만 접근 가능
			
			Student_Sub ss5 = new Student_Sub();
			// Student_Sub 객체 생성시 Student_Sub 타입으로 적용
			// Student_Sub 는 Person과 Student 와 Student_Sub 의 모든 필드와 메소드를 포함하고 있다.
			// 그중에서 Person과 Student와 Student_Sub 클래스의 필드와 메소드만 접근 가능
		
		
		
		
		
	}

}
