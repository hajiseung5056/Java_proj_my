package chap06_07.Ex04;

// ����� this Ű���� �߰� : �ݵ�� this Ű�� ����ؾ� �ϴ� ���
class Aa {		// this Ű�� ������� ���� ���
	int m ;
	int n ;
	void init(int m, int n){
		m = m;			// this Ű�� ������� �ʴ°�� m <== �������� m
		n=n;			// this Ű�� ������� �ʴ°�� n <== �������� n
	}
	
}

class Bb {		// this Ű�� ����� ���
	int m;
	int n;
	void init(int m, int n) {
		this.m = m;		// this Ű�� ����� ��� m <== �ʵ� m
		this.n = n;		// this Ű�� ����� ��� n <== �ʵ� n
	}
}



public class ThisKeyword_2 {

	public static void main(String[] args) {

		// 1. �ʵ��� ��� ���������� ���� ���� ��� (this Ű���带 ������� ������� : ���������� ����)
		Aa aa = new Aa();
		aa.init(2, 3);
		System.out.println(aa.m);  // 0
		System.out.println(aa.n);  // 0
		// 2. �ʵ��� ��� ���������� ���� ���� ��� (this Ű���带 ����ϴ� ��� : �ʵ� ������ ����)
		Bb bb = new Bb();
		bb.init(2, 3);
		System.out.println(bb.m);  // 2
		System.out.println(bb.n);  // 3
	}

}
