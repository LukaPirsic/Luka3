package hr.java.vjezbe.entitet;

import java.util.Scanner;

public class MaticnaPloca extends Komponenta{

	private String tip, tipSuceljaZaProcesor;
	private int brojMemorijskihModula;

	// KONSTRUKTOR
	public MaticnaPloca() {
	}
	// NEKAJ DA MOGU PRISTUPITI NAZ.PROIZ. IZ KOMPONENTE
	public MaticnaPloca(String nazivProizvodaca) {
		super();
	}
	// GET I SET METODE
	public void setNazivProizvodaca(String nazivProizvodaca) {
		this.nazivProizvodaca = nazivProizvodaca;
	}
	public String getNazivProizvodaca() {
		return nazivProizvodaca;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getTip() {
		return tip;
	}
	public void setTipSuceljaZaProcesor(String tipSuceljaZaProcesor) {
		this.tipSuceljaZaProcesor = tipSuceljaZaProcesor;
	}
	public String getTipSuceljaZaProcesor() {
		return tipSuceljaZaProcesor;
	}
	public void setBrojMemorijskihModula(int brojMemorijskihModula) {
		this.brojMemorijskihModula = brojMemorijskihModula;
	}
	public int getBrojMemorijskihModula() {
		return brojMemorijskihModula;
	}
	
	// METODA ZA UNOS KONFIGURACIJE
	public static MaticnaPloca fromUserInput(Scanner scanner) {
		MaticnaPloca maticnaPloca = new MaticnaPloca();
		Procesor procesor = new Procesor();
		
		System.out.print("Unesi proizvodaca maticne ploce: ");
		maticnaPloca.setNazivProizvodaca(scanner.nextLine());
		System.out.print("Unesi tip maticne ploce: ");
		maticnaPloca.setTip(scanner.nextLine());
		
		maticnaPloca.setTipSuceljaZaProcesor(procesor.unosSucelja());
		
		// ------------------------------------------------------------------------------------------------------------------------------------------------------------
		// PETLJA ZA MEMORIJSKE MODULE
		boolean nastaviPetlju = false;

		do {
			System.out.print("Unesite maksimalni broj memorijskih modula (min 2 - max 8): ");
			maticnaPloca.setBrojMemorijskihModula(scanner.nextInt());
			if (maticnaPloca.getBrojMemorijskihModula() > 1 && maticnaPloca.getBrojMemorijskihModula() < 9) {
				do {
					System.out.print("Unesite broj memorijskih modula koje zelite ugraditi u maticnu plocu: ");
					int temp = scanner.nextInt();

					if (temp > maticnaPloca.getBrojMemorijskihModula()) {

						System.out.printf(
								"Pogreska! Unijeli ste neispravan broj memorijskih modula. Maticna ploca podrzava do %s memorijskih modula! %n",
								maticnaPloca.getBrojMemorijskihModula());
						nastaviPetlju = true;
					} else {
						nastaviPetlju = false;
					}
				} while (nastaviPetlju);
			} else {
				System.out.println("Pogrešan unos!");
				nastaviPetlju = true;
			}
			scanner.nextLine();
		} while (nastaviPetlju);
		// ------------------------------------------------------------------------------------------------------------------------------------------------------------

		return maticnaPloca;
	}

	// METODA ZA ISPIS KONFIGURACIJE
	public String toString() {
		return "Naziv proizvodaca maticne ploce: " + nazivProizvodaca + "\n" + "Tip maticne ploce: " + tip;
	}
}
