package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TempId generated by hbm2java
 */
@Embeddable
public class TempId implements java.io.Serializable {

	private Long taeller;
	private String tekst;

	public TempId() {
	}

	public TempId(Long taeller, String tekst) {
		this.taeller = taeller;
		this.tekst = tekst;
	}

	@Column(name = "TAELLER", precision = 10, scale = 0)
	public Long getTaeller() {
		return this.taeller;
	}

	public void setTaeller(Long taeller) {
		this.taeller = taeller;
	}

	@Column(name = "TEKST", length = 2000)
	public String getTekst() {
		return this.tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TempId))
			return false;
		TempId castOther = (TempId) other;

		return ((this.getTaeller() == castOther.getTaeller()) || (this
				.getTaeller() != null && castOther.getTaeller() != null && this
				.getTaeller().equals(castOther.getTaeller())))
				&& ((this.getTekst() == castOther.getTekst()) || (this
						.getTekst() != null && castOther.getTekst() != null && this
						.getTekst().equals(castOther.getTekst())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTaeller() == null ? 0 : this.getTaeller().hashCode());
		result = 37 * result
				+ (getTekst() == null ? 0 : this.getTekst().hashCode());
		return result;
	}

}