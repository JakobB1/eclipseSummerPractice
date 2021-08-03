package aplikacija;

import java.util.ArrayList;
import java.util.List;

public class Start {
	
	private List<Korisnik> korisnici;
	
	public Start() {
		korisnici = new ArrayList<Korisnik>();
		glavniIzbornik();
	}
	
	private void glavniIzbornik() {
		System.out.println("****** ConsoleApp ******");
		System.out.println(" IZBORNIK ");
		System.out.println(" 1. Korisnici");
		System.out.println(" 2. Djelatnici");
		System.out.println(" 3. Proizvodi");
		System.out.println(" 4. Racuni");
		System.out.println(" 5. Izlaz iz programa");
		
		ucitajGlavnuAkciju();
	}

	private void ucitajGlavnuAkciju() {
		switch (Ulaz.ucitajInt("Odaberite stavku: ", "Niste unijeli cijeli broj", 1, 5)) {
		case 1: 
			korisnikIzbornik();
			break;
		case 5: 
			return;
		}
		
	}

	private void korisnikIzbornik() {
		
	}

	private void smjerIzbornik() {
		System.out.println("--------------------");	
		System.out.println("Podizbornik 1. Korisnici");		
		System.out.println("Odaberite akciju");
		System.out.println(" 1. Pregled unesenih korisnika");
		System.out.println(" 2. Unos novog korisnika");
		System.out.println(" 3. Promjena postojeceg korisnika");
		System.out.println(" 4. Brisanje korisnika");
		System.out.println(" 5. Povratak u prethodni izbornik");
		smjerUcitajAkciju();
	}

	private void smjerUcitajAkciju() {
		switch(Ulaz.ucitajInt("Odaberite akciju: ", 
				"Niste unijeli cijeli broj", 1, 5)) {
		case 1 -> korisnikPregled();
		case 5 -> glavniIzbornik();
		}
		
	}

	private Object korisnikPregled() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		new Start(); 
	}

}
