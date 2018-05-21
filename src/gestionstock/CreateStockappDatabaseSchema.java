package gestionstock;

/**
 * Licensee: chelo(Universidad de La Frontera)
 * License Type: Academic
 */
import modelo.ConcexionPersistenteManager;
import org.orm.*;
public class CreateStockappDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(ConcexionPersistenteManager.instance());
			ConcexionPersistenteManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
