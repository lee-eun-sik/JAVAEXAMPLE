package ex;

public class SmartPhone1 extends Phone1 {
	//자식 생성자 선언
	public SmartPhone1(String model, String color) {
		super();
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
}
