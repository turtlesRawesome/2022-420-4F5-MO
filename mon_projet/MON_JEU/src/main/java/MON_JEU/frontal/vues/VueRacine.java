package MON_JEU.frontal.vues;

import java.net.URL;
import java.util.ResourceBundle;

import ca.ntro.app.views.ViewFx;
import javafx.scene.layout.Pane;

public class VueRacine extends ViewFx {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	public void afficherSousVue (ViewFx sousVue) {
		Pane racineSousVue = sousVue.rootNode();
		
		rootNode().getChildren().clear();
		rootNode().getChildren().add(racineSousVue);
	}

}
