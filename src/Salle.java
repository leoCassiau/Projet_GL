import java.util.ArrayList;

public class Salle {

	private TypeSalle type;
	private int no_etage; // KEY
	private int no_salle; // KEY
	private int no_bat; // KEY
	private int superficie;
	private ArrayList<Materiel> materiauxFixes;
	private ArrayList<Reservation> reservations;

	/*
	 * cf cas d'utilisation gestion des locaux partie 1
	 *  - Le numero du batiment
	 * est saisi ou choisi dans une liste (il doit exister ou on doit le créer)
	 *  - le numero du type est saisi ou choisi dans une liste (il doit exister ou
	 * on doit le créer)
	 */
	public Salle(Batiment batiment, TypeSalle type, int num_salle,
			int num_etage, int superficie) {

	}

	// cf cas d'utilisation : gestion des locaux partie 1 pour les trois
	// prochaine méthodes
	public void ajouterMateriel(Materiel materielAAjouter) {

	}

	public void modifierMateriel() {

	}

	public void supprimerMateriel() {

	}
}
