package ex;

public class InfinityAndNanCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean result = Double.isInfinite(변수);
		//boolean result = Double.isNaN(변수)
		
		int x = 5;
		double y = 0.0;
		double z = x/y;
		//double = x%y;
		
		//잘못된 코드
		System.out.println(z+2);
		
		//알맞은 코드
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z + 2);
		}
			
	}

}
