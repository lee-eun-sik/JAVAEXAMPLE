package BirdInterface;

public interface BirdIf extends BirdIfS {
	//상수
	public int MAX_BIRD_NUM1 = 5;
	//추상함수
	public void eatPrint1();
	public void eatPrint2();
	public void eatPrint3();
	
	public static void eatPrint8() {
		System.out.println("static eatPrint8");
		System.out.println("MAX_BIRD_NUM2 :"+MAX_BIRD_NUM2);
	}
	
	
}

