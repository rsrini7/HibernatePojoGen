package com.srini.hibpojogen.protein_tracker.services.data;

import com.srini.hibpojogen.protein_tracker.factories.proteinTracker.*;
import com.srini.hibpojogen.protein_tracker.model.obj.proteinTracker.Goalalert;
import com.srini.hibpojogen.protein_tracker.model.obj.proteinTracker.Proteindata;
import com.srini.hibpojogen.protein_tracker.model.obj.proteinTracker.UserGoalalert;
import com.srini.hibpojogen.protein_tracker.model.obj.proteinTracker.UserGoalalertPK;
import com.srini.hibpojogen.protein_tracker.model.obj.proteinTracker.Userhistory;
import com.srini.hibpojogen.protein_tracker.model.obj.proteinTracker.Users;
import java.io.Serializable;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.ReplicationMode;
import org.hibernate.Session;
import java.util.Collection;
import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import com.felees.hbnpojogen.persistence.GenericDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.proxy.HibernateProxy;
/** 
 * Data layer.
 * @author autogenerated
 */
@org.springframework.stereotype.Component
public class DataLayerProteinTrackerImpl implements DataLayerProteinTracker {
	/** Singleton reference to this class. */
	private static DataLayerProteinTracker instance;
	/** map lock. */
	private static Object daoMapLock = new Object();

	/** Internal handle. */
	private static Map<Class<?>, GenericDAO<?, ?>> daoMap = null; 
	
		/** Inner handle. */
	private static ApplicationContext context;
 /** Sessionfactory in use. Filled in by Spring. */ 
    private SessionFactory sessionFactory = null;
	
	/** Handle to get back ourselves and perform correct injection. 
	 * @param ctxt filled by spring
	 */
	@Autowired
	public void setApplicationContext(ApplicationContext ctxt) {
		DataLayerProteinTrackerImpl.context = ctxt;
	}
	
	
		
 	/**
     * Set session factory.
     * @param sessionFactory sessionfactory to use. 
     */
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    /** 
	* Returns a DAO instance of the given type.
	* @param <T> Type
	* @param persistentObject to get
	* @return GenericDAO<T, ?> object
     */
    @SuppressWarnings("unchecked")
    private <T> GenericDAO<T, ?> getDAO(final T persistentObject) {
		T persistent = persistentObject;

		synchronized (daoMapLock) {
    		if (daoMap == null) {
    			daoMap = new ConcurrentHashMap<Class<?>, GenericDAO<?, ?>>(); 
	 	   		daoMap.put(Goalalert.class, HibernateProteinTrackerDaoFactory.getGoalalertDao());
	 	   		daoMap.put(Proteindata.class, HibernateProteinTrackerDaoFactory.getProteindataDao());
	 	   		daoMap.put(Userhistory.class, HibernateProteinTrackerDaoFactory.getUserhistoryDao());
	 	   		daoMap.put(Users.class, HibernateProteinTrackerDaoFactory.getUsersDao());
	 	   		daoMap.put(UserGoalalert.class, HibernateProteinTrackerDaoFactory.getUserGoalalertDao());
    		}
		 }
		if (persistentObject instanceof HibernateProxy) {
			persistent = (T) ((HibernateProxy) persistentObject).getHibernateLazyInitializer().getImplementation();
		} 
		
		GenericDAO<T, ?> result = (GenericDAO<T, ?>) daoMap.get(persistent.getClass());
		if (result == null) {
			throw new IllegalAccessError("The given object is of an incorrect type. ");
		}
		return result;
    }

    /**
     * Deletes the given object from disk.
     * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to delete
     */
    public <T> void delete(T persistentObject) {
    	    	getDAO(persistentObject).delete(persistentObject);
    }
    /**
     * Refresh the object $class.className from disk.
     * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to reload
     */
    public <T> void refresh(T persistentObject) {
	    	getDAO(persistentObject).refresh(persistentObject);
    }

