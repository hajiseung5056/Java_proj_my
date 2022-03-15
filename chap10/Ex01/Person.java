package chap10.Ex01;

class Student_Sub extends Student{
	// Student_Sub �� Student�� ��ӹް� �ִ�. Student �� �ʵ�� �޼ҵ带 ��ӹ޴´�.
	// Student �� Person�� ��� �ް� �ִ�. Student �� Person �� �ʵ�� �޼ҵ带 ��� �ް� �ִ�.
	// Student_Sub �� Person �� �ʵ�� �޼ҵ�, Student �� �ʵ�� �޼ҵ� ��θ� ��� �ް� �ִ�.
	
	String sub1;
	void sub1() {
		
	}
	
}


class Student extends Person{		// ���л� Ŭ���� , Person : �θ�, Student �ڽ�
	// �ڽ�Ŭ������ �θ� Ŭ������ �ʵ�, �޼ҵ�, �̳�Ŭ������ �״�� ��ӹ޴´�.

	int studentID;
	void goToScool() {
		System.out.println("�ڽ� Ŭ���� Student�� �żҵ� goToSchool ȣ��");
	}
}

class Worker extends Person{		// ������ Ŭ����
	int workerID;	// ���
	void goToWork() {
		System.out.println("�ڽ� Ŭ���� worker�� �޼ҵ� goToWork ȣ�� ");
	}
}


public class Person {		// ��� : �θ�Ŭ������ (�ʵ�, �޼ҵ�, ����Ŭ����)�� �ڽ�Ŭ�������� ������ش�.
							/* ����� ���� : 1. �ߺ��� �ڵ��� ����(�ڵ��� ����)
							 *			  2. �ڵ尡 ��������
							 *			  3. ������ ��������(�޼ҵ� �������̵�)
							 *					������ : �ϳ��� �޼ҵ带 ������������ ���� 
							 */
	String name;
	int age;
	
