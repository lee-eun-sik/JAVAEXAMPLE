package sec13.exam02.package1;

public class SealedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplClass impl = new ImplClass();
		
		InterfaceA ia = impl;
		ia.methodA();
		
		System.out.println();
		InterfaceB ib = impl;
		ib.methodA();
		ib.methodB();
		
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