    /**
     * Saves the given object to disk.
     * @param persistentObject Object to save
	 * @param <T> A DataLayerObject-derived type
     * @return Identifier of saved object 
     */
    public <T> Serializable save(T persistentObject) {
        return getDAO(persistentObject).save(persistentObject);
    }
    /**
     * Saves or updates the given $class.className object to disk.
	 * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to save 
     */
    public <T> void saveOrUpdate(T persistentObject) {
        getDAO(persistentObject).saveOrUpdate(persistentObject);
    }
    /**
     * Updates the given object to disk.
	 * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to update 
     */
    public <T> void update(T persistentObject) {
        getDAO(persistentObject).update(persistentObject);
    }


    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Goalalert obj) directly
     * @param id Identifier to delete
     */
    public void deleteGoalalert(final Integer id)  {
        HibernateProteinTrackerDaoFactory.getGoalalertDao().delete(loadGoalalert(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Goalalert object
     */
    public Goalalert loadGoalalert(final Integer id) {
        return HibernateProteinTrackerDaoFactory.getGoalalertDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Goalalert getGoalalert(final Integer id) {
        return HibernateProteinTrackerDaoFactory.getGoalalertDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Proteindata obj) directly
     * @param id Identifier to delete
     */
    public void deleteProteindata(final Integer id)  {
        HibernateProteinTrackerDaoFactory.getProteindataDao().delete(loadProteindata(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Proteindata object
     */
    public Proteindata loadProteindata(final Integer id) {
        return HibernateProteinTrackerDaoFactory.getProteindataDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Proteindata getProteindata(final Integer id) {
        return HibernateProteinTrackerDaoFactory.getProteindataDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Userhistory obj) directly
     * @param id Identifier to delete
     */
    public void deleteUserhistory(final Integer id)  {
        HibernateProteinTrackerDaoFactory.getUserhistoryDao().delete(loadUserhistory(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Userhistory object
     */
    public Userhistory loadUserhistory(final Integer id) {
        return HibernateProteinTrackerDaoFactory.getUserhistoryDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Userhistory getUserhistory(final Integer id) {
        return HibernateProteinTrackerDaoFactory.getUserhistoryDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Users obj) directly
     * @param id Identifier to delete
     */
    public void deleteUsers(final Integer id)  {
        HibernateProteinTrackerDaoFactory.getUsersDao().delete(loadUsers(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Users object
     */
    public Users loadUsers(final Integer id) {
        return HibernateProteinTrackerDaoFactory.getUsersDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Users getUsers(final Integer id) {
        return HibernateProteinTrackerDaoFactory.getUsersDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (UserGoalalert obj) directly
     * @param id Identifier to delete
     */
    public void deleteUserGoalalert(final UserGoalalertPK id)  {
        HibernateProteinTrackerDaoFactory.getUserGoalalertDao().delete(loadUserGoalalert(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a UserGoalalert object
     */
    public UserGoalalert loadUserGoalalert(final UserGoalalertPK id) {
        return HibernateProteinTrackerDaoFactory.getUserGoalalertDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public UserGoalalert getUserGoalalert(final UserGoalalertPK id) {
        return HibernateProteinTrackerDaoFactory.getUserGoalalertDao().get(id);
    }  
    /** Returns a singleton instance of this class.
     * @return an singleton instance
     */
    public static synchronized DataLayerProteinTracker getInstance() {
        
        if (instance == null) {
        	if (context == null) {
        		throw new IllegalStateException("Context is null. Make sure Spring is initialized.");
        	}
     		instance = (DataLayerProteinTracker) context.getBean("dataLayerProteinTrackerImpl");
        }
        
        return instance; 
    }
    /** Returns a query handle.
     * @param query Query to use
     * @return A query instance
     */
     public Query createQuery(final String query) {
        return this.sessionFactory.getCurrentSession().createQuery(query);
    }
    /** Returns a criteria handle.
     * @param criteria Criteria to use
     * @return A criteria instance
     */
     public Criteria createCriteria(final String criteria) {
        return this.sessionFactory.getCurrentSession().createCriteria(criteria);
    }
    /** Returns a Query handle based on your package-level named query.
     * @param query Query to use
     * @return A query instance
     */
     public Query getNamedQuery(final String query) {
        return this.sessionFactory.getCurrentSession().getNamedQuery(query);
    }
    /** Create a new Criteria instance, for the given entity class, or a superclass of an entity class.
	* @param persistentObject a class, which is persistent, or has persistent subclasses 
	* @return Criteria instance
	*/
	@SuppressWarnings("unchecked")
	public Criteria createCriteria(Class persistentObject) {
        return this.sessionFactory.getCurrentSession().createCriteria(persistentObject);
    }
    /** Flushes the currently open session.
	*/
	public void flushSession() {
        this.sessionFactory.getCurrentSession().flush();
    }
    /** Clears the currently open session.
	*/
	public void clearSession() {
        this.sessionFactory.getCurrentSession().clear();
    }
    /** Flushes and clears the currently open session.
	*/
	public void flushAndClearSession() {
		flushSession();
		clearSession();
    }
	/** Call currentSession.replicate.
	 * @param obj to replicate
	 * @param replicationMode mode
	 */ 
	public void replicate(Object obj, ReplicationMode replicationMode) {
		this.sessionFactory.getCurrentSession().replicate(obj, replicationMode);
	}
	/** Hibernate Merge. 
	 * @param obj to merge
	 * @return obj merged.
	 */
	public Object merge(Object obj) {
		return this.sessionFactory.getCurrentSession().merge(obj);
	}
	/** Returns the current session.
	 * @return the currently active session
	 */
	public Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	/** Returns a query handle.
     * @param query Query to use
     * @return A query instance
     */
     public SQLQuery createSQLQuery(final String query) {
        return this.sessionFactory.getCurrentSession().createSQLQuery(query);
    }
    /** Remove this instance from the session cache. 
	 * Changes to the instance will not be synchronized with the database
	 * @param obj object to evict
	 */
	public void evict(Object obj) {
        this.sessionFactory.getCurrentSession().evict(obj);
    }
    /**
     * Return the persistent instance of the given entity class with the given 
     * identifier, or null if there is no such persistent instance. 
     * (If the instance, or a proxy for the instance, is already 
     * associated with the session, return that instance or proxy)
     *
     * @param clazz a persistent class
     * @param id a valid identifier of an existing persistent instance of the class
     * @return a persistent instance or null
     * @throws HibernateException
     */
	public Object get(Class<?> clazz, Serializable id) throws HibernateException {
        return this.sessionFactory.getCurrentSession().get(clazz, id);
    }	


    /**
     * Return the persistent instance of the given entity class with the given identifier, assuming that the instance exists.
     *You should not use this method to determine if an instance exists (use get() instead). Use this only to retrieve an instance that you assume exists, where non-existence would be an actual error.
     *
     * @param clazz a persistent class
     * @param id a valid identifier of an existing persistent instance of the class
     * @return the persistent instance or proxy
     * @throws HibernateException
     */
	public Object load(Class<?> clazz, Serializable id) throws HibernateException {
        return this.sessionFactory.getCurrentSession().load(clazz, id);  
    }
	/**
	 * Reattaches the given entity to the current session using LockMode.NONE
	 *
	 * @param entity to reattach
	 */
	public void reattachEntityWithNoLock(IPojoGenEntity entity) {
		if (entity != null) {
        		this.sessionFactory.getCurrentSession().lock(entity, LockMode.NONE);
    		}
	}
	/**
	 * Reattaches the given entities to the current session.
	 *
	 * @param entities to attach
	 */
	public void reattachEntitiesWithNoLock(Collection<? extends IPojoGenEntity> entities) {
   		if (entities != null) {
		       for (IPojoGenEntity entity : entities) {
            		this.sessionFactory.getCurrentSession().lock(entity, LockMode.NONE);
        		 }
    		}
	}}

