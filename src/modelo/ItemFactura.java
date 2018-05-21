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
public class ItemFactura {
	public ItemFactura() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ITEMFACTURA_FACTURA) {
			this.factura = (Factura) owner;
		}
		
		else if (key == ORMConstants.KEY_ITEMFACTURA_ARTICULO) {
			this.articulo = (Articulo) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private Factura factura;
	
	private Articulo articulo;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setFactura(Factura value) {
		if (factura != null) {
			factura.itemFactura.remove(this);
		}
		if (value != null) {
			value.itemFactura.add(this);
		}
	}
	
	public Factura getFactura() {
		return factura;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Factura(Factura value) {
		this.factura = value;
	}
	
	private Factura getORM_Factura() {
		return factura;
	}
	
	public void setArticulo(Articulo value) {
		if (articulo != null) {
			articulo.itemFactura.remove(this);
		}
		if (value != null) {
			value.itemFactura.add(this);
		}
	}
	
	public Articulo getArticulo() {
		return articulo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Articulo(Articulo value) {
		this.articulo = value;
	}
	
	private Articulo getORM_Articulo() {
		return articulo;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
