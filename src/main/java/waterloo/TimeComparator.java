package waterloo;

import java.time.LocalTime;
import java.util.Comparator;

public class TimeComparator implements Comparator<Tren> {
	
	@Override
	public int compare(Tren tren1, Tren tren2) {
		LocalTime ora1 = tren1.getOra();
		LocalTime ora2 = tren2.getOra();
		// ascending order
		return ora1.compareTo(ora2);
	}
	
}
