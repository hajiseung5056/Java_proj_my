package Ex;

import java.util.Scanner;

public class Ex08_2 {
	public static void main(String[] args) {
		System.out.println("====해답====");
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000,10000,5000,1000,500,100,50,10,1}; // 환산할 돈의 종류를 배열에 저장
		int money;
		System.out.println("환산할 돈의 금액을 입력 하세요.");
		money = sc.nextInt();
		
		for(int i = 0 ; i < unit.length ; i++) {
			System.out.printf(" %d 원 짜리 : %d 개 \n" , unit[i], money/unit[i]);
			// System.out.println(unit[i] + " 원 짜리 : " + (money / unit[i] + "개"));
			money = money - (money / unit[i])*unit[i];
			               // 환산한 돈의 갯수    *50000 
		}
		
	}

}
