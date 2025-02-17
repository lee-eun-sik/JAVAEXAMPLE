package ex;

public enum Week {
	Mon("월요일", "01"),
	Tue("화요일", "02"),
	Wed("수요일", "03"),
	Thu("목요일", "04"),
	Fri("금요일", "05"),
	Sat("토요일", "06"),
	Sun("일요일", "07");
	String lable;
	String code;
	private Week(String lable, String code) { //생성자 실행
		this.lable = lable;
		this.code = code;
	}
	
	public String getLabel() {
		return lable;
	}
	
	public String getCode() {
		return code;
	}
}
