package chap06_07.Ex06;

//static 키가 할당된 필드는 모든 객체에서 공유해서 사용하는 메모리 영역.

class D {
	int m = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D d1 = new D(); //객체 생성
		D d2 = new D();
		D d3 = new D();
		D d4 = new D();
		
		//인스턴트 필드 : 각 개체에서 공유되지 않는 그 객체에서만 사용.
		d1.m = 5;
		d2.m = 6;
		d3.m = 7;
		d4.m = 8;
		System.out.println(d1.m);
		System.out.println(d2.m);
		System.out.println(d3.m);
		System.out.println(d4.m);	//8
	
	}

}
