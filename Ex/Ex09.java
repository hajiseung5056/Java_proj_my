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
		System.out.println("평균은 " + c/10);
		
		
		
		System.out.println("====해답====");
		double d = (double) Math.random();
		// 난수발생기 : 임의의 수를 자동으로 발생시킴 (0.00000xxx ~ 0.99999xxx)
		System.out.println(d);
		
		int e = (int)(Math.random()*10);    // 0 ~ 9까지의 랜덤한 값을 랜덤하게 생성
		int f = (int)(Math.random()*10+1);  // 1 부터 10 까지의 값을 랜덤하게 생성
		int g = (int)(Math.random()*100+1); // 1 부터 100 까지의 값을 랜덤하게 생성 
		
		System.out.println("0부터 9까지의 랜덤한 값 : " + e);
		System.out.println("1부터 10까지의 랜덤한 값 : " + f);
		System.out.println("1부터 100까지의 랜덤한 값 : " + g);
		
	}

}
