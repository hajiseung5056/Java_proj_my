package Ex;
public class Ex09 {
	public static void main(String[] args) {
		
		double c = 0;
		int[] a = new int [10];
		for (int b = 0 ; b<a.length;b++) {
			a[b] = (int)(Math.random()*10+1);
			System.out.print(a[b] + " ");
			c= c + a[b];
		}
		System.out.println();
		System.out.println("����� " + c/10);
		
		
		
		System.out.println("====�ش�====");
		double d = (double) Math.random();
		// �����߻��� : ������ ���� �ڵ����� �߻���Ŵ (0.00000xxx ~ 0.99999xxx)
		System.out.println(d);
		
		int e = (int)(Math.random()*10);    // 0 ~ 9������ ������ ���� �����ϰ� ����
		int f = (int)(Math.random()*10+1);  // 1 ���� 10 ������ ���� �����ϰ� ����
		int g = (int)(Math.random()*100+1); // 1 ���� 100 ������ ���� �����ϰ� ���� 
		
		System.out.println("0���� 9������ ������ �� : " + e);
		System.out.println("1���� 10������ ������ �� : " + f);
		System.out.println("1���� 100������ ������ �� : " + g);
		
	}

}
