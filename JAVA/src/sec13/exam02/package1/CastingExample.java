package sec13.exam02.package1;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스 변수 선언과 구현 객체 대입
		Vehicle vehicle = new Bus();
		
		//인터페이스를 통해서 호출
		vehicle.run();
		//vehicle.checkFare(); (x)
		
		//강제 타입 변환 후 호출
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}

}
