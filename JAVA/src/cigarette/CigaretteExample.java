package cigarette;

public class CigaretteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다양한 담배 제품 객체 생성
		TobaccoProduct cigarette = new Cigarette();
		TobaccoProduct eCigarette = new E_Cigarette();
		TobaccoProduct nicotineGum = new NicotineGum();
		TobaccoProduct nicotinePatch = new NicotinePatch();
		
		//소비자 객체 생성
		Consumer consumer = new Consumer();
		
		// 소비자가 각 제품을 선택하여 실행
		consumer.chooseProduct(cigarette);
		consumer.chooseProduct(eCigarette);
		consumer.chooseProduct(nicotineGum);
		consumer.chooseProduct(nicotinePatch);
	}

}
