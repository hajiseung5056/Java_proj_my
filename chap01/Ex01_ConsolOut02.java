package chap01;
public class Ex01_ConsolOut02 {
	public static void main(String[] args) {
		System.out.printf("���� ���̴� %d �Դϴ�. \n", 30);    // "�������", ����, ����
		                         // %d 10������ ���ڰ����� ������
		System.out.printf("%o\n", 10);
		                // %o 8������ ���ڰ����� ������ 
		System.out.printf("%x\n", 30);
                        // %x 16������ ���ڷ� ������
		System.out.printf("%s\n", "���");
                        // %s ���ڿ��� ���ڰ����� ������ 
		System.out.printf("%f\n", 5.80000);
                        // %f �Ǽ����� ���ڰ����� ������
		System.out.printf("%4.2f\n", 5.8); 
                        // %4.2f ��ü4�ڸ�, �Ҽ������� 2�ڸ��� ���ڰ����� ������
		System.out.printf("%d �� %4.2f\n", 10, 5.80);
	}
}
