package chap06_07.Ex01;

class Aaa {
	String name;     // �ʵ� : ��üȭ ���Ѿ� ��� ����, Ŭ���� ������� ����
	int age;         // �ʵ��� ������ Heap ������ ����, Heap ������ ������ ������ ���� �ʱ�ȭ
	double weigth;
	String email;    // �������� : Null, int : 0, double : 0.0, boolean : false
	boolean man;
	
	public String getName() {          // �޼ҵ� ȣ��
		return name;
	}
	public void setName(String name) { // ��ǲ�Ǵ� ����, �޴� �����̸�, �޸� �̸��� ��� ������ ���  
		this.name = name;			   // �޸� �̸��� this : �ڽ��� Ŭ������ ����
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	public boolean getMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	
	
	
}
public class CreateObject_02 {

	public static void main(String[] args) {

		Aaa aaa = new Aaa();    // ��ü�� ���� (aaa)
		
		// �ʵ��� �ʱ� ���� ��� (Heap������ ���� �ʱ�ȭ)
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weigth);
		System.out.println(aaa.man);
		System.out.println(aaa.email);
		
		// ������ ���� ���� ���� [Heap] , ���Ȼ� �޸𸮿� ���� ���� �Ҵ��ϴ� ���� ���� �ʴ�.
		aaa.name = "ȫ�浿";
		aaa.age = 30;
		aaa.weigth = 70.5;
		aaa.man = true;
		aaa.email = "aaa@aaa.com";
		
		// setter�� ���ؼ� ���� ���� , �޸𸮿� ���� ���� �� ��� �� �� �ִ�.
			// ���� �����ϴ� ���� (1�� ~ 12��)
		aaa.setName("�������");
		aaa.setAge(60);
		aaa.setWeigth(70.5);
		aaa.setMan(true);
		aaa.setEmail("bbb@bbb.com");
		
		// getter�� ���ؼ� �޸𸮰��� ���
		System.out.println(aaa.getName());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmail());
		System.out.println(aaa.getWeigth());
		System.out.println(aaa.getMan());
		
		
		// �ϳ��� Ŭ�������� �������� ��ü�� ���� �� ���.
	}

}

