package Try;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외 발생
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		//예외 발생
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
