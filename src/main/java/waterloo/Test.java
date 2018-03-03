package waterloo;

import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void displayTrenuriAsc(List<Tren> trenuri) {
		System.out.println("Sortat ascendent -------------------");
		
		Collections.sort(trenuri, new TimeComparator());
		
		for(Tren i: trenuri) {
			System.out.println(i);
		}
	}
	
	public static void displayTrenuri(List<Tren> trenuri) {
		System.out.println("Nesortat ---------------------------");
		for(Tren i: trenuri) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {

		Gara gara = new Gara("Waterloo Station");
		
		gara.addTren(new Tren("AC1", "Berlin", LocalTime.of(10,01,00,00)));
		gara.addTren(new Tren("AC2", "Munchen", LocalTime.of(05,01,00,00)));
		gara.addTren(new Tren("AC3", "Frankfurt", LocalTime.of(16,01,00,00)));
		gara.addTren(new Tren("AC4", "Dusseldorf", LocalTime.of(10,31,00,00)));
		gara.addTren(new Tren("AC5", "Koln", LocalTime.of(13,01,00,00)));
		
		Test.displayTrenuri(gara.getTrenuri());
		Test.displayTrenuriAsc(gara.getTrenuri());
		
		Controller controller = new Controller(gara);
		
		new Interfata(controller);
	}
}








