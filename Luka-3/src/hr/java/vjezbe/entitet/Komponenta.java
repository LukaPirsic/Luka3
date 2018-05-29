package hr.java.vjezbe.entitet;

public abstract class Komponenta {

	String nazivProizvodaca;

	public Komponenta() {
	}

	public void setNazivProizvodaca(String nazivProizvodaca) {
		this.nazivProizvodaca = nazivProizvodaca;
	}

	public String getNazivProizvodaca() {
		return nazivProizvodaca;
	}
}
