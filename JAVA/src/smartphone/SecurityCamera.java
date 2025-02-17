package smartphone;

public class SecurityCamera implements SmartDevice, Camera {

	public SecurityCamera() {
		// TODO Auto-generated constructor stub
	}

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
