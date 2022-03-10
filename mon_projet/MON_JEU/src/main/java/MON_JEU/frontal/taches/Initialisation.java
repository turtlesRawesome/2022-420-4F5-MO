package MON_JEU.frontal.taches;

import static ca.ntro.app.tasks.frontend.FrontendTasks.*;

import MON_JEU.frontal.vues.VueFileAttente;
import MON_JEU.frontal.vues.VueRacine;
import ca.ntro.app.frontend.ViewLoader;
import ca.ntro.app.services.Window;
import ca.ntro.app.tasks.frontend.FrontendTasks;

public class Initialisation {
	public static void creerTaches(FrontendTasks tasks) {
		
		tasks.taskGroup("initialisation")
		
		.contains(subTasks -> {
			
			afficherFenetre(subTasks);
		
			creerVueRacine(subTasks);
			installerVueRacine(subTasks);
			
			creerVueFileAttente(subTasks);
			installerVueFileAttente(subTasks);
			
		});
		
	}
	private static void afficherFenetre(FrontendTasks tasks) {
		tasks.task("afficherFenetre")
			.waitsFor(window())
			.thenExecutes(inputs -> {
				Window window = inputs.get(window());
				window.show();
			});
	}
	private static void creerVueRacine(FrontendTasks tasks) {
		tasks.task(create(VueRacine.class))
			.waitsFor(viewLoader(VueRacine.class))
			.thenExecutesAndReturnsValue(inputs -> {
				ViewLoader<VueRacine> viewLoader = inputs.get(viewLoader(VueRacine.class));
				VueRacine vueRacine = viewLoader.createView();
				return vueRacine;
			});
	}
	private static void installerVueRacine(FrontendTasks tasks) {
		tasks.task("installerVueRacine")
			.waitsFor(window())
			.waitsFor(created(VueRacine.class))
			.thenExecutes(inputs -> {
				
				VueRacine vueRacine = inputs.get(created(VueRacine.class));
				Window window = inputs.get(window());
				
				window.installRootView(vueRacine);
				
			});
	}
	private static void creerVueFileAttente(FrontendTasks tasks) {
		tasks.task(create(VueFileAttente.class))
			.waitsFor(viewLoader(VueFileAttente.class))
			.thenExecutesAndReturnsValue(inputs -> {
				
				ViewLoader<VueFileAttente> viewLoader = inputs.get(viewLoader(VueFileAttente.class));
				VueFileAttente vueFileAttente = viewLoader.createView();
				
				return vueFileAttente;
				
			});
	}
	private static void installerVueFileAttente(FrontendTasks tasks) {
		tasks.task("installerVueFileAttente")
		.waitsFor(created(VueRacine.class))
		.waitsFor(created(VueFileAttente.class))
		.thenExecutes(inputs -> {
			
			VueRacine vueRacine = inputs.get(created(VueRacine.class));
			VueFileAttente vueFileAttente = inputs.get(created(VueFileAttente.class));
			
			vueRacine.afficherSousVue(vueFileAttente);
		});
	}
}
