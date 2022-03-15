package chap06_07.Ex01;

class Aaa {
	String name;     // 필드 : 객체화 시켜야 사용 가능, 클래스 블락에서 선언
	int age;         // 필드의 값들은 Heap 영역에 저장, Heap 영역의 변수의 값들은 강제 초기화
	double weigth;
	String email;    // 참조변수 : Null, int : 0, double : 0.0, boolean : false
	boolean man;
	
	public String getName() {          // 메소드 호출
		return name;
	}
	public void setName(String name) { // 인풋되는 변수, 받는 변수이름, 메모리 이름이 모두 동일할 경우  
		this.name = name;			   // 메모리 이름에 this : 자신의 클래스의 변수
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	public boolean getMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	
	
	
}
public class CreateObject_02 {

	public static void main(String[] args) {

		Aaa aaa = new Aaa();    // 객체를 생성 (aaa)
		
		// 필드의 초기 값을 출력 (Heap영역은 강제 초기화)
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weigth);
		System.out.println(aaa.man);
		System.out.println(aaa.email);
		
		// 변수의 값을 직접 대입 [Heap] , 보안상 메모리에 직접 값을 할당하는 것은 좋지 않다.
		aaa.name = "홍길동";
		aaa.age = 30;
		aaa.weigth = 70.5;
		aaa.man = true;
		aaa.email = "aaa@aaa.com";
		
		// setter를 통해서 값을 대입 , 메모리에 값을 넣을 때 제어를 할 수 있다.
			// 달을 저장하는 변수 (1월 ~ 12월)
		aaa.setName("세종대왕");
		aaa.setAge(60);
		aaa.setWeigth(70.5);
		aaa.setMan(true);
		aaa.setEmail("bbb@bbb.com");
		
		// getter를 통해서 메모리값을 출력
		System.out.println(aaa.getName());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmail());
		System.out.println(aaa.getWeigth());
		System.out.println(aaa.getMan());
		
		
		// 하나의 클래스에서 여러개의 객체를 생성 및 사용.
	}

}

