package pj1;

public class UnivercityStudent extends Student1 {

	private String major;
	public UnivercityStudent(String name,int age, int grade, String major) {
		super(name, age,grade);
		this.major = major;
		System.out.println("UnivercityStudent 호출");
		
	}
	
	public String displayInfo() {
		return "Person = [" + "name = " + super.getName() + " age = " + super.getAge() + "], "
				+ "Student = [" + "grade = "+ super.getGrade()+ "], "
				+ "major = [" + "name = " + major + "]";
	}

}
