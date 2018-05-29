package hr.java.vjezbe.entitet;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public interface Memorijska {

	public static void uvecajKapacitet(int zadaniFaktor) {
	}
	
	BigDecimal x = new BigDecimal("1024");
	
	public static BigDecimal pretvoriUTB (BigDecimal kapacitet) {
		return kapacitet.divide(x, 6, RoundingMode.CEILING);
	}
	
}
