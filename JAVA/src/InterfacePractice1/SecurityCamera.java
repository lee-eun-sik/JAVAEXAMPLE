package InterfacePractice1;

public class SecurityCamera implements SmartDevice, Camera{
	//추상메소드 재정의, 인터페이스 다중상속
	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("[SecurityCamera] 사진을 찍습니다.");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("[SecurityCamera] 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("[SecurityCamera] 전원을 끕니다.");
	}

	

}
