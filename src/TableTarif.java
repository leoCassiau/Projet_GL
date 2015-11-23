public abstract class TableTarif {

	protected String libelle;
	protected float tarif;
	
	public TableTarif(String libelle, float tarif) {
		this.libelle = libelle;
		this.tarif = tarif;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public float getTarif() {
		return tarif;
	}

	public void setTarif(float tarif) {
		this.tarif = tarif;
	}
}
