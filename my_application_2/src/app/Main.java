package app;

import pack1.A;
//import pack2.B;
import pack3.C;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//my_module_a 패키지에 포함된 A 클래스 이용
		A a = new A();
		a.method();
		
		//패키지 은닉하기
//		//my_module_a 패키지에 포함된 B 클래스 이용
//		B b = new B();
//		b.method();
		
		//my_module_b 패키지에 포함된 C 클래스 이용
		C c = new C();
		c.method();
		
		C result = a.getC();
		result.method();
	}

}
