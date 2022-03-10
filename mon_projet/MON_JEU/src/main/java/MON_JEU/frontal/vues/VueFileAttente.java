package MON_JEU.frontal.vues;

import java.net.URL;
import java.util.ResourceBundle;

import MON_JEU.frontal.evenements.EvtAfficherPartie;
import ca.ntro.app.NtroApp;
import ca.ntro.app.views.ViewFx;
import ca.ntro.core.initialization.Ntro;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class VueFileAttente extends ViewFx {
	
	@FXML
	private Button boutonOuvrirPartie;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		Ntro.assertNotNull("boutonQuitterPartie", boutonOuvrirPartie);
		
		installerEvtAfficherPartie();
		
	}
	
	private void installerEvtAfficherPartie() {
		
		EvtAfficherPartie evtNtro = NtroApp.newEvent(EvtAfficherPartie.class);
		
		boutonOuvrirPartie.setOnAction(evtFx -> {
			
			System.out.println("[VueFileAttente] clic:" + evtFx.getEventType());
			
			evtNtro.trigger();
			
		});
		
	}
}
