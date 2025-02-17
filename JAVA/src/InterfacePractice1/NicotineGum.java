package InterfacePractice1;

public class NicotineGum implements Smokeless, NicotineProduct, TobaccoProduct{

	@Override
	public String getNicotineContent() {
		// TODO Auto-generated method stub
		return "니코틴 함량: 2mg";
	}

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		System.out.println("[니코틴껌] 씹어서 니코틴을 흡수합니다.");
	}
	
}
