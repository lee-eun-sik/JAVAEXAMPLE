package pj1;

public class ManagerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager("이은식", 20000, 40000); 
		Employee E = new Employee("이은식", 400000);
		System.out.println(m.displayInfo());
	}

}
