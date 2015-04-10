package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AddressesLogId generated by hbm2java
 */
@Embeddable
public class AddressesLogId implements java.io.Serializable {

	private Long addressId;
	private Long oldaddressId;
	private String errortext;

	public AddressesLogId() {
	}

	public AddressesLogId(Long addressId, Long oldaddressId, String errortext) {
		this.addressId = addressId;
		this.oldaddressId = oldaddressId;
		this.errortext = errortext;
	}

	@Column(name = "ADDRESS_ID", precision = 10, scale = 0)
	public Long getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	@Column(name = "OLDADDRESS_ID", precision = 10, scale = 0)
	public Long getOldaddressId() {
		return this.oldaddressId;
	}

	public void setOldaddressId(Long oldaddressId) {
		this.oldaddressId = oldaddressId;
	}

	@Column(name = "ERRORTEXT", length = 400)
	public String getErrortext() {
		return this.errortext;
	}

	public void setErrortext(String errortext) {
		this.errortext = errortext;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AddressesLogId))
			return false;
		AddressesLogId castOther = (AddressesLogId) other;

		return ((this.getAddressId() == castOther.getAddressId()) || (this
				.getAddressId() != null && castOther.getAddressId() != null && this
				.getAddressId().equals(castOther.getAddressId())))
				&& ((this.getOldaddressId() == castOther.getOldaddressId()) || (this
						.getOldaddressId() != null
						&& castOther.getOldaddressId() != null && this
						.getOldaddressId().equals(castOther.getOldaddressId())))
				&& ((this.getErrortext() == castOther.getErrortext()) || (this
						.getErrortext() != null
						&& castOther.getErrortext() != null && this
						.getErrortext().equals(castOther.getErrortext())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAddressId() == null ? 0 : this.getAddressId().hashCode());
		result = 37
				* result
				+ (getOldaddressId() == null ? 0 : this.getOldaddressId()
						.hashCode());
		result = 37 * result
				+ (getErrortext() == null ? 0 : this.getErrortext().hashCode());
		return result;
	}

}