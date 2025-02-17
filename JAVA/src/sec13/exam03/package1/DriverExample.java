package sec13.exam03.package1;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Driver 객체 생성
		Driver driver = new Driver();
		
		//Vehicle 구현 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//매개값으로 구현 객체 대입(다형성: 실행 결과가 다름)
		driver.drive(bus);
		driver.drive(taxi);
	}

}
