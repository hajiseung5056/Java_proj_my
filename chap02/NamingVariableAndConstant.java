package chap02;
public class NamingVariableAndConstant {
	public static void main(String[] args) {
		// ������
		boolean aBcD;  // �������� ù�ڴ� �ҹ��ڷ� ����, �ܾ �����ϴ� ��� ù���ڴ� �빮�ڷ��ۼ�
		byte �����ٶ�;  // �������� �ѱ��� �ֿ� �� �ִ�. (�������� ����)
		short _abcd;  // ������ Ư������ _�� ����� �� �ִ�.
		char $ab_cd;  // ������ Ư������ $,_�� ����� �� �ִ�.
		// char ab cd; // �����̳� �ٸ� Ư�����ڴ� �ֿ� �� ����.
		long abcd3;  // ������ ���ڸ� �ֿ� �� �ִ�. �� ù���ڿ��� ���ڸ� ���� �� ����.
		//long 3abcd;  // ù ���ڿ� ���ڰ� ���� ���� �߻�
		double main;  
		// double class; // �ڹٿ��� ����ϴ� �������� ���������� ����� �� ����.
		int ABCD;  // �������� �빮�ڷ� ��밡�� (�������� ����), ����� ������� ��ü �빮�ڷ� ����Ѵ�.
		
		// ��� : ����� ���� ���� �� �� ����. final Ű���带 ��� �Ѵ�. ������� �빮�ڷ� ����Ѵ�.
		final double PI;
		final int MY_DATA;
		final float my_Data;  // �ҹ��ڵ� ��밡���ϳ� �������� ����
		
		PI = 3.141957;
		
		System.out.println(PI);
		
		// PI = 123.4567;  // ������� ���� ���Ҵ� �� �� ����.
		
		abcd3 = 1234L;  // ���� ������Ÿ�� long  ������ ���� �Ҵ� �Ҷ�, L, l�� ����� ��� �Ѵ�.
		System.out.println(abcd3);
		abcd3 = 56789l;  // ������ ���� ���Ҵ�
		System.out.println(abcd3);
		
		aBcD = true;  // boolean Ÿ�Կ��� true, false�� ���� �� �ִ�.
		
		�����ٶ� = 127;  // byte : 1byte (-128 ~ 127)
		System.out.println(�����ٶ�);
		// �����ٶ� = 128;  // 
	}

}
