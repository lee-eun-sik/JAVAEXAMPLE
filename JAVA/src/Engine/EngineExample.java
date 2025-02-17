package Engine;

public class EngineExample {
	/**
	 * 자바 실행함수
	 * @param args 실행할때 입력값들
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동차 객체
		Car car = new Car();
		
		//부모 타입변수에 자식 객체 주입
		
		Engine gasolineEngine = new GasolineEngine(2025);
		Engine dieselEngine = new DieselEngine(2024);
		Engine electricMotor = new ElectricMotor(2023);
		
		car.setModelName("가솔린차");
		car.setYear(2025);
		car.printCatalogue(gasolineEngine);
		car.setModelName("디젤차");
		car.setYear(2024);
		car.printCatalogue(dieselEngine);
		car.setModelName("전기차");
		car.setYear(2023);
		car.printCatalogue(electricMotor);
	}

}
