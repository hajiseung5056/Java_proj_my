package chap10.Ex04;

// �޼ҵ� �����ε� VS �޼ҵ� �������̵�
/*
	 1. �޼ҵ� �����ε� : ������ �޼ҵ� �̸����� �Ű����� Ÿ��, �Ű����� �� �� ���� �ش� �޼ҵ尡 ȣ��
						��Ӱ��� ������ ����, �����ڿ��� ���� ���
	 2. �޼ҵ� �������̵� : �ݵ�� ��� ���迡�� ���
	 					�θ��� �޼ҵ带 �ڽĿ��� ���Ӱ� �����ؼ� ���.
	 					1. ��Ӱ��� 2. �޼ҵ��� �ñ״��İ� ���ƾ��Ѵ�(�޼ҵ�� , �Ű����� ����, �Ű����� Ÿ��)
	 					3. �ڽ��� ���������ڰ� �θ��� ���������ڿ� ���ų� �� ���� �������� �Ѵ�.
*/

class Ab {
	void print1() {		// overriding
		System.out.println("Ab Ŭ������ print1()");
	}
	void print2() {		// overloading
		System.out.println("Ab Ŭ������ print2()");
	}
}

class Bc extends Ab{
	@Override
	void print1() {		// overriding
		System.out.println("Bc Ŭ������ print1()");
	}
	void print2(int a) {	// overloading
		System.out.println("Bc Ŭ������ print2()");
	}
}
public class Overloading_VS_Overriding {

	public static void main(String[] args) {
		// 1. AbŸ�� ����
		System.out.println("=====1. AbŸ�� ����");
		Ab aa = new Ab();		
		aa.print1();	// AbŬ������ print1 ȣ��
		aa.print2();	// AbŬ������ print2 ȣ��
		
		// 2. BcŸ�� ����, ������ ȣ�� Bc
		System.out.println("=====2. BcŸ�� ����, ������ ȣ�� Bc");
		Bc bb = new Bc();
		bb.print1();	// BcŬ������ print1 ȣ��
		bb.print2();	// AbŬ������ print2 ȣ�� : �θ�Ŭ������ �޼ҵ� ȣ��
		bb.print2(1);	// BcŬ������ print2 ȣ�� : �ڽ�Ŭ������ �޼ҵ� ȣ��
		
		// 3. AbŸ������ ���� + BcŸ�� ������ ȣ��
		System.out.println("=====3. AbŸ������ ���� + BcŸ�� ������ ȣ��");
		Ab cc = new Bc();
		cc.print1();	// �޼ҵ� �������̵��� �Ǿ� �����Ƿ� ���� ���ε��� ���ؼ� Bc�� print1�� ȣ���Ѵ�.
		cc.print2();	// Ab Ŭ������ �޼ҵ常 ȣ���� ����	
		
		
		
	}

}
