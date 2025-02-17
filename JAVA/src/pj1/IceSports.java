package pj1;

public class IceSports extends SnowSports {
	
	public String Figure_Skating;
	public String Short_Track_Speed_Skating;
	public String Speed_Skaiting;
	public String Ice_Hockey;
	public String Curling;
	
	public IceSports() {
		
	}
	public IceSports(
			String MajorVenue,
			String the_date_of_the_first_competition,
			String Season,
			int the_cycle_of_holding_a_contest,
			String Alpine_Skiing,
			String Cross_Country_Skiing,
			String Freestyle_Skiing,
			String Snowboarding,
			String Ski_Jumping,
			String Nordic_Combined,
			String Figure_Skating,
			String Short_Track_Speed_Skating,
		    String Speed_Skaiting,
			String Ice_Hockey,
			String Curling
			) {
		// TODO Auto-generated constructor stub
		super(MajorVenue, the_date_of_the_first_competition, Season,
			the_cycle_of_holding_a_contest,
			Alpine_Skiing,
			Cross_Country_Skiing,
			Freestyle_Skiing,
			Snowboarding,
			Ski_Jumping,
			Nordic_Combined,
			Figure_Skating);
		this.Short_Track_Speed_Skating = Short_Track_Speed_Skating;
		this.Speed_Skaiting = Speed_Skaiting;
		this.Ice_Hockey = Ice_Hockey;
		this.Curling = Curling;
	}
	public String WinterAsianGamesInfo() {
		return "WinterAsianGames [MajorVenue :" + " "+ super.getMajorVenue() + "the_date_of_the_first_competition : " + " " + super.getThe_date_of_the_first_competition() 
				+ "Season : " + " " + super.getSeason() + " " +"the_cycle_of_holding_a_contest :" + " " + super.the_cycle_of_holding_a_contest + "]"
				+ "SnowSports [Alpine_Skiing : " + " " + super.getAlpine_Skiing() + "Cross_Country_Skiing :" + " " + super.getCross_Country_Skiing() + "Freestyle_Skiing :" + " " + super.getFreestyle_Skiing() 
				+ "Snowboarding : " + " " + super.getSnowboarding() + "Ski_Jumping : " + " " + super.getSki_Jumping() + "Nordic_Combined : " + " " + super.getNordic_Combined() +"]"
				+ "IceSports [Figure_Skating : " + " " + Figure_Skating + "Short_Track_Speed_Skating : " + " " + Short_Track_Speed_Skating + "Speed_Skaiting : " + " " + Speed_Skaiting
				+ "Ice_Hockey : " + " " + Ice_Hockey + "Curling : " + " " + Curling + "]";	
		
	}
	public String getFigure_Skating() {
		return Figure_Skating;
	}
	public void setFigure_Skating(String figure_Skating) {
		Figure_Skating = figure_Skating;
	}
	public String getShort_Track_Speed_Skating() {
		return Short_Track_Speed_Skating;
	}
	public void setShort_Track_Speed_Skating(String short_Track_Speed_Skating) {
		Short_Track_Speed_Skating = short_Track_Speed_Skating;
	}
	public String getSpeed_Skaiting() {
		return Speed_Skaiting;
	}
	public void setSpeed_Skaiting(String speed_Skaiting) {
		Speed_Skaiting = speed_Skaiting;
	}
	public String getIce_Hockey() {
		return Ice_Hockey;
	}
	public void setIce_Hockey(String ice_Hockey) {
		Ice_Hockey = ice_Hockey;
	}
	public String getCurling() {
		return Curling;
	}
	public void setCurling(String curling) {
		Curling = curling;
	}
	
}
