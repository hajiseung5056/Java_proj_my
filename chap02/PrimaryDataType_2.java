package chap02;
public class PrimaryDataType_2 {
	public static void main(String[] args) {
		// char �ڷ����� ���� �Ҵ��ϴ� ���
		// ���ڷ� �����ϴ� ���
		char value1 = 'A';  // ������
		char value2 = '��';  // �ѱ�
		char value3 = '3';  // ����3�� �ƴϰ� ����3�� ����Ŵ
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		System.out.println("===============");
		
		// ������ �����ϴ� ���
		char value4 = 65;  // ���� 65�� �ƽ�Ű �ڵ�� ���� A
		char value5 = 0xac00;  // 16�����ΰ��� �Ҵ�, 0x : 16������ ���� �ְڴٰ� ����
		char value6 = 51;  // ���� 51�� �ƽ�Ű �ڵ�� ���� 3
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		
		System.out.println("===============");
		
		// �����ڵ� Ÿ������ ����
		char value7 = '\u0041';  // �����ڵ�� �빮�� A
		char value8 = '\uac00';
		char value9 = '\u0033';
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
		System.out.println("=====���� A �� ���� �ϴ� �پ��� ���==========");
		char a = 'A';           // ���ڷ��Ҵ�
		char b = 65;            // �������Ҵ�
		char c = 0b1000001;     // 2�������Ҵ� (0b : ����������)
		char d = 00101;         // 8�������Ҵ� (00 : 8��������)
		char e = 0x0041;        // 16������ �Ҵ� (0x : 16��������)
		char f = '\u0041';      // �����ڵ尪 �Ҵ�
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println((double)(3/2));
	}

}
