package cricketAppObserverPattern;

public class CriketApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
		CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();
		
		CricketData cricketData = new CricketData();
		
		cricketData.registerObserver(currentScoreDisplay);
		cricketData.registerObserver(averageScoreDisplay);
		
		cricketData.dataUpdate();
		
		cricketData.removeObserver(averageScoreDisplay);
		
		cricketData.dataUpdate();

	}

}
