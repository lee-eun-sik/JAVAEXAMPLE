package Brain;

public class BrainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrainRole brainRole = new BrainRole();
		
		Celebrum celebrum = new Celebrum("대뇌", "운동 조절, 감각 처리, 인지 기능 수행", "신경 세포(뉴런)로 구성합니다.", "고등 인지 기능", "사고", "언어");
		brainRole.function(celebrum);
	}

}
