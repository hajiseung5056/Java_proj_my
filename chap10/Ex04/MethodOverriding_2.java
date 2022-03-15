package chap10.Ex04;

// �޼ҵ� �������̵�

class Animal2{
	void run() {}
}

class Tiger extends Animal2{	// ȣ���̴� �׹߷� �޸��ϴ�.
	@Override
	void run() {
		System.out.println("ȣ���̴� �׹߷� �޸��ϴ�.");
	}	
	void tigerEat() {
		System.out.println("ȣ���̴� ������ �Խ��ϴ�.");
	}
}

class Eagle extends Animal2{
	@Override
	void run() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	void eagleEat() {
		System.out.println("�������� �ٸ� ���� ��ƸԽ��ϴ�.");
	}
}

class Snake extends Animal2{
	@Override
	void run() {
		System.out.println("���� ���ٴմϴ�.");
	}
}




public class MethodOverriding_2 {

	public static void main(String[] args) {
		// 1. ��� ��ü�� Animal2 Ÿ������ ��ĳ���û���
		Animal2 at = new Tiger();
		Animal2 ae = new Eagle();
		Animal2 as = new Snake();
		
		// 2. Animal2 �迭�� �� ��ü�� ����.
		Animal2[] animal2 = {at,ae,as};
		
		// 3. for ������ �迭�� ��ü�� ��� . run
		System.out.println("====for��====");
		for (int i = 0 ; i < animal2.length ; i++) {
			animal2[i].run();
		}
		
		
		// 4. Enhanced for ���� ����ؼ� ��ü�� run() �޼ҵ� ���
		System.out.println("====Enhanced for��====");
		for (Animal2 k : animal2) {
			k.run();
		}
		
		// 5. �ٿ�ĳ����(instanceof) ����ؼ� ���
		System.out.println("====�ٿ�ĳ����(instanceof)====");
		for (int i = 0 ; i < animal2.length ; i++) {
			if (animal2[i] instanceof Tiger) {
				Tiger tt = (Tiger) animal2[i];
				tt.tigerEat();
			}else if(animal2[i] instanceof Eagle) {
				Eagle ee = (Eagle) animal2[i];
				ee.eagleEat();	
			}
		}
	}

}
