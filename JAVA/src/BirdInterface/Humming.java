package BirdInterface;

public class Humming extends Bird {
	//먹이
	private String food;
	
	//1초 날개짓수
	private int secFly;
	
	//기본생성자
	public Humming() {
		super();
		System.out.println("Humming 호출");
	}
	
	
	//생성자
	public Humming(String name, String age, String food) {
		super(name, age);
		this.food = food;
		System.out.println("Humming 호출");
	}
	
	//부모 함수 오버라이딩
	public void eat() {
		System.out.println("자식이 먹다");
	}


	public String getFood() {
		return food;
	}


	public void setFood(String food) {
		this.food = food;
	}


	public int getSecFly() {
		return secFly;
	}


	public void setSecFly(int secFly) {
		this.secFly = secFly;
	}
	
	
}
