package kata_berlin_clock;

import java.util.Arrays;

public class BerlinClock {

	public String getUpperLine(int hourOfDay) {
		int[] result = new int[4];
		if(hourOfDay >=5) {
			result[0] = 1;
		}
		return Arrays.toString(result);
	}

}
