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

public class ProovedorDAO {
	public static Proovedor loadProovedorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return loadProovedorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proovedor getProovedorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return getProovedorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proovedor loadProovedorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return loadProovedorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proovedor getProovedorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return getProovedorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proovedor loadProovedorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Proovedor) session.load(Proovedor.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proovedor getProovedorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Proovedor) session.get(Proovedor.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proovedor loadProovedorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Proovedor) session.load(Proovedor.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proovedor getProovedorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Proovedor) session.get(Proovedor.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProovedor(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return queryProovedor(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProovedor(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return queryProovedor(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proovedor[] listProovedorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return listProovedorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proovedor[] listProovedorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return listProovedorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProovedor(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Proovedor as Proovedor");
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
	
	public static List queryProovedor(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Proovedor as Proovedor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Proovedor", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proovedor[] listProovedorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProovedor(session, condition, orderBy);
			return (Proovedor[]) list.toArray(new Proovedor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proovedor[] listProovedorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProovedor(session, condition, orderBy, lockMode);
			return (Proovedor[]) list.toArray(new Proovedor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proovedor loadProovedorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return loadProovedorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proovedor loadProovedorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return loadProovedorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proovedor loadProovedorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Proovedor[] proovedors = listProovedorByQuery(session, condition, orderBy);
		if (proovedors != null && proovedors.length > 0)
			return proovedors[0];
		else
			return null;
	}
	
	public static Proovedor loadProovedorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Proovedor[] proovedors = listProovedorByQuery(session, condition, orderBy, lockMode);
		if (proovedors != null && proovedors.length > 0)
			return proovedors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProovedorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return iterateProovedorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProovedorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ConcexionPersistenteManager.instance().getSession();
			return iterateProovedorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProovedorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Proovedor as Proovedor");
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
	
	public static java.util.Iterator iterateProovedorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Proovedor as Proovedor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Proovedor", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proovedor createProovedor() {
		return new Proovedor();
	}
	
	public static boolean save(Proovedor proovedor) throws PersistentException {
		try {
			ConcexionPersistenteManager.instance().saveObject(proovedor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Proovedor proovedor) throws PersistentException {
		try {
			ConcexionPersistenteManager.instance().deleteObject(proovedor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Proovedor proovedor)throws PersistentException {
		try {
			Articulo[] lArticulos = proovedor.articulo.toArray();
			for(int i = 0; i < lArticulos.length; i++) {
				lArticulos[i].setProovedor(null);
			}
			return delete(proovedor);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Proovedor proovedor, org.orm.PersistentSession session)throws PersistentException {
		try {
			Articulo[] lArticulos = proovedor.articulo.toArray();
			for(int i = 0; i < lArticulos.length; i++) {
				lArticulos[i].setProovedor(null);
			}
			try {
				session.delete(proovedor);
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
	
	public static boolean refresh(Proovedor proovedor) throws PersistentException {
		try {
			ConcexionPersistenteManager.instance().getSession().refresh(proovedor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Proovedor proovedor) throws PersistentException {
		try {
			ConcexionPersistenteManager.instance().getSession().evict(proovedor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
