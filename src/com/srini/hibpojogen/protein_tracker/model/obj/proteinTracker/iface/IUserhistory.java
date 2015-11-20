package com.srini.hibpojogen.protein_tracker.model.obj.proteinTracker.iface;
import com.srini.hibpojogen.protein_tracker.model.obj.proteinTracker.Users;
import java.util.Date;
import javax.persistence.Basic;


/** 
 * Object interface mapping for hibernate-handled table: userhistory.
 * @author autogenerated
 */

public interface IUserhistory {



    /**
     * Return the value associated with the column: entry.
	 * @return A String object (this.entry)
	 */
	String getEntry();
	

  
    /**  
     * Set the value related to the column: entry.
	 * @param entry the entry value you wish to set
	 */
	void setEntry(final String entry);

    /**
     * Return the value associated with the column: entrytime.
	 * @return A Date object (this.entrytime)
	 */
	Date getEntrytime();
	

  
    /**  
     * Set the value related to the column: entrytime.
	 * @param entrytime the entrytime value you wish to set
	 */
	void setEntrytime(final Date entrytime);

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
	Integer getId();
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	void setId(final Integer id);

    /**
     * Return the value associated with the column: position.
	 * @return A Integer object (this.position)
	 */
	Integer getPosition();
	

  
    /**  
     * Set the value related to the column: position.
	 * @param position the position value you wish to set
	 */
	void setPosition(final Integer position);

    /**
     * Return the value associated with the column: user.
	 * @return A Users object (this.user)
	 */
	Users getUser();
	

  
    /**  
     * Set the value related to the column: user.
	 * @param user the user value you wish to set
	 */
	void setUser(final Users user);

	// end of interface
}