package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * WAdresseId generated by hbm2java
 */
@Embeddable
public class WAdresseId implements java.io.Serializable {

	private String WAk;
	private String adrDwadrid;
	private String adrVejnavn;
	private String adrHusnr;
	private String adrOpgang;
	private String adrEtage;
	private String adrSidedoer;
	private String adrPostnr;
	private String adrPostdistrikt;

	public WAdresseId() {
	}

	public WAdresseId(String WAk) {
		this.WAk = WAk;
	}

	public WAdresseId(String WAk, String adrDwadrid, String adrVejnavn,
			String adrHusnr, String adrOpgang, String adrEtage,
			String adrSidedoer, String adrPostnr, String adrPostdistrikt) {
		this.WAk = WAk;
		this.adrDwadrid = adrDwadrid;
		this.adrVejnavn = adrVejnavn;
		this.adrHusnr = adrHusnr;
		this.adrOpgang = adrOpgang;
		this.adrEtage = adrEtage;
		this.adrSidedoer = adrSidedoer;
		this.adrPostnr = adrPostnr;
		this.adrPostdistrikt = adrPostdistrikt;
	}

	@Column(name = "W_AK", nullable = false, length = 19)
	public String getWAk() {
		return this.WAk;
	}

	public void setWAk(String WAk) {
		this.WAk = WAk;
	}

	@Column(name = "ADR_DWADRID", length = 22)
	public String getAdrDwadrid() {
		return this.adrDwadrid;
	}

	public void setAdrDwadrid(String adrDwadrid) {
		this.adrDwadrid = adrDwadrid;
	}

	@Column(name = "ADR_VEJNAVN", length = 40)
	public String getAdrVejnavn() {
		return this.adrVejnavn;
	}

	public void setAdrVejnavn(String adrVejnavn) {
		this.adrVejnavn = adrVejnavn;
	}

	@Column(name = "ADR_HUSNR", length = 3)
	public String getAdrHusnr() {
		return this.adrHusnr;
	}

	public void setAdrHusnr(String adrHusnr) {
		this.adrHusnr = adrHusnr;
	}

	@Column(name = "ADR_OPGANG", length = 1)
	public String getAdrOpgang() {
		return this.adrOpgang;
	}

	public void setAdrOpgang(String adrOpgang) {
		this.adrOpgang = adrOpgang;
	}

	@Column(name = "ADR_ETAGE", length = 2)
	public String getAdrEtage() {
		return this.adrEtage;
	}

	public void setAdrEtage(String adrEtage) {
		this.adrEtage = adrEtage;
	}

	@Column(name = "ADR_SIDEDOER", length = 10)
	public String getAdrSidedoer() {
		return this.adrSidedoer;
	}

	public void setAdrSidedoer(String adrSidedoer) {
		this.adrSidedoer = adrSidedoer;
	}

	@Column(name = "ADR_POSTNR", length = 4)
	public String getAdrPostnr() {
		return this.adrPostnr;
	}

	public void setAdrPostnr(String adrPostnr) {
		this.adrPostnr = adrPostnr;
	}

	@Column(name = "ADR_POSTDISTRIKT", length = 30)
	public String getAdrPostdistrikt() {
		return this.adrPostdistrikt;
	}

	public void setAdrPostdistrikt(String adrPostdistrikt) {
		this.adrPostdistrikt = adrPostdistrikt;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WAdresseId))
			return false;
		WAdresseId castOther = (WAdresseId) other;

		return ((this.getWAk() == castOther.getWAk()) || (this.getWAk() != null
				&& castOther.getWAk() != null && this.getWAk().equals(
				castOther.getWAk())))
				&& ((this.getAdrDwadrid() == castOther.getAdrDwadrid()) || (this
						.getAdrDwadrid() != null
						&& castOther.getAdrDwadrid() != null && this
						.getAdrDwadrid().equals(castOther.getAdrDwadrid())))
				&& ((this.getAdrVejnavn() == castOther.getAdrVejnavn()) || (this
						.getAdrVejnavn() != null
						&& castOther.getAdrVejnavn() != null && this
						.getAdrVejnavn().equals(castOther.getAdrVejnavn())))
				&& ((this.getAdrHusnr() == castOther.getAdrHusnr()) || (this
						.getAdrHusnr() != null
						&& castOther.getAdrHusnr() != null && this
						.getAdrHusnr().equals(castOther.getAdrHusnr())))
				&& ((this.getAdrOpgang() == castOther.getAdrOpgang()) || (this
						.getAdrOpgang() != null
						&& castOther.getAdrOpgang() != null && this
						.getAdrOpgang().equals(castOther.getAdrOpgang())))
				&& ((this.getAdrEtage() == castOther.getAdrEtage()) || (this
						.getAdrEtage() != null
						&& castOther.getAdrEtage() != null && this
						.getAdrEtage().equals(castOther.getAdrEtage())))
				&& ((this.getAdrSidedoer() == castOther.getAdrSidedoer()) || (this
						.getAdrSidedoer() != null
						&& castOther.getAdrSidedoer() != null && this
						.getAdrSidedoer().equals(castOther.getAdrSidedoer())))
				&& ((this.getAdrPostnr() == castOther.getAdrPostnr()) || (this
						.getAdrPostnr() != null
						&& castOther.getAdrPostnr() != null && this
						.getAdrPostnr().equals(castOther.getAdrPostnr())))
				&& ((this.getAdrPostdistrikt() == castOther
						.getAdrPostdistrikt()) || (this.getAdrPostdistrikt() != null
						&& castOther.getAdrPostdistrikt() != null && this
						.getAdrPostdistrikt().equals(
								castOther.getAdrPostdistrikt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getWAk() == null ? 0 : this.getWAk().hashCode());
		result = 37
				* result
				+ (getAdrDwadrid() == null ? 0 : this.getAdrDwadrid()
						.hashCode());
		result = 37
				* result
				+ (getAdrVejnavn() == null ? 0 : this.getAdrVejnavn()
						.hashCode());
		result = 37 * result
				+ (getAdrHusnr() == null ? 0 : this.getAdrHusnr().hashCode());
		result = 37 * result
				+ (getAdrOpgang() == null ? 0 : this.getAdrOpgang().hashCode());
		result = 37 * result
				+ (getAdrEtage() == null ? 0 : this.getAdrEtage().hashCode());
		result = 37
				* result
				+ (getAdrSidedoer() == null ? 0 : this.getAdrSidedoer()
						.hashCode());
		result = 37 * result
				+ (getAdrPostnr() == null ? 0 : this.getAdrPostnr().hashCode());
		result = 37
				* result
				+ (getAdrPostdistrikt() == null ? 0 : this.getAdrPostdistrikt()
						.hashCode());
		return result;
	}

}