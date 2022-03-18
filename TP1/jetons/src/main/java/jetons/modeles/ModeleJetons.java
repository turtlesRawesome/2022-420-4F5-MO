package jetons.modeles;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ca.ntro.app.models.Model;
import jetons.messages.MsgAjouterSacAJetons;
import jetons.modeles.valeurs.SacAJetons;

public class ModeleJetons implements Model {
	
	private long hordotageOuverture = -1;
	private List<SacAJetons> sacsAJetons = new ArrayList<>();
	
	//GETs&SETs
	
	public List<SacAJetons> getSacsAJetons() {
		return sacsAJetons;
	}

	public void setSacsAJetons(List<SacAJetons> sacsAJetons) {
		this.sacsAJetons = sacsAJetons;
	}

	public long getHordotageOuverture() {
		return hordotageOuverture;
	}

	public void setHordotageOuverture(long hordotageOuverture) {
		this.hordotageOuverture = hordotageOuverture;
	}

	//ConstrDefaut
	
	public ModeleJetons() {
		
	}
	
	//Initialisation
	
	public void initialiser() {
		Date maintenant = new Date();
		hordotageOuverture = maintenant.getTime();
	}
	
	public void ajouterSacAJetons(MsgAjouterSacAJetons msg) {
		
		
		
	}
}
