package chap02;
public class OperationBetweenDataType {
	public static void main(String[] args) {
		System.out.println("====�����ڷ������� ����====");
		// ���� �ڷ��� ���� ����
		int value1 = 3 + 5;         // int + int = int
		int value2 = 8 / 5;         // int / int = int
		float value3 = 3.0f + 5.0f; // float + float = float
		double value4 = 8.0 / 5.0;  // double / double = double
		byte data1 = 3;
		byte data2 = 5;
		
		// byte value5 = data1 + data2; // �����߻�
		int value5 = data1 + data2; // int���� ���� �ڷ����� ���� ����� int Ÿ������ ��ȯ
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println("====�ٸ��ڷ������� ����====");
		// �ٸ� �ڷ��� ���� ����
		// int value6666 = 5 + 3.5     // ���� �߻�
		int value66 = (int)(5 + 3.5);  // int Ÿ������ ������ȯ �Ͽ� ���� �ذ�
		double value6 = 5 + 3.5;       // int + double = double
		double value8 = 5 / 2.0;
		
		byte data3 = 3;
		short data4 = 5;
		
		int value9 = data3 + data4;    // int���� ���� ������ Ÿ���� ������ int�� ��ȯ
		// short value99 = data3 + data4; // int���� short�� �޾� ���� �߻�
	    double value10 = data3 + data4; 
		System.out.println(value66);
		System.out.println(value6);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
		
	}

}
