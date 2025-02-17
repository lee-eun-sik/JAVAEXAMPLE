package pj1;

public class Human {
	//나이
	private String age;
	//이름
	private String name;
	//성별
	private String gender;
	public Human() {
		System.out.println("Human 호출");
	}
	public Human(String name, String age) {
		this.name= name;
		this.age = age;
		System.out.println("Human 호출");
	}
	public Human(String name, String age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("Human 호출");
	}
	protected void eat() {
		System.out.println("부모가 먹다");
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
