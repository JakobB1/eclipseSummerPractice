package edunova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
	
	private List<Smjer> smjerovi;
	
	public Start() {
		smjerovi = new ArrayList<Smjer>();
		Ulaz.scanner=new Scanner(System.in);
		glavniIzbornik();
	}
	
	private void glavniIzbornik() {
		System.out.println("******** Edunova APP konzola*********");
		System.out.println(" IZBORNIK ");
		System.out.println(" 1. Smjerovi");
		System.out.println(" 2. Polaznici");
		System.out.println(" 3. Predava�i");
		System.out.println(" 4. Grupe");
		System.out.println(" 5. Izlaz iz programa");
		ucitajGlavnuAkciju();
	}

	private void ucitajGlavnuAkciju() {
		switch (Ulaz.ucitajInt("Odaberite stavku: ", "Niste unijeli cijeli broj", 1, 5)) {
		case 1:
			smjerIzbornik();
			break;
		case 5:
			System.out.println("Program je zavr�io, dovi�enja!");
			return;
		}
		
	}
	
	///////////
	//// PO�ETAK SMJER
	///////////

	private void smjerIzbornik() {
		System.out.println("--------------------");	
		System.out.println("Podizbornik 1. Smjer");		
		System.out.println("Odaberite akciju");
		System.out.println(" 1. Pregled unesenih smjerova");
		System.out.println(" 2. Unos novog smjera");
		System.out.println(" 3. Promjena postoje�eg smjera");
		System.out.println(" 4. Brisanje smjera");
		System.out.println(" 5. Povratak u prethodni izbornik");
		smjerUcitajAkciju();
	}

	private void smjerUcitajAkciju() {
		switch(Ulaz.ucitajInt("Odaberite akciju: ", 
				"Niste unijeli cijeli broj", 1, 5)) {
		case 1 -> smjerPregled();
		case 2 -> smjerUnosNovog();
		case 3 -> smjerPromjena();
		case 4 -> smjerBrisanje();
		case 5 -> glavniIzbornik();
		}
		
	}

	private void smjerBrisanje() {
		smjerStavke("Trenutno dostupno u aplikaciji");
		int redniBroj = Ulaz.ucitajInt("Odaberite redni broj za brisanje: ", 
				"Niste unijeli cijeli broj", 1, smjerovi.size());
		smjerovi.remove(redniBroj-1);
		smjerIzbornik();
	}

	private void smjerPromjena() {
		smjerStavke("Trenutno dostupno u aplikaciji");
		int redniBroj = Ulaz.ucitajInt("Odaberite redni broj za promjenu: ", 
				"Niste unijeli cijeli broj", 1, smjerovi.size());
		Smjer smjerZaPromjenu = smjerovi.get(redniBroj-1);
		smjerZaPromjenu = smjerPostaviVrijednosti(smjerZaPromjenu);
		smjerovi.set(redniBroj-1, smjerZaPromjenu);
		smjerIzbornik();
	}

	private void smjerUnosNovog() {
		Smjer s = new Smjer();
		s = smjerPostaviVrijednosti(s);
		smjerovi.add(s);
		smjerIzbornik();
	}

	private Smjer smjerPostaviVrijednosti(Smjer s) {
		s.setSifra(Ulaz.ucitajInt("Unesi šifru smjera: ", 
				"Niste unijeli cijeli broj", 1, 
				Integer.MAX_VALUE));
		s.setNaziv(Ulaz.ucitajString("Unesi naziv smjera: ",
				"Naziv obavezno"));
		s.setTrajanje(Ulaz.ucitajInt("Unesi trajanje: ",
				"Trajanje nije cijeli broj", 1, 300));
		s.setCijena(Ulaz.ucitajDouble("Unesi cijenu: ", 
				"Cijena mora biti decimalni broj", 0, 100000));
		s.setCertifikat(Ulaz.ucitajBoolean("Unesite oznaku da li je "
				+ "smjer certificiran: ", "Kriva vrijednost"));
		return s;
	}

	private void smjerPregled() {
		smjerStavke("Pregled unesenih smjerova");
		smjerIzbornik();
	}
	
	private void smjerStavke(String naslov) {
		System.out.println(naslov);
		System.out.println("--------------------");
		if(smjerovi.size()==0) {
			System.out.println("Nema unesenih smjerova");
		}else {
			Smjer s;
			for(int i=0;i<smjerovi.size();i++) {
				s= smjerovi.get(i);
				System.out.println((i + 1) + ". " + s.getNaziv());
			}
		}
		
	}
	
	///////////
	//// PO�ETAK SMJER
	///////////

	public static void main(String[] args) {
		new Start();
	}

}
