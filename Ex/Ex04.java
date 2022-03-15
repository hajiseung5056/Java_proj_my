package Ex;
public class Ex04 {
	public static void main(String[] args) {
		String b = "";
		int a;
		for(a = 0; a < 4 ; a++) {
			b = b + "*";
			System.out.println(b);
		}
		
		System.out.println("====ÇØ´ä====");
		int lineCount;
		int starCount;
		for(lineCount = 0 ; lineCount < 4 ; lineCount++) {
			for(starCount = 0 ; starCount <= lineCount ; starCount++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
