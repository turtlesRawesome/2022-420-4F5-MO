package jetons.dorsal.taches;

import static ca.ntro.app.tasks.backend.BackendTasks.*;

import ca.ntro.app.tasks.backend.BackendTasks;
import jetons.messages.MsgAjouterSacAJetons;
import jetons.modeles.ModeleJetons;

public class ModifierSacAJetons {
	
	public static void creerTaches(BackendTasks tasks) {
		tasks.taskGroup("ModifierSacAJetons")
			.waitsFor("InitialiserModeles")
			.andContains(subTasks -> {
				
				//Les tâches qui modifient le modele:
				ajouterSacAJetons(subTasks);
				
			});
	}
	
	private static void ajouterSacAJetons(BackendTasks tasks) {
		
		tasks.task("ajouterSacAJetons")
		
		.waitsFor(message(MsgAjouterSacAJetons.class))
		
		.thenExecutes(inputs -> {
			
			MsgAjouterSacAJetons msgAjouterSacAJetons = inputs.get(message(MsgAjouterSacAJetons.class));
			ModeleJetons modeleJetons = inputs.get(model(ModeleJetons.class));
			
		});
	}
}
