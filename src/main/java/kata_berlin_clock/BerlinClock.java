package kata_berlin_clock;

import java.util.Arrays;

public class BerlinClock {

	public String getUpperLine(int hourOfDay) {
		return generate(hourOfDay / 5);
	}

	public String getLowerLine(int hourOfDay) {
		return generate(hourOfDay % 5);
	}

	private String generate(int row) {
		int[] result = new int[4];
		while (row > 0) {
			result[--row] = 1;
		}
		return Arrays.toString(result);
	}

	public String getForthLine(int minute) {
		return null;
	}

}
