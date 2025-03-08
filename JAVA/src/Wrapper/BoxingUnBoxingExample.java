package Wrapper;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Boxing
		Integer obj = 100;
		System.out.println("Value: " + obj.intValue());
		
		//Unboxing
		int value = obj;
		System.out.println("value: " + value);
		
		//연산 시 Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}

}
