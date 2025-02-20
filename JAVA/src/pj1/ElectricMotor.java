package pj1;

public class ElectricMotor extends Engine {
	public String fuel;
	
	public ElectricMotor() {
		super();
	}
	
	public ElectricMotor(int year) {
		super(year, "전기모더");
		this.fuel = "전기";
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
}
