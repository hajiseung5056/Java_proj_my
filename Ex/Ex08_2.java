package Ex;

import java.util.Scanner;

public class Ex08_2 {
	public static void main(String[] args) {
		System.out.println("====�ش�====");
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000,10000,5000,1000,500,100,50,10,1}; // ȯ���� ���� ������ �迭�� ����
		int money;
		System.out.println("ȯ���� ���� �ݾ��� �Է� �ϼ���.");
		money = sc.nextInt();
		
		for(int i = 0 ; i < unit.length ; i++) {
			System.out.printf(" %d �� ¥�� : %d �� \n" , unit[i], money/unit[i]);
			// System.out.println(unit[i] + " �� ¥�� : " + (money / unit[i] + "��"));
			money = money - (money / unit[i])*unit[i];
			               // ȯ���� ���� ����    *50000 
		}
		
	}

}
