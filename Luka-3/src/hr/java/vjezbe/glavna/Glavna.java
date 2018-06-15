package hr.java.vjezbe.glavna;

import java.util.Scanner;

import hr.java.vjezbe.entitet.Racunalo;
import hr.java.vjezbe.iznimke.NekompatibilnoSuceljeZaProcesorException;

public class Glavna {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Racunalo racunala[] = new Racunalo[2];
		boolean nastaviPetlju = false;

		// UNOS KONFIGURACIJE

		for (int i = 0; i < racunala.length; i++) {

			System.out.println(String.format("Unesi podatke %d. racunala:", i + 1));
			racunala[i] = Racunalo.fromUserInput(scanner);
			
			do {
				try {
					racunala[i].getProcesor().provjeraKompatibilnostiSucelja(racunala[i].getMaticnaPloca(), racunala[i].getProcesor());
					nastaviPetlju = false;
				} catch (NekompatibilnoSuceljeZaProcesorException e) {
					System.out.print(e.getMessage());
					racunala[i].getProcesor().unosSucelja();
					nastaviPetlju = true;
				}
			} while (nastaviPetlju);

		}
		// ISPIS KONFIGURACIJE
		for (int i = 0; i < racunala.length; i++) {

			System.out.println();
			System.out.println(String.format("%d. racunalo:", i + 1));
			System.out.println("------------");
			System.out.println(racunala[i].toString());
		}
/*
		// TRA�ENJE KOJE RACUNALO IMA MANJE RADNE MEMORIJE
		if (racunala[0].getRadnaMemorija().getKapacitet().compareTo(racunala[1].getRadnaMemorija().getKapacitet()) < 0) {

			racunala[0].getRadnaMemorija().uvecajKapacitet(racunala[0].getRadnaMemorija().getKapacitet());

		} else if (racunala[0].getRadnaMemorija().getKapacitet().compareTo(racunala[1].getRadnaMemorija().getKapacitet()) > 0) {

			racunala[1].getRadnaMemorija().uvecajKapacitet(racunala[1].getRadnaMemorija().getKapacitet());

		}

		// TRAZENJE KOJE RACUNALO IMA SPORIJI PROCESOR
		if (racunala[0].getProcesor().getBrzina().compareTo(racunala[1].getProcesor().getBrzina()) < 0) {

			racunala[0].getProcesor().setBrzina(racunala[0].getProcesor().overclock(racunala[0].getProcesor().getBrzina()));

		} else if (racunala[0].getProcesor().getBrzina().compareTo(racunala[1].getProcesor().getBrzina()) > 0) {

			racunala[1].getProcesor().setBrzina(racunala[1].getProcesor().overclock(racunala[1].getProcesor().getBrzina()));

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


