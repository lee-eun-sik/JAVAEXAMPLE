package smartphone;

public class DeviceManager {
	SmartDevice device; //인터페이스 타입 필드
	
	public DeviceManager(SmartDevice device) {
		this.device = device; // 생성자로 전달받은 SmartDevice 객체를 저장
	}
	//기기시작
	public void startDevice() {
		device.powerOn();
		//device가 Camera라는 인터페이스를 구현했어요?
		if(device instanceof Camera) {
			((Camera) device).takePhoto();
		}
		//device가 MusicPlayer라는 인터페이스를 구현했어요?
		if(device instanceof MusicPlayer) {
			((MusicPlayer) device).playMusic();
		}
	}
	//기기멈춤
	public void stopDevice() {
		
		//device가 MusicPlayer라는 인터페이스를 구현했어요? 
		if(device instanceof MusicPlayer) {
			((MusicPlayer) device).stopMusic();
		}
		
		device.powerOff();
	}
}
