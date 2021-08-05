package aplikacija;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
	
	private List<Korisnik> korisnici;
	private List<Djelatnik> djelatnici;
	private List<Racun> racuni;
	private List<Proizvod> proizvodi;
	
	public Start() {
		korisnici = new ArrayList<Korisnik>();
		djelatnici = new ArrayList<Djelatnik>();
		racuni = new ArrayList<Racun>();
		proizvodi = new ArrayList<Proizvod>();
		Ulaz.scanner= new Scanner(System.in);
		glavniIzbornik();
	}
	
	private void glavniIzbornik() {
		System.out.println("****** ConsoleApp ******");
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
		case 2: 
			djelatnikIzbornik();
			break;
		case 3: 
			racunIzbornik();
			break;
		case 4: 
			proizvodIzbornik();
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
		System.out.println("--------------------");	
		System.out.println("Podizbornik 1. Korisnici");		
		System.out.println("Odaberite akciju");
		System.out.println(" 1. Pregled unesenih korisnika");
		System.out.println(" 2. Unos novog korisnika");
		System.out.println(" 3. Promjena postojeceg korisnika");
		System.out.println(" 4. Brisanje korisnika");
		System.out.println(" 5. Povratak u prethodni izbornik");
		korisnikUcitajAkciju();
	}

	private void korisnikUcitajAkciju() {
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
		korisnikStavke("Trenutno dostupno u aplikaciji");
		int redniBroj = Ulaz.ucitajInt("Odaberite redni broj za brisanje: ", 
				"Niste unijeli cijeli broj", 1, korisnici.size());
		korisnici.remove(redniBroj-1);
		korisnikIzbornik();
	}

	private void korisnikPromjena() {
		korisnikStavke("Trenutno dostupno u aplikaciji");
		int redniBroj = Ulaz.ucitajInt("Odaberite redni broj za promjenu: ", 
				"Niste unijeli cijeli broj", 1, korisnici.size());
		Korisnik korisnikZaPromjenu = korisnici.get(redniBroj-1);
		korisnikZaPromjenu = korisnikPostaviVrijednosti(korisnikZaPromjenu);
		korisnici.set(redniBroj-1, korisnikZaPromjenu);
		korisnikIzbornik();
	}

	private void korisnikUnosNovog() {
		Korisnik k = new Korisnik();
		k = korisnikPostaviVrijednosti(k);
		korisnici.add(k);
		korisnikIzbornik();
	}

	private Korisnik korisnikPostaviVrijednosti(Korisnik k) {
		k.setSifra(Ulaz.ucitajInt("Unesite sifru: ",
    			"sifra mora biti cijeli broj",
    			1, Integer.MAX_VALUE));
    	k.setIme(Ulaz.ucitajString("Unesi ime korisnika: ",
    			"Ime obavezno"));
    	k.setPrezime(Ulaz.ucitajString("Unesi prezime korisnika: ",
    			"Prezime obavezno"));
    	k.setEmail(Ulaz.ucitajString("Unesi email korisnika: ",
    			"Email obavezan"));
    	k.setBrojClanskeKartice(Ulaz.ucitajString("Unesi broj kartice korisnika: ", "Broj kartice nije obavezan"));
    	return k;
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
	
	
	
    ///////////
    //// KRAJ KORISNIK
    ///////////
	
	
	
    ///////////
    //// POCETAK DJELATNIK
    ///////////
	
    private void djelatnikIzbornik() {
    	System.out.println("--------------------");	
		System.out.println("Podizbornik 2. Djelatnici");		
		System.out.println("Odaberite akciju");
		System.out.println(" 1. Pregled unesenih djelatnika");
		System.out.println(" 2. Unos novog djelatnika");
		System.out.println(" 3. Promjena postojeceg djelatnika");
		System.out.println(" 4. Brisanje djelatnika");
		System.out.println(" 5. Povratak u prethodni izbornik");
		djelatnikUcitajAkciju();
	}
	
	private void djelatnikUcitajAkciju() {
		switch(Ulaz.ucitajInt("Odaberite akciju: ", 
				"Niste unijeli cijeli broj", 1, 5)) {
		case 1 -> djelatnikPregled();
		case 2 -> djelatnikUnosNovog();
		case 3 -> djelatnikPromjena();
		case 4 -> djelatnikBrisanje();
		case 5 -> glavniIzbornik();
		}
	}

	private void djelatnikBrisanje() {
		djelatnikStavke("Trenutno dostupno u aplikaciji");
		int redniBroj = Ulaz.ucitajInt("Odaberite redni broj za brisanje: ", 
				"Niste unijeli cijeli broj", 1, djelatnici.size());
		djelatnici.remove(redniBroj-1);
		djelatnikIzbornik();
	}

	private void djelatnikStavke(String naslov) {
		System.out.println(naslov);
		System.out.println("--------------------");
		if(djelatnici.size()==0) {
			System.out.println("Nema unesenih djelatnika");
		}else {
			Djelatnik d;
			for(int i=0;i<djelatnici.size();i++) {
				d= djelatnici.get(i);
				System.out.println((i + 1) + ". " + d.getIme() + 
						" " + d.getPrezime () + 
						" " + d.getPcshop());
			}	
		}
	}

	private void djelatnikPromjena() {
		djelatnikStavke("Trenutno dostupno u aplikaciji");
		int redniBroj = Ulaz.ucitajInt("Odaberite redni broj za promjenu: ", 
				"Niste unijeli cijeli broj", 1, djelatnici.size());
		Djelatnik djelatnikZaPromjenu = djelatnici.get(redniBroj-1);
		djelatnikZaPromjenu = djelatnikPostaviVrijednosti(djelatnikZaPromjenu);
		djelatnici.set(redniBroj-1, djelatnikZaPromjenu);
		djelatnikIzbornik();
	}

	private void djelatnikUnosNovog() {
		Djelatnik d = new Djelatnik();
		d = djelatnikPostaviVrijednosti(d);
		djelatnici.add(d);
		djelatnikIzbornik();
	}

	private Djelatnik djelatnikPostaviVrijednosti(Djelatnik d) {
		d.setSifra(Ulaz.ucitajInt("Unesite sifru: ",
    			"Sifra mora biti cijeli broj",
    			1, Integer.MAX_VALUE));
    	d.setIme(Ulaz.ucitajString("Unesi ime predavaca: ",
    			"Ime obavezno"));
    	d.setPrezime(Ulaz.ucitajString("Unesi prezime predavaca: ",
    			"Prezime obavezno"));
    	d.setPcshop(Ulaz.ucitajString("Unesi ime PC Shop:", "Ime obavezno"));
		return d;
	}

	private void djelatnikPregled() {
		djelatnikStavke("Pregled unesenih smjerova");
		djelatnikIzbornik();
	}
	
    ///////////
    //// KRAJ DJELATNIK
    ///////////
	
	
	
    ///////////
    //// POCETAK RACUN
    ///////////
	
    private void racunIzbornik() {
    	System.out.println("--------------------");	
		System.out.println("Podizbornik 3. Racuni");		
		System.out.println("Odaberite akciju");
		System.out.println(" 1. Pregled unesenih racuna");
		System.out.println(" 2. Unos novog racuna");
		System.out.println(" 3. Promjena postojeceg racuna");
		System.out.println(" 4. Brisanje racuna");
		System.out.println(" 5. Povratak u prethodni izbornik");
		racunUcitajAkciju();
	}

	private void racunUcitajAkciju() {
		switch(Ulaz.ucitajInt("Odaberite akciju: ", 
				"Niste unijeli cijeli broj", 1, 5)) {
		case 1 -> racunPregled();
		case 2 -> racunUnosNovog();
		case 3 -> racunPromjena();
		case 4 -> racunBrisanje();
		case 5 -> glavniIzbornik();
		}
	}

	private void racunBrisanje() {
		racunStavke("Trenutno dostupno u aplikaciji");
		int redniBroj = Ulaz.ucitajInt("Odaberite redni broj za brisanje: ", 
				"Niste unijeli cijeli broj", 1, racuni.size());
		racuni.remove(redniBroj-1);
		racunIzbornik();
	}

	private void racunPromjena() {
		racunStavke("Trenutno dostupno u aplikaciji");
		int redniBroj = Ulaz.ucitajInt("Odaberite redni broj za promjenu: ", 
				"Niste unijeli cijeli broj", 1, racuni.size());
		Racun racunZaPromjenu = racuni.get(redniBroj-1);
		racunZaPromjenu = racunPostaviVrijednosti(racunZaPromjenu);
		racuni.set(redniBroj-1, racunZaPromjenu);
		racunIzbornik();
	}

	private void racunUnosNovog() {
		Racun r = new Racun();
		r = racunPostaviVrijednosti(r);
		racuni.add(r);
		racunIzbornik();
	}

	private Racun racunPostaviVrijednosti(Racun r) {
		r.setSifra(Ulaz.ucitajInt("Unesite sifru: ",
    			"Sifra mora biti cijeli broj",
    			1, Integer.MAX_VALUE));
		r.setBrojracuna(Ulaz.ucitajString("Unesi broj racuna :",
				"Broj racuna obavezan"));
		r.setCijena(Ulaz.ucitajDouble("Unesi cijenu: ", 
				"Cijena mora biti decimalni broj", 0, 100000));
    	r.setDatumpocetka(Ulaz.ucitajDatum("Unesi datum pocetka: "));
    	r.setCertifikat(Ulaz.ucitajBoolean("Unesite oznaku da li je " 
    			+ "smjer certification: ", "Kriva vrijednost"));

		return r;
	}

	private void racunPregled() {
		racunStavke("Pregled unesenih racuna");
		racunIzbornik();
	}

	private void racunStavke(String naslov) {
		System.out.println(naslov);
		System.out.println("--------------------");
		if(racuni.size()==0) {
			System.out.println("Nema unesenih racuna");
		}else {
			Racun r;
			for(int i=0;i<racuni.size();i++) {
				r= racuni.get(i);
				System.out.println((i + 1) + ". " + r.getBrojracuna() + 
						" " + r.getCijena() + 
						" " + r.getDatumpocetka() + 
						" " + r.isCertifikat());
			}	
		}
	}

	
	
    ///////////
    //// KRAJ RACUN
    ///////////
	
	
	
    ///////////
    //// POCETAK PROIZVOD
    ///////////
	
    private void proizvodIzbornik() {
    	System.out.println("--------------------");	
		System.out.println("Podizbornik 4. Proizvodi");		
		System.out.println("Odaberite akciju");
		System.out.println(" 1. Pregled unesenih proizvoda");
		System.out.println(" 2. Unos novog proizvoda");
		System.out.println(" 3. Promjena postojeceg proizvoda");
		System.out.println(" 4. Brisanje proizvoda");
		System.out.println(" 5. Povratak u prethodni izbornik");
		proizvodUcitajAkciju();
	}
	
	
	private void proizvodUcitajAkciju() {
		switch(Ulaz.ucitajInt("Odaberite akciju: ", 
				"Niste unijeli cijeli broj", 1, 5)) {
		case 1 -> proizvodPregled();
		case 2 -> proizvodUnosNovog();
		case 3 -> proizvodPromjena();
		case 4 -> proizvodBrisanje();
		case 5 -> glavniIzbornik();
		}
	}

	private void proizvodBrisanje() {
		proizvodStavke("Trenutno dostupno u aplikaciji");
		int redniBroj = Ulaz.ucitajInt("Odaberite redni broj za brisanje: ", 
				"Niste unijeli cijeli broj", 1, proizvodi.size());
		proizvodi.remove(redniBroj-1);
		proizvodIzbornik();
	}

	private void proizvodPromjena() {
		proizvodStavke("Trenutno dostupno u aplikaciji");
		int redniBroj = Ulaz.ucitajInt("Odaberite redni broj za promjenu: ", 
				"Niste unijeli cijeli broj", 1, proizvodi.size());
		Proizvod proizvodZaPromjenu = proizvodi.get(redniBroj-1);
		proizvodZaPromjenu = proizvodPostaviVrijednosti(proizvodZaPromjenu);
		proizvodi.set(redniBroj-1, proizvodZaPromjenu);
		proizvodIzbornik();
	}

	private void proizvodUnosNovog() {
		Proizvod p = new Proizvod();
		p = proizvodPostaviVrijednosti(p);
		proizvodi.add(p);
		proizvodIzbornik();
	}

	private Proizvod proizvodPostaviVrijednosti(Proizvod p) {
		p.setSifra(Ulaz.ucitajInt("Unesite sifru: ",
    			"Sifra mora biti cijeli broj",
    			1, Integer.MAX_VALUE));
		p.setCijena(Ulaz.ucitajDouble("Unesi cijenu: ", 
				"Cijena mora biti decimalni broj", 0, 100000));
		p.setGarancija(Ulaz.ucitajDatum("Unesi datum pocetka: "));
    
		return p;
	}

	private void proizvodPregled() {
		proizvodStavke("Pregled unesenih smjerova");
		proizvodIzbornik();
	}

	private void proizvodStavke(String naslov) {
		System.out.println(naslov);
		System.out.println("--------------------");
		if(proizvodi.size()==0) {
			System.out.println("Nema unesenih proizvoda");
		}else {
			Proizvod p;
			for(int i=0;i<proizvodi.size();i++) {
				p= proizvodi.get(i);
				System.out.println((i + 1) + ". " + p.getCijena() + 
						" " + p.getGarancija()
						);
			}	
		}
	}

	public static void main(String[] args) {
		new Start(); 
	}

}
