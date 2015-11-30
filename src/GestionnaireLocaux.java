import java.util.ArrayList;
import java.util.List;

public class GestionnaireLocaux {

	private List<Salle> listeDesSalles = new ArrayList<Salle>();
	private List<Batiment> listeDesBatiments = new ArrayList<Batiment>();

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
	 * @return Salle retourne la salle ajoutée
	 * @throws Exception
	 *             le batiment dans lequel la nouvelle salle est ajoutée
	 *             n'existe pas
	 */
	public Salle addSalle(int nuBatiment, int nuType, int nuSalle, int nuEtage,
			int superficie) throws Exception {
		Salle s = new Salle(this.getBatimentByNumero(nuBatiment), nuType,
				nuSalle, nuEtage, superficie);
		listeDesSalles.add(s);
		return s;
	}

	/**
	 * ajoute un batiment a la liste des batiments du gestionnaire de locaux
	 * 
	 * @param nomBat
	 *            string le nom du batiment
	 * @param adresse
	 *            string l'adresse du batiment
	 * @return Batiment retourne le batiment ajouté.
	 */
	public Batiment addBatiment(String nomBat, String adresse) {
		Batiment b = new Batiment(nomBat, adresse);
		listeDesBatiments.add(b);
		return b;
	}

	/**
	 * Verifie l'existance de salle
	 * 
	 * @param salle
	 *            Salle
	 * @return boolean retourne vrai si la salle fait partie de la liste des
	 *         salles du gestionnaire de locaux, faux sinon.
	 */
	public boolean existSalle(Salle salle) {
		return listeDesSalles.contains(salle);
	}

	/**
	 * vérifie l'existence de bat
	 * 
	 * @param bat
	 *            Batiment
	 * @return boolean retourne true si le batiment fait partie de la liste des
	 *         batiments du gestionnaire de locaux, false sinon.
	 */
	public boolean existBatiment(Batiment bat) {
		return listeDesBatiments.contains(bat);
	}

	/**
	 * renvoie la liste des salles du batiment bat
	 * 
	 * @param bat
	 *            Batiment
	 * @return List<Salle> la liste des salles du batiment bat
	 */
	public List<Salle> getSalleByBatiment(Batiment bat) {
		List<Salle> listeRetour = new ArrayList<Salle>();
		for (Salle salle : listeDesSalles) {
			if (salle.getNo_bat() == bat.getNo_bat()) {
				listeRetour.add(salle);
			}
		}
		return listeRetour;
	}

	/**
	 * renvoie la liste des salle aux etages numéro nuEtage
	 * 
	 * @param nuEtage
	 *            int numéro de l'étage
	 * @return List<Salle> la liste des salles aux étages numéro nuEtage
	 */
	public List<Salle> getSalleByEtage(int nuEtage) {
		List<Salle> listeRetour = new ArrayList<Salle>();
		for (Salle salle : listeDesSalles) {
			if (salle.getNo_etage() == nuEtage) {
				listeRetour.add(salle);
			}
		}
		return listeRetour;
	}

	/**
	 * renvoie la liste des Salles de numero nuSalle
	 * 
	 * @param nuSalle
	 *            int numéro de la salle
	 * @return Liste<Salle> la liste des salles de numéro nuSalle
	 */
	public List<Salle> getSalleByNumero(int nuSalle) {
		List<Salle> listeRetour = new ArrayList<Salle>();
		for (Salle salle : listeDesSalles) {
			if (salle.getNo_salle() == nuSalle) {
				listeRetour.add(salle);
			}
		}
		return listeRetour;
	}

	/**
	 * renvoie la liste des Salles par type de Salle
	 * 
	 * @param type
	 *            TypeSalle un type de salle
	 * @return List<Salle> la liste des salles de type type
	 */
	public List<Salle> getSalleByType(TypeSalle type) {
		List<Salle> listeRetour = new ArrayList<Salle>();
		for (Salle salle : listeDesSalles) {
			if (salle.getType() == type) {
				listeRetour.add(salle);
			}
		}
		return listeRetour;
	}

	/**
	 * renvoie la liste des Batiments de nom nomBatiment
	 * 
	 * @param nomBatiment
	 *            String le nom du batiment recherché
	 * @return List<Batiment> la liste des batiments de nom nomBatiment
	 */
	public List<Batiment> getBatimentByNom(String nomBatiment) {
		List<Batiment> listeRetour = new ArrayList<Batiment>();
		for (Batiment bat : listeDesBatiments) {
			if (bat.getNom() == nomBatiment) {
				listeRetour.add(bat);
			}
		}
		return listeRetour;
	}

	/**
	 * renvoie le batiment de numéro nuBatiment et lève une erreur si le
	 * batiment n'existe pas
	 * 
	 * @param nuBatiment
	 *            le numéro du batiment
	 * @return Batiment
	 * @throws Exception
	 *             le batiment de numéro nuBatiment n'existe pas
	 */
	public Batiment getBatimentByNumero(int nuBatiment) throws Exception {
		for (Batiment bat : listeDesBatiments) {
			if (bat.getNo_bat() == nuBatiment) {
				return bat;
			}
		}
		throw new Exception("le batiment numéro " + nuBatiment
				+ " n'existe pas.");
	}

	/**
	 * renvoie la liste des batiments de l'adresse adresseBatiment
	 * 
	 * @param adresseBatiment
	 *            String une adresse de batiment
	 * @return List<Batiment> la liste des batiments à l'adresse adresseBatiment
	 */
	public List<Batiment> getBatimentByAdresse(String adresseBatiment) {
		List<Batiment> listeRetour = new ArrayList<Batiment>();
		for (Batiment bat : listeDesBatiments) {
			if (bat.getAdresse() == adresseBatiment) {
				listeRetour.add(bat);
			}
		}
		return listeRetour;
	}

	// TODO : Léo State de matériel fixe/mobile
	/**
	 * ajoute un matériel à une salle
	 * 
	 * @param salleMaj
	 *            Salle la salle dans laquelle ajouté le materiel
	 *            materielAAjouter
	 * @param materielAAjouter
	 *            Materiel le materiel a ajouter dans la salle
	 * @throws Exception
	 *             Si la salle n'existe pas, le matériel n'est pas ajouté.
	 */
	public void addMateriel(Salle salleMaj, Materiel materielAAjouter)
			throws Exception {
		boolean materielAjoute = false;
		for (Salle salle : listeDesSalles) {
			if (salleMaj.equals(salle)) {
				salle.addMateriel(materielAAjouter);
				materielAjoute = true;
			}
		}

		if (!materielAjoute) {
			throw new Exception(
					"Le materiel n'a pas été ajouté car la salle n'existe pas");
		}
	}

	// TODO : LEO
	public void removeMateriel(Salle salleMaj, Materiel materielASupprimer) {
		// for (Salle salle : listeDesSalles) {
		// if (salleMaj.equals(salle)) {
		// salle.getMateriauxFixes().remove(materielASupprimer);
		// }
		// }
	}

	/**
	 * supprime une salle si elle n'a pas de réservation de prévue
	 * 
	 * @param salle
	 *            Salle salle a supprimer
	 * @throws Exception
	 *             la salle a encore des réservations
	 */
	public void removeSalle(Salle salle) throws Exception {
		if (salle.getReservations().isEmpty()) {
			listeDesSalles.remove(salle);
		} else {
			throw new Exception("La salle a encore des réservations");
		}
	}

	/**
	 * supprime le batiment batiment
	 * 
	 * @param batiment
	 *            Batiment batiment a supprimer
	 */
	public void removeBatiment(Batiment batiment) {
		listeDesBatiments.remove(batiment);
	}

}
