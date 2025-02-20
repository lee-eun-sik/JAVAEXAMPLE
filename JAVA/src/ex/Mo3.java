package ex;

public class Mo3 {
	public int int1;
	public String str1;
	
	private static Mo3 sg = new Mo3();//자기 자신 만듦, 기본생성자 생성필요없다.
	
	//생성자 private 생성자가 안보임, 생성자 사용을 막아버림
	private Mo3 () {
		
	}
	//인스턴스 리턴함수
	public static Mo3 getIn() {
		return sg;
	}
	
}
