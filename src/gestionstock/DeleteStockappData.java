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
public class DeleteStockappData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = ConcexionPersistenteManager.instance().getSession().beginTransaction();
		try {
			Cliente cliente = ClienteDAO.loadClienteByQuery(null, null);
			// Delete the persistent object
			ClienteDAO.delete(cliente);
			Articulo articulo = ArticuloDAO.loadArticuloByQuery(null, null);
			// Delete the persistent object
			ArticuloDAO.delete(articulo);
			Proovedor proovedor = ProovedorDAO.loadProovedorByQuery(null, null);
			// Delete the persistent object
			ProovedorDAO.delete(proovedor);
			ItemFactura itemFactura = ItemFacturaDAO.loadItemFacturaByQuery(null, null);
			// Delete the persistent object
			ItemFacturaDAO.delete(itemFactura);
			Factura factura = FacturaDAO.loadFacturaByQuery(null, null);
			// Delete the persistent object
			FacturaDAO.delete(factura);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteStockappData deleteStockappData = new DeleteStockappData();
			try {
				deleteStockappData.deleteTestData();
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
