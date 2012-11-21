import java.io.Serializable;
import java.util.ArrayList;


public class Parution implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String identParution;
	private Periodique periodique;
	private ArrayList<Article> articles;
	
	public Parution(String identParution, Periodique periodique, ArrayList<Article> articles) {
		this.identParution = identParution;
		this.periodique = periodique;
		this.articles = new ArrayList<Article>();
	}

	public String getIdentParution() {
		return identParution;
	}

	public void setIdentParution(String identParution) {
		this.identParution = identParution;
	}

	public Periodique getPeriodique() {
		return periodique;
	}

	public void setPeriodique(Periodique periodique) {
		this.periodique = periodique;
	}

}
