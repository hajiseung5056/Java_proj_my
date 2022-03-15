package Ex;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		// 과목배열
		
		String course[] = {"Java", "C++" , "HTML5", "컴퓨터구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		String name;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ;; i++) {
			System.out.println("과목은 >>>");
			name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			for(int j = 0 ; j<course.length;j++) {
				if(course[j].equals(name)) {
					System.out.println(course[j] + " 의 점수는 " + score[j]);
					break;
				}
				if(j == course.length - 1){
					System.out.println("없는과목입니다.");
				}
			}
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}

}
