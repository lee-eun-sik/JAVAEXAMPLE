package Engine;

public class Car {
	//모델명(modelName)
	private String modelName;
	//연식(year)
	private int year;
	/**
	 * 엔진정보를 받아서 자동차 정보를 뿌려준다.
	 * @param engine 엔진 정보
	 */
	public void printCatalogue(Engine engine) {
		System.out.println(year+"년식 \"" + modelName + "\"차량은 "+engine.getYear()
		+"년식 "+engine.getEngineKind()
		+"(을)를 장착하고 있다.");
		
		System.out.println("연료는 "+engine.getCFuel()+"(을)를 사용한다.");
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
