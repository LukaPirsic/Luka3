package hr.java.vjezbe.entitet;

import java.math.BigDecimal;
import java.util.Scanner;

public class Procesor extends Komponenta implements Ferkvencija {

	public static final String SOCKET_AM2 = "Socket AM2";
	public static final String SOCKET_AM3 = "Socket AM3";
	public static final String LGA_1151 = "Socket LGA 1151";
	public static final String SOCKET_G3 = "Socket G3";

	private String tip, tipSucelja;
	private BigDecimal brzina;

	static Scanner scanner = new Scanner(System.in);

	// KONSTRUKTOR
	public Procesor() {
	}

	// NEKAJ DA MOGU PRISTUPITI NAZ.PROIZ. IZ KOMPONENTE
	public Procesor(String nazivProizvodaca) {
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

	public void setTipSucelja(String tip) {
		this.tip = tipSucelja;
	}

	public String getTipSucelja() {
		return tipSucelja;
	}

	public void setBrzina(BigDecimal brzina) {
		this.brzina = brzina;
	}

	public BigDecimal getBrzina() {
		return brzina;
	}

	static boolean nastaviPetlju = false;

	// METODA ZA UNOS KONFIGURACIJE
	public static Procesor fromUserInput(Scanner scanner) {

		Procesor procesor = new Procesor();
		MaticnaPloca maticnaPloca = new MaticnaPloca();

		System.out.print("Unesi proizvodaca procesora: ");
		procesor.setNazivProizvodaca(scanner.nextLine());
		System.out.print("Unesi tip procesora: ");
		procesor.setTip(scanner.nextLine());

		procesor.tipSucelja = procesor.unosSucelja();
		procesor.provjera();
		

		System.out.print("Unesi brzinu procesora: ");
		procesor.setBrzina(scanner.nextBigDecimal());
		scanner.nextLine();

		return procesor;
	}

	// METODA ZA ISPIS KONFIGURACIJE
	public String toString() {
		return "Naziv proizvodaca procesora: " + nazivProizvodaca + "\n" + "Tip procesora: " + tip + "\n"
				+ "Tip sucelja procesora: " + tipSucelja + "\n" + "Brzina procesora: " + brzina + " GHz";
	}

	// METODA ZA UNOS SUCELJA
	public String unosSucelja() {

		// PETLJA KOJA VRACA NA POCEKAT AKO NIJE BROJ ODABRAN IZMEDU 1 - 4
		do {
			System.out.println("Unesi tip sucelja procesora (odaberite broj ispred zeljenog sucelja): ");
			System.out.println("1) " + SOCKET_AM2);
			System.out.println("2) " + SOCKET_AM3);
			System.out.println("3) " + LGA_1151);
			System.out.println("4) " + SOCKET_G3);
			int temp = scanner.nextInt();

			if (temp > 0 && temp < 5) {

				switch (temp) {
				case 1:
					tipSucelja = SOCKET_AM2;
					nastaviPetlju = false;
					break;
				case 2:
					tipSucelja = SOCKET_AM3;
					nastaviPetlju = false;
					break;
				case 3:
					tipSucelja = LGA_1151;
					nastaviPetlju = false;
					break;
				case 4:
					tipSucelja = SOCKET_G3;
					nastaviPetlju = false;
					break;
				}

			} else {
				System.out.println("Pogreska kod odabira, molim pokusajte ponovno!");
				nastaviPetlju = true;
			}
		} while (nastaviPetlju);
		return tipSucelja;
	}

	// ANALIZA SUCELJA MATICNE I PROCESORA
	public void provjera() {

		Procesor procesor = new Procesor();
		MaticnaPloca maticnaPloca = new MaticnaPloca();

		do {
			if (maticnaPloca.getTipSuceljaZaProcesor() == procesor.tipSucelja) { //zakaj je ovo null i null?? zato kaj jos nije return-ao racunalo??
				nastaviPetlju = false;
			} else {
				System.out.println("Pogreska! Tip sucelja proesora mora se podudarati s tipom sucelja procesora na maticnoj ploca!");
				nastaviPetlju = true;
			}
		} while (nastaviPetlju);
	}
}
