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
public class Proovedor {
	public Proovedor() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PROOVEDOR_ARTICULO) {
			return ORM_articulo;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private String nombre;
	
	private String rut;
	
	private String fono;
	
	private java.util.Set ORM_articulo = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setRut(String value) {
		this.rut = value;
	}
	
	public String getRut() {
		return rut;
	}
	
	public void setFono(String value) {
		this.fono = value;
	}
	
	public String getFono() {
		return fono;
	}
	
	private void setORM_Articulo(java.util.Set value) {
		this.ORM_articulo = value;
	}
	
	private java.util.Set getORM_Articulo() {
		return ORM_articulo;
	}
	
	public final ArticuloSetCollection articulo = new ArticuloSetCollection(this, _ormAdapter, ORMConstants.KEY_PROOVEDOR_ARTICULO, ORMConstants.KEY_ARTICULO_PROOVEDOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
