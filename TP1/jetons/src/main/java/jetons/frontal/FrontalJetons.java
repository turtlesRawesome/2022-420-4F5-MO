package jetons.frontal;

import ca.ntro.app.NtroApp;
import ca.ntro.app.frontend.FrontendFx;
import ca.ntro.app.frontend.ViewRegistrarFx;
import ca.ntro.app.frontend.events.EventRegistrar;
import ca.ntro.app.tasks.frontend.FrontendTasks;
import jetons.frontal.evenements.EvtAfficherFileAttente;
import jetons.frontal.evenements.EvtAfficherJetons;
import jetons.frontal.taches.Initialisation;
import jetons.frontal.taches.Navigation;
import jetons.frontal.vues.VueFileAttente;
import jetons.frontal.vues.VueRacine;
import jetons.frontal.vues.VueJetons;

public class FrontalJetons implements FrontendFx{

	@Override
	public void createTasks(FrontendTasks tasks) {
		// TODO Auto-generated method stub
		Initialisation.creerTaches(tasks);
		Navigation.creerTaches(tasks);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerEvents(EventRegistrar registrar) {
		// TODO Auto-generated method stub
		registrar.registerEvent(EvtAfficherFileAttente.class);
		registrar.registerEvent(EvtAfficherJetons.class);
	}

	@Override
	public void registerViews(ViewRegistrarFx registrar) {
		// Vues
		registrar.registerView(VueRacine.class, "/racine.xml");
		registrar.registerView(VueFileAttente.class, "/file_attente.xml");
		registrar.registerView(VueJetons.class, "/jetons.xml");
		
		//Langue par défaut
		registrar.registerDefaultResources("/chaines_fr.properties");
		//langue additionnelle
		registrar.registerResources(NtroApp.locale("en"),
				"/chaines_en.properties");
		
		//registrar.registerStylesheet("/dev.css");
		registrar.registerStylesheet("/prod.css");
	}

	

}
