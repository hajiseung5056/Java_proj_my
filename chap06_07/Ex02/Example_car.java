package chap06_07.Ex02;

public class Example_car {

	public static void main(String[] args) {
		// Car Class를 객체화 해서 5개의 객체를 생성한 후 값을 할당하여 출력

		// 
		Car sonata = new Car();
		Car pony = new Car();
		Car k3 = new Car();
		Car k5 = new Car();
		Car k7 = new Car();
		
		
		
		
		// 변수의 값을 직접 할당, 권장사항은 아니다. 메모리에 원하지 않는 값을 직접 할당 할 수가 있다.
		// private 변수명 : 캡슐화, 직접 변수의 값을 할당하지 못하도록 한다.
		// setter 를 통해서 값을 부여 : 변수의 입력되는 값을 제어 할 수 있다.
		pony.company = "현대";
		pony.model = "포니";
		pony.color = "blue";
		pony.maxSpeed = 110;  // -, 700 이상 값은 넣을 수 없도록 제어
		System.out.println(pony.getCompany());
		System.out.println(pony.getModel());
		System.out.println(pony.getColor());
		System.out.println(pony.getMaxSpeed());
		
		System.out.println("=================");
		
		// 각 변수의 값을 할당하고 출력
		sonata.setCompany("현대");
		sonata.setModel("소나타");
		sonata.setColor("red");
		sonata.setMaxSpeed(100);
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getModel());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getMaxSpeed());
		
		System.out.println("=================");

		k3.setCompany("kia");
		k3.setModel("k3");
		k3.setColor("yellow");
		k3.setMaxSpeed(120);
		System.out.println(k3.getCompany());
		System.out.println(k3.getModel());
		System.out.println(k3.getColor());
		System.out.println(k3.getMaxSpeed());
		
		System.out.println("=================");
		
		k5.setCompany("kia");
		k5.setModel("k5");
		k5.setColor("green");
		k5.setMaxSpeed(130);
		System.out.println(k5.getCompany());
		System.out.println(k5.getModel());
		System.out.println(k5.getColor());
		System.out.println(k5.getMaxSpeed());
		
		System.out.println("=================");
		
		k7.setCompany("kia");
		k7.setModel("k7");
		k7.setColor("black");
		k7.setMaxSpeed(140);
		System.out.println(k7.getCompany());
		System.out.println(k7.getModel());
		System.out.println(k7.getColor());
		System.out.println(k7.getMaxSpeed());

	}

}
