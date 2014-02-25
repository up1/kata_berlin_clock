package kata_berlin_clock;

public class BerlinClock {

	public String getUpperLine(int hourOfDay) {
		if(hourOfDay >=5) {
			return "1000";
		}
		return "0000";
	}

}
