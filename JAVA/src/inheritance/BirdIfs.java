package inheritance;

public interface BirdIfs {
	//상수 
		public int MAX_BIRD_NUM2 = 10;
		//추상함수 강제시킬때 쓴다.
		public void eatPrint4();//자식이 오버라이딩이 된 것 처럼 친다.
		public void eatPrint5();
		public void eatPrint6();
		public  default void eatPrint7() {
			System.out.println("default eatPrint7");
			eatPrint4();
			eatPrint5();
			eatPrint6();
			System.out.println("MAX_BIRD_NUM2 : "+MAX_BIRD_NUM2);
		}
}
