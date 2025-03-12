package Generic;

public class GenericExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car1 car1 = carAgency.rent();
		car1.run();
	}

}
