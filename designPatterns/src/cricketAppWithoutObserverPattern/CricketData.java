package cricketAppWithoutObserverPattern;

public class CricketData {
	
	int runs, wickets;
	float overs;
	
	AverageScoreDisplay averageScoreDisplay;
	CurrentScoreDisplay currentScoreDisplay;
	
	
	public CricketData(AverageScoreDisplay averageScoreDisplay, CurrentScoreDisplay currentScoreDisplay) {
		
		this.averageScoreDisplay = averageScoreDisplay;
		this.currentScoreDisplay = currentScoreDisplay;
		
	}
	
	
	private int getLatestRuns() {
		
		return 90;
	}
	
	
	private int getLatestWickets() {
		
		return 5;
	}
	
	
	private float getLatestOvers() {
		
		return (float)15.2;
	}
	
	
	public void updates() {
		
		runs = getLatestRuns();
		wickets = getLatestWickets();
		overs = getLatestOvers();
		
		currentScoreDisplay.update(runs,wickets,overs);    // Concrete implementations, there is no way of add
		averageScoreDisplay.update(runs, wickets, overs);  // or remove other display elements without changing the code
		
	}
	
	
	

}
