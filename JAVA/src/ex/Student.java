package ex;

public class Student extends Human {
	//학년
	private String grade;
	//전공
	private String speciality;
	//조직
	private String department;
	
	public Student() {
		super();
		System.out.println("Student 호출");
	}
	
	public Student(String name, String age, String grade) {
		super(name, age);
		this.grade = grade;
		
		System.out.println("Student 호출");
	}
	
	public Student(String name, String age, String gender, String grade) {
		super(name, age, gender);
		this.grade = grade;
		System.out.println("Student 호출");
	}
	
	public void eat() {
		System.out.println("자식이 먹다.");
	}
	public String studentString() {
		return "Human [name =" + super.getName()+ ", age=" +super.getAge()+", gender=" +super.getGender() +
				"]"+ grade + ",specially=" + speciality+",department=" + department +"]";
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
