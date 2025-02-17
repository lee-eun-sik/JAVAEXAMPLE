package pj1;

public class Mo2 {
	private String str1;
	private int int1;
	
	public static String str2;
	public static String str3;
	//일반 메소드 정적변수 사용가능 정적 메소드 사용가능, this사용가능
	public void setStr1(int int1, String str2 ) {
		//this
		this.int1 = int1;
		//정적 메소드 사용
		setStr2(str2);
		System.out.println("int1:"+int1);
	}
	//정적 메소드는 정적변수, 정적 메소드 사용가능
	public static void setStr2(String str) {
		str2 = str;
		System.out.println("str:"+str);
	}
	//정적 메소드는 정적변수, 정적 메소드 사용가능
	public static void setStr3(String str2, String str) {
		//정적맴버가 아닐시 사용불가능 인스턴스가 필요한 this 사용불가능
		//this
		//str1 = str2;
		//setStr(10,"");
		setStr2(str2); //this와 정적멤버들만 사용가능
		str3 = str;
		System.out.println("str3:"+str);
		
		
	}
}
