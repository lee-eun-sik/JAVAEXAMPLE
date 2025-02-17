package ex;

public class BitLogicExample {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		byte num1 = 45;
//		byte num2 = 25;
//		//byte result = num1 & num2; //컴파일 에러
//		
//		int result = num1 & num2;
//		
//		byte receiveData = -120;
//		int unsigndInt = receiveData & 255; //136
//		
//		byte receiveData1 = -120;
//		int unsigndInt1 = Byte.toUnsignedInt(receiveData1); // 136
		
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("-------------------------------------");
		
		byte receiveData = -120;
		
		//방법1 : 비트 논리곱 연산으로 Unsigned 정수 열기
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		
		//방법2 : 자바 API를 이용해서 Unsigned 정수 열기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
	}

}
