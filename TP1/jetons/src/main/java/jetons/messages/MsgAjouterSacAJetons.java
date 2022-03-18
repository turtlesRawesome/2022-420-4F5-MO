package jetons.messages;

import ca.ntro.app.messages.MessageNtro;
import jetons.dorsal.taches.ModifierSacAJetons;
import jetons.modeles.ModeleJetons;

public class MsgAjouterSacAJetons extends MessageNtro{

	private int valeurDuSac;
	
	public int getValeurDuSac() {
		return valeurDuSac;
	}
	public void setValeurDuSac(int valeurDuSac) {
		this.valeurDuSac = valeurDuSac;
	}
	
	public MsgAjouterSacAJetons() {
	}
}
