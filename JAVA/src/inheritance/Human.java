package inheritance;

public class Human {
	String age;
	String name;
	String gender;
	public Human() {
		System.out.println("Human 호출");
	}
	public Human(String name, String age) {
		this.name = name;
		this.age = age;
		System.out.println("Human 호출");
	}
	
	public Human(String name, String age, String gender) {
		this.name= name;
		this.age = age;
		this.gender = gender;
		System.out.println("Human 호출");
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
	protected void eat() {
		System.out.println("부모가 먹다");
	}
}
