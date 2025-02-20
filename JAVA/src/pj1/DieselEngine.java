package pj1;

public class DieselEngine extends Engine{
	//연료
	private String fuel;
	
	public DieselEngine(int year) {
		super(year, "디젤엔진");
		this.fuel = "경유";
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	
}
