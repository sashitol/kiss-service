package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * StreetsId generated by hbm2java
 */
@Embeddable
public class StreetsId implements java.io.Serializable {

	private long streetId;
	private Date startdate;

	public StreetsId() {
	}

	public StreetsId(long streetId, Date startdate) {
		this.streetId = streetId;
		this.startdate = startdate;
	}

	@Column(name = "STREET_ID", nullable = false, precision = 10, scale = 0)
	public long getStreetId() {
		return this.streetId;
	}

	public void setStreetId(long streetId) {
		this.streetId = streetId;
	}

	@Column(name = "STARTDATE", nullable = false, length = 7)
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StreetsId))
			return false;
		StreetsId castOther = (StreetsId) other;

		return (this.getStreetId() == castOther.getStreetId())
				&& ((this.getStartdate() == castOther.getStartdate()) || (this
						.getStartdate() != null
						&& castOther.getStartdate() != null && this
						.getStartdate().equals(castOther.getStartdate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getStreetId();
		result = 37 * result
				+ (getStartdate() == null ? 0 : this.getStartdate().hashCode());
		return result;
	}

}