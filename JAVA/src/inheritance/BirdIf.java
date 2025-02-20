package inheritance;

public interface BirdIf extends BirdIfs {
	//바깥에서 기준값으로 사용한다. 상수필드
	
		public int MAX_BIRD_NUM1 = 5;
		public void eatPrint1();
		public void eatPrint2();
		public void eatPrint3();
		
		public static void eatPrint8() {
			System.out.println("default eatPrint7");
			System.out.println("MAX_BIRD_NUM2 : "+MAX_BIRD_NUM2);
		}
}
