package ex;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 125;
		for(int i=0; i<5; i++) { //{}를 5번 반복 실행
			var1++;				//++ 연산은 var1의 값을 1 증가시킨다.
			System.out.println("var1: " + var1);
		}
		
		System.out.println("------------------");
		
		byte var2 = -125;	
		for(int i=0; i<5; i++) {	//{ }를 5번 반복 실행
			var2--;					//-- 연산은 var2의 값을 1 감소시킨다.
			System.out.println("var2: " + var2);
		}
		
		int x=1000000;
		int y=1000000;
		int z= x*y;
		System.out.println(z);
		
		long x1=1000000;
		long y1=1000000;
		long z1= x1*y1;
		System.out.println(z1);
		
		byte value =127;
		value++;
		System.out.println(value);
		
		byte value1 = -128;
		value1--;
		System.out.println(value1);
	}

}
