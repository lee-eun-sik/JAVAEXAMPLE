package cigarette;

public class Consumer {
	public void chooseProduct(TobaccoProduct product) {
		System.out.println("=== 소비자 제품 선택 ===");
		System.out.println("니코틴 함량: " + product.getNicotineContent());
		
		if(product instanceof Smokable) {
			((Smokable) product).smoke(); //흡연 실행
		}
		
		if(product instanceof Smokeless) {
			((Smokeless) product).consume(); //무연 제폼 소비 실행
		}
	}
}
