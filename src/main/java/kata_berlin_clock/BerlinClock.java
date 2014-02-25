package kata_berlin_clock;

import java.util.Arrays;

public class BerlinClock {

	public String getUpperLine(int hourOfDay) {
		int[] result = new int[4];
		int position = 0;
		while(hourOfDay >= 5) {
			result[position++] = 1;
			hourOfDay -= 5;
		}
		return Arrays.toString(result);
	}

	public String getLowerLine(int hourOfDay) {
		return null;
	}

}
