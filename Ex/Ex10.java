package Ex;
public class Ex10 {
	public static void main(String[] args) {
		// 369����   ��Ǯ�ڽ��ϴ�...
		
		
		System.out.println("====�ش�====");
		int a, b; // a : 10���ڸ��� ǥ���ϴ� ����, b : 1�� �ڸ��� ǥ���ϴ� ����
		
		for (int i = 1 ; i < 100 ; i++) {
			a = i/10;      // a = 10�� �ڸ��� �ǹ�, i�� 10���� ����� �� �����´�.
			b = i%10;      // b = 1�� �ڸ��� �ǹ�, i�� 10���� ���� ������ ���� �����´�.
			if((a==3 || a==6 || a==9) && (b ==3 || b==6 || b==9)) {
				System.out.println(i + " : �ڼ� ¦¦");
			} else if ((a==3 || a==6 || a==9) && (b!=3 || b!=6 || b!=9)) {
				System.out.println(i + " : �ڼ� ¦");
			} else if ((a!=3 || a!=6 || a!=9) && (b==3 || b==6 || b==9)) {
				System.out.println(i + " : �ڼ� ¦");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
