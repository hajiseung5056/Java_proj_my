package chap10.Ex04;

// �޼ҵ� �������̵��� ���������ڿ��� ����
	// �ڽ��� Ŭ�������� �θ��� �޼ҵ带 ������ �Ұ�� ���������ڴ� �θ�� ���ų� �о�� �Ѵ�.

class Aaa {
	protected void abc () {}
}
class B1 extends Aaa{
	@Override
	public void abc() {}
}
class B2 extends Aaa{
	@Override
	protected void abc() {}
}
class B3 extends Aaa{
	//@Override
	//void abc() {} 	// �����߻� : �����󸮵��� �޼ҵ��� ���������� ����
}
class B4 extends Aaa{
	//@Override
	//private void abc() {} 	// �����߻� : �����󸮵��� �޼ҵ��� ���������� ����
}

public class MethodOverriding_3 {

	public static void main(String[] args) {

	}

}
