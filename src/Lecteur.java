import java.io.Serializable;


public class Lecteur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nomLecteur;
	private String prenomLecteur;
	private String adresse;
	private String telephone;
	
	public Lecteur(String nomLecteur, String prenomLecteur, String adresse,
			String telephone) {
		this.setNomLecteur(nomLecteur);
		this.setPrenomLecteur(prenomLecteur);
		this.setAdresse(adresse);
		this.setTelephone(telephone);
	}

	public String getNomLecteur() {
		return nomLecteur;
	}

	public void setNomLecteur(String nomLecteur) {
		this.nomLecteur = nomLecteur;
	}

	public String getPrenomLecteur() {
		return prenomLecteur;
	}

	public void setPrenomLecteur(String prenomLecteur) {
		this.prenomLecteur = prenomLecteur;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
