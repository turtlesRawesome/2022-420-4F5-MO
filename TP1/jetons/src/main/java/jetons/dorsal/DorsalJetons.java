package jetons.dorsal;

import ca.ntro.app.backend.LocalBackendNtro;
import ca.ntro.app.tasks.backend.BackendTasks;
import jetons.dorsal.taches.InitialiserModeles;
import jetons.dorsal.taches.ModifierSacAJetons;

public class DorsalJetons extends LocalBackendNtro{

	@Override
	public void createTasks(BackendTasks tasks) {
		
		InitialiserModeles.creerTaches(tasks);	
		ModifierSacAJetons.creerTaches(tasks);
		
	}

	@Override
	public void execute() {
		
	}

}
