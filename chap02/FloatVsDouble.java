package chap02;
public class FloatVsDouble {
	public static void main(String[] args) {
		// float vs double 의 정밀도 : float은 소숫점 이하 7자리까지, double은 소숫점 이하 15자리까지 정밀도 유지.
		float f1 = 1.0000001f;  // float에는 변수의 값을 담을 때, 뒤에 f를 넣는다.
		float f2 = 1.00000001f;  
		System.out.println(f1);
		System.out.println(f2);
		System.out.println("===============");
		double d1 = 1.000000000000001;
		double d2 = 1.0000000000000001;
		System.out.println(d1);
		System.out.println(d2);
	}

}
