package ex;

public class CarExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		Car6 myCar = new Car6();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도: " + myCar.getSpeed());
	}

}
