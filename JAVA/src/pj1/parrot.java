package pj1;

public class parrot extends bird{
	private String featherColor;
	private String kind;
	private String price;
	
	public parrot() {
		super();
		System.out.println("parrot 호출");
	}
	public void eat() {
		System.out.println("꽃가루를 먹다.");
	}
	public parrot(String name, String featherColor) {
		super(name);
		this.featherColor = featherColor;
		System.out.println("parrot1 호출");
	}
	public parrot(String name, String age, String featherColor, String kind) {
		super(name, age);
		this.featherColor=featherColor;
		this.kind = kind;
		System.out.println("parrot3 호출");
	}
	public parrot(String name, String age, String habitat, String featherColor, String kind, String price) {
		super(name, age, habitat);
		this.featherColor=featherColor;
		this.kind = habitat;
		this.price = price;
		System.out.println("parrot2 호출");
	}
	
	public String ParrotString() {
		return "bird [name=" + super.getName() + ", age=" + super.getAge() + ", habitat=" + super.getHabitat() + "]"+
				"parrot [feather=" + featherColor + ", kind="+ kind + ", "
				+ "price="+ price+"]";
	}
	public String getFeather() {
		return featherColor;
	}
	public void setFeather(String featherColor) {
		this.featherColor = featherColor;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
