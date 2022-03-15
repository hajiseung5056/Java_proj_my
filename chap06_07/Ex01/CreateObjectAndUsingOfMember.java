package chap06_07.Ex01;

// Ŭ����(class) : ���赵, �ؾ�� Ʋ
// ��ü(object) : Ŭ������ �����ؼ� RAM���� �۵��Ǵ� �����ڵ� (��, �ؾ)
	// ��ü == �ν��Ͻ�
	// �ν��Ͻ�ȭ(��üȭ) ��Ų��. (���� �޼��忡�� ��ü�� �ν��Ͻ�ȭ ���� ����Ѵ�.)
	// A a = new A();  <== Ŭ������ ��üȭ���Ѽ� �޸𸮿� �ε�
class A {        // �ܺ� Ŭ����
	int m = 3;			// �ʵ�(����) : Ŭ����������� ����� ������ �ʵ�� ȣĪ
						// �ʵ�� �ν��Ͻ�ȭ(��üȭ) ���Ѿ� ��밡��
						// �ʵ�� �޸���  Heap ������ ����
	
	void print() {		//�޼ҵ� : ������������� �Լ�
		System.out.println("��ü���� �� Ȱ��");
	}
}
class B {        // �ܺ� Ŭ����
	String name = "ȫ�浿";
	int age = 24;
	String phone = "010-1111-1111";
	
	void printName() {
		System.out.println(name);
	}
	void printAge() {
		System.out.println(age);
	}
	void printPhone() {
		System.out.println(phone);
	}
	void printAll() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
	}
}

public class CreateObjectAndUsingOfMember {

	public static void main(String[] args) {
		A a = new A();            // Class A�� ��üȭ(�ν��Ͻ�ȭ) ��Ų��. (RAM�� �ε��Ų��.)
		System.out.println(a.m);
		a.print();
		System.out.println("================");
		
		A b = new A();            // Class A�� ��üȭ(�ν��Ͻ�ȭ) ��Ų��. (RAM�� �ε��Ų��.)
		System.out.println(b.m);
		b.print();
		System.out.println("================");
		
		A c = new A();
		System.out.println(c.m);
		c.print();
		
		System.out.println("================");
		B bb = new B();           // Class B�� bb��� �̸����� ��üȭ ��Ų��.
		System.out.println(bb.name);
		System.out.println(bb.age);
		System.out.println(bb.phone);
		bb.printName();          // bb ��ü�� �޼ҵ带 ȣ��
		bb.printAge();           // bb ��ü�� �޼ҵ带 ȣ��
		bb.printPhone(); 		 // bb ��ü�� �޼ҵ带 ȣ��
		bb.printAll();
		System.out.println("=================");
		B cc = new B();
		cc.printAll();
		
	}

}
