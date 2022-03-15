package Ex;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] unit = {50000,10000,1000,500,100,50,10,1};   // 환산할 돈의 종류
		int a = sc.nextInt();
		for (int i = 0 ; i < unit.length ; i++) {
			System.out.println(unit[i] + "원짜리 " + a / unit[i] + " 개");
			a = a - (a/unit[i]) * unit[i];
		}
		sc.close();
	}

}
