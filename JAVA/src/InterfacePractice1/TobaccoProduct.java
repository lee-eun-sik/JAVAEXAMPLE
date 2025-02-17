package InterfacePractice1;

public interface TobaccoProduct extends NicotineProduct {
	//이 인터페이스는 Smokable 또는 Smokeless 중 하나를 포함할 수 있음.
	//TobaccoProduct 자체는 직접 Smokable또는 Smokeless를 구현하지 않음
	//대신, TobaccoProduct를 구현하는 클래스가 Smokable 또는 Smokeless 중 하나를 선택할 수 있다.
	String getNicotineContent();//NicotineContect를 구현하므로
}
