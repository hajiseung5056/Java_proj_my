package Ex;

import java.util.Scanner;

public class Ex11_3 {
	public static void main(String[] args) {
		System.out.println("====�ش�====");
		
		Scanner sc = new Scanner(System.in);
		String[] course = {"Java", "C++" , "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int[] score = {95, 88, 76, 62, 55};		
		
		String name = null;     // ��ĳ�ʷ� ������ ���ڿ��� �޴� ����
		int i = 0;              // ���ȣ�� ��� ����
		System.out.println("���α׷��� �����Ϸ��� \"�׸�\" �� �Է��ϼ���");
		while (true) {
			System.out.println("�����̸� >>> ");
			name = sc.next();   // ��ĳ�ʷ� �����̸��� �޾Ƽ� ���� name�� �Ҵ�.
			
			if (name.equals("�׸�")) {     // ���� : name�� ���������̹Ƿ� "=="�� ������� �ʰ� "equals"�� ���
				break;
			}
		
			// course�� �� ���� ���鼭 ��ĳ�ʷ� ���� name ������ ���� ������
			for (i = 0 ; i < course.length ; i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i] + "�� ������ : " + score[i]);
					break;
				}
				// ������ ����� ������ �˻��� �ȵ� ���
				if(i == course.length - 1) {
					System.out.println("���� �����Դϴ�.");
				}
			}
		}
		sc.close();
		System.out.println("���α׷��� �����մϴ�.");
		
	}

}
