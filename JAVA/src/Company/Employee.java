package Company;

public class Employee {
	private String name;
	private double salary;
	public Employee(String name, double salary) {
		//TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
	}
	public String displayInfo() {
		System.out.println("Employee 호출");
		return name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
