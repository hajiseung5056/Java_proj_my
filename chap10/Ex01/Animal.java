package chap10.Ex01;

class Tiger extends Animal{
	int leg;
	
	void tigerEat() {
		System.out.println("호랑이는 다른 동물을 잡아먹습니다.");
	}
}

class Dog extends Animal{
	int dog;
	
	void dogEat() {
		System.out.println("개는 잡식성입니다.");
	}
}

class Dog_Sub extends Dog{
	int dog_sub;
	void dog_sub() {
		System.out.println("Dog 의 자식클래스 입니다.");
	}
}

class Egle extends Animal{
	int eagle;
	void eagleFly() {
		System.out.println("독수리는 날아다닙니다.");
	}
}


public class Animal {
	
	String name;	// 동물의 이름 
	int age; 		// 동물의 나이
	String color; 	// 동물의 색깔
	
	void eat() {
		System.out.println("모든 동물은 음식을 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
	
	public static void main(String[] args) {
		// 업캐스팅은 다형성으로 처리하기 떄문에 매우 효율적으로 프로그래밍을 처리할 수 있다.
			// 다형성 : 오버라이딩(상속) 을 이용해서 상속에서 하나의 메소드로 여러 정보를 처리
		
		// 1. Animal 클래스 객체화
		Animal a1 = new Animal();	// 자신의 필드와 메소드만 접근
		
		// 2. Dog클래스를 Dog 타입으로 객체화
		Dog d1 = new Dog();		// Animal 과 Dog 의 필드와 메소드 접근
		
		// 3. Dog를 Animal타입으로 업캐스팅
		Animal a2 = new Dog();	// a2 는 Animal,Dog 를 내포하고 있고 Animal 의 필드와 메소드만 접근 가능하다
		
		// 4. Dog_Sub를 Animal타입으로 업캐스팅
		Animal a3 = new Dog_Sub();	// a3 는 Animal, Dog, Dog_sub 를 내포하고 있고 Animal의 필드와 메소드만 접근 가능하다.
			// Animal 클래스의 필드
			a3.name = "요크셔테리어";
			
			// Dog 클래스의 필드
			//a3.dog = 6; <== 접근불가
			
		// 5. Dog_Sub를 Dog 데이터 타입으로 업캐스팅
		Dog d2 = new Dog_Sub();	// d2 는 Animal, Dog, Dog_sub 를 내포하고 있고 Animal,Dog의 필드와 메소드만 접근 가능하다.
			// Animal 클래스의 필드
			d2.name = "세퍼드";
		
			// Dog 클래스의 필드
			d2.dog = 5;
			
			// Dog_Sub 클래스의 필드
			// d2.dog_sub; <== 접근불가
			
		// 6. Dog_Sub를 Dog_Sub 데이터 타입으로 객체화
		Dog_Sub ds1 = new Dog_Sub();	// ds1 은 Animal, Dog, Dog_sub 를 내포하고 있고 Animal,Dog,Dog_Sub의 필드와 메소드에 접근 가능하다.
			// Animal 클래스의 필드
			ds1.name = "진돗개";	
			ds1.age = 4;
			
			// Dog 클래스의 필드
			ds1.dog = 4;
			
			// Dog_Sub 클래스의 필드
			ds1.dog_sub = 2;
			
			
	// 상속에서 업캐스팅 , 다운캐스팅
		// 업캐스팅 : 자식데이터 타입에서 부모 데이터 타입으로 변환하는 것
			// 부모 타입의 필드와 메소드만 접근가능
			// 강제 타입 변환 없이 자동으려 업캐스팅
			// ds1은 Dog_sub 의 데이터 타입을 가지고 있다. Animal, Dog, Dog_Sub 접근가능
		
			Dog ds1_c1 = ds1;		// 업캐스팅 : Dog_Sub ===> Dog 타입으로 업캐스팅
			Animal ds1_c2 = ds1;	// 업캐스팅 : Dog_Sub ===> Animal 타입으로 업캐스팅
			
			
		// 다운캐스팅 : 부모 데이터 타입을 다시 자식 데이터 타입으로 변환
			// 강제로 타입 변환이 필요함
			
			Dog a3_down1 = (Dog)a3;	// 다운캐스팅 : Animal ===> Dog 타입으로 다운캐스팅
			Dog_Sub a3_down2 = (Dog_Sub)a3;	// 다운캐스팅 : Animal ===> Dog_Sub 타입으로 다운캐스팅

	}

}
