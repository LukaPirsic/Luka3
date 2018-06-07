package hr.java.vjezbe.iznimke;

public class NeispravanBrojMemorijskihModula extends RuntimeException {  //NEOZNACENE IZMINKE

	/**
	 * 
	 */
	private static final long serialVersionUID = 3615791161843705414L;
	
	public NeispravanBrojMemorijskihModula(String message) {
		super(message);
	}
	public NeispravanBrojMemorijskihModula(String message, Throwable cause) {
		super(message, cause);
	}
	public NeispravanBrojMemorijskihModula(Throwable cause) {
		super(cause);
	}
}
