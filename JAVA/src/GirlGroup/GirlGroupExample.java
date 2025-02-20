package GirlGroup;

public class GirlGroupExample {

	public GirlGroupExample() {
		// TODO Auto-generated constructor stub
	}
	
		
		
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		GirlGroup girlgroup = new GirlGroup("뉴진스", "2022년"); // 객체 공간만들고 인스턴스를 생성만들고 메모리상에 올림 생성자 함수 실행 인스턴스 메모리상의 주소를 GirlGroup에 넘겨준다.
		IVE ive = new IVE("뉴진스", "2022년", "IVE", "2025년 2월 3일"); // 문자형을 받는 애가 실행
		Hearts2Hearts hearts2hearts= new Hearts2Hearts("뉴진스", "2022년", "하츠투하츠(Hearts2Hearts)", "2025년 2월 24일", "The Chase", "아름다움");
		System.out.println(girlgroup.GirlGroupInfo());
		System.out.println(hearts2hearts.GirlGroupInfo());
		System.out.println(ive.GirlGroupInfo());
	}
	

}
