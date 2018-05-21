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
public class Articulo {
	public Articulo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ARTICULO_ITEMFACTURA) {
			return ORM_itemFactura;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ARTICULO_PROOVEDOR) {
			this.proovedor = (Proovedor) owner;
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
	
	private String codigo;
	
	private String nombre;
	
	private int precio_costo;
	
	private int precio_venta;
	
	private int stock;
	
	private Proovedor proovedor;
	
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
	
	public void setCodigo(String value) {
		this.codigo = value;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPrecio_costo(int value) {
		this.precio_costo = value;
	}
	
	public int getPrecio_costo() {
		return precio_costo;
	}
	
	public void setPrecio_venta(int value) {
		this.precio_venta = value;
	}
	
	public int getPrecio_venta() {
		return precio_venta;
	}
	
	public void setStock(int value) {
		this.stock = value;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setProovedor(Proovedor value) {
		if (proovedor != null) {
			proovedor.articulo.remove(this);
		}
		if (value != null) {
			value.articulo.add(this);
		}
	}
	
	public Proovedor getProovedor() {
		return proovedor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Proovedor(Proovedor value) {
		this.proovedor = value;
	}
	
	private Proovedor getORM_Proovedor() {
		return proovedor;
	}
	
	private void setORM_ItemFactura(java.util.Set value) {
		this.ORM_itemFactura = value;
	}
	
	private java.util.Set getORM_ItemFactura() {
		return ORM_itemFactura;
	}
	
	public final ItemFacturaSetCollection itemFactura = new ItemFacturaSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTICULO_ITEMFACTURA, ORMConstants.KEY_ITEMFACTURA_ARTICULO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
