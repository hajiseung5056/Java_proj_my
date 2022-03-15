package Ex;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		// 가위바위보
		String str[] = {"가위","바위","보"};
		String a;
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ;; i++) {
			a = sc.next();
			int n = (int)(Math.random()*3);
			if(a.equals("가위")) {
				System.out.println("사용자 = 가위");
				if(str[n].equals("가위")) {
					System.out.println(" , 컴퓨터 = 가위 / 비겼습니다.");
				}else if(str[n].equals("바위")) {
					System.out.println(" , 컴퓨터 = 바위 / 컴퓨터가 이겼습니다.");
				}else if(str[n].equals("보")) {
					System.out.println(" , 컴퓨터 = 보 / 사용자가 이겼습니다.");
				}
			}else if(a.equals("바위")) {
				System.out.println("사용자 = 바위");
				if(str[n].equals("가위")) {
					System.out.println(" , 컴퓨터 = 가위 / 사용자가 이겼습니다.");
				}else if(str[n].equals("바위")) {
					System.out.println(" , 컴퓨터 = 바위 / 비겼습니다.");
				}else if(str[n].equals("보")) {
					System.out.println(" , 컴퓨터 = 보 / 컴퓨터가 이겼습니다.");
				}
			}else if(a.equals("보")) {
				System.out.println("사용자 = 보");
				if(str[n].equals("가위")) {
					System.out.println(" , 컴퓨터 = 가위 / 컴퓨터가 이겼습니다.");
				}else if(str[n].equals("바위")) {
					System.out.println(" , 컴퓨터 = 바위 / 사용자가 이겼습니다.");
				}else if(str[n].equals("보")) {
					System.out.println(" , 컴퓨터 = 보 / 비겼습니다.");
				}else if(a.equals("바위")) {
				System.out.println("사용자 = 주먹");
				if(str[n].equals("가위")) {
					System.out.println(" , 컴퓨터 = 가위 / 사용자가 이겼습니다.");
				}else if(str[n].equals("바위")) {
					System.out.println(" , 컴퓨터 = 바위 / 비겼습니다.");
				}else if(str[n].equals("보")) {
					System.out.println(" , 컴퓨터 = 보 / 컴퓨터가 이겼습니다.");
				}
			}
			}else if(a.equals("그만")) {
				System.out.println("게임을 종료함니다.");
				break;
			}
		}
	}
}
