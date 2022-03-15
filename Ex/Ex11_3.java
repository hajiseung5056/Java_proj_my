package Ex;

import java.util.Scanner;

public class Ex11_3 {
	public static void main(String[] args) {
		System.out.println("====해답====");
		
		Scanner sc = new Scanner(System.in);
		String[] course = {"Java", "C++" , "HTML5", "컴퓨터구조", "안드로이드"};
		int[] score = {95, 88, 76, 62, 55};		
		
		String name = null;     // 스캐너로 과목의 문자열을 받는 변수
		int i = 0;              // 방번호를 담는 변수
		System.out.println("프로그램을 종료하려면 \"그만\" 을 입력하세요");
		while (true) {
			System.out.println("과목이름 >>> ");
			name = sc.next();   // 스캐너로 과목이름을 받아서 변수 name에 할당.
			
			if (name.equals("그만")) {     // 주의 : name은 참조변수이므로 "=="를 사용하지 않고 "equals"를 사용
				break;
			}
		
			// course의 각 방을 돌면서 스캐너로 받은 name 변수의 값이 같을때
			for (i = 0 ; i < course.length ; i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i] + "의 점수는 : " + score[i]);
					break;
				}
				// 마지막 방까지 갔을때 검색이 안된 경우
				if(i == course.length - 1) {
					System.out.println("없는 과목입니다.");
				}
			}
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");
		
	}

}
