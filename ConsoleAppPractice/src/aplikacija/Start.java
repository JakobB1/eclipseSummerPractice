package aplikacija;

import java.util.ArrayList;
import java.util.List;

public class Start {
	
	private List<Korisnik> korisnici;
	
	public Start() {
		korisnici = new ArrayList<>();
		izbornik();
	}
	
	private void izbornik() {
		System.out.println("****** ConsoleApp ******");
		System.out.println(" IZBORNIK ");
		System.out.println(" 1. Racuni");
		System.out.println(" 2. Korisnici");
		System.out.println(" 3. Djelaznici");
		System.out.println(" 4. Proizvodi");
		System.out.println(" 5. Izlaz iz programa");
		
		
	}

	public static void main(String[] args) {
		new Start(); 
	}

}
