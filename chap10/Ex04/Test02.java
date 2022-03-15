package chap10.Ex04;

class Animal3 {		// �θ�Ŭ����, ��� Ŭ������ Object Ŭ������ ����Ѵ�.
	String name;
	int age;
	
	void cry() {
		System.out.println("������ ��ϴ�.");
	}

	@Override	// Object.toString �޼ҵ�� ��ü ��ü�� ����� �� ȸ��ȴ�.
	public String toString() {		// ��ü�� �ּҸ� ����մϴ�. [��Ű����.Ŭ������@��ü�Ǹ޸����콬�ڵ�]
		return "�̸��� : "+ name +", ���̴� : " + age + " �Դϴ�. ";
	}
	
	
	
}
class Tiger3 extends Animal3 {
	Tiger3(){}	// �⺻������ (�ٸ������ڰ� ��ü���� ������ ��� �⺻�����ڸ� ȣ���� �� �⺻�����ڰ� �����Ǿ������� �����߻�)
	Tiger3(String a, int b){ // ������ : ��ü�� �����Ҷ� �޸��� �ʱⰪ�� �Ҵ� �� �� ����
		super.name = a;
		super.age = b;
	}
	@Override
	void cry() {
		//super.cry();	// super Ű����� �θ�Ŭ����, super : ��� �����϶� �θ�Ŭ����
						// this Ű����� �ڱ��ڽ��� ��ü
		System.out.println("ȣ���̴� ���� �ϰ� ��ϴ�.");
	}
	
}
class Cat3 extends Animal3{
	Cat3(){}
	Cat3(String a, int b){
		super.name = a;
		super.age = b;
	}
	@Override
	void cry() {
		//super.cry();
		System.out.println("����̴� �߿� �ϰ� ��ϴ�.");
	}
	
}
class Dog3 extends Animal3{

	Dog3(){}
	Dog3(String a, int b){
		super.name = a;
		super.age = b;
	}
	@Override
	void cry() {
		//super.cry();
		System.out.println("���� �۸��ϰ� ��ϴ�.");
	}
	
}

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal3 a3 = new Animal3();
		System.out.println(a3); 	// ��ü ��ü�� ��� : ObjectŬ������ toString�޼ҵ尡 ȣ��
									// Object.toString() : ��ü�� �޸��ּ��� �콬�ڵ带 ���
									// chap10.Ex04.Animal3@32d2fa64
									// ��Ű���� .   ��ü��     @ �콬�ڵ�
		System.out.println(a3.toString());
		
		System.out.println("==============");
		Animal3 t3 = new Tiger3();
		Animal3 c3 = new Cat3();
		Animal3 d3 = new Dog3();
		
		t3.cry(); 	// �θ��� cry()�� ȣ�� �� ��� �������̵��� Tiger3�� cry()�� ȣ��
		c3.cry();	// Animal3.cry �� ȣ�� ===> �������̵��� Cat3�� cry()�� ȣ��
		d3.cry();
		
		System.out.println("=============");
		Animal3[] arr = {t3,c3,d3};
		for (int i = 0 ; i<arr.length ; i++) {
			arr[i].cry();
		}
		System.out.println("=============");
		for(Animal3 k :arr) {
			k.cry();
		}
		System.out.println("=============");
		
		Animal3 tt3 = new Tiger3("ȣ����",5);
		Animal3 cc3 = new Cat3("�����",3);
		Animal3 dd3 = new Dog3("��",10);
		
		System.out.println(tt3);	// ��ü ��ü�� ��½� Object �� toString �޼ҵ尡 ���(��ü�� �޸� ����ڵ�)					
		System.out.println(cc3);
		System.out.println(dd3);
		System.out.println("=============");
		Animal3[] arr2 = {tt3,cc3,dd3};
		for(int i = 0; i<arr2.length;i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();
		System.out.println("=============");
		for(Animal3 k : arr2) {
			System.out.print(k);
		}
		
	}

}
