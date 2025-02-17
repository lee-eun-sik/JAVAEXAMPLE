package inheritance;



public class ZooExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//동물원 객체
		// TODO Auto-generated method stub
				//동물원 객체
				Zoo zoo = new Zoo();
				
				//부모 타입변수에 자식 객체 주입
				bird hummingBird = new Humming("벌새", "1살", "벌꿀");
				bird penguinBird = new Penguin("펭귄", "2살", "물고기");
				
				zoo.setHummingBird(hummingBird);
				zoo.setPenguinBird(penguinBird);
				
				zoo.getHummingBird().setGender("암컷");
				zoo.getPenguinBird().setGender("수컷");
				
				//벌새 정보
				zoo.getBird(zoo.getHummingBird());
				//펭귄 정보
				zoo.getBird(zoo.getPenguinBird());
	}

}
