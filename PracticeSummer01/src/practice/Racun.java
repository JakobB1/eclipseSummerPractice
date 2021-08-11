package practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Racun {
	
	private int sifra;
	private Date datumpocetka;
	private String brojracuna;
	private double cijena;
	private boolean certifikat;
	private List<Korisnik> korisnici = new ArrayList<Korisnik>();
	private List<Djelatnik> djelatnici = new ArrayList<Djelatnik>();
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public Date getDatumpocetka() {
		return datumpocetka;
	}
	public void setDatumpocetka(Date datumpocetka) {
		this.datumpocetka = datumpocetka;
	}
	public String getBrojracuna() {
		return brojracuna;
	}
	public void setBrojracuna(String brojracuna) {
		this.brojracuna = brojracuna;
	}
	public double getCijena() {
		return cijena;
	}
	public void setCijena(double cijena) {
		this.cijena = cijena;
	}
	public boolean isCertifikat() {
		return certifikat;
	}
	public void setCertifikat(boolean certifikat) {
		this.certifikat = certifikat;
	}
	public List<Korisnik> getKorisnici() {
		return korisnici;
	}
	public void setKorisnici(List<Korisnik> korisnici) {
		this.korisnici = korisnici;
	}
	public List<Djelatnik> getDjelatnici() {
		return djelatnici;
	}
	public void setDjelatnici(List<Djelatnik> djelatnici) {
		this.djelatnici = djelatnici;
	}
	
	
}
