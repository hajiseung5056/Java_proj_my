package chap06_07.Ex05;

// ���� ��Ű�� ������ class A ����
public class Ex_A {

	public static void main(String[] args) {
		// A class �� ���� ��Ű�� ���ο� �����ϹǷ� import���� ��밡��
		
		A a = new A();		// import ���� ��� : A class�� ���� ��Ű�� ���� ����
		
		a.m = 10;	// A class �� ���� �����ڰ� default, ������Ű������ �ٸ�Ŭ�������� ���ٰ���
		a.n = 20;	
		
		a.print();	// default ���������� �̹Ƿ� ������ ���� 
	}

}