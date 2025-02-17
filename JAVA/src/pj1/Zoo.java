package pj1;

import pj1.bird1;

public class Zoo {
	//필드 다형성
	//펭귄
	private bird1 penguinBird;
	//부모 타입의 벌새
	private bird1 hummingBird;
	//벌새에 대한 정보
	private Humming humming;
	
	//매개 변수 다형성
	public void getBird(bird1 bird1) {
		//부모 변수 찍기
		System.out.println(
		"Bird [species=" +
		bird1.getSpecies() +
		", age=" +
		bird1.getAge() +
		", gender=" +
		bird1.getGender() + "]");
		//함수 실행
		bird1.eat();
	}

	public bird1 getPenguinBird() {
		return penguinBird;
	}

	public void setPenguinBird(bird1 penguinBird) {
		this.penguinBird = penguinBird;
	}

	public bird1 getHummingBird() {
		return hummingBird;
	}

	public void setHummingBird(bird1 hummingBird) {
		this.hummingBird = hummingBird;
	}

	public Humming getHumming() {
		return humming;
	}

	public void setHumming(Humming humming) {
		this.humming = humming;
	}
	
}
