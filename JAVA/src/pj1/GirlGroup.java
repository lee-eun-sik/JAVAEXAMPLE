package pj1;

public class GirlGroup {
	private String name1;
	private String DebutDay1;
	public GirlGroup() {
		
	}
	public GirlGroup(String name1, String DebutDay1) {
		// TODO Auto-generated constructor stub
		this.name1=name1;
		this.DebutDay1=DebutDay1;
		System.out.println("GirlGroup 호출");
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getDebutDay1() {
		return DebutDay1;
	}
	public void setDebutDay(String DebutDay1) {
		DebutDay1 = DebutDay1;
	}
	public String GirGroupInfo() {
		return "GirlGroup [name1:" + name1 + "DebutDay1 : " + DebutDay1 +"]";
		
	}
}
