package chap06_07.Ex02;

public class Example_car {

	public static void main(String[] args) {
		// Car Class�� ��üȭ �ؼ� 5���� ��ü�� ������ �� ���� �Ҵ��Ͽ� ���

		// 
		Car sonata = new Car();
		Car pony = new Car();
		Car k3 = new Car();
		Car k5 = new Car();
		Car k7 = new Car();
		
		
		
		
		// ������ ���� ���� �Ҵ�, ��������� �ƴϴ�. �޸𸮿� ������ �ʴ� ���� ���� �Ҵ� �� ���� �ִ�.
		// private ������ : ĸ��ȭ, ���� ������ ���� �Ҵ����� ���ϵ��� �Ѵ�.
		// setter �� ���ؼ� ���� �ο� : ������ �ԷµǴ� ���� ���� �� �� �ִ�.
		pony.company = "����";
		pony.model = "����";
		pony.color = "blue";
		pony.maxSpeed = 110;  // -, 700 �̻� ���� ���� �� ������ ����
		System.out.println(pony.getCompany());
		System.out.println(pony.getModel());
		System.out.println(pony.getColor());
		System.out.println(pony.getMaxSpeed());
		
		System.out.println("=================");
		
		// �� ������ ���� �Ҵ��ϰ� ���
		sonata.setCompany("����");
		sonata.setModel("�ҳ�Ÿ");
		sonata.setColor("red");
		sonata.setMaxSpeed(100);
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getModel());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getMaxSpeed());
		
		System.out.println("=================");

		k3.setCompany("kia");
		k3.setModel("k3");
		k3.setColor("yellow");
		k3.setMaxSpeed(120);
		System.out.println(k3.getCompany());
		System.out.println(k3.getModel());
		System.out.println(k3.getColor());
		System.out.println(k3.getMaxSpeed());
		
		System.out.println("=================");
		
		k5.setCompany("kia");
		k5.setModel("k5");
		k5.setColor("green");
		k5.setMaxSpeed(130);
		System.out.println(k5.getCompany());
		System.out.println(k5.getModel());
		System.out.println(k5.getColor());
		System.out.println(k5.getMaxSpeed());
		
		System.out.println("=================");
		
		k7.setCompany("kia");
		k7.setModel("k7");
		k7.setColor("black");
		k7.setMaxSpeed(140);
		System.out.println(k7.getCompany());
		System.out.println(k7.getModel());
		System.out.println(k7.getColor());
		System.out.println(k7.getMaxSpeed());

	}

}
