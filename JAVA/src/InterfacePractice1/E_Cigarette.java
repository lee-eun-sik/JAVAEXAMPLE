package InterfacePractice1;

public class E_Cigarette implements Smokable, NicotineProduct, TobaccoProduct{

	@Override
	public String getNicotineContent() {
		// TODO Auto-generated method stub
		return "니코틴 함량: 5mg";
	}

	@Override
	public void smoke() {
		// TODO Auto-generated method stub
		System.out.println("[전자담배] 증기를 내뿜으며 흡연합니다.");
	}
	
}
