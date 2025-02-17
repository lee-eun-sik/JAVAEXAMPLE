package InterfacePractice1;

public class Cigarette implements Smokable, NicotineProduct, TobaccoProduct{

	@Override
	public String getNicotineContent() {
		// TODO Auto-generated method stub
		return "니코틴 함량: 10mg";
	}

	@Override
	public void smoke() {
		// TODO Auto-generated method stub
		System.out.println("[일반 담배] 연기를 내뿜으며 흡연합니다.");
	}

}
