package chap06_07.Ex06;

//static Ű�� �Ҵ�� �ʵ�� ��� ��ü���� �����ؼ� ����ϴ� �޸� ����.

class D {
	int m = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D d1 = new D(); //��ü ����
		D d2 = new D();
		D d3 = new D();
		D d4 = new D();
		
		//�ν���Ʈ �ʵ� : �� ��ü���� �������� �ʴ� �� ��ü������ ���.
		d1.m = 5;
		d2.m = 6;
		d3.m = 7;
		d4.m = 8;
		System.out.println(d1.m);
		System.out.println(d2.m);
		System.out.println(d3.m);
		System.out.println(d4.m);	//8
	
	}

}
