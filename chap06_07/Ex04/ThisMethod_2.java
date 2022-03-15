package chap06_07.Ex04;

// Aaa Ŭ������ �������� �����ڸ� ����� ��� this(); ���� ����� ��� : �ߺ��� ���� �Ź� �Է�
class Aaa{		
	int m1, m2, m3, m4;		// �ʵ� 4�� ����
	Aaa(){		// ������ : �Ű������� ���� ������
		m1 = 1;		m2 = 2;		m3 = 3;		m4 = 4;
	}
	Aaa(int a){
		m1 = a;		m2 = 2;		m3 = 3;		m4 = 4;
	}
	Aaa(int a, int b){
		m1 = a;		m2 = b;		m3 = 3;		m4 = 4;
	}
	Aaa(int a, int b, int c){
		m1 = a;		m2 = b;		m3 = c;		m4 = 4;
	}
	Aaa(int a, int b, int c, int d){
		m1 = a;		m2 = b;		m3 = c;		m4 = d;
	}
	
	void print() {		// �� �޸��� ���� ���
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	}
}


// this(); �� ����ϴ� ���
class Bbb{
	int m1, m2, m3, m4;
	Bbb(){
		m1 = 1;		m2 = 2;		m3 = 3;		m4 = 4;
	}
	Bbb(int a){
		this();
		m1 = a;
	}
	Bbb(int a, int b){
		this(a);
		m2 = b;
	}
	Bbb(int a, int b, int c){
		this(a,b);
		m3 = c;
	}
	Bbb(int a,int b, int c, int d){
		this(a,b,c);
		m4 = d;
	}
	
	void print() {		// �� �޸��� ���� ���
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	}
}



public class ThisMethod_2 {
	public static void main(String[] args) {
		// 1. ��ü ���� ( this �̻��)
		Aaa aaa1 = new Aaa();
		Aaa aaa2 = new Aaa(10);
		Aaa aaa3 = new Aaa(10,20);
		Aaa aaa4 = new Aaa(10,20,30);
		Aaa aaa5 = new Aaa(10,20,30,40);
		aaa1.print();
		aaa2.print();
		aaa3.print();
		aaa4.print();
		aaa5.print();
		System.out.println("===============");
		Bbb bbb1 = new Bbb();
		Bbb bbb2 = new Bbb(10);
		Bbb bbb3 = new Bbb(10,20);
		Bbb bbb4 = new Bbb(10,20,30);
		Bbb bbb5 = new Bbb(10,20,30,40);
		bbb1.print();
		bbb2.print();
		bbb3.print();
		bbb4.print();
		bbb5.print();
		
	}

}
