package chap03;
public class OperatorEx01 {
	public static void main(String[] args) {
		int data = 13;
		
		System.out.println(Integer.toBinaryString(data));    // 2������ ��ȯ
		System.out.println(Integer.toOctalString(data));     // 8������ ��ȯ
		System.out.println(Integer.toHexString(data));       // 16������ ��ȯ
		
		System.out.println("==============================");
		
		System.out.println(Integer.parseInt("1101", 2));     // 2������ 10������ ��ȯ
		System.out.println(Integer.parseInt("15", 8));       // 8������ 10������ ��ȯ
		System.out.println(Integer.parseInt("d", 16));       // 16������ 10������ ��ȯ
		
		System.out.println(~3);  // ����� ~ �� �ϸ�, ���� : 0�� �������� ���+1
		System.out.println(~7);
		
		System.out.println("=============================");
		// �پ��� ���� ǥ��
		System.out.println(13);         
		System.out.println(0b1101);    // 0b 2����ǥ��
		System.out.println(015);       // 0  8����ǥ�� 
		System.out.println(0x0d);      // 0x 16����ǥ��
		System.out.println();
	}

}