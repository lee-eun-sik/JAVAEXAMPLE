package BirdInterface;

public interface BirdIfS {
	//상수
	public int MAX_BIRD_NUM2 = 10;
	public void eatPrint1(int int1);
	//추상함수
	public void eatPrint4();
	public void eatPrint5();
	public void eatPrint6();
	
	public default void eatPrint7() {
		System.out.println("default eatPrint7");
		eatPrint4();
		eatPrint5();
		eatPrint6();
		System.out.println("MAX_BIRD_NUM2 :"+MAX_BIRD_NUM2);
	}
}
