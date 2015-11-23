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
	 * cf cas d'utilisation gestion des locaux partie 1 - Le numero du batiment
	 * est saisi ou choisi dans une liste (il doit exister ou on doit le créer)
	 * - le numero du type est saisi ou choisi dans une liste (il doit exister
	 * ou on doit le créer)
	 */
	public Salle(Batiment batiment, TypeSalle type, int num_salle,
			int num_etage, int superficie) {

	}

	// cf cas d'utilisation : gestion des locaux partie 1 pour les trois
	// prochaine méthodes
	public void addMateriel(Materiel materielAAjouter) {

	}

	public void modifierMateriel() {

	}

	public void supprimerMateriel() {

	}

	public TypeSalle getType() {
		return type;
	}

	public void setType(TypeSalle type) {
		this.type = type;
	}

	public int getNo_etage() {
		return no_etage;
	}

	public void setNo_etage(int no_etage) {
		this.no_etage = no_etage;
	}

	public int getNo_salle() {
		return no_salle;
	}

	public void setNo_salle(int no_salle) {
		this.no_salle = no_salle;
	}

	public int getNo_bat() {
		return no_bat;
	}

	public void setNo_bat(int no_bat) {
		this.no_bat = no_bat;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public ArrayList<Materiel> getMateriauxFixes() {
		return materiauxFixes;
	}

	public void setMateriauxFixes(ArrayList<Materiel> materiauxFixes) {
		this.materiauxFixes = materiauxFixes;
	}

	public ArrayList<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}

	@Override
	public boolean equals(Object o) {
		Salle salle = (Salle) o;
		if (this.no_bat == salle.getNo_bat()
				&& this.no_etage == salle.getNo_etage()
				&& this.no_salle == salle.getNo_salle()) {
			return true;
		} else
			return false;
	}

}
