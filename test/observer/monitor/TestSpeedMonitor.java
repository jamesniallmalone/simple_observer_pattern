package observer.monitor;

import static org.junit.Assert.*;

import org.junit.Test;

import observer.meter.Speedometer;

public class TestSpeedMonitor {

	@Test
	public void test() {
		SpeedMonitor monitor = new SpeedMonitor();
		
		//The speedometer. Register the monitor to it.
		Speedometer speedo = new Speedometer();
		speedo.addObserver(monitor);
		
		assertEquals("Initial conditions not met",0, monitor.getHitCount());

		final int speed = 50;
		speedo.setCurrentSpeed(speed);
		

		assertEquals("Setting speed failed.",speed, speedo.getCurrentSpeed());
		assertEquals("Hit count not met",1, monitor.getHitCount());
		assertEquals("Speed statement not expected after update", 
				"Nice and steady... (" + speedo.getCurrentSpeed() + ")", 
				monitor.getStatement());
		
		
		final int exceedspeed = 150;
		speedo.setCurrentSpeed(exceedspeed);
		

		assertEquals("Setting speed failed.",exceedspeed, speedo.getCurrentSpeed());
		assertEquals("Hit count not met",2, monitor.getHitCount());
		assertEquals("Speed statement not expected after update", 
				"** ALERT ** Driving too fast! (" + speedo.getCurrentSpeed() + ")", 
				monitor.getStatement());
		
	}

}
