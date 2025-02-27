package Nested;

public class A3Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3.B b = new A3.B();
		System.out.println(b.field1);
		b.method1();
		
		
		//B 클래스의 정적 필드 및 메소드 사용
		System.out.println(A3.B.field2);
		A3.B.method2();
	}

}
