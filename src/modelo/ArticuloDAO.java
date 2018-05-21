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
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ArticuloDAO {
	public static Articulo loadArticuloByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return loadArticuloByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Articulo getArticuloByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return getArticuloByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Articulo loadArticuloByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return loadArticuloByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Articulo getArticuloByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return getArticuloByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Articulo loadArticuloByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Articulo) session.load(Articulo.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Articulo getArticuloByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Articulo) session.get(Articulo.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Articulo loadArticuloByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Articulo) session.load(Articulo.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Articulo getArticuloByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Articulo) session.get(Articulo.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArticulo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return queryArticulo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArticulo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return queryArticulo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Articulo[] listArticuloByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return listArticuloByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Articulo[] listArticuloByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return listArticuloByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
            public static List queryArticulo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Articulo as Articulo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArticulo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Articulo as Articulo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Articulo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Articulo[] listArticuloByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryArticulo(session, condition, orderBy);
			return (Articulo[]) list.toArray(new Articulo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Articulo[] listArticuloByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryArticulo(session, condition, orderBy, lockMode);
			return (Articulo[]) list.toArray(new Articulo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Articulo loadArticuloByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return loadArticuloByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Articulo loadArticuloByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return loadArticuloByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Articulo loadArticuloByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Articulo[] articulos = listArticuloByQuery(session, condition, orderBy);
		if (articulos != null && articulos.length > 0)
			return articulos[0];
		else
			return null;
	}
	
	public static Articulo loadArticuloByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Articulo[] articulos = listArticuloByQuery(session, condition, orderBy, lockMode);
		if (articulos != null && articulos.length > 0)
			return articulos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateArticuloByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return iterateArticuloByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArticuloByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return iterateArticuloByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArticuloByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Articulo as Articulo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArticuloByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Articulo as Articulo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Articulo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Articulo createArticulo() {
		return new Articulo();
	}
	
	public static boolean save(Articulo articulo) throws PersistentException {
		try {
			ConcexionPersistenteManager.instance().saveObject(articulo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Articulo articulo) throws PersistentException {
		try {
			ConcexionPersistenteManager.instance().deleteObject(articulo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Articulo articulo)throws PersistentException {
		try {
			if (articulo.getProovedor() != null) {
				articulo.getProovedor().articulo.remove(articulo);
			}
			
			ItemFactura[] lItemFacturas = articulo.itemFactura.toArray();
			for(int i = 0; i < lItemFacturas.length; i++) {
				lItemFacturas[i].setArticulo(null);
			}
			return delete(articulo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Articulo articulo, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (articulo.getProovedor() != null) {
				articulo.getProovedor().articulo.remove(articulo);
			}
			
			ItemFactura[] lItemFacturas = articulo.itemFactura.toArray();
			for(int i = 0; i < lItemFacturas.length; i++) {
				lItemFacturas[i].setArticulo(null);
			}
			try {
				session.delete(articulo);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Articulo articulo) throws PersistentException {
		try {
			ConcexionPersistenteManager.instance().getSession().refresh(articulo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Articulo articulo) throws PersistentException {
		try {
			ConcexionPersistenteManager.instance().getSession().evict(articulo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
