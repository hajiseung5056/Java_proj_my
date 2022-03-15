package chap04;
public class Overlap_Ex04 {
	public static void main(String[] args) {
		
		
		// 1. if 문 내의 if 문
		int value1 = 4;
		int value2 = 1;
		if (value1 < 5) {
			if(value2 < 2) {
				System.out.println("실행1");
			}else {	System.out.println("실행2");}
		}else {System.out.println("실행3");}
		
		System.out.println("=================");
		// 2. switch 문 내의 for 문
		
		int value3 = 1;
		switch (value3) {
		case 1 :
			for (int k=10; k>0 ; k--) {
				System.out.print(k + " ");
			}
			
			System.out.println();
			break;
		case 2 :
			for (int k =0; k < 10 ; k++) {
				System.out.print(k + " ");
			}
			break;
		}
		
		
		// 3. for 문 내의 for 문
		
		for (int i = 0 ; i < 3 ; i++) {
			for (int j =0 ; j < 5 ; j++) {
				if (i == j) {
					System.out.println(i + " = " + j);
				}else {System.out.println(i + " , " + j);}
			}
		}
		
		
		
		
		
	}

}
