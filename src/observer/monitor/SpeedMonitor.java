package observer.monitor;

import java.util.Observable;
import java.util.Observer;

import observer.meter.Speedometer;

public class SpeedMonitor implements Observer {

	private static final int SPEED_TO_ALERT = 70;
	private int hitcount;
	private String statement;
	
	public SpeedMonitor(){
		hitcount = 0;
		statement = "";
	}
	
	public String getStatement(){
		return statement;
	}
	
	public int getHitCount(){
		return hitcount;
	}


	@Override
	public void update(Observable obs, Object obj) {
		hitcount++;
		Speedometer sm = (Speedometer) obs;
		
		statement = (sm.getCurrentSpeed() > SPEED_TO_ALERT) 
				? "** ALERT ** Driving too fast! (" + sm.getCurrentSpeed() + ")"
						:"Nice and steady... (" + sm.getCurrentSpeed() + ")";
		
		System.out.println(statement);
		
	}

}
