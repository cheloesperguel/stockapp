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
public class ListStockappData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Cliente...");
		Cliente[] clientes = ClienteDAO.listClienteByQuery(null, null);
		int length = Math.min(clientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Articulo...");
		Articulo[] articulos = ArticuloDAO.listArticuloByQuery(null, null);
		length = Math.min(articulos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(articulos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Proovedor...");
		Proovedor[] proovedors = ProovedorDAO.listProovedorByQuery(null, null);
		length = Math.min(proovedors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proovedors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ItemFactura...");
		ItemFactura[] itemFacturas = ItemFacturaDAO.listItemFacturaByQuery(null, null);
		length = Math.min(itemFacturas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(itemFacturas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Factura...");
		Factura[] facturas = FacturaDAO.listFacturaByQuery(null, null);
		length = Math.min(facturas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(facturas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListStockappData listStockappData = new ListStockappData();
			try {
				listStockappData.listTestData();
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
