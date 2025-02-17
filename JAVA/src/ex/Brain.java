package ex;

public class Brain {
	private String name = "Cerebrum";
	private String function = "운동 조절, 감각 처리, 인지 기능 수행";
	private String similarity = "신경 세포(뉴런)로 구성합니다.";
	
	
	//생성자 오버로딩
	public Brain(String name, String function, String similarity) {
		this.name = name;
		this.function = function;
		this.similarity = similarity;
		System.out.println("Brain 호출");
	}
	
	//메소드 오버라이딩(다형성)
	public String function() {
		System.out.println("모든 신체 기능을 조절합니다.");
		return function;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getSimilarity() {
		return similarity;
	}

	public void setSimilarity(String similarity) {
		this.similarity = similarity;
	}
	
	
}
