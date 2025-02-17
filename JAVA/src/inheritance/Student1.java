package inheritance;
public class Student1 extends Person {
	private int grade;
	public Student1(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
		System.out.println("Student1 생성자 호출");
	}
	
	public Student1(String name,int grade) {
		// TODO Auto-generated constructor stub
		super(name);
		this.grade= grade;
		System.out.println("Student2 생성자 호출");
	}

	public String displayInfo() {
		return "Person = [" + "name = " + super.getName() + " " +"age = " + super.getAge() + "], "
				+ "Student = [" + "grade = "+ grade+ "]";
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
