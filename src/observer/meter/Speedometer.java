package observer.meter;

import java.util.Observable;

public class Speedometer extends Observable{

	private int current_speed;

	public Speedometer() {
		current_speed = 0;
	}
	
	public void setCurrentSpeed(int speed){
		current_speed = speed;
		//Observable methods.
		setChanged();
		notifyObservers();
	}
	
	public int getCurrentSpeed(){
		return current_speed;
	}

}
