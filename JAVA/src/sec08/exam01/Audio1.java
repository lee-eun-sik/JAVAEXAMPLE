package sec08.exam01;

public class Audio1 implements RemoteControl1{
	//필드
		private int volume;
		
		//turnOn() 추상 메소드 오버라이딩
		@Override
		public void turnOn() {
			System.out.println("Audio를 켭니다.");
		}
		
		//turnOff()추상 메소드 오버라이딩
		@Override
		public void turnOff() {
			System.out.println("Audio를 끕니다.");
		}
		
		//setVolume() 추상 메소드 오버라이딩
		@Override
		public void setVolume(int volume) {
			if(volume>RemoteControl1.MAX_VOLUME) {
				this.volume = RemoteControl1.MAX_VOLUME;
			} else if(volume<RemoteControl1.MIN_VOLUME) {
				this.volume = RemoteControl1.MIN_VOLUME;
			} else {
				this.volume = volume;
			}
			System.out.println("현재 Audio 볼륨: " + volume);
		}
		
		//필드 
		private int memoryVolume;
		
		@Override
		public void setMute(boolean mute) {
			if(mute) {
				this.memoryVolume = this.volume;
				System.out.println("무음 처리합니다.");
				setVolume(RemoteControl1.MIN_VOLUME);
			} else {
				System.out.println("무음 해제합니다.");
				setVolume(this.memoryVolume);
			}
		}
}
