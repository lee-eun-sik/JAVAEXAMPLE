package WinterAsianGames;

public class WinterAsianGames {
	//주요개최지
	public String MajorVenue;
	public String the_date_of_the_first_competition;
	public String Season;
	public int the_cycle_of_holding_a_contest;
	public WinterAsianGames() {
		
	}
	public WinterAsianGames(String MajorVenue, String the_date_of_the_first_competition, String Season, int the_cycle_of_holding_a_contest) {
		//TODO Auto-generated constructor stub
		this.MajorVenue = MajorVenue;
		this.the_date_of_the_first_competition = the_date_of_the_first_competition;
		this.Season = Season;
		this.the_cycle_of_holding_a_contest = the_cycle_of_holding_a_contest;
	}
	
	public String WinterAsianGamesInfo() {
		return "WinterAsianGames [MajorVenue :" + " "+ MajorVenue +" "+ "the_date_of_the_first_competition : " +
				" " + the_date_of_the_first_competition + " "+ "Season : " + " " + Season + " " + "the_cycle_of_holding_a_contest :" + " " +
				the_cycle_of_holding_a_contest;
	}
	public String getMajorVenue() {
		return MajorVenue;
	}
	public void setMajorVenue(String majorVenue) {
		MajorVenue = majorVenue;
	}
	public String getThe_date_of_the_first_competition() {
		return the_date_of_the_first_competition;
	}
	public void setThe_date_of_the_first_competition(String the_date_of_the_first_competition) {
		this.the_date_of_the_first_competition = the_date_of_the_first_competition;
	}
	public String getSeason() {
		return Season;
	}
	public void setSeason(String season) {
		Season = season;
	}
	public int getThe_cycle_of_holding_a_contest() {
		return the_cycle_of_holding_a_contest;
	}
	public void setThe_cycle_of_holding_a_contest(int the_cycle_of_holding_a_contest) {
		this.the_cycle_of_holding_a_contest = the_cycle_of_holding_a_contest;
	}
	
	
}
