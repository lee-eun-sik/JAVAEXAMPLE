package Nested;

public class A_local {
	//생성자
	A_local() {
		//로컬 클래스 선언
		class B {}
		
		//로컿 객체 생성
		B b = new B();
	}
	
	//메소드
	void method() {
		//로컬 클래스 선언
		class B {}
		
		//로컬 객체 생성
		B b = new B();
	}
	
	
}
