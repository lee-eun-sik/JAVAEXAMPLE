package inheritance;



public class Penguin extends bird {

	//먹이

	private String food;

	//잠수거리

	private String diveRange;

	public Penguin() {

	super();

	System.out.println("Penguin 호출");

	}
	
	@Override
	public String toString() {//메소드를 부모가 알고있는 것까지 가져온다.
		return "Penguin [food=" + food + ", diveRange=" + diveRange + ", getFood()=" + getFood() + ", getDiveRange()="
				+ getDiveRange() + ", getSpecies()=" + getSpecies() + ", getAge()=" + getAge() + ", getGender()="
				+ getGender() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
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

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("아하하하하하");
	}

	}
