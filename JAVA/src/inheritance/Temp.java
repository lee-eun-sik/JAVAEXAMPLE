package inheritance;



public class Temp {
	/**
	 * 새 자식 객체 받아서 자식 객체 함수 실행 하는 함수
	 * @param bird 부모클래스  매개변수
	 */
	public static void birdCprint(bird bird1) {
		//if(birdH instanceof Humming) 체크
		if(bird1 instanceof Humming) { //부모로 받는다.
			//맞는 자식클래스로 강제 케스팅 한후
			Humming humming = (Humming) bird1;
			//자식 클래스 함수 실행
			System.out.println(humming.toString());
		}
		
		if(bird1 instanceof Penguin) {
			//맞는 자식클래스로 강제 케스팅 한후
			Penguin penguin = (Penguin) bird1;
			//자식클래스 함수 실행
			System.out.println(penguin.toString());
		}
	}
		
	public void ifCPrint(BirdIf birdIf) {
		System.out.println("bird ?"+(birdIf instanceof bird));
		//인터페이스 안에 구현체의 인스턴스 주소에 가서 Bird인지 확인True
		if(birdIf instanceof bird) {
			//버드타입에 강제 캐스팅을해서 넣은
			bird bird = (bird) birdIf;
			//버드안테 함수 사용
			bird.sound(); //부모껄 찍어줌.
			bird.eat();
			//구현클래스 여기서는 자식
			bird.eatPrint1();
		}
	}
}
