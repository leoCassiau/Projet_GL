public class TypeMateriel extends TableTarif {
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String description; // cf exercice 5.1 page 228
								// "Le type de materiel contient la description et son tarif"

	public TypeMateriel(String libelle, float tarif, String description) {
		super(libelle, tarif);
		this.description = description;
	}
}
