package edunova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
	
	private List<Smjer> smjerovi;
	private List<Polaznik> polaznici;
	private List<Predavac> predavaci;
	
	public Start() {
		smjerovi = new ArrayList<Smjer>();
		polaznici = new ArrayList<Polaznik>();
		predavaci = new ArrayList<Predavac>();
		Ulaz.scanner=new Scanner(System.in);
		glavniIzbornik();
	}
	
	private void glavniIzbornik() {
		System.out.println("******** Edunova APP konzola*********");
		System.out.println(" IZBORNIK ");
		System.out.println(" 1. Smjerovi");
		System.out.println(" 2. Polaznici");
		System.out.println(" 3. Predavači");
		System.out.println(" 4. Grupe");
		System.out.println(" 5. Izlaz iz programa");
		ucitajGlavnuAkciju();
	}

	private void ucitajGlavnuAkciju() {
		switch (Ulaz.ucitajInt("Odaberite stavku: ", "Niste unijeli cijeli broj", 1, 5)) {
		case 1:
			smjerIzbornik();
			break;
		case 2:
			polaznikIzbornik();
			break;	
		case 3:
			predavacIzbornik();
			break;	
		case 5:
			System.out.println("Program je završio, doviđenja!");
			return;
		}
		
	}
	
    

	///////////
    //// POČETAK POLAZNIK
    ///////////
	
	
	
	private void polaznikIzbornik() {
		System.out.println("--------------------");	
		System.out.println("Podizbornik 2. Polaznici");		
		System.out.println("Odaberite akciju");
		System.out.println(" 1. Pregled unesenih polaznika");
		System.out.println(" 2. Unos novog polaznika");
		System.out.println(" 3. Promjena postoječeg polaznika");
		System.out.println(" 4. Brisanje polaznika");
		System.out.println(" 5. Povratak u prethodni izbornik");
		polaznikUcitajAkciju();
		
	}

	private void polaznikUcitajAkciju() {
		switch(Ulaz.ucitajInt("Odaberite akciju: ", 
				"Niste unijeli cijeli broj", 1, 5)) {
		case 1 -> polaznikPregled();
		case 2 -> polaznikUnosNovog();
		case 3 -> polaznikPromjena();
		case 4 -> polaznikBrisanje();
		case 5 -> glavniIzbornik();
		}
		
	}

	private void polaznikBrisanje() {
		polaznikStavke("Trenutno dostupno u aplikaciji");
		int redniBroj = Ulaz.ucitajInt("Odaberite redni broj za brisanje: ", 
				"Niste unijeli cijeli broj", 1, polaznici.size());
		polaznici.remove(redniBroj-1);
		polaznikIzbornik();
	}

	private void polaznikPromjena() {
		polaznikStavke("Trenutno dostupno u aplikaciji");
		int redniBroj = Ulaz.ucitajInt("Odaberite redni broj za promjenu: ", 
				"Niste unijeli cijeli broj", 1, polaznici.size());
		Polaznik polaznikZaPromjenu = polaznici.get(redniBroj-1);
		polaznikZaPromjenu = polaznikPostaviVrijednosti(polaznikZaPromjenu);
		polaznici.set(redniBroj-1, polaznikZaPromjenu);
		polaznikIzbornik();
	}

	private void polaznikUnosNovog() {
		Polaznik p = new Polaznik();
		p = polaznikPostaviVrijednosti(p);
		polaznici.add(p);
		polaznikIzbornik();
	}
	
    private Polaznik polaznikPostaviVrijednosti(Polaznik p) {
    	p.setSifra(Ulaz.ucitajInt("Unesite šifru: ",
    			"Šifra mora biti cijeli broj",
    			1, Integer.MAX_VALUE));
    	p.setIme(Ulaz.ucitajString("Unesi ime polaznika: ",
    			"Ime obavezno"));
    	p.setPrezime(Ulaz.ucitajString("Unesi prezime polaznika: ",
    			"Prezime obavezno"));
    	p.setEmail(Ulaz.ucitajString("Unesi email polaznika: ",
    			"Email obavezan"));
    	p.setBrojUgovora(Ulaz.ucitajString("Unesi broj ugovora polaznika: ",
    			"Broj ugovora obavezan"));
    	
    	return p;
	}

	private void polaznikPregled() {
    	polaznikStavke("Pregled unesenih smjerova");
    	polaznikIzbornik();
	}

	private void polaznikStavke(String naslov) {
		System.out.println(naslov);
		System.out.println("--------------------");
		if(smjerovi.size()==0) {
			System.out.println("Nema unesenih polaznika");
		}else {
			Polaznik p;
			for(int i=0;i<polaznici.size();i++) {
				p= polaznici.get(i);
				System.out.println((i + 1) + ". " + p.getIme() + 
						" " + p.getPrezime());
			}
		}
		
		
	}	
	
    ///////////
    //// KRAJ POLAZNIK
    ///////////

	
	
	///////////
	//// POČETAK SMJER
	///////////

	
	
	private void smjerIzbornik() {
		System.out.println("--------------------");	
		System.out.println("Podizbornik 1. Smjer");		
		System.out.println("Odaberite akciju");
		System.out.println(" 1. Pregled unesenih smjerova");
		System.out.println(" 2. Unos novog smjera");
		System.out.println(" 3. Promjena postoječeg smjera");
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
    //// KRAJ SMJER
    ///////////



    ///////////
    //// POČETAK PREDAVAČ
    ///////////
	
	
	
	private void predavacIzbornik() {
		System.out.println("--------------------");	
		System.out.println("Podizbornik 3. Predavaci");		
		System.out.println("Odaberite akciju");
		System.out.println(" 1. Pregled unesenih predavaca");
		System.out.println(" 2. Unos novog predavaca");
		System.out.println(" 3. Promjena postoječeg predavaca");
		System.out.println(" 4. Brisanje predavaca");
		System.out.println(" 5. Povratak u prethodni izbornik");
		predavacUcitajAkciju();
	}
	

	
	private void predavacUcitajAkciju() {
		switch(Ulaz.ucitajInt("Odaberite akciju: ", 
				"Niste unijeli cijeli broj", 1, 5)) {
		case 1 -> predavacPregled();
		case 2 -> predavacUnosNovog();
		case 3 -> predavacPromjena();
		case 4 -> predavacBrisanje();
		case 5 -> glavniIzbornik();
		}
	}

	private void predavacBrisanje() {
		
	}

	private void predavacPromjena() {
		
	}

	private void predavacUnosNovog() {
		Predavac p = new Predavac();
		p = predavacPostaviVrijednosti(p);
		predavaci.add(p);
		predavacIzbornik();
	}

	private Predavac predavacPostaviVrijednosti(Predavac p) {
		p.setSifra(Ulaz.ucitajInt("Unesite šifru: ",
    			"Šifra mora biti cijeli broj",
    			1, Integer.MAX_VALUE));
    	p.setIme(Ulaz.ucitajString("Unesi ime predavaca: ",
    			"Ime obavezno"));
    	p.setPrezime(Ulaz.ucitajString("Unesi prezime predavaca: ",
    			"Prezime obavezno"));
    	p.setEmail(Ulaz.ucitajString("Unesi email predavaca: ",
    			"Email obavezan"));
    	p.setIban(Ulaz.ucitajString("Unesi broj Ibana predavac: ",
    			"Broj ibana obavezan"));
    	
    	return p;
	}

	private void predavacPregled() {
		predavacStavke("Pregled unesenih smjerova");
		predavacIzbornik();
	}

	private void predavacStavke(String naslov) {
		System.out.println(naslov);
		System.out.println("--------------------");
		if(predavaci.size()==0) {
			System.out.println("Nema unesenih predavaca");
		}else {
			Predavac p;
			for(int i=0;i<predavaci.size();i++) {
				p= predavaci.get(i);
				System.out.println((i + 1) + ". " + p.getIme() + 
						" " + p.getPrezime());
			}
		}
		
	}

	public static void main(String[] args) {
		new Start();
	}

}
