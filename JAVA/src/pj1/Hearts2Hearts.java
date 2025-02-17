package pj1;

public class Hearts2Hearts extends GirlGroup{
	private String name;
	private String DebutDay;
	private String Album;
	private String Style;
	public Hearts2Hearts(String name1,String DebutDay1,String name, String DebutDay, String Album, String Style) {
		// TODO Auto-generated constructor stub
		super(name1, DebutDay1);
		this.name = name;
		this.DebutDay = DebutDay;
		this.Album = Album;
		this.Style = Style;
		System.out.println("Hears2Hearts 호출");
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
	public String getAlbum() {
		return Album;
	}
	public void setAlbum(String album) {
		Album = album;
	}
	public String getStyle() {
		return Style;
	}
	public void setStyle(String style) {
		Style = style;
	}
	
	public String GirGroupInfo() {
		return "GirlGroup [name1:" + super.getName1() + "DebutDay1 : " + super.getDebutDay1() +"]"
				+ "Hearts2Hearts [name:" + name + "DebutDay : " + DebutDay + "Album : " + Album + "Style : " + Style + "]";
		
	}
}
