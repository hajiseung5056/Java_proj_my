package chap06_07.Ex03;

class Car{
	String company;  // �ʵ�(�ν��Ͻ��ʵ�)�� company�� �˷��ִ� this, Heap�޸𸮿� ����
	String model;		// �ν��Ͻ� : ��üȭ�� ������ ��� ������ �ʵ�
	String color;		// �ʵ��� �ʵ��� ���� Heap ������ ����.
	double maxSpeed;
	
	Car(){}			// �⺻������
	Car(String a, String b, String c, double d){
		company = a;
		model = b;
		color = c;
		maxSpeed = d;
	}
	
	
	void work() {		// �޼ҵ�(�ν��Ͻ� �޼ҵ�) : Heap ������ �޼ҵ��� �����͸� ����
		System.out.println("ȸ�� : " + company + ", �� : " + model + ", �÷� : " + color + ", �ִ�ӵ� : " +maxSpeed);
		// �޼ҵ��� ��ü ������ Ŭ���� ������ �޼ҵ� ������ ����
	}
}


public class Q1 {

	public static void main(String[] args) {
		// �����ڸ� ���ؼ� �⺻ ���� �Ҵ��� �޸��� ������ work() �޼ҵ带 ����ؼ� ���
		
		Car sonata = new Car("����","�ҳ�Ÿ","����",100);
		sonata.work();
		
		Car k3 = new Car("���","k3","���",120);
		k3.work();

	}

}
