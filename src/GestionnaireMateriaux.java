import java.util.ArrayList;
import java.util.List;

public class GestionnaireMateriaux {

	private List<Materiel> materiels = new ArrayList<Materiel>() ;
	private List<TypeMateriel> typesMateriel = new ArrayList<TypeMateriel>();
	
	public Materiel addMateriel(TypeMateriel type) {
		Materiel m = new Materiel(type);
		materiels.add(m);
		return m;
	}
	
	public Materiel addMateriel(String nom, TypeMateriel type) {
		Materiel m = new Materiel(nom, type);
		materiels.add(m);
		return m;
	}
	
	public List<Materiel> getMaterielByType(TypeMateriel type) {
		List<Materiel> result = new ArrayList<Materiel>();
		for(Materiel m : materiels) {
			if(m.getType().equals(type)) {
				result.add(m);
			}
		}
		return result;
	}
	
	public List<Materiel> getMaterielByNom(String nom) {
		List<Materiel> result = new ArrayList<Materiel>();
		for(Materiel m : materiels) {
			if(m.getNom().equals(nom)) {
				result.add(m);
			}
		}
		return result;
	}
	
	public boolean removeMateriel(Materiel m) {
		return materiels.remove(m);
	}
	
	public boolean removeMaterielByType(TypeMateriel type){
		return materiels.remove(this.getMaterielByType(type));
	}
	
	public boolean removeMaterielByNom(String nom){
		return materiels.remove(this.getMaterielByNom(nom));
	}
	
	public TypeMateriel addTypeMateriel(String nom, Float tarif, String description) {
		TypeMateriel tm = new TypeMateriel(nom,tarif,description);
		typesMateriel.add(tm);
		return tm;
	}
	
	public List<TypeMateriel> getTypesMateriel() {
		return typesMateriel;
	}
	
	public boolean removeTypeMateriel(TypeMateriel tm) {
		return typesMateriel.remove(tm);
	}
}
