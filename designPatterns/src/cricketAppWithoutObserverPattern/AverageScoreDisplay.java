package cricketAppWithoutObserverPattern;

public class AverageScoreDisplay {
	
	private float runRate;
	private float predictedScore;
	
	public void update(int runs, int wickets, float overs) {
		this.runRate = (float)runs/overs;
		this.predictedScore = (int) (this.runRate * 50);
		display();
	}
	
	public void display() {
		System.out.println("\nAverage Score Display:\n" + "Run Rate -: " + runRate + "\n Predicted Score" + predictedScore);
	}

}
