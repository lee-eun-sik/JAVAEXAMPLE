package cigarette;

public class NicotinePatch implements Smokeless, NicotineProduct, TobaccoProduct {

	@Override
	public String getNicotineContent() {
		// TODO Auto-generated method stub
		return "니코틴 함량: 7mg";
	}

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		System.out.println("[니코틴 패치] 피부를 통해 니코틴을 전달합니다.");
	}

}
