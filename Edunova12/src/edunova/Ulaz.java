package edunova;


import java.util.Scanner;


public class Ulaz {
	
	public static Scanner scanner;
	
	public static int ucitajInt(
			String poruka, 
			String greska, 
			int min, 
			int max) {
		int broj=0;
		while(true) {
			System.out.print(poruka);
			try {
				
				broj = Integer.parseInt(
						scanner.nextLine());
				if (broj<min || broj>max) {
					System.out.println("Broj ne smije biti manji od " + min
							+ " ili veći od " + max);
					continue;
				}
				break;
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println(greska);
			}
		}
		
		return broj;
	}
	
	public static String ucitajString(String poruka,String greska) {
		String s="";
		while(true) {
			System.out.print(poruka);
			s = scanner.nextLine();
			if(s.trim().equals("")){
				System.out.println(greska);
				continue;
			}
			break;
		}
		
		return s;
	}
	
	
	
	public static double ucitajDouble(
			String poruka, 
			String greska, 
			double min, 
			double max) {
		double broj=0;
		while(true) {
			System.out.print(poruka);
			try {
				
				broj = Double.parseDouble(
						// Zamjeniti s Scanner
						scanner.nextLine());
				if (broj<min || broj>max) {
					System.out.println("Broj ne smije biti manji od " + min
							+ " ili ve�i od " + max);
					continue;
				}
				break;
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println(greska);
			}
		}
		
		return broj;
	}
	
	public static boolean ucitajBoolean(String poruka, String greska) {
		String s;
		while(true) {
			System.out.print(poruka);
			s=scanner.nextLine();
			if(s.trim().toLowerCase().equals("da")) {
				return true;
			}
			if(s.trim().toLowerCase().equals("ne")) {
				return false;
			}
			System.out.println(greska + " (unos da/ne)");
		}
	}
	
	
}
