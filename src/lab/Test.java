package lab;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int heureDnM = 0;
		int heureDnS = 0;
		int heureFnM = 0;
		int heureFnS = 0;
		int totalHn = 0;
		int totalHm = 0;
		int total = 0;
		int prix = 0;
		
		System.out.print("Heure de début : ");
		Scanner debut = new Scanner(System.in);
		int heureDebut = debut.nextInt();
		
		System.out.print("Heure de fin : ");
		Scanner fin = new Scanner(System.in);
		int heureFin = fin.nextInt();
		
		if(heureDebut < heureFin){
			if(heureDebut <= 7){
				heureDnM = 7 - heureDebut;
			}
			if(heureDebut >= 17){
				heureDnS = heureDebut - 17;
			}
			if(heureFin <= 7){
				heureFnM = heureFin - 7;
			}
			if(heureFin >= 17){
				heureFnS = heureFin - 17;
			}
			total = heureFin - heureDebut;
			totalHn = heureDnM + heureDnS + heureFnM + heureFnS;
			totalHm = total - totalHn;
			prix = (totalHm * 2) + totalHn;
			
			System.out.println("Vous avez loué votre vélo pour : ");
			System.out.println("TOTAL HEURES : " + total + " Heure(s)");
			System.out.println("HEURES MAJOREES : " + totalHm + " Heure(s)");
			System.out.println("HEURES NORMALES : " + totalHn + " Heure(s)");
			System.out.println("Vous devez régler : " + prix + " €");
		}else{
			System.out.println("Merde !!!");
		}
	}

}
