package pj1;

public class Engine {
	//년식
	private int year;
	//엔진종류
	private String engineKind;
	//기본 생성자
	public Engine() {
		
	}
	//추가 생성자
	public Engine(int year, String engineKind) {
		this.year = year;
		this.engineKind = engineKind;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getEngineKind() {
		return engineKind;
	}
	public void setEngineKind(String engineKind) {
		this.engineKind = engineKind;
	}
	

	

}
