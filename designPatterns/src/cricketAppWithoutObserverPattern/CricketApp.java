package cricketAppWithoutObserverPattern;

public class CricketApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
		CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();
		
		CricketData cricketData  = new CricketData(averageScoreDisplay,currentScoreDisplay);
		
		cricketData.updates();
		

	}

}
