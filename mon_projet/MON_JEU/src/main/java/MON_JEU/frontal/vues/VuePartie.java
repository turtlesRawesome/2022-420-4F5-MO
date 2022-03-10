package MON_JEU.frontal.vues;

import java.net.URL;
import java.util.ResourceBundle;

import MON_JEU.frontal.evenements.EvtAfficherFileAttente;
import ca.ntro.app.NtroApp;
import ca.ntro.app.views.ViewFx;
import ca.ntro.core.initialization.Ntro;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class VuePartie extends ViewFx{

	@FXML
	private Button boutonQuitterPartie;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		Ntro.assertNotNull("boutonQuitterPartie", boutonQuitterPartie);
		installerEvtAfficherFileAttente();
	}
	
	private void installerEvtAfficherFileAttente() {
		
		EvtAfficherFileAttente evtNtro = NtroApp.newEvent(EvtAfficherFileAttente.class);
		
		boutonQuitterPartie.setOnAction(evtFx -> {
			
			System.out.println("[VuePartie] clic: " + evtFx.getEventType());
			
			evtNtro.trigger();
			
		});
		
	}

}
