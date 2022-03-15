package chap05;
public class CreateStringObject {
	public static void main(String[] args) {
		// 1. String 객체 생성 1 : new 키를 사용해서 객체 생성 : Heap 영역의 별도의 공간에 저장
		       // RAM 의 값을 절대 공유하지 않는다.
		String str1 = new String("안녕");  // new 키는 객체를 생성하라. (Heap 메모리에 저장)
		System.out.println(str1);    // String 은 객체를 출력했을때 객체의 값이 출력.
									 // String 만 가지는 특수한 기능
									 // 객체 자체를 출력하면 , Heap 메모리의 번지를 출력
									 // 객체의 값을 출력할때는 객체명.toString() 재정의
		
		String str11 = new String("안녕");  // str1 과 str11은 별도의 메모리 공간에 저장 (Heap )
		System.out.println(str11);
		
		if(str1 == str11) {
			System.out.println(true);
		}else {System.out.println(false);}
		if(str1.equals(str11)) {
			System.out.println(true);
		}else {System.out.println(false);}
		
		System.out.println("===============");
		// 2. 리터럴의 값을 바로 할당 : 값이 같을 경우 RAM 의 값을 공유하게 된다. (Heap)
		String str2 = "안녕하세요.";   
		String str22 = "안녕하세요.";   // 동일한 메모리 공간을 공유(Heap)
		System.out.println(str2);
		System.out.println(str22);
		
		if(str2 == str22) {
			System.out.println(true);
		}else {System.out.println(false);}
		if(str2.equals(str22)) {
			System.out.println(true);
		}else {System.out.println(false);}
	}

}
