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
		
	}

	public static void main(String[] args) {
		new Start();
	}
}