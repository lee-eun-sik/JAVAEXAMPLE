package pj1;

public class This {

	public static class Cons {
		int int1;
		String str1;
		String str2;
		String str3;
		
		//기본 생성자
		
		public Cons() {
			System.out.println(" 기본 ");
		}
		
		//생성자 오버로딩
		public Cons (int int1) {
			this.int1 = int1;
			System.out.println("int1 :"+int1);
		}
		
		public Cons(String str1) {
			this();
			this.str1 = str1;
			System.out.println(" str1 : "+ str1);
		}
		
		public Cons(String str1, String str2) {
			this(str1);
			this.str2 = str2;
			System.out.print(" str1 : " +str1);
			System.out.println(" str2 : " +str2);
		}
		
		public Cons(String str1, String str2, String str3) {
			this(str1,str2);
			this.str3 = str3;
			System.out.print(" str1 : "+str1);
			System.out.print(" str2 : "+str2);
			System.out.print(" str3 : "+str3);
			
		}
	}

}
