package waterloo;

import java.time.LocalTime;

public class Tren {

	private final String cod;
	private String destinatie;	
	private LocalTime ora; // leaving hour
	
	Tren (String cod, String destinatie, LocalTime ora) {
		this.cod = cod;
		this.destinatie = destinatie;
		this.ora = ora;
	}
	
	// copy constructor
	Tren (Tren copied_tren) {
		this.cod = copied_tren.cod;
		this.destinatie = copied_tren.destinatie;
		this.ora = copied_tren.ora;
	}
	
	public String getCod() {
		return this.cod;
	}
	
	public String getDestinatie() {
		return this.destinatie;
	}
	
	public LocalTime getOra() {
		return this.ora;
	}
	
	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
	}
	
	public void setOra(LocalTime ora) {
		this.ora = ora;
	}
	
	// Used to print train details in main()
    public String toString() {
        return  "Cod: " + this.cod + " " + 
			    "Destinatie: " + this.destinatie + " " +
			    "Ora plecare " + this.ora;
    }
    
    // used to display in interface
    public String toStringInfo() {
        return this.cod + " " + this.destinatie + " " + this.ora;
    }
    
    
}
