package pj1;

public class IVE extends GirlGroup{
	private String name;
	private String DebutDay;
	
	public IVE(String name1,String DebutDay1,String name, String DebutDay) {
		// TODO Auto-generated constructor stub
		super(name1, DebutDay1);
		this.name = name;
		this.DebutDay = DebutDay;
		System.out.println("IVE 호출");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDebutDay() {
		return DebutDay;
	}

	public void setDebutDay(String debutDay) {
		DebutDay = debutDay;
	}
	
	public String GirGroupInfo() {
		return "IVE [ name : "+ name+ "DebutDay :" + DebutDay+ "]";
		
	}
}
