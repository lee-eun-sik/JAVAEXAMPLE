package ex;

public class Mo3Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mo3 m = Mo3.getIn();
		m.int1 = 10;
		System.out.println("m.int1 :"+m.int1);
		
		Mo3 m1 = Mo3.getIn();//정적 인스턴스를 계속 가져다 씀. 유지된다.
		m1.int1 = 20;
		
		System.out.println("m1.int1 : " + m1.int1);
		System.out.println("m.int : " + m.int1);
		
		m.int1 = 30;
		
		System.out.println("m1.int1 = "+m1.int1);
		System.out.println("m.int1 :"+m.int1);
		//생성자 사용불가
		//Mo3 m = new Mo3();
	}

}
