package hr.java.vjezbe.entitet;

import java.math.BigDecimal;
import java.util.Scanner;

public class RadnaMemorija extends Komponenta implements Memorijska {

	private String tip;
	private BigDecimal kapacitet;
	
			//KONSTRUKTOR
	public RadnaMemorija() {
	}
	
			//NEKAJ DA MOGU PRISTUPITI NAZ.PROIZ. IZ KOMPONENTE
	public RadnaMemorija(String nazivProizvodaca) {
		super();
	}
	
			//GET I SET METODE
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
	public void setKapacitet(BigDecimal kapacitet) {
		this.kapacitet = kapacitet;
		
	}
	public BigDecimal getKapacitet() {
		return kapacitet;
	}
	
			//METODA ZA UNOS KONFIGURACIJE
	public static RadnaMemorija fromUserInput(Scanner scanner) {
		
		RadnaMemorija radnaMemorija = new RadnaMemorija();
		
		System.out.print("Unesi proizvodaca radne memorija: ");
		radnaMemorija.setNazivProizvodaca(scanner.nextLine());
		System.out.print("Unesi tip radne memorije: ");
		radnaMemorija.setTip(scanner.nextLine());
		System.out.print("Unesi kapacitet radne memorije (u GB): ");
		radnaMemorija.setKapacitet(scanner.nextBigDecimal());
		scanner.nextLine();
		
		return radnaMemorija;
	}
	
			//METODA ZA ISPIS KONFIGURACIJE
	public String toString() {
		return "Naziv proizvodaca radne memorije: " + nazivProizvodaca + "\n" + "Tip radne memorije: " + tip + "\n" + "Kapacitet radne memorije: " + Memorijska.pretvoriUTB(kapacitet) + " GB";
	}
	
	public void uvecajKapacitet(BigDecimal kapacitet) {
		BigDecimal x = new BigDecimal(2);
		this.kapacitet = kapacitet.multiply(x);
	}
	
}



