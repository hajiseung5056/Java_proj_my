package chap03;
public class OperatorEx04 {
	public static void main(String[] args) {
		/*
		 * ���Կ����� (=, +=, -=, *=, /=, >>=, <<=, >>>=), ���Ŀ��� �켱������ ���� ����.
		 * a = b;     <== b������ ���� a�� �Ҵ��Ѵ�
		 * a += b;    <== a = a + b
		 * a -= b;    <== a = a - b
		 * a *= b;    <== a = a * b
		 * a /= b;    <== a = a / b
		 * a &= b;    <== a = a & b
		 * a |= b;    <== a = a | b
		 * a <<= b;   <== a = a <<= b
		 * */
		
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);
		System.out.println();
		
		int value2;  // �⺻�ڷ����� ��� ������ ���� ���� ���� ��� �⺻������ 0�� �Ҵ�.
		value2 = 5;  // �����ڷ����� ��� ������ ���� ���� ���� ��� �⺻������ NULL�� �Ҵ�.
		// ���ǥ��
		System.out.println(value2 += 2);  // value2 = value2 + 2
		System.out.println(value2 -= 2);  // value2 = value2 - 2
		System.out.println(value2 /= 2);  // value2 = value2 / 2
		value2 = 5; System.out.println(value2 %= 2);
		value2 = 5; System.out.println(value2 |= 2);    // value2 = value2 | 2
		value2 = 5; System.out.println(value2 &= 2);    // value2 = value2 & 2
		
		value2 = 5; System.out.println(value2 <<= 2);  // value2 = value2 << 2
		value2 = 5; System.out.println(value2 >>= 2);  // value2 = value2 >> 2
		
		value2 = 5; System.out.println(value2 >>>=2);  // value2 = value2 >>> 2 ��ȣ��Ʈ �Բ��̵�
		int value3;
		value3 = -128; System.out.println(value3 >>> 27);
		
	}

}
