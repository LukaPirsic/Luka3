package hr.java.vjezbe.iznimke;

public class NekompatibilnoSuceljeZaProcesorException extends Exception { //OZNACENE IZMINKE
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2148123292766696489L;
	
	public NekompatibilnoSuceljeZaProcesorException(String message) {
		super(message);
	}
	public NekompatibilnoSuceljeZaProcesorException(String message, Throwable cause) {
		super(message, cause);
	}
	public NekompatibilnoSuceljeZaProcesorException(Throwable cause) {
		super(cause);
	}
}
