import java.util.ArrayList;

public class Artikel {
	String[] forfattere;
	String titel;
	String tidsskrift;
	ArrayList<String> referenceListe= new ArrayList<String>();
	
	
	public Artikel(String[] forfattere, String titel, String tidsskrift) {
		this.forfattere = forfattere;
		this.titel = titel;
		this.tidsskrift = tidsskrift;
	}
	
	public void setReferenceliste(String reference) {
		referenceListe.add(reference);
	}
	
	public String toString() {
		for(int i = 0; i<forfattere.length;i++) {
			System.out.print(forfattere[i]);
			if(i<forfattere.length-1) {
				System.out.print(" ");
			}
		}
		return ": " + titel + " " + tidsskrift;
	}

}
