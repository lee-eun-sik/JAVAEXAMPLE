package ex;

public class SubstringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum= ssn.substring(7);
		System.out.println(secondNum);
	}

}
