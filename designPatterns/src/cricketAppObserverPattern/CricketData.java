package cricketAppObserverPattern;

import java.util.ArrayList;
import java.util.Iterator;


public class CricketData implements Subject{
	
	int runs;
	int wickets;
	float overs;
	
	ArrayList<Observer> observerList;
	
	public CricketData() {
		observerList = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		observerList.remove(observer);
		
		
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (Iterator<Observer> it = observerList.iterator(); it.hasNext();)
		{
			Observer o = it.next();
			o.update(runs,wickets,overs);
		}
		
	}
	
	private int getLatestRuns() {
		return 90;
	}
	
	private int getLatestWickets() {
		return 5;
	}
	
	private float getLatestOvers() {
		return (float)10.5;
	}
	
	public void dataUpdate() {
		runs = getLatestRuns();
		wickets = getLatestWickets();
		overs = getLatestOvers();
		notifyObserver();
	}
	
	

}
