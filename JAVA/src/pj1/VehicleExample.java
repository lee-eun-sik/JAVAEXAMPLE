package pj1;

public class VehicleExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		
		//부모 타입변수에 자식 객체 주입
		Engine gasolineEngine = new GasolineEngine(2025);
		Engine dieselEngine = new DieselEngine(2024);
		Engine electricMotor = new ElectricMotor(2023);
		vehicle.setModelName("가솔린차");
		vehicle.setYear(2025);
		vehicle.printCatalogue(gasolineEngine);
		
		vehicle.setModelName("디젤차");
		vehicle.setYear(2024);
		vehicle.printCatalogue(dieselEngine);
		
		vehicle.setModelName("전기차");
		vehicle.setYear(2023);
		vehicle.printCatalogue(electricMotor);
	}

}
