public class Batiment {
	private int no_bat; // key
	private String nom;
	private String adresse;

	public Batiment(String nom, String adresse) {
//		this.no_bat = no_bat; // calculé pour etre une clé
		this.nom = nom;
		this.adresse = adresse;
	}

	public int getNo_bat() {
		return no_bat;
	}

	public void setNo_bat(int no_bat) {
		this.no_bat = no_bat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
