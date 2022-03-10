package jetons;

import jetons.frontal.FrontalJetons;
import ca.ntro.app.NtroClientFx;
import ca.ntro.app.backend.BackendRegistrar;
import ca.ntro.app.frontend.FrontendRegistrarFx;
import ca.ntro.app.messages.MessageRegistrar;
import ca.ntro.app.models.ModelRegistrar;

public class ClientJetons implements NtroClientFx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NtroClientFx.launch(args);
	}

	@Override
	public void registerBackend(BackendRegistrar registrar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerFrontend(FrontendRegistrarFx registrar) {
		// TODO Auto-generated method stub
		registrar.registerFrontend(new FrontalJetons());
	}

	@Override
	public void registerMessages(MessageRegistrar registrar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerModels(ModelRegistrar registrar) {
		// TODO Auto-generated method stub
		
	}

}
