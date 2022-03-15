package chap10.Ex02;

// ������(polymorphism) : ��ü�� ��� ���迡�� ���� ������ Ÿ������ ��ȯ ����

class A {}
class B extends A {}
class C extends B {}
class D extends C {}


public class Polymorphism {

	public static void main(String[] args) {
		
		// 1. ��ĳ���� (�ڵ����� ��ȯ) : ������ �����Ϸ��� �ڵ����� �߰�
		A ac = new C();	//	C => A : C�� A��.
		A ab = new B(); //  B => A : B�� A��.
		B bd = new D(); //  D => B : D�� B��.
		C c = new C();	//  C => C : C�� C��.
		
		// ��ü������ �� �� ���� ��� (���)
		// B b = new A();	// ����
		
		// 3. �ٿ�ĳ���� : �θ� => �ڽ� (������ȯ) : ĳ������ �Ұ����ϸ� ����� �����߻�(��Ÿ�� ����)
		A aa = new A();	// aa �� A Ÿ�Ը� �����ϰ� �ִ�.
		// B b1 = (B) aa;	// A => B �ٿ�ĳ����(������ȯ) : ���������� ������ ����� �����߻�
				// java.lang.ClassCastException : �ٿ� ĳ���ý� ��ü ���� �ش� Ÿ���� �������� �ʴ� ���
		
		// 4. �ٿ�ĳ���� �����Ѱ�� (������ȯ) : ��ü ���ο� �ڽ� ������Ÿ���� ������ ������ ĳ���ð���
		A ac3 = new C();
		
		B ac5 = (B) ac3;
		C ac6 = (C) ac3;
		
		A ad2 = new D();
		D ad3 = (D) ad2;
		
	}

}
