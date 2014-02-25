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
	
	@Test
	public void hourInUpperLine5() {
		assertEquals("[1, 1, 1, 1]", berlinClock.getUpperLine(23));
	}
	
	@Test
	public void hourInLowerLine() {
		assertEquals("[0, 0, 0, 0]", berlinClock.getLowerLine(0));
	}
	
	@Test
	public void hourInLowerLine2() {
		assertEquals("[1, 0, 0, 0]", berlinClock.getLowerLine(1));
	}
	
	@Test
	public void hourInLowerLine3() {
		assertEquals("[1, 1, 0, 0]", berlinClock.getLowerLine(2));
	}
	
	@Test
	public void hourInLowerLine4() {
		assertEquals("[1, 1, 1, 0]", berlinClock.getLowerLine(3));
	}
	
	@Test
	public void hourInLowerLine5() {
		assertEquals("[1, 1, 1, 0]", berlinClock.getLowerLine(8));
	}
	
	@Test
	public void hourInLowerLine6() {
		assertEquals("[1, 1, 1, 1]", berlinClock.getLowerLine(14));
	}
	
	@Test
	public void minuteInForthLine() {
		assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", berlinClock.getForthLine(0));
	}
	
	@Test
	public void minuteInForthLine1() {
		assertEquals("[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", berlinClock.getForthLine(6));
	}
	
	@Test
	public void minuteInForthLine2() {
		assertEquals("[1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0]", berlinClock.getForthLine(11));
	}
	
	@Test
	public void minuteInForthLine3() {
		assertEquals("[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]", berlinClock.getForthLine(59));
	}

}
