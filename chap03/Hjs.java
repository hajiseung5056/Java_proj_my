package chap03;

import java.util.Scanner;

public class Hjs {
	public static void main(String[] args) {
		System.out.println("�������� �Է��ϼ���?");
		
		Scanner scanner = new Scanner(System.in);		
		
		int value = scanner.nextInt();
		System.out.println((value %3 == 0) ? "3�ǹ���Դϴ�." : "3�ǹ�����ƴմϴ�");
		
		int value2 = scanner.nextInt();
		if(value2 %3 == 0) {
			System.out.println("3�ǹ���Դϴ�.");
		}else {
			System.out.println("3�ǹ�����ƴմϴ�.");
			
		}

		scanner.close();
		
	}

}
