package smartphone;

//기기 통제자 클래스
public class DeviceController {
	public void operateDevice(SmartDevice device) {
		//전원키기
		device.powerOn();
		//각 기기 구현클래스가 인터페이스를 구현했나요?
		if(device instanceof Camera) {
			((Camera) device).takePhoto();
		}
		
		//각 기기 구현클래스가 인터페이스를 구현했나요?
		if(device instanceof MusicPlayer) {
			((MusicPlayer) device).playMusic();
		}
		//전원끄기
		device.powerOff();
		System.out.println();
	}
}
