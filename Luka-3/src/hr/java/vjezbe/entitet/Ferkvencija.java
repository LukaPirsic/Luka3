package hr.java.vjezbe.entitet;

import java.math.BigDecimal;

public interface Ferkvencija {
	
	default BigDecimal overclock(BigDecimal brzina) {
		return brzina.multiply(new BigDecimal(1.5));
	}
}
