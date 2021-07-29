package edunova;

import java.util.ArrayList;
import java.util.List;

public class Start {
	
	private List<Smjer> smjerovi;
	
	public Start() {
		smjerovi = new ArrayList<Smjer>();
		glavniIzbornik();
	}
	
	private void glavniIzbornik() {
		System.out.println("**** Edunova APP konzola ****");
		System.out.println(" IZBORNIK ");
		System.out.println(" 1. Smjerovi");
		System.out.println(" 2. Polaznici");
		System.out.println(" 3. Predavači");
		System.out.println(" 4. Grupe");
		System.out.println(" 5. Izlazi iz programa");
		ucitajGlavnuAkciju();
		
	}

	private void ucitajGlavnuAkciju() {
		switch (Ulaz.ucitajInt("Odaberite stavku ", "Greška unosa", 1, 5)) {
		case 1:
			smjerIzbornik();
			break;
		case 5:
			return;
		}
		
	}

	private void smjerIzbornik() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new Start();
	}

}
