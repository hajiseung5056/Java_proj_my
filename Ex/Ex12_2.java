package Ex;

import java.util.Scanner;

public class Ex12_2 {
	public static void main(String[] args) {   
		Scanner sc = new Scanner(System.in);
		String[] str = {"가위","바위","보"};
		String uSelect, comSelect;  // uSelect : 사용자가 낸 값(스캐너로 인풋)
                                    // comSelect : 컴퓨터가 낸 값 (난수발생기(Math.random)()로 인풋)
		int n; // 컴퓨터가 낸값(0,1,2)
		System.out.println("컴퓨터와 \'가위 바위 보\' 게임을 합니다.");
		do {
			System.out.println("가위 바위 보 !! >>> ");
			uSelect = sc.next();
			if (uSelect.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			n = (int)(Math.random()*3);         // 컴퓨터가 내는 값 : 0,1,2
			comSelect = str[n];
			if (uSelect.equals("가위")) {        // 사용자가 "가위" 일때
				if(comSelect.equals("가위")) {
					System.out.println("사용자 " + uSelect + ", 컴퓨터 " + comSelect + " 비겼습니다.");
				}else if(comSelect.equals("바위")) {
					System.out.println("사용자 " + uSelect + ", 컴퓨터 " + comSelect + " 컴퓨터가 이겼습니다.");
				}else if(comSelect.equals("보")) {
					System.out.println("사용자 " + uSelect + ", 컴퓨터 " + comSelect + " 당신이 이겼습니다.");
				}
			}else if(uSelect.equals("바위")) {   // 사용자가 "바위" 일때
				if(comSelect.equals("가위")) {
					System.out.println("사용자 " + uSelect + ", 컴퓨터 " + comSelect + " 당신이 이겼습니다.");
				}else if(comSelect.equals("바위")) {
					System.out.println("사용자 " + uSelect + ", 컴퓨터 " + comSelect + " 비겼습니다.");
				}else if(comSelect.equals("보")) {
					System.out.println("사용자 " + uSelect + ", 컴퓨터 " + comSelect + " 컴퓨터가 이겼습니다.");
				}
			}else if(uSelect.equals("보")) {   // 사용자가 "보" 일때
				if(comSelect.equals("가위")) {
					System.out.println("사용자 " + uSelect + ", 컴퓨터 " + comSelect + " 컴퓨터가 이겼습니다.");
				}else if(comSelect.equals("바위")) {
					System.out.println("사용자 " + uSelect + ", 컴퓨터 " + comSelect + " 당신이 이겼습니다.");
				}else if(comSelect.equals("보")) {
					System.out.println("사용자 " + uSelect + ", 컴퓨터 " + comSelect + " 비겼습니다.");
				}
			}
		}while (true);
	}
}
