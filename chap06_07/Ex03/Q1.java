package chap06_07.Ex03;

class Car{
	String company;  // 필드(인스턴스필드)의 company를 알려주는 this, Heap메모리에 저장
	String model;		// 인스턴스 : 객체화를 했을때 사용 가능한 필드
	String color;		// 필드명과 필드의 값은 Heap 영역에 들어간다.
	double maxSpeed;
	
	Car(){}			// 기본생성자
	Car(String a, String b, String c, double d){
		company = a;
		model = b;
		color = c;
		maxSpeed = d;
	}
	
	
	void work() {		// 메소드(인스턴스 메소드) : Heap 영역에 메소드명과 포인터를 저장
		System.out.println("회사 : " + company + ", 모델 : " + model + ", 컬러 : " + color + ", 최대속도 : " +maxSpeed);
		// 메소드의 전체 구문은 클래스 영역의 메소드 영역에 저장
	}
}


public class Q1 {

	public static void main(String[] args) {
		// 생성자를 통해서 기본 값을 할당후 메모리의 내용을 work() 메소드를 사용해서 출력
		
		Car sonata = new Car("현대","소나타","검정",100);
		sonata.work();
		
		Car k3 = new Car("기아","k3","흰색",120);
		k3.work();

	}

}
