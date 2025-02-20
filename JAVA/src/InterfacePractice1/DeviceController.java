package InterfacePractice1;

public class DeviceController {
	
	//기기 운영 함수
	public void operateDevice(SmartDevice device) {
		device.powerOn();
		
		//구현 객체가 인터페이스를 구현했나?
		if(device instanceof Camera) {
			((Camera) device).takePhoto();
		}
		
		//구현 객체가 인터페이스를 구현했나?
		if(device instanceof MusicPlayer) {
			((MusicPlayer) device).playMusic();
		}
		
		//구현 객체가 인터페이스를 구현했나?
		if(device instanceof MusicPlayer) {
			((MusicPlayer) device).stopMusic();
		}
		device.powerOff();
	}
}
