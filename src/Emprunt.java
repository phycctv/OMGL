import java.io.Serializable;
import java.util.GregorianCalendar;


public class Emprunt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private GregorianCalendar dateDebutRetrait;
	private GregorianCalendar dateLimiteRetrait;
	
	public Emprunt(GregorianCalendar dateDebutRetrait, GregorianCalendar dateLimiteRetrait) {
		this.setDateDebutRetrait(dateDebutRetrait);
		this.setDateLimiteRetrait(dateLimiteRetrait);
	}

	public GregorianCalendar getDateDebutRetrait() {
		return dateDebutRetrait;
	}

	public void setDateDebutRetrait(GregorianCalendar dateDebutRetrait) {
		this.dateDebutRetrait = dateDebutRetrait;
	}

	public GregorianCalendar getDateLimiteRetrait() {
		return dateLimiteRetrait;
	}

	public void setDateLimiteRetrait(GregorianCalendar dateLimiteRetrait) {
		this.dateLimiteRetrait = dateLimiteRetrait;
	}

}
