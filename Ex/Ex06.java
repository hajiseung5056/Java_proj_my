package Ex;

public class Ex06 {

	public static void main(String[] args) {

		
		System.out.println("====해답====");
		int[] array = {4,5,1,2,3};
		int max = 0;
		
		for(int i = 0 ; i < array.length ; i++) {
			if(array[1] > max) {
				max = array[i];
			}
		}
		System.out.println("최대값은 " + max);
	}
}
