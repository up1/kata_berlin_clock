package kata_berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class BerlinClockTest {

	@Test
	public void hourInUpperLine() {
		BerlinClock berlinClock = new BerlinClock();
		assertEquals("[0, 0, 0, 0]", berlinClock.getUpperLine(0));
	}
	
	@Test
	public void hourInUpperLine2() {
		BerlinClock berlinClock = new BerlinClock();
		assertEquals("[1, 0, 0, 0]", berlinClock.getUpperLine(5));
	}

}
