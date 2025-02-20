package cigarette;

public class Cigarette implements Smokable, NicotineProduct, TobaccoProduct {
	@Override
	public void smoke() {
		System.out.println("[일반 담배] 연기를 내뿜으며 흡연합니다.");
	}
	
	@Override
	public String getNicotineContent() {
		return "니코틴 함량: 10mg";
	}
}
