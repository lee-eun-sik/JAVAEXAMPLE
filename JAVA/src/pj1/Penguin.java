package pj1;

public class Penguin extends bird1 {
	//먹이
	private String food;
	
	//잠수거리
	private String diveRange;
	public Penguin() {
		super();
		System.out.println("Penguin 호출");
	}
	
	public Penguin(String name, String age, String food) {
		super(name, age);
		this.food = food;
		System.out.println("Penguin 호출");
	}
	
	public void eat() {
		System.out.println("자식이 먹다");
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getDiveRange() {
		return diveRange;
	}

	public void setDiveRange(String diveRange) {
		this.diveRange = diveRange;
	}
	
	
}
