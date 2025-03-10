package ex;

public class ChildExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성 및 자동 타입 변환
		Parent1 parent = new Child1();
		
		//Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		 parent.field2 = "data2";	//(불가능)
		 parent.method3();			//(불가능)
		 */
		
		//강제 타입 변환
		Child1 child = (Child1) parent;
		
		//Child 타입으로 필드와 메소드 사용
		child.field2 = "data2";	//(가능)
		child.method3(); 		//(가능)
	}

}
