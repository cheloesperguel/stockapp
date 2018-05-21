package gestionstock;

/**
 * Licensee: chelo(Universidad de La Frontera)
 * License Type: Academic
 */
import modelo.Articulo;
import modelo.ArticuloDAO;
import modelo.Cliente;
import modelo.ClienteDAO;
import modelo.Factura;
import modelo.FacturaDAO;
import modelo.ItemFactura;
import modelo.ItemFacturaDAO;
import modelo.Proovedor;
import modelo.ProovedorDAO;
import modelo.ConcexionPersistenteManager;
import org.orm.*;
public class RetrieveAndUpdateStockappData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = ConcexionPersistenteManager.instance().getSession().beginTransaction();
		try {
			Cliente cliente = ClienteDAO.loadClienteByQuery(null, null);
			// Update the properties of the persistent object
			ClienteDAO.save(cliente);
			Articulo articulo = ArticuloDAO.loadArticuloByQuery(null, null);
			// Update the properties of the persistent object
			ArticuloDAO.save(articulo);
			Proovedor proovedor = ProovedorDAO.loadProovedorByQuery(null, null);
			// Update the properties of the persistent object
			ProovedorDAO.save(proovedor);
			ItemFactura itemFactura = ItemFacturaDAO.loadItemFacturaByQuery(null, null);
			// Update the properties of the persistent object
			ItemFacturaDAO.save(itemFactura);
			Factura factura = FacturaDAO.loadFacturaByQuery(null, null);
			// Update the properties of the persistent object
			FacturaDAO.save(factura);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateStockappData retrieveAndUpdateStockappData = new RetrieveAndUpdateStockappData();
			try {
				retrieveAndUpdateStockappData.retrieveAndUpdateTestData();
			}
			finally {
				ConcexionPersistenteManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
