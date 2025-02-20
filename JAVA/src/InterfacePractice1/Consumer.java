package InterfacePractice1;

public class Consumer {
	public void chooseProduct(TobaccoProduct product) {
		System.out.println("=== 소비자 제품 선택 ==="); 
		System.out.println("니코틴 함량: " + product.getNicotineContent());
		//구현 객체가 인터페이스를 구현했다면?
		if(product instanceof Smokable) {
			((Smokable) product).smoke(); //흡연 실행
		}
		//구현 객체가 인터페이스를 구현했다면?
		if(product instanceof Smokeless) {
			((Smokeless) product).consume();
		}
	}
}
