package sec08.exam01;

public class ServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스 변수 선언과 구현 객체 대입
		Service service = new ServiceImpl();
		
		//디폴트 메소드 호출
		service.defaultMethod1();
		System.out.println();
		service.defaultMethod2();
		System.out.println();
		
		//정적 메소드 호출
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();
	}

}
