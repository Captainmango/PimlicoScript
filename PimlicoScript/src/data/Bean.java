/**
 * 
 */
package data;

import java.io.Serializable;

/**
 * @author edward
 *
 */
public class Bean implements Serializable {

	private String firstName;
	private String lastName;
	private String callReason;
	private String systemTime;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((callReason == null) ? 0 : callReason.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((systemTime == null) ? 0 : systemTime.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bean other = (Bean) obj;
		if (callReason == null) {
			if (other.callReason != null)
				return false;
		} else if (!callReason.equals(other.callReason))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (systemTime == null) {
			if (other.systemTime != null)
				return false;
		} else if (!systemTime.equals(other.systemTime))
			return false;
		return true;
	}


	/**
	 * @param firstName
	 * @param lastName
	 * @param callReason
	 * @param systemTime
	 */
	public Bean(String firstName, String lastName, String callReason, String systemTime) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.callReason = callReason;
		this.systemTime = systemTime;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the callReason
	 */
	public String getCallReason() {
		return callReason;
	}


	/**
	 * @param callReason the callReason to set
	 */
	public void setCallReason(String callReason) {
		this.callReason = callReason;
	}


	/**
	 * @return the systemTime
	 */
	public String getSystemTime() {
		return systemTime;
	}


	/**
	 * @param systemTime the systemTime to set
	 */
	public void setSystemTime(String systemTime) {
		this.systemTime = systemTime;
	}


	public Bean() {
		super();
	}

}
