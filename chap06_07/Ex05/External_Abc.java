package chap06_07.Ex05;

import chap06_07.Ex06.Bcd;

// import chap06_07.Ex06.Abc; <== Abc class�� ���������ڰ� default : �ܺ���Ű������ ���ٺҰ�

public class External_Abc extends Bcd {
			// �θ� Ŭ���� Bcd, �ڽ�Ŭ���� External_Abc
	public static void main(String[] args) {
		// Abc abc2 = new Abc(); <== Abc class�� ���������ڰ� default : �ܺ���Ű������ ���ٺҰ�
		Bcd bcd1 = new Bcd();					// �θ� Ŭ���� ��ü
		External_Abc ext = new External_Abc();	// �ڽ� Ŭ����
		
		// �ٸ� ��Ű������ �ʵ� ȣ�� : 1. import, 2. ��ü����, 3. ���������� Ȯ�� �� ���� (�ʵ�, �޼ҵ�)
		bcd1.a = 1000;	// public : �ٸ� ��Ű������ ���ٰ���
		//bcd1.b = 2000;	// protected : ��Ӱ����� �ٸ���Ű������ ���ٰ���
		bcd1.print1();
		ext.b = 2000;	// �ڽ�Ŭ�������� �θ�Ŭ������ protected�� �ٸ���Ű������ ����
	}

}
