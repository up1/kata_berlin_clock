package kata_berlin_clock;

import java.util.Arrays;

public class BerlinClock {

	public String getUpperLine(int hourOfDay) {
		int[] result = new int[4];
		int row = hourOfDay / 5;
		while (row > 0) {
			result[--row] = 1;
		}
		return Arrays.toString(result);
	}

	public String getLowerLine(int hourOfDay) {
		int[] result = new int[4];
		int row = hourOfDay % 5;
		while (row > 0) {
			result[--row] = 1;
		}
		return Arrays.toString(result);
	}

}
