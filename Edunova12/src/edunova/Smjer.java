package edunova;

public class Smjer {
	
	private int sifra;
	private String naziv;
	private int trajanje;
	private double cijena;
	private boolean certifikat;
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getTrajanje() {
		return trajanje;
	}
	public void setTrajanje(int trajanje) {
		this.trajanje = trajanje;
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

}
