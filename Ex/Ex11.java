package Ex;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		// ����迭
		
		String course[] = {"Java", "C++" , "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score [] = {95, 88, 76, 62, 55};
		String name;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ;; i++) {
			System.out.println("������ >>>");
			name = sc.next();
			if(name.equals("�׸�")) {
				break;
			}
			for(int j = 0 ; j<course.length;j++) {
				if(course[j].equals(name)) {
					System.out.println(course[j] + " �� ������ " + score[j]);
					break;
				}
				if(j == course.length - 1){
					System.out.println("���°����Դϴ�.");
				}
			}
		}
		sc.close();
		System.out.println("���α׷��� �����մϴ�.");
	}

}
