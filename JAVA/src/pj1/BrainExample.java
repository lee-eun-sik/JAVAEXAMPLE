package pj1;

public class BrainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrainRole brainRole = new BrainRole();
		
		Cerebrum cerebrum  = new Cerebrum("대뇌", "운동 조절, 감각 처리, 인지 기능 수행", "신경 세포(뉴런)로 구성합니다.","고등 인지 기능", "사고", "언어");
		brainRole.function(cerebrum);
		
	}

}
