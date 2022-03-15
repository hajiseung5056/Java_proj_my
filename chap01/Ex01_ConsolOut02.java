package chap01;
public class Ex01_ConsolOut02 {
	public static void main(String[] args) {
		System.out.printf("나의 나이는 %d 입니다. \n", 30);    // "출력포멧", 인자, 인자
		                         // %d 10진수를 인자값으로 받을때
		System.out.printf("%o\n", 10);
		                // %o 8진수를 인자값으로 받을때 
		System.out.printf("%x\n", 30);
                        // %x 16진수를 인자로 받을때
		System.out.printf("%s\n", "출력");
                        // %s 문자열을 인자값으로 받을때 
		System.out.printf("%f\n", 5.80000);
                        // %f 실수값을 인자값으로 받을때
		System.out.printf("%4.2f\n", 5.8); 
                        // %4.2f 전체4자리, 소숫점이하 2자리를 인자값으로 받을때
		System.out.printf("%d 와 %4.2f\n", 10, 5.80);
	}
}
