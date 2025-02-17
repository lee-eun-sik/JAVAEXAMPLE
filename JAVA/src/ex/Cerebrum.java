package ex;

public class Cerebrum extends Brain {
	private String function1;
	private String Think;
	private String language;
	public Cerebrum(String name, String function, String similarity, String function1, String Think, String language) {
		super(name, function, similarity);
		this.function1=function1;
		this.Think = Think;
		this.language = language;
		System.out.println("Cerebrum 호출");
	}
	
	public String function() {
		String result = "Cerebrum["+"function=" +getFunction1() + "Think=" + Think + "language=" + language + "]"+
				"Brain [name=" + super.getName() + "function="+ super.getFunction() + "similarity="
				+ super.getSimilarity()+"]";
		System.out.println(result);
		return result;
	}
	public String getFunction1() {
		return function1;
	}
	public void setFunction1(String function1) {
		this.function1 = function1;
	}
	public String getThink() {
		return Think;
	}
	public void setThink(String think) {
		Think = think;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
