package kata_berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class BerlinClockTest {

	@Test
	public void hourInUpperLine() {
		BerlinClock berlinClock = new BerlinClock();
		assertEquals("0000", berlinClock.getUpperLine(0));
	}

}
