package sec08.exam01;

public class RemoteControlExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스 변수 선언
		RemoteControl1 rc;
		
		//Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television1();
		rc.turnOn();
		rc.setVolume(5);
		
		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		//Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio1();
		rc.turnOn();
		rc.setVolume(5);
		
		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		//정적 메소드 호출
		RemoteControl1.changeBattery();
	}

}
