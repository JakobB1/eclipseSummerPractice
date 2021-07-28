package aplikacija;

import java.util.Scanner;

public class Ulaz {
	
	public static int ucitajInt(
			String poruka, 
			String greska, 
			int mix, 
			int max) {
		int broj=0;
		Scanner ulaz = new Scanner(System.in);
		while(true) {
			System.out.println(poruka);
			try {
				broj = Integer.parseInt(ulaz.nextLine());
				break;
			} catch (Exception e) {
				System.out.println(greska);
			}
		}
		ulaz.close();
		return broj;
	}

}
