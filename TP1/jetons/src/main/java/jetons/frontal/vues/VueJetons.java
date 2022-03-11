package jetons.frontal.vues;

import java.net.URL;
import java.util.ResourceBundle;

import ca.ntro.app.NtroApp;
import ca.ntro.app.views.ViewFx;
import ca.ntro.core.initialization.Ntro;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import jetons.frontal.evenements.EvtAfficherFileAttente;

public class VueJetons extends ViewFx{
	
	@FXML
	private Button boutonAllerFileAttente;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//Ntro.assertNotNull("boutonAllerFileAttente", boutonAllerFileAttente);
		installerEvtAfficherFileAttente();
	}
	
	private void installerEvtAfficherFileAttente() {
		EvtAfficherFileAttente evtNtro = NtroApp.newEvent(EvtAfficherFileAttente.class);
		
		boutonAllerFileAttente.setOnAction(evtFx -> {
			
			System.out.println("[VueJetons] clic: " + evtFx.getEventType());
			
			evtNtro.trigger();			
		});
		
	}
}
