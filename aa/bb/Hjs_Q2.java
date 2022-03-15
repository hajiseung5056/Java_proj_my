package aa.bb;

public class Hjs_Q2 {

	public static void main(String[] args) {
		for(int a = 1 ; a < 20 ; a++) {
			for (int b = 1 ; b < 10 ; b++) {
				if(a%3 != 0) {
					continue;
				}
				System.out.println(a + " x " + b);
			}
			System.out.println("================");
		}
	}

}
