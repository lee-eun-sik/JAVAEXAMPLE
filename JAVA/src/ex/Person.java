package ex;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person 생성자 호출");
	}
	public Person() {
	
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println("Person 생성자 호출");
	}
	public String displayInfo() {
		return "Person = [" + "name = " + name + " " + "age = " + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
