package pj1;

public class Manager extends Employee {
	private double bonus;
	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
		System.out.println("급여받기");
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public String displayInfo() {
		return "Employer :["+ "name:"+ super.getName() +"Salary:"+ super.getSalary() + "]"+ "bonus: ["+ bonus+"]";
	}
}
