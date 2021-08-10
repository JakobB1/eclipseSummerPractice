package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {

	private List<Korisnik> korisnici;

	public Start() {
		korisnici = new ArrayList<Korisnik>();
		Ulaz.scanner = new Scanner(System.in);
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

		ucitajGlavnuAkciju();
	}

	private void ucitajGlavnuAkciju() {
		switch (Ulaz.ucitajInt("Odaberite stavku: ", "Niste unijeli cijeli broj", 1, 5)) {
		case 1:
			korisnikIzbornik();
			break;
		case 5:
			System.out.println("Program je zavrsio, dovidenja!");
			return;
		}
	}

	///////////
	//// POCETAK KORISNIK
	///////////
	
	private void korisnikIzbornik() {
		System.out.println("Podizbornik 1. Korisnik");
		System.out.println("Odaberite akciju");
		System.out.println(" 1. Pregled unesenih korisnika");
		System.out.println(" 2. Unos novog korisnika");
		System.out.println(" 3. Promjena postojeceg korisnika");
		System.out.println(" 4. Brisanje korisnika");
		System.out.println(" 5. Povratak na prethodni izbornik");

		ucitajIzbornikAkciju();
	}

	private void ucitajIzbornikAkciju() {
		switch(Ulaz.ucitajInt("Odaberite akciju: ", 
				"Niste unijeli cijeli broj", 1, 5)) {
		case 1 -> korisnikPregled();
		case 2 -> korisnikUnosNovog();
		case 3 -> korisnikPromjena();
		case 4 -> korisnikBrisanje();
		case 5 -> glavniIzbornik();
 		}
	}

	private void korisnikBrisanje() {
		
	}

	private void korisnikPromjena() {
		
	}

	private void korisnikUnosNovog() {
		
	}

	private void korisnikPregled() {
		korisnikStavke("Pregled unesenih smjerova");
		korisnikIzbornik();
	}

	private void korisnikStavke(String naslov) {
		System.out.println(naslov);
		System.out.println("--------------------");
		if(korisnici.size()==0) {
			System.out.println("Nema unesenih korisnika");
		}else {
			Korisnik k;
			for(int i=0;i<korisnici.size();i++) {
				k= korisnici.get(i);
				System.out.println((i + 1) + ". " + k.getIme() + 
						" " + k.getPrezime());
			}	
		}
	}

	public static void main(String[] args) {
		new Start();
	}
}