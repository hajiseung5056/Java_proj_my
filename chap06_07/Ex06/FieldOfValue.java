package chap06_07.Ex06;

// ��ü�� �ʵ忡 ���� �Ҵ��ϴ� ��� 3����
	// 1. �ʵ忡 ���� ���� �ο�					<== ��ü ������
	// 2. setter�� ���ؼ� ���� �ο�. ��Ʈ�� ����	<== ��ü ������
	// 3. �����ڸ� ���ؼ� ���� �ο�. ��Ʈ�� ����		<== ��ü ������ �ʱⰪ���� �ʵ忡 ���� �Ҵ�.


class Aa{	// 1. �����Ҵ�
	String name = "������";	// �̸�
	int age = 28;		// ����
	String mail = "aaa@aaa.com";	// �����ּ�
	
	void print() {
		System.out.println("name : " + name + " age : " + age + " mail : " + mail);
	}
}

class Bb{	// 2. setter����� �Ҵ�
	String name;	// �̸�
	int age;		// ����
	String mail;	// �����ּ�
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}


	void print() {
		System.out.println("name : " + name + " age : " + age + " mail : " + mail);
	}
}

class Cc{	// 3. ������ ����Ͽ� �Ҵ�
	String name;	// �̸�
	int age;		// ����
	String mail;	// �����ּ�
	
	Cc(){
		name = "������";
		age = 28;
		mail = "aaa@aaa.com";
	}
	
	void print() {
		System.out.println("name : " + name + " age : " + age + " mail : " + mail);
	}
}


public class FieldOfValue {

	public static void main(String[] args) {
		// 1. ��ü�� �ʵ忡 �������� �Ҵ�.
		System.out.println("====�����Ҵ�====");
		Aa aa = new Aa();
		aa.print();
		
		// 2. ��ü�� setter�� ����ؼ� �ʵ��� ���� �Ҵ�.
		System.out.println("====setter====");
		Bb bb = new Bb();
		bb.setName("������");
		bb.setAge(28);
		bb.setMail("aaa@aaa.com");
		bb.print();
		
		// 3. �����ڸ� ����ؼ� �ʵ��� ���� �Ҵ�.
		System.out.println("====������====");
		Cc cc = new Cc();
		cc.print();
	}

}
