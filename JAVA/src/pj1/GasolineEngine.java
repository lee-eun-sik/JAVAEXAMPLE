package pj1;
//가솔린 엔진 클래스
public class GasolineEngine extends Engine {
	//연료
	private String fuel;
	
	public GasolineEngine() {
		super();
	}
	
	
	public String getFuel() {
		return fuel;
	}


	public void setFuel(String fuel) {
		this.fuel = fuel;
	}


	public GasolineEngine(int year) {
		super(year, "가솔린엔진");
		this.fuel = "가솔린";
		
	}
	
}
