package chap06_07.Ex06;

class Abc {		// �ܺ� Ŭ����	: public �����ڸ� ����Ҽ� ����. default �⺻���� ����
				// class : public, default ���������� ���
				// �ʵ�, �޼ҵ�, ������ : public, protected, default, private ���
				/*����������
				 *  1. public : �ٸ� ��Ű������ ���� ����
				 *  2. protected : ��ӱ����� �� ��� �ٸ���Ű���� �־ ���ٰ���
				 *  3. default : ���� ��Ű�� ���ο����� ���ٰ���(import ���� ��밡��)
				 *  4. private : ���� Ŭ���� ���ο����� ���ٰ���
				 * */
	
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	// Abc(){} <== �⺻������(�����Ǿ�����) : �ʵ��� �ʱⰪ�� �ο��ؼ� ��ü�� ����
	
	public void print1() {
		System.out.println("�ٸ���Ű������ ���ٰ��� : public");
	}
	protected void print2() {
		System.out.println("�ٸ� ��Ű������ ���� ����(��Ӱ��谡 �����ɶ�) : protected");
	}
	void print3() {
		System.out.println("���� ��Ű�������� ���� ���� : default");
	}
	private void print4() {
		System.out.println("���� Ŭ���������� ���� ���� : private");
	}
	
}

public class Ex06_All {

	public static void main(String[] args) {
		
		Abc abc1 = new Abc();	// �⺻ ������ ȣ��
			// Abc : Ŭ������, abc1 : �޸𸮿� �ε��� ��ü��, new = ��ü�� Heap������ ����, Abc() : ������ ȣ��
				// Abc() : �⺻������(��������)
					// ������ : Ŭ�����̸��� ������ �޼ҵ���� �����鼭 ����Ÿ���� ���� �޼ҵ�
		
		// ���� ��Ű�� ������ �ʵ� ȣ��
		abc1.a = 100; // public
		abc1.b = 200; // protected
		abc1.c = 300; // default
		// abc1.d = 400; private : ���ٺҰ�
		
		// ���� ��Ű�� ������ �޼ҵ�ȣ��
		abc1.print1();		// public
		abc1.print2();		// protected
		abc1.print3();		// default
		// abc1.print4();	// private
		 
	}

}
