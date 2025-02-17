package pj1;

public class SnowSports extends WinterAsianGames{
	
	private String Alpine_Skiing;
	private String Cross_Country_Skiing;
	private String Freestyle_Skiing;
	private String Snowboarding;
	private String Ski_Jumping;
	private String Nordic_Combined;
	public SnowSports() {
		
	}
	public SnowSports(
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
			String Figure_Skating) {
		// TODO Auto-generated constructor stub
		super(MajorVenue, the_date_of_the_first_competition, Season, the_cycle_of_holding_a_contest);
		this.Alpine_Skiing = Alpine_Skiing;
		this.Cross_Country_Skiing = Cross_Country_Skiing;
		this.Freestyle_Skiing = Freestyle_Skiing;
		this.Snowboarding = Snowboarding;
		this.Ski_Jumping = Ski_Jumping;
		this.Nordic_Combined = Nordic_Combined;
	}
	
	
	
	
	public String WinterAsianGamesInfo() {
		return "WinterAsianGames [MajorVenue : " + " "+ super.getMajorVenue() + " "+ "the_date_of_the_first_competition : " + " " + super.the_date_of_the_first_competition +" " 
				+ "Season : " + " " + super.Season + " " +"the_cycle_of_holding_a_contest :" + " " + super.the_cycle_of_holding_a_contest +"]"
				+ "SnowSports [Alpine_Skiing : " + " " + Alpine_Skiing +" "+ "Cross_Country_Skiing :" + " " + Cross_Country_Skiing +" "+ "Freestyle_Skiing :" + " " + Freestyle_Skiing +" "
				+ "Snowboarding : " + " " + Snowboarding + " " + "Ski_Jumping : " + " " + Ski_Jumping + " " + "Nordic_Combined : " + " " + Nordic_Combined +"]";	
	}

	public String getAlpine_Skiing() {
		return Alpine_Skiing;
	}

	public void setAlpine_Skiing(String alpine_Skiing) {
		Alpine_Skiing = alpine_Skiing;
	}

	public String getCross_Country_Skiing() {
		return Cross_Country_Skiing;
	}

	public void setCross_Country_Skiing(String cross_Country_Skiing) {
		Cross_Country_Skiing = cross_Country_Skiing;
	}

	public String getFreestyle_Skiing() {
		return Freestyle_Skiing;
	}

	public void setFreestyle_Skiing(String freestyle_Skiing) {
		Freestyle_Skiing = freestyle_Skiing;
	}

	public String getSnowboarding() {
		return Snowboarding;
	}

	public void setSnowboarding(String snowboarding) {
		Snowboarding = snowboarding;
	}

	public String getSki_Jumping() {
		return Ski_Jumping;
	}

	public void setSki_Jumping(String ski_Jumping) {
		Ski_Jumping = ski_Jumping;
	}

	public String getNordic_Combined() {
		return Nordic_Combined;
	}

	public void setNordic_Combined(String nordic_Combined) {
		Nordic_Combined = nordic_Combined;
	}
	
}
