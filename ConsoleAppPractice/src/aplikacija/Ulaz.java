package aplikacija;

import java.util.Scanner;

public class Ulaz {
	
	public static int ucitajInt(
			String poruka, 
			String greska, 
			int min, 
			int max) {
		int broj=0;
		Scanner ulaz = new Scanner(System.in);
		while(true) {
			System.out.print(poruka);
			try {
				broj = Integer.parseInt(ulaz.nextLine());
				if (broj<min  || broj>max) {
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println(greska);
			}
		}
		ulaz.close();
		return broj;
	}

}
