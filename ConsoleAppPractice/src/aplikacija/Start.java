package aplikacija;

import java.util.ArrayList;
import java.util.List;

public class Start {
	
	private List<Korisnik> korisnici;
	
	public Start() {
		korisnici = new ArrayList<>();
		glavniIzbornik();
	}
	
	private void glavniIzbornik() {
		System.out.println("****** ConsoleApp ******");
		System.out.println(" IZBORNIK ");
		System.out.println(" 1. Djelatnici");
		System.out.println(" 2. Racuni");
		System.out.println(" 3. Proizvod");
		System.out.println(" 4. Korisnici");
		System.out.println(" 5. Izlaz iz programa");
		
		ucitajGlavnuAkciju();
	}

	private void ucitajGlavnuAkciju() {
		
		
	}

	public static void main(String[] args) {
		new Start(); 
	}

}
