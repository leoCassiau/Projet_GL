public class Materiel {
	
	private TypeMateriel type;
	private String nom;
	
	public Materiel(TypeMateriel type) {
		this.type = type;
		this.nom = type.toString();
	}
	
	public Materiel(String nom, TypeMateriel type) {
		this.type = type;
		this.nom = nom;
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
}
