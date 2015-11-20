package com.srini.hibpojogen.protein_tracker.model.obj.proteinTracker;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import com.srini.hibpojogen.protein_tracker.model.obj.proteinTracker.UserGoalalert;
import com.srini.hibpojogen.protein_tracker.model.obj.proteinTracker.Userhistory;
import com.srini.hibpojogen.protein_tracker.model.obj.proteinTracker.iface.IUsers;
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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;


/** 
 * Object mapping for hibernate-handled table: users.
 * @author autogenerated
 */

@Entity
@Table(name = "users", catalog = "protein_tracker")
public class Users implements Cloneable, Serializable, IPojoGenEntity, IUsers {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558912247L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private String name;
	/** Field mapping. */
	private Proteindata proteinData;
	/** Field mapping. */
	private Set<UserGoalalert> userGoalalerts = new HashSet<UserGoalalert>();

	/** Field mapping. */
	private Set<Userhistory> userhistories = new HashSet<Userhistory>();

	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Users() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public Users(Integer id) {
		this.id = id;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return Users.class;
	}
 

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
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
     * Return the value associated with the column: name.
	 * @return A String object (this.name)
	 */
	@Basic( optional = true )
	@Column( length = 255  )
	public String getName() {
		return this.name;
		
	}
	

  
    /**  
     * Set the value related to the column: name.
	 * @param name the name value you wish to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

    /**
     * Return the value associated with the column: proteinData.
	 * @return A Proteindata object (this.proteinData)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = true )
	@JoinColumn(name = "PROTEIN_DATA_ID", nullable = true )
	public Proteindata getProteinData() {
		return this.proteinData;
		
	}
	

  
    /**  
     * Set the value related to the column: proteinData.
	 * @param proteinData the proteinData value you wish to set
	 */
	public void setProteinData(final Proteindata proteinData) {
		this.proteinData = proteinData;
	}

    /**
     * Return the value associated with the column: userGoalalert.
	 * @return A Set&lt;UserGoalalert&gt; object (this.userGoalalert)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "id.user"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( nullable = false  )
	public Set<UserGoalalert> getUserGoalalerts() {
		return this.userGoalalerts;
		
	}
	
	/**
	 * Adds a bi-directional link of type UserGoalalert to the userGoalalerts set.
	 * @param userGoalalert item to add
	 */
	public void addUserGoalalert(UserGoalalert userGoalalert) {
		userGoalalert.getId().setUser(this);
		this.userGoalalerts.add(userGoalalert);
	}

  
    /**  
     * Set the value related to the column: userGoalalert.
	 * @param userGoalalert the userGoalalert value you wish to set
	 */
	public void setUserGoalalerts(final Set<UserGoalalert> userGoalalert) {
		this.userGoalalerts = userGoalalert;
	}

    /**
     * Return the value associated with the column: userhistory.
	 * @return A Set&lt;Userhistory&gt; object (this.userhistory)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "user"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( nullable = false  )
	public Set<Userhistory> getUserhistories() {
		return this.userhistories;
		
	}
	
	/**
	 * Adds a bi-directional link of type Userhistory to the userhistories set.
	 * @param userhistory item to add
	 */
	public void addUserhistory(Userhistory userhistory) {
		userhistory.setUser(this);
		this.userhistories.add(userhistory);
	}

  
    /**  
     * Set the value related to the column: userhistory.
	 * @param userhistory the userhistory value you wish to set
	 */
	public void setUserhistories(final Set<Userhistory> userhistory) {
		this.userhistories = userhistory;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public Users clone() throws CloneNotSupportedException {
		
        final Users copy = (Users)super.clone();

		copy.setId(this.getId());
		copy.setName(this.getName());
		copy.setProteinData(this.getProteinData());
		if (this.getUserGoalalerts() != null) {
			copy.getUserGoalalerts().addAll(this.getUserGoalalerts());
		}
		if (this.getUserhistories() != null) {
			copy.getUserhistories().addAll(this.getUserhistories());
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
		
		sb.append("id: " + this.getId() + ", ");
		sb.append("name: " + this.getName() + ", ");
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
		
		final Users that; 
		try {
			that = (Users) proxyThat;
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
		result = result && (((getName() == null) && (that.getName() == null)) || (getName() != null && getName().equals(that.getName())));
		result = result && (((getProteinData() == null) && (that.getProteinData() == null)) || (getProteinData() != null && getProteinData().getId().equals(that.getProteinData().getId())));	
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
