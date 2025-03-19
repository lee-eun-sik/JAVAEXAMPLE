package Lamda_Expressions;

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action((x, y) -> {
			int result = x + y;
			System.out.println("result: " + result);
		});
		
		action((x, y) -> {
			int result = x - y;
			System.out.println("result: " + result);
		});
	}
	
	public static void action(Calcuable calculable) {
		//데이터
		int x = 10;
		int y = 4;
		// 데이터 처리
		calculable.calculate(x, y);
	}

}
