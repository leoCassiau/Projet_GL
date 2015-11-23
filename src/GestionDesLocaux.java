import java.util.ArrayList;

public class GestionDesLocaux {

	private ArrayList<Salle> listeDesSalles;
	private ArrayList<Batiment> listeDesBatiments;
	private GestionnaireDesMateriaux gestionnaireDesMateriaux;
	private GestionnaireDesReservations gestionnaireDesReservations;

	public GestionDesLocaux() {
		listeDesSalles = new ArrayList<Salle>();
	}

	/*
	 * LE numero du batiment est saisi ou choisi dans une liste de batiments
	 * existant. Si le batiment n'existe pas, on doit d'abord le créer. Le type
	 * est ensuite donné (numéro), ou choisi dans une liste. Si le type n'existe
	 * pas on doit d'abord le créer. Lorsque le bâtiment et le type sont
	 * correct, le numéro de la salle et de l'étage sont saisis, ainsi que la
	 * superficie.
	 */
	/**
	 * Ajoute une salle, créer une nouvelle salle si l'ajout c'est bien passé.
	 * 
	 * @param nuBatiment
	 *            int numéro du batiment
	 * @param nuType
	 *            int numero du type de la salle
	 * @param nuSalle
	 *            int numéro de la salle
	 * @param nuEtage
	 *            int numero de l'étage
	 * @param superficie
	 *            int superficie de la salle
	 * @return boolean retourne true si la salle a été ajoutée, false sinon.
	 */
	public void addSalle(int nuBatiment, int nuType, int nuSalle, int nuEtage,
			int superficie) {
		listeDesSalles.add(new Salle(this.searchBatimentParNumero(nuBatiment),
				nuType, nuSalle, nuEtage, superficie));
	}
	
	public void addBatiment(String nomBat, String adresse){
		listeDesBatiments.add(new Batiment(nomBat, adresse));
	}
	
	public boolean existSalle(Salle salle){
		return listeDesSalles.contains(salle);
	}
	
	public boolean existBatiment(Batiment bat){
		return listeDesBatiments.contains(bat);
	}

	public ArrayList<Salle> searchSalleParBatiment(Batiment bat) {
		ArrayList<Salle> listeRetour = new ArrayList<Salle>();
		for (Salle salle : listeDesSalles) {
			if (salle.getNo_bat() == bat.getNo_bat()) {
				listeRetour.add(salle);
			}
		}
		return listeRetour;
	}

	public ArrayList<Salle> searchSalleParEtage(int nuEtage) {
		ArrayList<Salle> listeRetour = new ArrayList<Salle>();
		for (Salle salle : listeDesSalles) {
			if (salle.getNo_etage() == nuEtage) {
				listeRetour.add(salle);
			}
		}
		return listeRetour;
	}

	public ArrayList<Salle> searchSalleParNumero(int nuSalle) {
		ArrayList<Salle> listeRetour = new ArrayList<Salle>();
		for (Salle salle : listeDesSalles) {
			if (salle.getNo_salle() == nuSalle) {
				listeRetour.add(salle);
			}
		}
		return listeRetour;
	}

	public ArrayList<Salle> searchSalleParType(TypeSalle type) {
		ArrayList<Salle> listeRetour = new ArrayList<Salle>();
		for (Salle salle : listeDesSalles) {
			if (salle.getType() == type) {
				listeRetour.add(salle);
			}
		}
		return listeRetour;
	}

	public void addMateriel(Salle salleMaj, Materiel materielAAjouter) {
		for (Salle salle : listeDesSalles) {
			if (salleMaj.equals(salle)) {
				salle.addMateriel(materielAAjouter);
			}
		}
	}

	
	// TODO : LEO
	public void removeMateriel(Salle salleMaj, Materiel materielASupprimer) {
//		for (Salle salle : listeDesSalles) {
//			if (salleMaj.equals(salle)) {
//				salle.getMateriauxFixes().remove(materielASupprimer);
//			}
//		}
	}
	
	public void removeSalle(Salle salle) throws Exception{
		if (salle.getReservations().isEmpty()){
			listeDesSalles.remove(salle);
		}
		else throw new Exception("La salle a encore des réservations");
	}

}
