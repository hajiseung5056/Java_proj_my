package chap06_07.Ex02;

class B {
	static String name = "BTS";
	static void print() {
		System.out.println(name);
		System.out.println("static�� ���� �޼ҵ� �Դϴ�.");
	}
}

public class MethodOverLoading {

	public static void main(String[] args) {
		// �޼ҵ� �����ε� : �ϳ��� �޼ҵ�� �ް� ����Ÿ��, ������ ���� ���� �ٸ� �޼ҵ尡 ȣ���
		// �޼ҵ� �������̵� : ��ӿ��� �θ� Ŭ������ �޼ҵ带 ������ �ؼ� ���
		
		// static : ��ü ���� ���� �ٷ� ȣ�� �ؼ� ��밡���ϵ��� ���ִ� Ű����
			// ��ü�̸��� �ƴ϶� Ŭ���� �̸����� ȣ�� ��밡��
		
		B.print();
		System.out.println(B.name);  // ��ü�̸��� �ƴ� Ŭ���� �̸����� ȣ���� ����
		
		print1();
		
		print1(3);
		
		print1(3.0);
		
		print1(3,3);
	}

	// �޼ҵ� �����ε� : �޼ҵ� �̸��� ���� , �Ű�����Ÿ��, �Ű����� ������ ���� �ش� �޼ҵ带 ȣ�� 
		// JVM �� ������ �޼ҵ� �̸��� ������ Ÿ���̳� ������ ���� �ش� �޼ҵ带 �۵�
	public static void print1(){
		System.out.println("�����Ͱ� �����ϴ�.");
	}
	public static void print1(int a){
		System.out.println("int" + a);
	}
	public static void print1(double a){
		System.out.println("double" + a);
	}
	/* �����߻� : ������ ������Ÿ��, ������ ������ �޼ҵ尡 �����ϴ� ���
	 * public static void print1(double k){
		System.out.println("double" + k);
	}
	*/
	
	public static void print1(int a, int b){
		System.out.println("a : " + a + " b : " + b);
	}
	
	
}
