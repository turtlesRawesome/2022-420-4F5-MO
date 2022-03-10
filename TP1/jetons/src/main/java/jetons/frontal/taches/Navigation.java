package jetons.frontal.taches;

import static ca.ntro.app.tasks.frontend.FrontendTasks.*;

import jetons.frontal.evenements.EvtAfficherFileAttente;
import jetons.frontal.evenements.EvtAfficherJetons;
import jetons.frontal.vues.VueJetons;
import ca.ntro.app.frontend.ViewLoader;
import jetons.frontal.vues.VueFileAttente;
import jetons.frontal.vues.VueRacine;
import ca.ntro.app.tasks.frontend.FrontendTasks;


public class Navigation {
	
	public static void creerTaches(FrontendTasks tasks) {
		tasks.taskGroup("Navigation")
			.waitsFor("initialisation")
			.andContains(subTasks ->{
				
				afficherVueJetons(subTasks);
				
				creerVueFileAttente(subTasks);
				afficherVueFileAttente(subTasks);
								
			});
	}
	private static void afficherVueJetons(FrontendTasks tasks) {
		tasks.task("afficherVueJetons")

		.waitsFor(event(EvtAfficherJetons.class))
		
		.thenExecutes(inputs -> {
			
			VueRacine vueRacine = inputs.get(created(VueRacine.class));
			VueJetons vueJetons = inputs.get(created(VueJetons.class));
			
			vueRacine.afficherSousVue(vueJetons);
		});
	}
	
	public static void creerVueFileAttente(FrontendTasks tasks) {
		
		tasks.task(create(VueFileAttente.class))
			.waitsFor(viewLoader(VueFileAttente.class))
			.thenExecutesAndReturnsValue(inputs -> {
				
				ViewLoader<VueFileAttente> viewLoader = inputs.get(viewLoader(VueFileAttente.class));
				
				VueFileAttente vueFilleAttente = viewLoader.createView();
				
				return vueFilleAttente;
				
				
			});
	}
	
	private static void afficherVueFileAttente(FrontendTasks tasks) {
		
		tasks.task("afficherVueFileAttente")
		
			.waitsFor(created(VueFileAttente.class))
			
			.waitsFor(event(EvtAfficherFileAttente.class))
			
			.thenExecutes(inputs -> {
				
				VueRacine vueRacine = inputs.get(created(VueRacine.class));
				VueFileAttente vueFilleAttente = inputs.get(created(VueFileAttente.class));
				
				vueRacine.afficherSousVue(vueFilleAttente);
				
			});
		
	}
	
}
