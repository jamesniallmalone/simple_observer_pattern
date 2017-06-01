package observer.meter;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSpeedometer {
	
	@Test
	public void testSpeedometerObject() {
		Speedometer sm = new Speedometer();
		final int speed = 50;
		sm.setCurrentSpeed(speed);
		assertEquals("Speed set correctly on speedometer object", speed, sm.getCurrentSpeed());
	}

}
