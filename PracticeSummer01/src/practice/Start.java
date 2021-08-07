package practice;

import java.util.ArrayList;
import java.util.List;

public class Start {
	
	private List<Korisnik> korisnici;	
	
	public Start() {
		korisnici = new ArrayList<Korisnik>();
		glavniIzbornik();
	}
	
	private void glavniIzbornik() {
		 System.out.println("***** PC SHOP Vjezba konzola");
		 System.out.println(" IZBORNIK ");
		 System.out.println(" 1. Korisnici");
		 System.out.println(" 2. Djelatnici");
		 System.out.println(" 3. Racuni");
		 System.out.println(" 4. Proizvodi");
		 System.out.println(" 5. Izlaz iz programa");
	}

	public static void main(String[] args) {
		new Start();
	}

}
