package ex;

public class BitShiftExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 1<<3;
		//1<<3 = 1 X 2^3 = 8;
		int result6 = -8 >>3; // -8>> 3 = -8 / 2^3 = -1
		int num1 = 1;
		int result1 = num1 <<3;
		int result2 = num1 *(int) Math.pow(2,3);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		int num2 = -8;
		int result3 = num2 >>3;
		int result4 = num2/ (int) Math.pow(2,3);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
	}

}
