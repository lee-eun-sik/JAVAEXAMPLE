package ex;

public class 연산의방향과우선순위 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//x>0 && y<0
		//100 * 2 / 3 % 5
		//a = b = c = 5;
		int var1 = 1;
		int var2 = 3;
		int var3 = 2;
		int result = var1 + var2 * var3;
		System.out.println(result);
		
		int result1 = (var1 + var2)*var3;
		System.out.println(result1);
	}

}
