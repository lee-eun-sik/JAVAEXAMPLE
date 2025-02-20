package Engine;
//가솔린 엔진 클래스
public class GasolineEngine extends Engine {
	//연료
	private String fuel;
	public GasolineEngine() {
		super();
	}
	
	/**
	 * 생성자
	 * **@param** engineKind 엔진종류
	 * **@param** fuel 연료
	 */
	
	public GasolineEngine(int year) {
		super(year, "가솔린엔진");
		this.fuel = "휘발유";
	}

	public String getCFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getFuel() {
		return fuel;
	}
	
	
}
