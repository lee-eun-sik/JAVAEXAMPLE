package InterfacePractice1;

public class DeviceManager {
	SmartDevice device;
	
	public DeviceManager(SmartDevice device) {
		this.device = device; //생성자로 전달받은 SmartDevice 객체를 저장
	}
	//기기 전원을 켜는 함수
	public void startDevice() {
		device.powerOn();
		
		//구현 객체가 인터페이스를 구현했나?
		if(device instanceof Camera) {
			((Camera) device).takePhoto();
		}
		
		//구현 객체가 인터페이스를 구현했나?
		if(device instanceof MusicPlayer) {
			((MusicPlayer) device).playMusic();
		}
	}
	
	//기기를 멈추는 함수
	public void stopDevice() {
		//구현 객체가 인터페이스를 구현했나?
		if(device instanceof MusicPlayer) {
			((MusicPlayer) device).stopMusic();
		}
		
		device.powerOff();
	}
}
