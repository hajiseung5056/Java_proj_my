package chap06_07.Ex02;

import chap06_07.Ex03.Aaaa;



public class ExternalCallMethods {

	public static void main(String[] args) {
		// ��ü����
		Aaaa a = new Aaaa();   // ���� ��Ű�� ���� Ŭ������ import���� ȣ���ؼ� ��밡��
		
		// �޼ҵ� ȣ��
		a.print();
		int k = a.data();       // 3
		System.out.println(k);

		double result = a.sum(3, 5.2);
		System.out.println(result);  // 8.2
		
		a.printMethod(1);      // 1 ~ 12
		a.printMethod(25);
		
		// ����
		System.out.println(a.data());  // ��±����� ȣ�� ������ �޼ҵ� (������ �ִ� �޼ҵ�,)
		//System.out.println(a.print());  // �޼ҵ�ȿ� ��±����� �ִ°�� ��±�����ȣ���ϸ� �����߻�
		
		
		
	}

}
