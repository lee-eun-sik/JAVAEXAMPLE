package InterfacePractice;

public class SmartphoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartDevice[] devices= new SmartDevice[3];
		
		devices[0] = new Smartphone();
		devices[1] = new Tablet();
		devices[2] = new SecurityCamera();
		
		for (SmartDevice i : devices) {
			i.powerOn();
			
			if(i instanceof Camera) {
				((Camera) i).takePhoto();
			}
			
			if(i instanceof MusicPlayer) {
				((MusicPlayer) i).playMusic();
			}
			
			if(i instanceof MusicPlayer) {
				((MusicPlayer) i).stopMusic();
			}
			System.out.println();
		}
		
		for (SmartDevice i : devices) {
			i.powerOff();
		}
	}

}
