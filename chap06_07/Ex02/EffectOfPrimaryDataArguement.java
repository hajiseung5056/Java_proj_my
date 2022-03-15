package chap06_07.Ex02;

public class EffectOfPrimaryDataArguement {
	int abc;   // 필드 : Heap영역에 저장, 객체화를 시켜야 사용가능
	static int twice (int a) {  // 매개변수로 정수를 받아서 *2한 값을 리턴
		a = a*2;
		return a;    // a : 메소드가 종료될때 삭제되는 변수
	}
	
	public static void main(String[] args) {
		int a = 3;        // 지역변수 : Stack 영역에 저장
		int result1 = twice(3);
		System.out.println(result1);  // 6
		
		int result2 = twice(a);
		System.out.println(result2);  // 6
		System.out.println(a);    	  
		
	}

}
