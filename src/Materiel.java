public class Materiel {
	
	private TypeMateriel type;
	private String nom;
	private MaterielState etatCourant;
	
	public Materiel(TypeMateriel type) {
		this.type = type;
		this.nom = type.toString();
		this.etatCourant = new MaterielStateMobile();
	}
	
	public Materiel(String nom, TypeMateriel type) {
		this.type = type;
		this.nom = nom;
		this.etatCourant = new MaterielStateMobile();
	}

	public TypeMateriel getType() {
		return type;
	}

	public void setType(TypeMateriel type) {
		this.type = type;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public boolean reserver() {
		return etatCourant.reserver();
	}
}