	void eat() {
		System.out.println("�θ� Ŭ������ eat() �޼ҵ�");
	}
	void sleep() {
		System.out.println("�θ� Ŭ������ sleep() �޼ҵ�");
	}


	
	public static void main(String[] args) {
		
		// 1. person ��ü ����
		Person p = new Person();
		p.name = "ȫ�浿";
		p.age = 1;
		p.eat();
		p.sleep();
		
		// 2. student ��ü ����
		Student s = new Student();	// Person Ŭ������ ��� �Ѵ�. PersonŬ������ �ʵ�� �޼ҵ� ���
			// �ڽ� Ŭ������ �θ� Ŭ������ ����� �ʵ�� �޼ҵ带 ����� �� �ִ�.
		
		//Person Ŭ������ �ʵ�
		s.name = "�̼���";
		s.age = 50;
		//Student Ŭ������ �ʵ�
		s.studentID = 20200310;
		
		//Person Ŭ������ �޼ҵ�
		s.eat();
		s.sleep();
		
		//Student Ŭ������ �޼ҵ�
		s.goToScool();
		
		
		// 3. worker ��ü ����
		Worker w = new Worker();	// Person Ŭ������ ��� �Ѵ�. PersonŬ������ �ʵ�� �޼ҵ� ���
		// �θ� Ŭ������ �ʵ�
		w.name = "name";
		w.age = 0;
		
		// �ڽ� Ŭ������ �ʵ�
		w.workerID = 20200310;	// ���
		
		// �θ� Ŭ������ �޼ҵ�
		w.eat();
		w.sleep();
		
		// �ڽ� Ŭ������ �޼ҵ�
		w.goToWork();
		
		System.out.println("===��ü������ Ÿ�Ժ�ȯ===");
		
		Person p1 = new Person();	// Person()�� Person �̴�(�ڽ��� �θ��)
		Person ps = new Student();	// ��ĳ����, student�� person�̴�.
		// Student sp = new Person();	// Person�� Student �̴�. (x)
		Person pw = new Worker();	// ��ĳ����, Worker�� Person�̴�.
		// Worker wp = new Person(); // Person�� Worker�̴� (x)
		
		System.out.println("====Person <==Student <==Student_Sub=======");
		
		Student_Sub sub1 = new Student_Sub();
		// Ŭ����Ÿ��  ��ü��      �ڽ�Ŭ����
		
		// Person Ŭ������ �ʵ�� �޼ҵ� ��� ����
		sub1.name = "�Ż��Ӵ�";
		sub1.age = 50;
		sub1.eat();
		sub1.sleep();
		// Student Ŭ������ �ʵ�� �޼ҵ� ��� ����
		sub1.studentID = 20200310;
		sub1.goToScool();
		// Student_Sub �� �ʵ�� �޼ҵ�
		sub1.sub1 = "�ڽ��� �ڽ� Ŭ����";
		sub1.sub1();
		
		Person ps1 = new Student_Sub();	// ��ĳ���� : Student_Sub ��ü�� ������ �θ� ������ Ÿ������ ����ȯ
			// Student_Sub�� Person Ÿ������ ��ĳ����, Person Ŭ������ ����� ��밡��
		
			// Person Ŭ������ �ʵ�� �޼ҵ常 ����
			ps1.name = "BTS";	
			ps1.age = 30;
			ps1.eat();
			ps1.sleep();
			
			
		Student ss1 = new Student_Sub();	// ��ĳ���� : Student Ÿ������ ��ĳ����, Student Ŭ������ ����� ��� ����
			
			// Student,Person Ŭ������ �ʵ�� �޼ҵ� ����
			
			// PersonŬ������ �ʵ�� �޼ҵ�
			ss1.name = "SES";
			ss1.age = 30;
			ss1.eat();
			ss1.sleep();
			
			// Student Ŭ������ �ʵ�� �޼ҵ�
			ss1.studentID = 20220310;
			ss1.goToScool();
			
			
		Student_Sub ss2 = new Student_Sub();	// Person, Student, Student_Sub �� �ʵ�� �޼ҵ� ��� ���
			
			// Person �� �ʵ�� �޼ҵ�
			ss2.name = "�����������ܿ�";
			ss2.age = 40;
			ss2.eat();
			ss2.sleep();
			
			// Student �� �ʵ�� �޼ҵ�
			ss2.studentID = 20220310;
			ss2.goToScool();
			
			// Student_Sub �� �ʵ�� �޼ҵ�
			ss2.sub1 = "�ڽ��� �ڽ�Ŭ����";
			ss2.sub1();
			
		// ��� ���迡�� ��ü ������ �θ� ������ Ÿ������ ��ĳ���� ����.
			// �θ� ������ Ÿ������ ��ĳ���� �� ��� �θ��� �ʵ�� �޼ҵ常 ��밡��.
			// Person <== Student <== Student_sub
			
			Person ps4 = new Student_Sub();
				// Student_Sub ��ü ������ Person Ÿ������ ��ĳ����
				// Student_Sub �� Person�� Student �� Student_Sub �� ��� �ʵ�� �޼ҵ带 �����ϰ� �ִ�.
				// ���߿��� Person Ŭ������ �ʵ�� �޼ҵ常 ���� ����
			
			Student ss4 = new Student_Sub();
			// Student_Sub ��ü ������ Student Ÿ������ ��ĳ����
			// Student_Sub �� Person�� Student �� Student_Sub �� ��� �ʵ�� �޼ҵ带 �����ϰ� �ִ�.
			// ���߿��� Person�� Student Ŭ������ �ʵ�� �޼ҵ常 ���� ����
			
			Student_Sub ss5 = new Student_Sub();
			// Student_Sub ��ü ������ Student_Sub Ÿ������ ����
			// Student_Sub �� Person�� Student �� Student_Sub �� ��� �ʵ�� �޼ҵ带 �����ϰ� �ִ�.
			// ���߿��� Person�� Student�� Student_Sub Ŭ������ �ʵ�� �޼ҵ常 ���� ����
		
		
		
		
		
	}

}
