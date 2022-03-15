package chap03;
public class OperatorEx04 {
	public static void main(String[] args) {
		/*
		 * 대입연산자 (=, +=, -=, *=, /=, >>=, <<=, >>>=), 수식에서 우선순위가 가장 낮다.
		 * a = b;     <== b변수의 값을 a에 할당한다
		 * a += b;    <== a = a + b
		 * a -= b;    <== a = a - b
		 * a *= b;    <== a = a * b
		 * a /= b;    <== a = a / b
		 * a &= b;    <== a = a & b
		 * a |= b;    <== a = a | b
		 * a <<= b;   <== a = a <<= b
		 * */
		
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);
		System.out.println();
		
		int value2;  // 기본자료형인 경우 변수의 값을 넣지 않을 경우 기본값으로 0이 할당.
		value2 = 5;  // 참조자료형일 경우 변수의 값을 넣지 않을 경우 기본값으로 NULL이 할당.
		// 축약표현
		System.out.println(value2 += 2);  // value2 = value2 + 2
		System.out.println(value2 -= 2);  // value2 = value2 - 2
		System.out.println(value2 /= 2);  // value2 = value2 / 2
		value2 = 5; System.out.println(value2 %= 2);
		value2 = 5; System.out.println(value2 |= 2);    // value2 = value2 | 2
		value2 = 5; System.out.println(value2 &= 2);    // value2 = value2 & 2
		
		value2 = 5; System.out.println(value2 <<= 2);  // value2 = value2 << 2
		value2 = 5; System.out.println(value2 >>= 2);  // value2 = value2 >> 2
		
		value2 = 5; System.out.println(value2 >>>=2);  // value2 = value2 >>> 2 부호비트 함께이동
		int value3;
		value3 = -128; System.out.println(value3 >>> 27);
		
	}

}
