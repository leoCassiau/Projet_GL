import java.util.ArrayList;

public class GestionnaireMateriaux {

	private ArrayList<Materiel> materiels;
	private ArrayList<TypeMateriel> typesMateriel;
	
	public int addMateriel(TypeMateriel type) {
		return addMateriel(new Materiel(type));
	}
	
	public int addMateriel(String nom, TypeMateriel type) {
		return addMateriel(new Materiel(nom, type));
	}
	
	private int addMateriel(Materiel m) {
		materiels.add(m);
		return materiels.size()-1;
	}
	
	public ArrayList<Materiel> getMateriel(TypeMateriel type) {
		ArrayList<Materiel> result = new ArrayList<Materiel>();
		for(Materiel m : materiels) {
			if(m.getType().equals(type)) {
				result.add(m);
			}
		}
		return result;
	}
	
	public ArrayList<Materiel> getMateriel(String nom) {
		ArrayList<Materiel> result = new ArrayList<Materiel>();
		for(Materiel m : materiels) {
			if(m.getNom().equals(nom)) {
				result.add(m);
			}
		}
		return result;
	}
	
	public Materiel getMateriel(int code) {
		return materiels.get(code);
	}
	
	public boolean removeMateriel(TypeMateriel type){
		return materiels.remove(this.getMateriel(type));
	}
	
	public boolean removeMateriel(String nom){
		return materiels.remove(this.getMateriel(nom));
	}
	
	public int addTypeMateriel(String nom, Float tarif, String description) {
		typesMateriel.add(new TypeMateriel(nom,tarif,description));
		return typesMateriel.size()-1;
	}
	
	public TypeMateriel removeTypeMateriel(int code) {
		return typesMateriel.remove(code);
	}
}
