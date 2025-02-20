package BirdInterface;



public class Temp {
	//함수 생성
	//위에 만든 새 부모클래스로 매개 변수로 받고
	
	public void birdCPrint(Bird bird) {
		//if(birdH instanceof Humming) 체크
		if(bird instanceof Humming) {
			//맞는 자식클래스로 강제 케스팅 한후
			Humming humming = (Humming) bird;
			//자식클래스 함수 실행
			System.out.println(humming.toString());
		}
		
		if(bird instanceof Penguin) {
			//맞는 자식클래스로 강제 케스팅 한후
			Penguin penguin = (Penguin) bird;
			//자식클래스 함수 실행
			System.out.println(penguin.toString());
		}
	}
	
	//매개변수 인터페이스 사용, 매개변수의 다형성,강제타입변환
	public void ifCPrint(BirdIf birdIf) {
		System.out.println("Bird ?"+(birdIf instanceof Bird));
		//인터페이스 안에 구현체의 인스턴스 주소에 가서 Bird 확인
		//객체 타입 확인
		if(birdIf instanceof Bird) {
			//버드타입에 강제 캐스팅을해서 넣음
			Bird bird = (Bird) birdIf;
			//버드안에 함수 사용
			bird.eat();
		}
	}
}
