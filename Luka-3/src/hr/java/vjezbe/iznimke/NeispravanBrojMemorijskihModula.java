package hr.java.vjezbe.iznimke;

public class NeispravanBrojMemorijskihModula extends RuntimeException {  //NEOZNACENE IZMINKE

	/**
	 * 
	 */
	private static final long serialVersionUID = 3615791161843705414L;
	public NeispravanBrojMemorijskihModula() {
		super("Pogreska! Unijeli ste neispravan broj memorijskih modula. Maticna ploca podrzava izmedu 2 i 8 memorijskih modula!");
	}
	public NeispravanBrojMemorijskihModula(String message) {
	}
	public NeispravanBrojMemorijskihModula(String message, Throwable cause) {
	}
	public NeispravanBrojMemorijskihModula(Throwable cause) {
	}
}
