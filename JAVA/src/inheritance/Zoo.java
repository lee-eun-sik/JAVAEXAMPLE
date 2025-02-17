package inheritance;

public class Zoo {
	//필드 다형성
	//펭귄
	private bird penguinBird;
	//부모 타입의 벌새
	private bird hummingBird;
	//벌새에 대한 정보
	private Humming humming;
	
	//매개 변수 다형성
	public void getBird(bird bird1) {
		//부모 변수 찍기
		System.out.println("Bird [species=" + bird1.getSpecies() + ", age=" + bird1.getAge() + ", gender=" + bird1.getGender() + "]");
		//함수 실행
		bird1.eat();
	}

	public bird getPenguinBird() {
		return penguinBird;
	}

	public void setPenguinBird(bird penguinBird) {
		this.penguinBird = penguinBird;
	}

	public bird getHummingBird() {
		return hummingBird;
	}

	public void setHummingBird(bird hummingBird2) {
		this.hummingBird = hummingBird2;
	}

	public Humming getHumming() {
		return humming;
	}

	public void setHumming(Humming humming) {
		this.humming = humming;
	}

	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("아아아아아");
	}
	
	
}
