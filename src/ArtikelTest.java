
public class ArtikelTest {

	public static void main(String[] args) {
		Forlag forlag1 = new Forlag("University Press", "Denmark");
		
		Tidsskrift tidsskrift1 = new Tidsskrift("Journal of Logic ");
		tidsskrift1.setForlag(forlag1.navn);
	
		Tidsskrift tidsskrift2 = new Tidsskrift("Brain");	
		tidsskrift2.setForlag(forlag1.navn);
		
		String[] fA = {"A. Abe", "A. Turing"};
		String[] fB = {"B. Bim"};
		
		Artikel artikel1 = new Artikel(fA, "A", tidsskrift1.forlag);
		
		Artikel artikel2 = new Artikel(fB, "B", tidsskrift1.forlag);
		
		artikel1.setReferenceliste(artikel2.titel);
		System.out.println(artikel2);
		System.out.println(artikel1.referenceListe);
		
		System.out.println(artikel1);
		System.out.println(artikel2.referenceListe);
		
		

	}

}
