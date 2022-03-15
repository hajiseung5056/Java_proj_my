package chap06_07.Ex06;

import java.util.Scanner;

public class Q1_1 {

	public static void main(String[] args) {
		/* 임의의 운동 이름을 넣고 해당 운동의 구성원수를 넣어서 출력하는 프로그램을 작성 후,
		 * 전체 합과 평균을 구하는 프로그램을 작성하세요.
		 * 
		 * 예)
		 * 입력>>
		 * 탁구 2 야구 9 축구 11 농구 6 씨름 2
		 * 
		 * 출력>>
		 * 탁구 2 야구 9 축구 11 농구 6 씨름 2
		 * 운동종목의 구성원수 총합계 : 
		 * 운동종목의 평균 구성원수 : 
		 * 
		 * "그만" 이라고 입력하면 프로그램 종료
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("운동이름 구성원수를 공백을 이용해서 입력하세요.");
		System.out.println("예) 입력>>> 탁구 2 야구 9 축구 11 농구 6 씨름 2");
		
		String str;		// 전체 String값을 인풋받는 변수
		String[] arr;		// 공백을 기준으로 잘라서 배열에 저장하는 변수
		
		do {
			int sum = 0; 	// 구성원수의 합을 저장하는 변수
			double avg = 0;	// 운동종목의 구성원수 평균을 저장하는 변수 : (double)sum/종목수
			int b = 0; 		// 각 종목의 구성원수를 담는 변수
			int memberCount = 0;		
			str = sc.nextLine();	// sc.next() : 공백까지만 String에 저장
			arr = str.split(" ");		// sc.nextLine() : 엔터(enter) 까지 전체를 String에 저장
			if(str.equals("그만")) {	// str을 공백을 기준으로 잘라서 arr 배열에 저장
				break;
			}
			for(int i = 0 ; i < arr.length ; i++) {
				if(i%2 != 0) {		// i : 방의번호, 숫자만가지고온다
					b = Integer.parseInt(arr[i]);	// 각방의 타입을 정수로 변환
					sum += b;
					memberCount++;	
				}
				
			}
			avg = (double)sum/memberCount;
			
			System.out.println(str);
			System.out.println("구성원의 총합 : " + sum);
			System.out.println("구성원의 평균 : " + avg);
			
		}while(true);
		
		
		
		
		
		
	}

}
