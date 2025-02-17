package BirdInterface;

public class BirdExample {
	/**
	 * 자바 실행함수
	 * @param args 실행할때 입력값들
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동타입변환, 필드의 다형성
		Bird bird = new Bird();
		BirdIf birdIf = bird;
		BirdIfS birdIfS = bird;
		//birdIf.MAX_BIRD_NUM1 = 10;
		System.out.println(birdIf.MAX_BIRD_NUM1);
		System.out.println(birdIf.MAX_BIRD_NUM2);
		
		birdIf.eatPrint1();
		birdIf.eatPrint2();
		birdIf.eatPrint3();
		
		birdIfS.eatPrint4();
		birdIfS.eatPrint5();
		birdIfS.eatPrint6();
		birdIfS.eatPrint7();
		
		Temp temp = new Temp();
		temp.ifCPrint(birdIf);
		//호출
		BirdIf.eatPrint8();
	}

}
