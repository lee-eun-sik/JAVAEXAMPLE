package pj1;

public class WinterAsianGamesExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WinterAsianGames winterAsianGames = new WinterAsianGames("일본 삿포로", "1986년", "겨울", 4);
		SnowSports snowSports = new SnowSports("일본 삿포로", "1986년", "겨울", 4, "알파인스키", "크로스컨트리 스키","프리스타일 스키","스노우보딩", "스키점프", "노르딕 복함", "피겨 스케이팅");
		IceSports iceSports = new IceSports("일본 삿포로", "1986년", "겨울", 4,"알파인스키", "크로스컨트리 스키","프리스타일 스키","스노우보딩", "스키점프", "노르딕 복함", "피겨 스케이팅", "쇼트트랙 스피드 스케이팅", "스피드 스케이팅", "아이스 하키", "컬링");
		SleddingSports sleddingSports = new SleddingSports("일본 삿포로", "1986년", "겨울", 4,"알파인스키", "크로스컨트리 스키","프리스타일 스키","스노우보딩", "스키점프", "노르딕 복함", "피겨 스케이딩", "쇼트트랙 스피드 스케이팅", "스피드 스케이팅", "아이스 하키", "컬링", "바이애슬론", "봅슳레이", "스켈레톤", "루지");
		System.out.println(winterAsianGames.WinterAsianGamesInfo());
		System.out.println(snowSports.WinterAsianGamesInfo());
		System.out.println(iceSports.WinterAsianGamesInfo());
		System.out.println(sleddingSports.WinterAsianGamesInfo());
	}

}
