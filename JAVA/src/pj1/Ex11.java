package pj1;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		boolean result = (x == 5); //true
		System.out.println("result:"+result);
		String str = "JAVA";
		String str1 = "JAVA";
		
		if(str.equals(str1)) {
			System.out.println("equals 비교");
		}
		
		String str2 = new String("hello");
		String str3 = new String("hello");
		
		if(str2.equals(str3)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}

}
