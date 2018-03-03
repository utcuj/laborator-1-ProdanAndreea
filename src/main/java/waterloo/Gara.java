package waterloo;

import java.util.ArrayList;
import java.util.List;

public class Gara {
	
	private String nume;
	List<Tren> trenuri;
	
	Gara (String nume, List<Tren> trenuri) {
		this.nume = nume;
		this.trenuri = trenuri;
	}
	
	Gara (String nume) {
		this.nume = nume;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public List<Tren> getTrenuri() {
		return trenuri;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void addTren(Tren tren) {
		if (trenuri == null) {
			trenuri = new ArrayList<Tren>();	
		}
		trenuri.add(tren);
	}

	
	public String getTren(String cod) {
		for(Tren i: trenuri) {
			if (i.getCod().equals(cod)) {
				return i.toStringInfo();
			}
		}
		return null;
	}

	
}
