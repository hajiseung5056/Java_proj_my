package chap06_07.Ex06;

import chap06_07.Ex05.Bb;	// �ٸ� ��Ű���� Ŭ�������� Ŭ������ ȣ���Ҷ� public ���������ڰ� �ο��Ǿ� �־�� �Ѵ�.

// import chap06_07.Ex05.B ;		// class B�� ���� �����ڰ� default �̱� ������ �ٸ� ��Ű������ ���� �Ұ�.

public class ExternalClass_2 {

	public static void main(String[] args) {

		// B b = new B();
		// �ٸ� ��Ű���� Ŭ�������� BbŬ������ �����ϴ°��
			// 1. improt �� �������
			// 2. Bb Ŭ������ Ŭ���� ���������ڿ� publicŰ�� ���Ǿ���Ѵ�.
			// 3. �ʵ�, �޼ҵ��� ���� �����ڿ� ���� ������ ����(protected(��Ӱ���),public), �Ұ���(private, default)
		Bb bb = new Bb();		// �ٸ� ��Ű���� Ŭ���� : 1. Ŭ���� ���� �����ڿ� public
		
		// bb.a = 10;	// private : ���� Ŭ���� �������� ����
		// bb.b = 10;	// default : ���� ��Ű�� �������� ����
		// bb.c = 10;	// protected : ���� ��Ű�� ���������� + ��Ӱ����� �ٸ���Ű������ ���ٰ���
		bb.d = 40;		// public : �ٸ���Ű������ ���� ����
		
		// �޼ҵ� ����
		
		// bb.print1();	// private : ���ٺҰ�
		// bb.print2();	// default : ���ٺҰ�
		// bb.print3();	// protected : ���ٺҰ�	�ܺ��� �ٸ� ��Ű������ ���� �ҷ��� ��� ���谡 �ʿ�.
		bb.print4();	// public : ���ٰ���
		
		
	}

}
