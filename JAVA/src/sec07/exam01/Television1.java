package sec07.exam01;

public class Television1 implements RemoteControl2 {
	//필드
	private int volume;
	
	//turnOn() 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	//turnOff() 추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	//setVolume() 추상 메소드 오버라이딩
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl2.MAX_VOLUME) {
			this.volume = RemoteControl2.MAX_VOLUME;
		} else if(volume<RemoteControl2.MIN_VOLUME) {
			this.volume = RemoteControl2.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
}
