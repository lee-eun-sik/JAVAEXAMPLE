package InterfacePractice;

public class Tablet implements SmartDevice, MusicPlayer{

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("[Tablet] 음악을 재생합니다.");
	}

	@Override
	public void stopMusic() {
		// TODO Auto-generated method stub
		System.out.println("[Tablet] 음악을 정지합니다.");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("[Tablet] 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("[Tablet] 전원을 끕니다.");
	}

}
