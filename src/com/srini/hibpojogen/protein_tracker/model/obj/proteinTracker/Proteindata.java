package com.srini.hibpojogen.protein_tracker.model.obj.proteinTracker;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import com.srini.hibpojogen.protein_tracker.model.obj.proteinTracker.Users;
import com.srini.hibpojogen.protein_tracker.model.obj.proteinTracker.iface.IProteindata;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;


/** 
 * Object mapping for hibernate-handled table: proteindata.
 * @author autogenerated
 */

@Entity
@Table(name = "proteindata", catalog = "protein_tracker")
public class Proteindata implements Cloneable, Serializable, IPojoGenEntity, IProteindata {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558912249L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private Integer goal;
	/** Field mapping. */
	private Integer id;
	/** Field mapping. */
	private Integer total;
	/** Field mapping. */
	private Set<Users> userss = new HashSet<Users>();

	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Proteindata() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public Proteindata(Integer id) {
		this.id = id;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return Proteindata.class;
	}
 

    /**
     * Return the value associated with the column: goal.
	 * @return A Integer object (this.goal)
	 */
	public Integer getGoal() {
		return this.goal;
		
	}
	

  
    /**  
     * Set the value related to the column: goal.
	 * @param goal the goal value you wish to set
	 */
	public void setGoal(final Integer goal) {
		this.goal = goal;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@Basic( optional = false )
	@Column( name = "id", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: total.
	 * @return A Integer object (this.total)
	 */
	public Integer getTotal() {
		return this.total;
		
	}
	

  
    /**  
     * Set the value related to the column: total.
	 * @param total the total value you wish to set
	 */
	public void setTotal(final Integer total) {
		this.total = total;
	}

    /**
     * Return the value associated with the column: users.
	 * @return A Set&lt;Users&gt; object (this.users)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "proteinData"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( nullable = false  )
	public Set<Users> getUserss() {
		return this.userss;
		
	}
	
	/**
	 * Adds a bi-directional link of type Users to the userss set.
	 * @param users item to add
	 */
	public void addUsers(Users users) {
		users.setProteinData(this);
		this.userss.add(users);
	}

  
    /**  
     * Set the value related to the column: users.
	 * @param users the users value you wish to set
	 */
	public void setUserss(final Set<Users> users) {
		this.userss = users;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public Proteindata clone() throws CloneNotSupportedException {
		
        final Proteindata copy = (Proteindata)super.clone();

		copy.setGoal(this.getGoal());
		copy.setId(this.getId());
		copy.setTotal(this.getTotal());
		if (this.getUserss() != null) {
			copy.getUserss().addAll(this.getUserss());
		}
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("goal: " + this.getGoal() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("total: " + this.getTotal() + ", ");
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final Proteindata that; 
		try {
			that = (Proteindata) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getGoal() == null) && (that.getGoal() == null)) || (getGoal() != null && getGoal().equals(that.getGoal())));
		result = result && (((getTotal() == null) && (that.getTotal() == null)) || (getTotal() != null && getTotal().equals(that.getTotal())));
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Integer newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
}
