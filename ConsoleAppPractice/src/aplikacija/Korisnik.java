package aplikacija;

public class Korisnik {
	
	private int sifra;
	private String ime;
	private String prezime;
	private int brojClanskeKartice;
	private String email;
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getBrojClanskeKartice() {
		return brojClanskeKartice;
	}
	public void setBrojClanskeKartice(int brojClanskeKartice) {
		this.brojClanskeKartice = brojClanskeKartice;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
