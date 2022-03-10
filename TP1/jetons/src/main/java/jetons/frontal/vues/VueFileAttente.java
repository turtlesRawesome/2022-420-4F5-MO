package jetons.frontal.vues;

import java.net.URL;
import java.util.ResourceBundle;

import jetons.frontal.evenements.EvtAfficherJetons;
import ca.ntro.app.NtroApp;
import ca.ntro.app.views.ViewFx;
import ca.ntro.core.initialization.Ntro;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class VueFileAttente extends ViewFx {
	
	@FXML
	private Button boutonOuvrirJetons;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		Ntro.assertNotNull("boutonOuvrirJetons", boutonOuvrirJetons);
		
		installerEvtAfficherJetons();
		
	}
	
	private void installerEvtAfficherJetons() {
		
		EvtAfficherJetons evtNtro = NtroApp.newEvent(EvtAfficherJetons.class);
		
		boutonOuvrirJetons.setOnAction(evtFx -> {
			
			System.out.println("[VueFileAttente] clic:" + evtFx.getEventType());
			
			evtNtro.trigger();
			
		});
		
	}
}
