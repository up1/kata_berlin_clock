package kata_berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class BerlinClockTest {

	BerlinClock berlinClock = new BerlinClock();
	
	@Test
	public void hourInUpperLine() {
		assertEquals("[0, 0, 0, 0]", berlinClock.getUpperLine(0));
	}
	
	@Test
	public void hourInUpperLine2() {
		assertEquals("[1, 0, 0, 0]", berlinClock.getUpperLine(5));
	}
	
	@Test
	public void hourInUpperLine3() {
		assertEquals("[1, 1, 0, 0]", berlinClock.getUpperLine(11));
	}
	
	@Test
	public void hourInUpperLine4() {
		assertEquals("[1, 1, 1, 0]", berlinClock.getUpperLine(17));
	}

}
