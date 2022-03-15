package chap03;

import java.util.Scanner;

public class Hjs {
	public static void main(String[] args) {
		System.out.println("정수값을 입력하세요?");
		
		Scanner scanner = new Scanner(System.in);		
		
		int value = scanner.nextInt();
		System.out.println((value %3 == 0) ? "3의배수입니다." : "3의배수가아닙니다");
		
		int value2 = scanner.nextInt();
		if(value2 %3 == 0) {
			System.out.println("3의배수입니다.");
		}else {
			System.out.println("3의배수가아닙니다.");
			
		}

		scanner.close();
		
	}

}
