package ex;

public class SmartPhoneExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SmartPhone 객체 생성
		SmartPhone1 myPhone = new SmartPhone1("갤럭시", "은색");
		
		//Phone으로부터 상속받은 필드 읽기
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
	}

}
