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

public class ItemFacturaDAO {
	public static ItemFactura loadItemFacturaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return loadItemFacturaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ItemFactura getItemFacturaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return getItemFacturaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ItemFactura loadItemFacturaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return loadItemFacturaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ItemFactura getItemFacturaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return getItemFacturaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ItemFactura loadItemFacturaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (ItemFactura) session.load(ItemFactura.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ItemFactura getItemFacturaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (ItemFactura) session.get(ItemFactura.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ItemFactura loadItemFacturaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ItemFactura) session.load(ItemFactura.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ItemFactura getItemFacturaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ItemFactura) session.get(ItemFactura.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryItemFactura(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return queryItemFactura(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryItemFactura(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return queryItemFactura(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ItemFactura[] listItemFacturaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return listItemFacturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ItemFactura[] listItemFacturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return listItemFacturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryItemFactura(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ItemFactura as ItemFactura");
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
	
	public static List queryItemFactura(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ItemFactura as ItemFactura");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ItemFactura", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ItemFactura[] listItemFacturaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryItemFactura(session, condition, orderBy);
			return (ItemFactura[]) list.toArray(new ItemFactura[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ItemFactura[] listItemFacturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryItemFactura(session, condition, orderBy, lockMode);
			return (ItemFactura[]) list.toArray(new ItemFactura[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ItemFactura loadItemFacturaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return loadItemFacturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ItemFactura loadItemFacturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return loadItemFacturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ItemFactura loadItemFacturaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ItemFactura[] itemFacturas = listItemFacturaByQuery(session, condition, orderBy);
		if (itemFacturas != null && itemFacturas.length > 0)
			return itemFacturas[0];
		else
			return null;
	}
	
	public static ItemFactura loadItemFacturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ItemFactura[] itemFacturas = listItemFacturaByQuery(session, condition, orderBy, lockMode);
		if (itemFacturas != null && itemFacturas.length > 0)
			return itemFacturas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateItemFacturaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return iterateItemFacturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateItemFacturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return iterateItemFacturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateItemFacturaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ItemFactura as ItemFactura");
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
	
	public static java.util.Iterator iterateItemFacturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ItemFactura as ItemFactura");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ItemFactura", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ItemFactura createItemFactura() {
		return new ItemFactura();
	}
	
	public static boolean save(ItemFactura itemFactura) throws PersistentException {
		try {
			ConcexionPersistenteManager.instance().saveObject(itemFactura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ItemFactura itemFactura) throws PersistentException {
		try {
			ConcexionPersistenteManager.instance().deleteObject(itemFactura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ItemFactura itemFactura)throws PersistentException {
		try {
			if (itemFactura.getFactura() != null) {
				itemFactura.getFactura().itemFactura.remove(itemFactura);
			}
			
			if (itemFactura.getArticulo() != null) {
				itemFactura.getArticulo().itemFactura.remove(itemFactura);
			}
			
			return delete(itemFactura);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ItemFactura itemFactura, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (itemFactura.getFactura() != null) {
				itemFactura.getFactura().itemFactura.remove(itemFactura);
			}
			
			if (itemFactura.getArticulo() != null) {
				itemFactura.getArticulo().itemFactura.remove(itemFactura);
			}
			
			try {
				session.delete(itemFactura);
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
	
	public static boolean refresh(ItemFactura itemFactura) throws PersistentException {
		try {
			ConcexionPersistenteManager.instance().getSession().refresh(itemFactura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ItemFactura itemFactura) throws PersistentException {
		try {
			ConcexionPersistenteManager.instance().getSession().evict(itemFactura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
