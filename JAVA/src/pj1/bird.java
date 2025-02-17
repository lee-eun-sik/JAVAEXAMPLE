package pj1;

public class bird {
	//필드 다형성
	private String name;
	private String age;
	private String habitat;
	public bird(){
		System.out.println("bird 호출");
	}
	
	public bird(String name) {
		this.name = name;
		System.out.println("bird1 호출");
	}
	//매개변수 다형성
	public void eat() {
		System.out.println("해바라기씨를 먹다.");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public bird(String name, String age) {
		this.name = name;
		this.age = age;
		System.out.println("bird2 호출");
	}
	public bird(String name, String age, String habitat) {
		this.name = name;
		this.age = age;
		this.habitat = habitat;
	}

	
}
