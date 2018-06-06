package hr.java.vjezbe.glavna;

import java.util.Scanner;

import hr.java.vjezbe.entitet.Racunalo;

public class Glavna {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Racunalo racunala[] = new Racunalo[2];

		// UNOS KONFIGURACIJE
		
			for (int i = 0; i < racunala.length; i++) {

				racunala[i] = new Racunalo();

				System.out.println(String.format("Unesi podatke %d. racunala:", i + 1));
				racunala[i] = Racunalo.fromUserInput(scanner);
				
				racunala[i].getProcesor().provjera(racunala[i].getMaticnaPloca(), racunala[i].getProcesor());
			}
			
		// ISPIS KONFIGURACIJE
		for (int i = 0; i < racunala.length; i++) {

			System.out.println();
			System.out.println(String.format("%d. racunalo:", i + 1));
			System.out.println("------------");
			System.out.println(racunala[i].toString());
		}
/*
		// TRAŽENJE KOJE RACUNALO IMA MANJE RADNE MEMORIJE
		if (racunala[0].getRadnaMemorija().getKapacitet()
				.compareTo(racunala[1].getRadnaMemorija().getKapacitet()) < 0) {

			racunala[0].getRadnaMemorija().uvecajKapacitet(racunala[0].getRadnaMemorija().getKapacitet());

		} else if (racunala[0].getRadnaMemorija().getKapacitet()
				.compareTo(racunala[1].getRadnaMemorija().getKapacitet()) > 0) {

			racunala[1].getRadnaMemorija().uvecajKapacitet(racunala[1].getRadnaMemorija().getKapacitet());

		}

		// TRAZENJE KOJE RACUNALO IMA SPORIJI PROCESOR
		if (racunala[0].getProcesor().getBrzina().compareTo(racunala[1].getProcesor().getBrzina()) < 0) {

			racunala[0].getProcesor()
					.setBrzina(racunala[0].getProcesor().overclock(racunala[0].getProcesor().getBrzina()));

		} else if (racunala[0].getProcesor().getBrzina().compareTo(racunala[1].getProcesor().getBrzina()) > 0) {

			racunala[1].getProcesor()
					.setBrzina(racunala[1].getProcesor().overclock(racunala[1].getProcesor().getBrzina()));

		}

		// PONOVNI ISPIS KONFIGURACIJE for (int i = 0; i < racunala.length; i++) {
		for (int i = 0; i < racunala.length; i++) {
			System.out.println();
			System.out.println(String.format("%s. racunalo:", i + 1));
			System.out.println("------------");
			System.out.println(racunala[i].toString());
		}
*/		
	}
}


