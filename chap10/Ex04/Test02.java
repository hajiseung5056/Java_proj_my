package chap10.Ex04;

class Animal3 {		// 부모클래스, 모든 클래스는 Object 클래스를 상속한다.
	String name;
	int age;
	
	void cry() {
		System.out.println("동물은 웁니다.");
	}

	@Override	// Object.toString 메소드는 객체 자체를 출력할 때 회출된다.
	public String toString() {		// 객체의 주소를 출력합니다. [패키지명.클래스명@객체의메모리의헤쉬코드]
		return "이름은 : "+ name +", 나이는 : " + age + " 입니다. ";
	}
	
	
	
}
class Tiger3 extends Animal3 {
	Tiger3(){}	// 기본생성자 (다른생성자가 객체내에 존재할 경우 기본생성자를 호출할 때 기본생성자가 생략되어있으면 오류발생)
	Tiger3(String a, int b){ // 생성자 : 객체를 생성할때 메모리의 초기값을 할당 할 떄 적용
		super.name = a;
		super.age = b;
	}
	@Override
	void cry() {
		//super.cry();	// super 키워드는 부모클래스, super : 상속 관계일때 부모클래스
						// this 키워드는 자기자신의 객체
		System.out.println("호랑이는 어흥 하고 웁니다.");
	}
	
}
class Cat3 extends Animal3{
	Cat3(){}
	Cat3(String a, int b){
		super.name = a;
		super.age = b;
	}
	@Override
	void cry() {
		//super.cry();
		System.out.println("고양이는 야옹 하고 웁니다.");
	}
	
}
class Dog3 extends Animal3{

	Dog3(){}
	Dog3(String a, int b){
		super.name = a;
		super.age = b;
	}
	@Override
	void cry() {
		//super.cry();
		System.out.println("개는 멍멍하고 웁니다.");
	}
	
}

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal3 a3 = new Animal3();
		System.out.println(a3); 	// 객체 자체를 출력 : Object클래스의 toString메소드가 호출
									// Object.toString() : 객체의 메모리주소의 헤쉬코드를 출력
									// chap10.Ex04.Animal3@32d2fa64
									// 패키지명 .   객체명     @ 헤쉬코드
		System.out.println(a3.toString());
		
		System.out.println("==============");
		Animal3 t3 = new Tiger3();
		Animal3 c3 = new Cat3();
		Animal3 d3 = new Dog3();
		
		t3.cry(); 	// 부모의 cry()를 호출 할 경우 오버라이딩된 Tiger3의 cry()를 호출
		c3.cry();	// Animal3.cry 를 호출 ===> 오버라이딩된 Cat3의 cry()를 호출
		d3.cry();
		
		System.out.println("=============");
		Animal3[] arr = {t3,c3,d3};
		for (int i = 0 ; i<arr.length ; i++) {
			arr[i].cry();
		}
		System.out.println("=============");
		for(Animal3 k :arr) {
			k.cry();
		}
		System.out.println("=============");
		
		Animal3 tt3 = new Tiger3("호랑이",5);
		Animal3 cc3 = new Cat3("고양이",3);
		Animal3 dd3 = new Dog3("개",10);
		
		System.out.println(tt3);	// 객체 자체를 출력시 Object 의 toString 메소드가 출력(객체의 메모리 헤시코드)					
		System.out.println(cc3);
		System.out.println(dd3);
		System.out.println("=============");
		Animal3[] arr2 = {tt3,cc3,dd3};
		for(int i = 0; i<arr2.length;i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();
		System.out.println("=============");
		for(Animal3 k : arr2) {
			System.out.print(k);
		}
		
	}

}
