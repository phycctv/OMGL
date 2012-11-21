import java.io.Serializable;


public class Quota implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int maxEmprunts;
	private int dureeEmprunt;
	private int penaliteJour;
	
	public Quota(int maxEmprunts, int dureeEmprunt, int penaliteJour) {
		this.setMaxEmprunts(maxEmprunts);
		this.setDureeEmprunt(dureeEmprunt);
		this.setPenaliteJour(penaliteJour);
	}

	public int getMaxEmprunts() {
		return maxEmprunts;
	}

	public void setMaxEmprunts(int maxEmprunts) {
		this.maxEmprunts = maxEmprunts;
	}

	public int getDureeEmprunt() {
		return dureeEmprunt;
	}

	public void setDureeEmprunt(int dureeEmprunt) {
		this.dureeEmprunt = dureeEmprunt;
	}

	public int getPenaliteJour() {
		return penaliteJour;
	}

	public void setPenaliteJour(int penaliteJour) {
		this.penaliteJour = penaliteJour;
	}

}
