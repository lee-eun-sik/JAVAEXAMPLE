package ex;

public class Phone2 {
	//필드 선언
	public String model;
	public String color;
	
	//매개변수를 갖는 생성자 선언
	public Phone2(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone(String model, String color) 생성자 실행");
	}
}
