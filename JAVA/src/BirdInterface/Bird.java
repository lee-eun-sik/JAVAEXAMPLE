package BirdInterface;

public class Bird implements BirdIf, BirdIfS {
	//종
	private String species;
	//나이
	private String age;
	//성별
	private String gender;
	
	public Bird() {
		System.out.println("Bird 호출");
	}
	
	public Bird(String species, String age) {
		this.species = species;
		this.age = age;
		System.out.println("Bird 호출");
	}
	
	public void eat() {
		System.out.println("부모가 먹다");
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public void eatPrint1() {
		System.out.println("eatPrint1");
	}
	
	@Override
	public void eatPrint2() {
		System.out.println("eatPrint2");
	}
	
	@Override
	public void eatPrint3() {
		System.out.println("eatPrint3");
	}
	
	@Override
	public void eatPrint4() {
		System.out.println("eatPrint4");
	}
	
	@Override
	public void eatPrint5() {
		System.out.println("eatPrint5");
	}
	
	@Override
	public void eatPrint6() {
		System.out.println("eatPrint6");
	}

	@Override
	public void eatPrint1(int int1) {
		// TODO Auto-generated method stub
		
	}
	
	public void eatPrint7() {
		System.out.println("Bird eatPrint7");
		eatPrint4();
		eatPrint5();
		eatPrint6();
		System.out.println("MAX_BIRD_NUM2 :"+MAX_BIRD_NUM2);
	}
}
