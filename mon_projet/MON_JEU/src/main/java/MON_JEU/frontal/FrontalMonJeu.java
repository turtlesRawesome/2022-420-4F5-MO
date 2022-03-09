package MON_JEU.frontal;

import ca.ntro.app.NtroApp;
import ca.ntro.app.frontend.FrontendFx;
import ca.ntro.app.frontend.ViewRegistrarFx;
import ca.ntro.app.frontend.events.EventRegistrar;
import ca.ntro.app.tasks.frontend.FrontendTasks;
import ca.ntro.app.services.Window;
import static ca.ntro.app.tasks.frontend.FrontendTasks.*;

import MON_JEU.frontal.taches.Initialisation;
import MON_JEU.frontal.vues.VueRacine;

public class FrontalMonJeu implements FrontendFx{

	@Override
	public void createTasks(FrontendTasks tasks) {
		// TODO Auto-generated method stub
		Initialisation.creerTaches(tasks);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerEvents(EventRegistrar registrar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerViews(ViewRegistrarFx registrar) {
		// TODO Auto-generated method stub
		registrar.registerView(VueRacine.class, "/racine.xml");
		
		//Langue par défaut
		registrar.registerDefaultResources("/chaines_fr.properties");
		//langue additionnelle
		registrar.registerResources(NtroApp.locale("en"),
				"/chaines_en.properties");
		
		registrar.registerStylesheet("/dev.css");
		//registrar.registerStylesheet("/prod.css");
	}

	

}
