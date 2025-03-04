package Nested;

public class A2 {
	//정적 멤버 클래스
<<<<<<< HEAD
		static class B {}
		
	//인스턴스 필드값으로 B 객체 대입
	B field1 = new B();
		
	//정적 필드값으로 B 객체 대입
	static B field2 = new B();
		
	//생성자
	A2() {
		B b = new B();
	}
		
	//인스턴스 메소드 
	void method1() {
		B b = new B();
	}
		
=======
	static class B {}
	
	//인스턴스 필드값으로 B 객체 대입
	B field1 = new B();
	
	//정적 필드값으로 B 객체 대입
	static B field2 = new B();
	
	//생성자
	A2() {
		B b = new B();
	}
	
	//인스턴스 메소드 
	void method1() {
		B b = new B();
	}
	
>>>>>>> branch 'main' of https://github.com/lee-eun-sik/JAVAEXAMPLE.git
	//정적 메소드
	static void method2() {
		B b = new B();
	}
}
