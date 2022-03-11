package jetons.dorsal.taches;

import static ca.ntro.app.tasks.backend.BackendTasks.*;

import ca.ntro.app.tasks.backend.BackendTasks;
import jetons.modeles.ModeleJetons;

public class InitialiserModeles {

	public static void creerTaches(BackendTasks tasks) {		
		tasks.taskGroup("InitialiserModeles")			
			.contains(subTasks -> {
				
				initialiserModeleJetons(subTasks);				
			});
		
	}
	
	private static void initialiserModeleJetons(BackendTasks tasks) {		
		tasks.task("initialiserModeleJetons")		
			.waitsFor(model(ModeleJetons.class))			
			.thenExecutes(inputs -> {
				
				ModeleJetons jetons = inputs.get(model(ModeleJetons.class));
				
				jetons.initialiser();				
			});
		
	}
	
}
