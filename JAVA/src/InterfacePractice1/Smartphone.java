package InterfacePractice1;

public class Smartphone implements SmartDevice, Camera, MusicPlayer{
	//추상메소드 재정의, 인터페이스 다중상속
	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("[Smartphone] 음악을 재생합니다.");
	}

	@Override
	public void stopMusic() {
		// TODO Auto-generated method stub
		System.out.println("[Smartphone] 음악을 정지합니다.");
	}

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("[Smartphone] 사진을 찍습니다.");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("[Smartphone] 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("[Smartphone] 전원을 끕니다.");
	}

}
