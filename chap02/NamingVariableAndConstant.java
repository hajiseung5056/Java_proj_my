package chap02;
public class NamingVariableAndConstant {
	public static void main(String[] args) {
		// 변수명
		boolean aBcD;  // 변수명은 첫자는 소문자로 시작, 단어를 연결하는 경우 첫글자는 대문자로작성
		byte 가나다라;  // 변수명은 한글을 넣울 수 있다. (권장하지 않음)
		short _abcd;  // 변수명에 특수문자 _를 사용할 수 있다.
		char $ab_cd;  // 변수명에 특수문자 $,_를 사용할 수 있다.
		// char ab cd; // 공백이나 다른 특수문자는 넣울 수 없다.
		long abcd3;  // 변수명에 숫자를 넣울 수 있다. 단 첫글자에는 숫자를 넣을 수 없다.
		//long 3abcd;  // 첫 글자에 숫자가 오면 오류 발생
		double main;  
		// double class; // 자바에서 사용하는 예약어들은 변수명으로 사용할 수 없다.
		int ABCD;  // 변수명은 대문자로 사용가능 (권장하지 않음), 상수는 상수명을 전체 대문자로 사용한다.
		
		// 상수 : 상수는 값을 변경 할 수 없다. final 키워드를 사용 한다. 상수명은 대문자로 사용한다.
		final double PI;
		final int MY_DATA;
		final float my_Data;  // 소문자도 사용가능하나 권장하지 않음
		
		PI = 3.141957;
		
		System.out.println(PI);
		
		// PI = 123.4567;  // 상수에는 값을 재할당 할 수 없다.
		
		abcd3 = 1234L;  // 정수 데이터타입 long  변수에 값을 할당 할때, L, l을 명시해 줘야 한다.
		System.out.println(abcd3);
		abcd3 = 56789l;  // 변수에 값을 재할당
		System.out.println(abcd3);
		
		aBcD = true;  // boolean 타입에는 true, false만 넣을 수 있다.
		
		가나다라 = 127;  // byte : 1byte (-128 ~ 127)
		System.out.println(가나다라);
		// 가나다라 = 128;  // 
	}

}
