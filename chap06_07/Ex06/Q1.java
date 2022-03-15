package chap06_07.Ex06;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		System.out.println("운동이름과 구성원수를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String a;
		
		do {
			int sum = 0;
			int c = 0;
			int d = 0;
			double avg = 0;
			a = sc.nextLine();
			String[] b = a.split(" ");
			if(a.equals("그만")) {
				break;
			}
			for(int i = 0 ; i<b.length ; i++) {
				if(i%2 != 0) {
					c = Integer.parseInt(b[i]);
					sum += c;
					d++;
				}
			}
			avg = (double)sum/d;
			
			System.out.println(a);
			System.out.println("운동종목의 구성원 총 합계 : " + sum);
			System.out.println("운동종목의 평균 구성원 수 : " + avg);
			
		
		}while(true);
		
		
		
		
		sc.close();
		

	}

}
