package Ex;
class Student{
	String name;	// �л��̸�
	int studentID;	// �й�
	int kor; 		// ��������
	int eng;		// ��������
	int math;		// ��������
	int sum;		// �����հ�
	double avg;		// �������
	
	
	void hobby() {
		System.out.println("�� �л��� ��� �Դϴ�.");
	}

	@Override
	public String toString() {
		return "�̸� : " + name + " , �й� : " + studentID + " , ���� : " + kor + " , ���� : " + eng + " , ���� : " + math + " , �հ� : " + sum + " , ��� : " + avg;
	}
}

class S_ö�� extends Student{
	S_ö��(){}
	S_ö��(String a, int b, int c, int d, int e){
		super.name = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c + d + e;
		super.avg = ((double)c + d + e)/3;
	}
	@Override
	void hobby() {
		System.out.println("ö���� ��̴� �����Դϴ�.");
	}
}

class S_���� extends Student{
	S_����(){	}
	S_����(String a, int b, int c, int d, int e){
		String name = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c + d + e;
		super.avg = ((double)c + d + e)/3;
	}
	@Override
	void hobby() {
		System.out.println("������ ��̴� �����Դϴ�.");
	}
}


class S_���� extends Student{
	S_����(){}
	S_����(String a, int b, int c, int d, int e){
		String name = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c + d + e;
		super.avg = ((double)c + d + e)/3;
	}
	@Override
	void hobby() {
		System.out.println("������ ��̴� ��Դϴ�.");
	}
}


public class Quiz03 {

	public static void main(String[] args) {
		Student s1 = new S_ö��("ö��",1111,80,90,95);
		Student s2 = new S_����("����",2222,95,57,68);
		Student s3 = new S_����("����",3333,68,99,87);
		Student[] arr = {s1,s2,s3};
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
			arr[i].hobby();
		}
		
	}

}
