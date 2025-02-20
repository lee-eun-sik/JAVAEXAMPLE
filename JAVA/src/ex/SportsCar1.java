package ex;

public class SportsCar1 extends Car7 {

	
		// TODO Auto-generated method stub
		@Override
		public void speedUp() {
			speed += 10;
		}
		
		//오버라이딩을 할 수 없음
		@Override
		public void stop() {
			System.out.println("스포츠카를 멈춤");
			speed = 0;
		
	}
	
}
