package Try;

public class ThrowExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("예외 처리: " + e.toString());
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}

}
