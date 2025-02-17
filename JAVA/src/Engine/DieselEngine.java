package Engine;

public class DieselEngine extends Engine {
	//연료
	private String fuel;
	public DieselEngine() {
		super();
	}
	
	/**
	 * 생성자
	 * **@param** year 년식
	 * **@param** engineKind 엔진종류
	 * **@param** fuel 연료
	 */
	
	public DieselEngine(int year) {
		super(year, "디젤엔진");
		this.fuel = "경유";
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
