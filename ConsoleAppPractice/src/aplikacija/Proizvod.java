package aplikacija;

import java.util.Date;

public class Proizvod {
	
	private int sifra;
	private double cijena;
	private Date garancija;
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public double getCijena() {
		return cijena;
	}
	public void setCijena(double cijena) {
		this.cijena = cijena;
	}
	public Date getGarancija() {
		return garancija;
	}
	public void setGarancija(Date garancija) {
		this.garancija = garancija;
	}
	
	

}
