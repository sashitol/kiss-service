package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * StreetsSearchId generated by hbm2java
 */
@Embeddable
public class StreetsSearchId implements java.io.Serializable {

	private long streetId;
	private Short municipalitycode;
	private Short streetcode;
	private String postalcode;
	private String streetname;
	private String streetnameSearch;
	private String placename;
	private boolean accessClass;

	public StreetsSearchId() {
	}

	public StreetsSearchId(long streetId, boolean accessClass) {
		this.streetId = streetId;
		this.accessClass = accessClass;
	}

	public StreetsSearchId(long streetId, Short municipalitycode,
			Short streetcode, String postalcode, String streetname,
			String streetnameSearch, String placename, boolean accessClass) {
		this.streetId = streetId;
		this.municipalitycode = municipalitycode;
		this.streetcode = streetcode;
		this.postalcode = postalcode;
		this.streetname = streetname;
		this.streetnameSearch = streetnameSearch;
		this.placename = placename;
		this.accessClass = accessClass;
	}

	@Column(name = "STREET_ID", nullable = false, precision = 10, scale = 0)
	public long getStreetId() {
		return this.streetId;
	}

	public void setStreetId(long streetId) {
		this.streetId = streetId;
	}

	@Column(name = "MUNICIPALITYCODE", precision = 3, scale = 0)
	public Short getMunicipalitycode() {
		return this.municipalitycode;
	}

	public void setMunicipalitycode(Short municipalitycode) {
		this.municipalitycode = municipalitycode;
	}

	@Column(name = "STREETCODE", precision = 4, scale = 0)
	public Short getStreetcode() {
		return this.streetcode;
	}

	public void setStreetcode(Short streetcode) {
		this.streetcode = streetcode;
	}

	@Column(name = "POSTALCODE", length = 10)
	public String getPostalcode() {
		return this.postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	@Column(name = "STREETNAME", length = 40)
	public String getStreetname() {
		return this.streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	@Column(name = "STREETNAME_SEARCH", length = 40)
	public String getStreetnameSearch() {
		return this.streetnameSearch;
	}

	public void setStreetnameSearch(String streetnameSearch) {
		this.streetnameSearch = streetnameSearch;
	}

	@Column(name = "PLACENAME", length = 40)
	public String getPlacename() {
		return this.placename;
	}

	public void setPlacename(String placename) {
		this.placename = placename;
	}

	@Column(name = "ACCESS_CLASS", nullable = false, precision = 1, scale = 0)
	public boolean isAccessClass() {
		return this.accessClass;
	}

	public void setAccessClass(boolean accessClass) {
		this.accessClass = accessClass;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StreetsSearchId))
			return false;
		StreetsSearchId castOther = (StreetsSearchId) other;

		return (this.getStreetId() == castOther.getStreetId())
				&& ((this.getMunicipalitycode() == castOther
						.getMunicipalitycode()) || (this.getMunicipalitycode() != null
						&& castOther.getMunicipalitycode() != null && this
						.getMunicipalitycode().equals(
								castOther.getMunicipalitycode())))
				&& ((this.getStreetcode() == castOther.getStreetcode()) || (this
						.getStreetcode() != null
						&& castOther.getStreetcode() != null && this
						.getStreetcode().equals(castOther.getStreetcode())))
				&& ((this.getPostalcode() == castOther.getPostalcode()) || (this
						.getPostalcode() != null
						&& castOther.getPostalcode() != null && this
						.getPostalcode().equals(castOther.getPostalcode())))
				&& ((this.getStreetname() == castOther.getStreetname()) || (this
						.getStreetname() != null
						&& castOther.getStreetname() != null && this
						.getStreetname().equals(castOther.getStreetname())))
				&& ((this.getStreetnameSearch() == castOther
						.getStreetnameSearch()) || (this.getStreetnameSearch() != null
						&& castOther.getStreetnameSearch() != null && this
						.getStreetnameSearch().equals(
								castOther.getStreetnameSearch())))
				&& ((this.getPlacename() == castOther.getPlacename()) || (this
						.getPlacename() != null
						&& castOther.getPlacename() != null && this
						.getPlacename().equals(castOther.getPlacename())))
				&& (this.isAccessClass() == castOther.isAccessClass());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getStreetId();
		result = 37
				* result
				+ (getMunicipalitycode() == null ? 0 : this
						.getMunicipalitycode().hashCode());
		result = 37
				* result
				+ (getStreetcode() == null ? 0 : this.getStreetcode()
						.hashCode());
		result = 37
				* result
				+ (getPostalcode() == null ? 0 : this.getPostalcode()
						.hashCode());
		result = 37
				* result
				+ (getStreetname() == null ? 0 : this.getStreetname()
						.hashCode());
		result = 37
				* result
				+ (getStreetnameSearch() == null ? 0 : this
						.getStreetnameSearch().hashCode());
		result = 37 * result
				+ (getPlacename() == null ? 0 : this.getPlacename().hashCode());
		result = 37 * result + (this.isAccessClass() ? 1 : 0);
		return result;
	}

}