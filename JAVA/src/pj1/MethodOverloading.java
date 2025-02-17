package pj1;

public class MethodOverloading {
	private String str1;
	private String str2;
	private String str3;
	private int int1;
	//메소드 오버로딩
	public void setStr1(int int1) {
		this.int1 = int1;
		System.out.println("int1 : " + int1);
	}
	public void setStr1(String str1) {
		this.str1 = str1;
		System.out.println("str1:"+ str1);
	}
	
	public void setStr1(String str1, int int1) {// 리턴타입 쓰기
		setStr1(str1); //this생략
		setStr1(int1);
		this.str1 = str1;
		this.int1 = int1;
	}
	public void setStr1(String str1, int int1, String str2) {
		setStr1(str1, int1);
		this.str2 = str2;
		System.out.println("str2:"+str2);
	}
	public String getStr1() {
		return str1;
	}
}
