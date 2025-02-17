package sec08.exam02;

public class ExtendsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImpl impl = new InterfaceImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
		//ia.methodB();
		System.out.println();
		
		InterfaceB ib = impl;
		//ib.methodA();
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
