package sec07.exam01;

public class RemoteControlExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스 변수 선언
		RemoteControl2 rc;
		
		//Television1 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television1();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		//Audio1 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio1();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
