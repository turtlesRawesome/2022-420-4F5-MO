package jetons.modeles.valeurs;

import ca.ntro.app.models.Value;

public class SacAJetons implements Value{
	
	private String idSacAJetons;
	private int valeurDuSac;
	
	public String getIdSacAJetons() {
		return idSacAJetons;
	}

	public void setIdSacAJetons(String idSacAJetons) {
		this.idSacAJetons = idSacAJetons;
	}

	public int getValeurDuSac() {
		return valeurDuSac;
	}

	public void setValeurDuSac(int valeurDuSac) {
		this.valeurDuSac = valeurDuSac;
	}

	public SacAJetons() {
		
	}
}
