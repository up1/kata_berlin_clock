package kata_berlin_clock;

import java.util.Arrays;

public class BerlinClock {

	public String getUpperLine(int hourOfDay) {
		return generate(hourOfDay / 5, 4);
	}

	public String getLowerLine(int hourOfDay) {
		return generate(hourOfDay % 5, 4);
	}
	
	public String getForthLine(int minute) {
		return generate(minute % 5, 11);
	}

	private String generate(int row, int sizeOfResult) {
		int[] result = new int[sizeOfResult];
		while (row > 0) {
			result[--row] = 1;
		}
		return Arrays.toString(result);
	}
}
