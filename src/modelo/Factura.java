package modelo;

/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: chelo(Universidad de La Frontera)
 * License Type: Academic
 */
public class Factura {
	public Factura() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_FACTURA_ITEMFACTURA) {
			return ORM_itemFactura;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_FACTURA_CLIENTE) {
			this.cliente = (Cliente) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private java.util.Date fecha;
	
	private Cliente cliente;
	
	private java.util.Set ORM_itemFactura = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setCliente(Cliente value) {
		if (cliente != null) {
			cliente.factura.remove(this);
		}
		if (value != null) {
			value.factura.add(this);
		}
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cliente(Cliente value) {
		this.cliente = value;
	}
	
	private Cliente getORM_Cliente() {
		return cliente;
	}
	
	private void setORM_ItemFactura(java.util.Set value) {
		this.ORM_itemFactura = value;
	}
	
	private java.util.Set getORM_ItemFactura() {
		return ORM_itemFactura;
	}
	
	public final ItemFacturaSetCollection itemFactura = new ItemFacturaSetCollection(this, _ormAdapter, ORMConstants.KEY_FACTURA_ITEMFACTURA, ORMConstants.KEY_ITEMFACTURA_FACTURA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
