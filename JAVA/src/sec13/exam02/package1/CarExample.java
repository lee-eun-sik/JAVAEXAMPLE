package sec13.exam02.package1;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동차 객체 생성
		Car myCar = new Car();
		
		//run() 메소드 실행
		myCar.run();
		
		//타이어 객체 교체
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		
		//run() 메소드 실행(다형성: 실행 결과가 다름)
		myCar.run();
	}

}
