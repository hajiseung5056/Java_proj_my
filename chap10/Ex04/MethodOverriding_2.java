package chap10.Ex04;

// 메소드 오버라이딩

class Animal2{
	void run() {}
}

class Tiger extends Animal2{	// 호랑이는 네발로 달립니다.
	@Override
	void run() {
		System.out.println("호랑이는 네발로 달립니다.");
	}	
	void tigerEat() {
		System.out.println("호랑이는 동물을 먹습니다.");
	}
}

class Eagle extends Animal2{
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	void eagleEat() {
		System.out.println("독수리는 다른 새를 잡아먹습니다.");
	}
}

class Snake extends Animal2{
	@Override
	void run() {
		System.out.println("뱀은 기어다닙니다.");
	}
}




public class MethodOverriding_2 {

	public static void main(String[] args) {
		// 1. 모든 객체는 Animal2 타입으로 업캐스팅생성
		Animal2 at = new Tiger();
		Animal2 ae = new Eagle();
		Animal2 as = new Snake();
		
		// 2. Animal2 배열에 각 개체를 저장.
		Animal2[] animal2 = {at,ae,as};
		
		// 3. for 문으로 배열의 객체를 출력 . run
		System.out.println("====for문====");
		for (int i = 0 ; i < animal2.length ; i++) {
			animal2[i].run();
		}
		
		
		// 4. Enhanced for 문을 사용해서 객체의 run() 메소드 출력
		System.out.println("====Enhanced for문====");
		for (Animal2 k : animal2) {
			k.run();
		}
		
		// 5. 다운캐스팅(instanceof) 사용해서 출력
		System.out.println("====다운캐스팅(instanceof)====");
		for (int i = 0 ; i < animal2.length ; i++) {
			if (animal2[i] instanceof Tiger) {
				Tiger tt = (Tiger) animal2[i];
				tt.tigerEat();
			}else if(animal2[i] instanceof Eagle) {
				Eagle ee = (Eagle) animal2[i];
				ee.eagleEat();	
			}
		}
	}

}
