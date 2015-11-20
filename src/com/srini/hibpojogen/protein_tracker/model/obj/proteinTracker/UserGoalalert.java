package com.srini.hibpojogen.protein_tracker.model.obj.proteinTracker;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import com.srini.hibpojogen.protein_tracker.model.obj.proteinTracker.iface.IUserGoalalert;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


/** 
 * Object mapping for hibernate-handled table: user_goalalert.
 * @author autogenerated
 */

@Entity
@Table(name = "user_goalalert", catalog = "protein_tracker")
public class UserGoalalert implements Cloneable, Serializable, IPojoGenEntity, IUserGoalalert {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558912246L;

	

	/** Field mapping. */
	@Id 
	private UserGoalalertPK id;

	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public UserGoalalert() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public UserGoalalert(UserGoalalertPK id) {
		this.id = id;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return UserGoalalert.class;
	}
 

    /**
     * Return the value associated with the column: id.
	 * @return A UserGoalalertPK object (this.id)
	 */
	public UserGoalalertPK getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final UserGoalalertPK id) {
		this.id = id;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public UserGoalalert clone() throws CloneNotSupportedException {
		
        final UserGoalalert copy = (UserGoalalert)super.clone();

		copy.setId(this.getId());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("id: " + this.getId());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		if ( this == aThat ) {
			 return true;
		}

		if ((aThat == null) || ( !(aThat.getClass().equals(this.getClass())))) {
			 return false;
		}
	
		final UserGoalalert that = (UserGoalalert) aThat;
		return this.getId().equals(that.getId());
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		return getId().hashCode();
	}
	

	
}
