package practice;

public class TheJourneyCalculator {

	public static void main(String[] args) {
		TheJourneyCalculator journeyCalculator = new TheJourneyCalculator();
		System.out.printf("%.2f",journeyCalculator.journeyCalculator(60.0,1.5));
	
	 
	 
	}
	public double journeyCalculator(double speed, double time) {
    return speed*time;
	}

}
