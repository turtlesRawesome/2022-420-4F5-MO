package jetons;

import jetons.dorsal.DorsalJetons;
import jetons.frontal.FrontalJetons;
import jetons.modeles.ModeleJetons;
import jetons.modeles.valeurs.SacAJetons;
import ca.ntro.app.NtroClientFx;
import ca.ntro.app.backend.BackendRegistrar;
import ca.ntro.app.frontend.FrontendRegistrarFx;
import ca.ntro.app.messages.MessageRegistrar;
import ca.ntro.app.models.ModelRegistrar;

public class ClientJetons implements NtroClientFx {

	public static void main(String[] args) {
		NtroClientFx.launch(args);
	}

	@Override
	public void registerBackend(BackendRegistrar registrar) {
		registrar.registerBackend(new DorsalJetons());		
	}

	@Override
	public void registerFrontend(FrontendRegistrarFx registrar) {
		registrar.registerFrontend(new FrontalJetons());
	}

	@Override
	public void registerMessages(MessageRegistrar registrar) {
		
	}

	@Override
	public void registerModels(ModelRegistrar registrar) {
		registrar.registerModel(ModeleJetons.class);
		registrar.registerValue(SacAJetons.class);		
	}

}
