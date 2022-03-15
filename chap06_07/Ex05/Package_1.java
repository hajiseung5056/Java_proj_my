package chap06_07.Ex05;		// 패키지 선언

import java.util.Scanner;	// 자동 import : []
	//  패키지명    클래스명

// 클래스 파일이 자신의 패키지에 존재 하지 않는 경우 import 클래스전체이름(java.util.Scanner) 
// 클래스 외부에 선언 : 1. 패키지, 2. import, 3. 외부클래스
// 패키지 : 클래스를 담는 그릇, 클래스 외부에서 선언
// 패키지를 선언하지 않고 클래스를 생성할 경우 : default 패키지에 저장. 클래스의 위치는 src
// 같은 패키지 내에서는 동일한 이름의 클래스가 존재할 수 없다.

public class Package_1 {
	// 클래스의 Full Name : 패키지명 + 클래스명
		// chap06_07.Ex05.Package_1  <== 클래스의 전체 이름
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);	// 같은 패키지에 존재하지 않는 클래스를 사용할때
		// 클래스 객체 = new 생성자(매개변수) 
		
	}
}
