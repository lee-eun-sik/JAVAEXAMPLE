package System;

public class ErrExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int value = Integer.parseInt("1oo");
		} catch(NumberFormatException e) {
			System.out.println("[에러 내용]");
			System.out.println(e.getMessage());
		}
	}

}
