import java.io.Serializable;


public class Periodique implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String issn;
	private String nomPeriodique;

	public Periodique(String issn, String nomPeriodique) {
		this.issn = issn;
		this.nomPeriodique = nomPeriodique;
	}
	
	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getNomPeriodique() {
		return nomPeriodique;
	}

	public void setNomPeriodique(String nomPeriodique) {
		this.nomPeriodique = nomPeriodique;
	}

}
