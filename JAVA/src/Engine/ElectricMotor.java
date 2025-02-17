package Engine;
//전기 모터 클래스
public class ElectricMotor extends Engine{
	//연료
	private String fuel;
	public ElectricMotor() {
		super();
	}
	
	/**
	 * 생성자
	 * **@param** year 년식
	 * **@param** engineKing 엔진종류
	 * **@param** fuel 연료
	 */
	
	public ElectricMotor(int year) {
		super(year, "전기모터");
		this.fuel = "전기";
	}
	
	public String getCFuel() {
		return fuel;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	
}
