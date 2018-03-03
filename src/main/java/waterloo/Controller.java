package waterloo;

public class Controller {
	private Gara gara;
	
	public Controller(Gara gara) {
		this.gara = gara;
	}
	
	public String getTren(String cod) {
		return gara.getTren(cod);
	}
	
	
	
}
