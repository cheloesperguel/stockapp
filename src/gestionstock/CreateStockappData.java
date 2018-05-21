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
public class CreateStockappData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ConcexionPersistenteManager.instance().getSession().beginTransaction();
		try {
			Cliente cliente = ClienteDAO.createCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : factura, rut, nombre
			ClienteDAO.save(cliente);
			Articulo articulo = ArticuloDAO.createArticulo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : itemFactura, proovedor, stock, precio_venta, precio_costo, nombre, codigo
			ArticuloDAO.save(articulo);
			Proovedor proovedor = ProovedorDAO.createProovedor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : articulo, rut, nombre
			ProovedorDAO.save(proovedor);
			ItemFactura itemFactura = ItemFacturaDAO.createItemFactura();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : articulo, factura
			ItemFacturaDAO.save(itemFactura);
			Factura factura = FacturaDAO.createFactura();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : itemFactura, cliente, fecha
			FacturaDAO.save(factura);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateStockappData createStockappData = new CreateStockappData();
			try {
				createStockappData.createTestData();
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
