package chap10.Ex01;

class Tiger extends Animal{
	int leg;
	
	void tigerEat() {
		System.out.println("ȣ���̴� �ٸ� ������ ��ƸԽ��ϴ�.");
	}
}

class Dog extends Animal{
	int dog;
	
	void dogEat() {
		System.out.println("���� ��ļ��Դϴ�.");
	}
}

class Dog_Sub extends Dog{
	int dog_sub;
	void dog_sub() {
		System.out.println("Dog �� �ڽ�Ŭ���� �Դϴ�.");
	}
}

class Egle extends Animal{
	int eagle;
	void eagleFly() {
		System.out.println("�������� ���ƴٴմϴ�.");
	}
}


public class Animal {
	
	String name;	// ������ �̸� 
	int age; 		// ������ ����
	String color; 	// ������ ����
	
	void eat() {
		System.out.println("��� ������ ������ �Խ��ϴ�.");
	}
	void sleep() {
		System.out.println("��� ������ ���� ��ϴ�.");
	}
	
	public static void main(String[] args) {
		// ��ĳ������ ���������� ó���ϱ� ������ �ſ� ȿ�������� ���α׷����� ó���� �� �ִ�.
			// ������ : �������̵�(���) �� �̿��ؼ� ��ӿ��� �ϳ��� �޼ҵ�� ���� ������ ó��
		
		// 1. Animal Ŭ���� ��üȭ
		Animal a1 = new Animal();	// �ڽ��� �ʵ�� �޼ҵ常 ����
		
		// 2. DogŬ������ Dog Ÿ������ ��üȭ
		Dog d1 = new Dog();		// Animal �� Dog �� �ʵ�� �޼ҵ� ����
		
		// 3. Dog�� AnimalŸ������ ��ĳ����
		Animal a2 = new Dog();	// a2 �� Animal,Dog �� �����ϰ� �ְ� Animal �� �ʵ�� �޼ҵ常 ���� �����ϴ�
		
		// 4. Dog_Sub�� AnimalŸ������ ��ĳ����
		Animal a3 = new Dog_Sub();	// a3 �� Animal, Dog, Dog_sub �� �����ϰ� �ְ� Animal�� �ʵ�� �޼ҵ常 ���� �����ϴ�.
			// Animal Ŭ������ �ʵ�
			a3.name = "��ũ���׸���";
			
			// Dog Ŭ������ �ʵ�
			//a3.dog = 6; <== ���ٺҰ�
			
		// 5. Dog_Sub�� Dog ������ Ÿ������ ��ĳ����
		Dog d2 = new Dog_Sub();	// d2 �� Animal, Dog, Dog_sub �� �����ϰ� �ְ� Animal,Dog�� �ʵ�� �޼ҵ常 ���� �����ϴ�.
			// Animal Ŭ������ �ʵ�
			d2.name = "���۵�";
		
			// Dog Ŭ������ �ʵ�
			d2.dog = 5;
			
			// Dog_Sub Ŭ������ �ʵ�
			// d2.dog_sub; <== ���ٺҰ�
			
		// 6. Dog_Sub�� Dog_Sub ������ Ÿ������ ��üȭ
		Dog_Sub ds1 = new Dog_Sub();	// ds1 �� Animal, Dog, Dog_sub �� �����ϰ� �ְ� Animal,Dog,Dog_Sub�� �ʵ�� �޼ҵ忡 ���� �����ϴ�.
			// Animal Ŭ������ �ʵ�
			ds1.name = "������";	
			ds1.age = 4;
			
			// Dog Ŭ������ �ʵ�
			ds1.dog = 4;
			
			// Dog_Sub Ŭ������ �ʵ�
			ds1.dog_sub = 2;
			
			
	// ��ӿ��� ��ĳ���� , �ٿ�ĳ����
		// ��ĳ���� : �ڽĵ����� Ÿ�Կ��� �θ� ������ Ÿ������ ��ȯ�ϴ� ��
			// �θ� Ÿ���� �ʵ�� �޼ҵ常 ���ٰ���
			// ���� Ÿ�� ��ȯ ���� �ڵ����� ��ĳ����
			// ds1�� Dog_sub �� ������ Ÿ���� ������ �ִ�. Animal, Dog, Dog_Sub ���ٰ���
		
			Dog ds1_c1 = ds1;		// ��ĳ���� : Dog_Sub ===> Dog Ÿ������ ��ĳ����
			Animal ds1_c2 = ds1;	// ��ĳ���� : Dog_Sub ===> Animal Ÿ������ ��ĳ����
			
			
		// �ٿ�ĳ���� : �θ� ������ Ÿ���� �ٽ� �ڽ� ������ Ÿ������ ��ȯ
			// ������ Ÿ�� ��ȯ�� �ʿ���
			
			Dog a3_down1 = (Dog)a3;	// �ٿ�ĳ���� : Animal ===> Dog Ÿ������ �ٿ�ĳ����
			Dog_Sub a3_down2 = (Dog_Sub)a3;	// �ٿ�ĳ���� : Animal ===> Dog_Sub Ÿ������ �ٿ�ĳ����

	}

}
