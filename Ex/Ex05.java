package Ex;
public class Ex05 {
	public static void main(String[] args) {
		// 배열을 이용해서 1~10까지 합을 출력
		int [] scores = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int i = 0 ; i < scores.length ; i++) {
			sum = sum + scores[i];
		}
		System.out.println(sum);
		System.out.println("=====해답======");
		int[] scores1 = {1,2,3,4,5,6,7,8,9,10};
		int sum1 = 0 ;
		for(int i = 0 ; i < scores1.length ; i++) {
			sum1 += scores[i];
		}
		System.out.println("배열의 각 방의 합은 : " + sum1);
	}
}
