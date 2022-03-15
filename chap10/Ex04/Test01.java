package chap10.Ex04;

class Human {		// �θ�Ŭ����
	String name;	// �ν��Ͻ� �ʵ� : ��üȭ ���Ѿ� ���, Heap������
	int age;
	
	void eat() {	// �ν��Ͻ� �޼ҵ� : ��üȭ ���Ѿ� ���, Heap�� �ּҰ�(pointer)�� ����, Ŭ���� ���� ���� �ν��Ͻ� �޼ҵ� ������ ���� �޼ҵ��ڵ尡 ����
		System.out.println("����� �Խ��ϴ�.");
	}
	void sleep() {
		System.out.println("����� ���� ��ϴ�.");
	}
}
class Student extends Human{
	int sutdentID;
	void goToSchool() {
		System.out.println("�л��� �б��� ���ϴ�.");
	}
}
class Worker extends Human{
	int workerID;
	void goToCompany() {
		System.out.println("ȸ����� ���忡 ���ϴ�.");
	}
}


public class Test01 {

	public static void main(String[] args) {
		Human h = new Human();	// �θ�Ŭ����
		h.name = "ȫ�浿";
		h.age = 30;
		h.eat();
		h.sleep();
		
		Student s = new Student();	// �ڽ�Ŭ����
		s.name = "�Ż��Ӵ�";		// �θ�Ŭ���� �ʵ�
		s.eat();				// �θ�Ŭ���� �޼ҵ�
		s.sutdentID = 1111;		// �ڽ�Ŭ���� �ʵ�
		s.goToSchool();			// �ڽ�Ŭ���� �޼ҵ�
		
		Worker w = new Worker();
		w.name = "BTS";			// �θ�Ŭ���� �ʵ�
		w.eat();				// �θ�Ŭ���� �޼ҵ�
		w.workerID = 2222;				// �ڽ�Ŭ���� �ʵ�
		w.goToCompany();		// �ڽ�Ŭ���� �޼ҵ�
		
		// ��ĳ���� : �ڽ� ==> �θ�� Ÿ�Ժ�ȯ
		Human h1 = new Student();	// h1 : Human,StudentŸ���� �������, Human�� ���ٰ���
		h.name = "�̼���";
		h.eat();
		
		// �ٿ�ĳ���� : �θ� ==> �ڽ����� Ÿ�Ժ�ȯ (��Ÿ�� ���� ���� : if���ǹ��� instanceof Ű���带 ����ؼ� ó��)
		System.out.println(h1 instanceof Human); 	// true
		System.out.println(h1 instanceof Student);	// true
		
		if ( h1 instanceof Student) {
			Student s2 = (Student)h1;
			s2.sutdentID = 3333;
			s2.goToSchool();
		}
		
		if (h1 instanceof Worker) {
			Worker w2 = (Worker)h1;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
