package chap06_07.Ex06;

import chap06_07.Ex05.C;

public class Ex_C {

	public static void main(String[] args) {
		
		
		// �ٸ� ��Ű���� ������ / public �� ���� / model,color �޸𸮷� ���� �Ұ�
		// model�� color�� setter �� public ���ؼ� �Ҵ� �� ���
		C c = new C();
		c.maxSpeed = 300;
		
		c.setModel("����");
		c.setColor("������");
		c.setMaxSpeed(300);
		c.print();
	}
}
