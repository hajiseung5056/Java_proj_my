package Ex;

import java.util.Scanner;

public class Ex12_2 {
	public static void main(String[] args) {   
		Scanner sc = new Scanner(System.in);
		String[] str = {"����","����","��"};
		String uSelect, comSelect;  // uSelect : ����ڰ� �� ��(��ĳ�ʷ� ��ǲ)
                                    // comSelect : ��ǻ�Ͱ� �� �� (�����߻���(Math.random)()�� ��ǲ)
		int n; // ��ǻ�Ͱ� ����(0,1,2)
		System.out.println("��ǻ�Ϳ� \'���� ���� ��\' ������ �մϴ�.");
		do {
			System.out.println("���� ���� �� !! >>> ");
			uSelect = sc.next();
			if (uSelect.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			n = (int)(Math.random()*3);         // ��ǻ�Ͱ� ���� �� : 0,1,2
			comSelect = str[n];
			if (uSelect.equals("����")) {        // ����ڰ� "����" �϶�
				if(comSelect.equals("����")) {
					System.out.println("����� " + uSelect + ", ��ǻ�� " + comSelect + " �����ϴ�.");
				}else if(comSelect.equals("����")) {
					System.out.println("����� " + uSelect + ", ��ǻ�� " + comSelect + " ��ǻ�Ͱ� �̰���ϴ�.");
				}else if(comSelect.equals("��")) {
					System.out.println("����� " + uSelect + ", ��ǻ�� " + comSelect + " ����� �̰���ϴ�.");
				}
			}else if(uSelect.equals("����")) {   // ����ڰ� "����" �϶�
				if(comSelect.equals("����")) {
					System.out.println("����� " + uSelect + ", ��ǻ�� " + comSelect + " ����� �̰���ϴ�.");
				}else if(comSelect.equals("����")) {
					System.out.println("����� " + uSelect + ", ��ǻ�� " + comSelect + " �����ϴ�.");
				}else if(comSelect.equals("��")) {
					System.out.println("����� " + uSelect + ", ��ǻ�� " + comSelect + " ��ǻ�Ͱ� �̰���ϴ�.");
				}
			}else if(uSelect.equals("��")) {   // ����ڰ� "��" �϶�
				if(comSelect.equals("����")) {
					System.out.println("����� " + uSelect + ", ��ǻ�� " + comSelect + " ��ǻ�Ͱ� �̰���ϴ�.");
				}else if(comSelect.equals("����")) {
					System.out.println("����� " + uSelect + ", ��ǻ�� " + comSelect + " ����� �̰���ϴ�.");
				}else if(comSelect.equals("��")) {
					System.out.println("����� " + uSelect + ", ��ǻ�� " + comSelect + " �����ϴ�.");
				}
			}
		}while (true);
	}
}
