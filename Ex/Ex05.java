package Ex;
public class Ex05 {
	public static void main(String[] args) {
		// �迭�� �̿��ؼ� 1~10���� ���� ���
		int [] scores = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int i = 0 ; i < scores.length ; i++) {
			sum = sum + scores[i];
		}
		System.out.println(sum);
		System.out.println("=====�ش�======");
		int[] scores1 = {1,2,3,4,5,6,7,8,9,10};
		int sum1 = 0 ;
		for(int i = 0 ; i < scores1.length ; i++) {
			sum1 += scores[i];
		}
		System.out.println("�迭�� �� ���� ���� : " + sum1);
	}
}
