package reflection;

public class Car1 {
	//필드
	private String model;
	private String owner;
	
	//생성자
	public Car1() {
		
	}
	public Car1(String model) {
		this.model = model;
	}
	
	//메소드
	public String getModel() { return model; }
	public void setModel(String model) {this.model = model; }
	public String getOwner() { return owner; }
	public void setOwner(String owner) {this.owner = owner; }
}
