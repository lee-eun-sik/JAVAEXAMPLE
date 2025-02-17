package InterfacePractice;

public class Smartphone implements SmartDevice, Camera, MusicPlayer {

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("[Smartphone] 음악을 재생합니다.");
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


	@Override
	public void stopMusic() {
		// TODO Auto-generated method stub
		System.out.println("[Smartphone] 음악을 정지합니다.");
	}

}
