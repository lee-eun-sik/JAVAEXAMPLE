package sec08.exam01;

public class Television1 implements RemoteControl1 {
	private int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
			if(volume>RemoteControl1.MAX_VOLUME) {
				this.volume = RemoteControl1.MAX_VOLUME;
			} else if(volume<RemoteControl1.MIN_VOLUME) {
				this.volume = RemoteControl1.MIN_VOLUME;
			} else {
				this.volume = volume;
			}
			System.out.println("현재 TV 볼륨: " + this.volume);
		
	}
}
