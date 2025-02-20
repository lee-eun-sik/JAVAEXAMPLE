package WinterAsianGames;

public class SleddingSports extends IceSports {
	public String Biathlon;
	public String Bobsleigh;
	public String Skeleton;
	public String Luge;
	public SleddingSports(
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
			String Curling,
			String Biathlon,
			String Bobsleigh,
			String Skeleton,
			String Luge) {
		//TODO Auto-generated constructor stub
		super(MajorVenue, the_date_of_the_first_competition, Season, the_cycle_of_holding_a_contest,
				Alpine_Skiing, Cross_Country_Skiing, Freestyle_Skiing, Snowboarding, Ski_Jumping, Nordic_Combined, Figure_Skating,
				Short_Track_Speed_Skating, Speed_Skaiting, Ice_Hockey, Curling);
				this.Biathlon = Biathlon;
				this.Bobsleigh = Bobsleigh;
				this.Skeleton = Skeleton;
				this.Luge = Luge;
		
	}
	public String WinterAsianGamesInfo()  {
		return "WinterAsianGames [MajorVenue :" + " "+ super.getMajorVenue() + "the_date_of_the_first_competition : " + " " + super.getThe_date_of_the_first_competition() 
		+ "Season : " + " " + super.getSeason() + " " +"the_cycle_of_holding_a_contest :" + " " + super.the_cycle_of_holding_a_contest + "]"
		+ "SnowSports [Alpine_Skiing : " + " " + super.getAlpine_Skiing() + "Cross_Country_Skiing :" + " " + super.getCross_Country_Skiing() + "Freestyle_Skiing :" + " " + super.getFreestyle_Skiing() 
		+ "Snowboarding : " + " " + super.getSnowboarding() + "Ski_Jumping : " + " " + super.getSki_Jumping() + "Nordic_Combined : " + " " + super.getNordic_Combined() +"]"
		+ "IceSports [Figure_Skating : " + " " + super.getFreestyle_Skiing() + "Short_Track_Speed_Skating : " + " " + super.getShort_Track_Speed_Skaiting() + "Speed_Skaiting : " + " " + super.getSpeed_Skaiting()
		+ "Ice_Hockey : " + " " + super.getIce_Hockey() + "Curling : " + " " + super.getCurling() + "]"
		+ "SleddingSports [Biathlon : " + " " + Biathlon + "Bobsleigh : " + " " + Bobsleigh + "Skeleton : " + " " + Skeleton 
		+ "Luge : " + Luge + "]";
	}
	
}
