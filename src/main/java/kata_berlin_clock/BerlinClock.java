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
		int[] result = new int[4];
		if(hourOfDay > 0) {
			result[0] = 1;
		}
		hourOfDay -=1;
		if(hourOfDay > 0) {
			result[1] = 1;
		}
		hourOfDay -=1;
		if(hourOfDay > 0) {
			result[2] = 1;
		}
		return Arrays.toString(result);
	}

}
