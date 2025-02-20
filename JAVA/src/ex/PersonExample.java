package ex;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("이은식", 20);
		System.out.println(p.displayInfo());
		Student1 st1 = new Student1("이은식", 20, 1);
		System.out.println(st1.displayInfo());
		UnivercityStudent u = new UnivercityStudent("이은식", 20, 1, "Department of Business");
		System.out.println(u.displayInfo());
	}

}
