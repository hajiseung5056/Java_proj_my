package chap06_07.Ex06;

// 객체의 필드에 값을 할당하는 방식 3가지
	// 1. 필드에 직접 값을 부여					<== 객체 생성후
	// 2. setter를 통해서 값을 부여. 컨트롤 가능	<== 객체 생성후
	// 3. 생성자를 통해서 값을 부여. 컨트롤 가능		<== 객체 생성시 초기값으로 필드에 값을 할당.


class Aa{	// 1. 직접할당
	String name = "하지승";	// 이름
	int age = 28;		// 나이
	String mail = "aaa@aaa.com";	// 메일주소
	
	void print() {
		System.out.println("name : " + name + " age : " + age + " mail : " + mail);
	}
}

class Bb{	// 2. setter사용항 할당
	String name;	// 이름
	int age;		// 나이
	String mail;	// 메일주소
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}


	void print() {
		System.out.println("name : " + name + " age : " + age + " mail : " + mail);
	}
}

class Cc{	// 3. 생성자 사용하여 할당
	String name;	// 이름
	int age;		// 나이
	String mail;	// 메일주소
	
	Cc(){
		name = "하지승";
		age = 28;
		mail = "aaa@aaa.com";
	}
	
	void print() {
		System.out.println("name : " + name + " age : " + age + " mail : " + mail);
	}
}


public class FieldOfValue {

	public static void main(String[] args) {
		// 1. 객체의 필드에 직접값을 할당.
		System.out.println("====직접할당====");
		Aa aa = new Aa();
		aa.print();
		
		// 2. 객체의 setter를 사용해서 필드의 값을 할당.
		System.out.println("====setter====");
		Bb bb = new Bb();
		bb.setName("하지승");
		bb.setAge(28);
		bb.setMail("aaa@aaa.com");
		bb.print();
		
		// 3. 생성자를 사용해서 필드의 값을 할당.
		System.out.println("====생성자====");
		Cc cc = new Cc();
		cc.print();
	}

}
