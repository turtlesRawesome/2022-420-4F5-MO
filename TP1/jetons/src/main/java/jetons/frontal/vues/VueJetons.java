package jetons.frontal.vues;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import ca.ntro.app.NtroApp;
import ca.ntro.app.views.ViewFx;
import ca.ntro.core.initialization.Ntro;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import jetons.frontal.evenements.EvtAfficherFileAttente;
import jetons.messages.MsgAjouterSacAJetons;

public class VueJetons extends ViewFx{
	
	@FXML
	private Button boutonAllerFileAttente;
	@FXML
	private Button boutonAjouterSacAJetons;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//Ntro.assertNotNull("boutonAllerFileAttente", boutonAllerFileAttente);
		installerEvtAfficherFileAttente();
		//Ntro.assertNotNull("boutonAjouterSacAJetons", boutonAjouterSacAJetons);
		installerMsgAjouterSacAJetons();
	}
	
	private void installerEvtAfficherFileAttente() {
		EvtAfficherFileAttente evtNtro = NtroApp.newEvent(EvtAfficherFileAttente.class);
		
		boutonAllerFileAttente.setOnAction(evtFx -> {
			
			System.out.println("[VueJetons] clic: " + evtFx.getEventType());
			
			evtNtro.trigger();			
		});
		
	}
	
	private void installerMsgAjouterSacAJetons() {
		
		MsgAjouterSacAJetons msgAjouterSacAJetons = NtroApp.newMessage(MsgAjouterSacAJetons.class);
		
		boutonAjouterSacAJetons.setOnAction(evtFx -> {
			
			//ajout des valeurs dans le message
			//TEMPORAIRE TODO
			msgAjouterSacAJetons.setValeurDuSac(new Random().nextInt(200)+100);
			//envoi du message
			msgAjouterSacAJetons.send();
		});
	}
}
