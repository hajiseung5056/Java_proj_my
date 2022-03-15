package Ex;
class Student{
	String name;	// 학생이름
	int studentID;	// 학번
	int kor; 		// 국어점수
	int eng;		// 영어점수
	int math;		// 수학점수
	int sum;		// 점수합계
	double avg;		// 점수평균
	
	
	void hobby() {
		System.out.println("각 학생의 취미 입니다.");
	}

	@Override
	public String toString() {
		return "이름 : " + name + " , 학번 : " + studentID + " , 국어 : " + kor + " , 영어 : " + eng + " , 수학 : " + math + " , 합계 : " + sum + " , 평균 : " + avg;
	}
}

class S_철수 extends Student{
	S_철수(){}
	S_철수(String a, int b, int c, int d, int e){
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
		System.out.println("철수의 취미는 낚시입니다.");
	}
}

class S_영희 extends Student{
	S_영희(){	}
	S_영희(String a, int b, int c, int d, int e){
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
		System.out.println("영희의 취미는 독서입니다.");
	}
}


class S_영식 extends Student{
	S_영식(){}
	S_영식(String a, int b, int c, int d, int e){
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
		System.out.println("영식의 취미는 운동입니다.");
	}
}


public class Quiz03 {

	public static void main(String[] args) {
		Student s1 = new S_철수("철수",1111,80,90,95);
		Student s2 = new S_영희("영희",2222,95,57,68);
		Student s3 = new S_영식("영식",3333,68,99,87);
		Student[] arr = {s1,s2,s3};
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
			arr[i].hobby();
		}
		
	}

}
