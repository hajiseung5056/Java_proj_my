package Ex;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		// ����������
		String str[] = {"����","����","��"};
		String a;
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ;; i++) {
			a = sc.next();
			int n = (int)(Math.random()*3);
			if(a.equals("����")) {
				System.out.println("����� = ����");
				if(str[n].equals("����")) {
					System.out.println(" , ��ǻ�� = ���� / �����ϴ�.");
				}else if(str[n].equals("����")) {
					System.out.println(" , ��ǻ�� = ���� / ��ǻ�Ͱ� �̰���ϴ�.");
				}else if(str[n].equals("��")) {
					System.out.println(" , ��ǻ�� = �� / ����ڰ� �̰���ϴ�.");
				}
			}else if(a.equals("����")) {
				System.out.println("����� = ����");
				if(str[n].equals("����")) {
					System.out.println(" , ��ǻ�� = ���� / ����ڰ� �̰���ϴ�.");
				}else if(str[n].equals("����")) {
					System.out.println(" , ��ǻ�� = ���� / �����ϴ�.");
				}else if(str[n].equals("��")) {
					System.out.println(" , ��ǻ�� = �� / ��ǻ�Ͱ� �̰���ϴ�.");
				}
			}else if(a.equals("��")) {
				System.out.println("����� = ��");
				if(str[n].equals("����")) {
					System.out.println(" , ��ǻ�� = ���� / ��ǻ�Ͱ� �̰���ϴ�.");
				}else if(str[n].equals("����")) {
					System.out.println(" , ��ǻ�� = ���� / ����ڰ� �̰���ϴ�.");
				}else if(str[n].equals("��")) {
					System.out.println(" , ��ǻ�� = �� / �����ϴ�.");
				}else if(a.equals("����")) {
				System.out.println("����� = �ָ�");
				if(str[n].equals("����")) {
					System.out.println(" , ��ǻ�� = ���� / ����ڰ� �̰���ϴ�.");
				}else if(str[n].equals("����")) {
					System.out.println(" , ��ǻ�� = ���� / �����ϴ�.");
				}else if(str[n].equals("��")) {
					System.out.println(" , ��ǻ�� = �� / ��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
			}else if(a.equals("�׸�")) {
				System.out.println("������ �����Դϴ�.");
				break;
			}
		}
	}
}
