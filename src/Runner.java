import observer.meter.Speedometer;
import observer.monitor.SpeedMonitor;

public class Runner {

	public static void main(String[] args) {
		//The monitor
		SpeedMonitor monitor = new SpeedMonitor();
		
		//The speedometer. Register the monitor to it.
		Speedometer speedo = new Speedometer();
		speedo.addObserver(monitor);
		
		speedo.setCurrentSpeed(50);
		speedo.setCurrentSpeed(70);
		speedo.setCurrentSpeed(110);
		speedo.setCurrentSpeed(69);
		
	}

}
