package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * WAdresse generated by hbm2java
 */
@Entity
@Table(name = "W_ADRESSE", schema = "PCRM")
public class WAdresse implements java.io.Serializable {

	private WAdresseId id;

	public WAdresse() {
	}

	public WAdresse(WAdresseId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "WAk", column = @Column(name = "W_AK", nullable = false, length = 19)),
			@AttributeOverride(name = "adrDwadrid", column = @Column(name = "ADR_DWADRID", length = 22)),
			@AttributeOverride(name = "adrVejnavn", column = @Column(name = "ADR_VEJNAVN", length = 40)),
			@AttributeOverride(name = "adrHusnr", column = @Column(name = "ADR_HUSNR", length = 3)),
			@AttributeOverride(name = "adrOpgang", column = @Column(name = "ADR_OPGANG", length = 1)),
			@AttributeOverride(name = "adrEtage", column = @Column(name = "ADR_ETAGE", length = 2)),
			@AttributeOverride(name = "adrSidedoer", column = @Column(name = "ADR_SIDEDOER", length = 10)),
			@AttributeOverride(name = "adrPostnr", column = @Column(name = "ADR_POSTNR", length = 4)),
			@AttributeOverride(name = "adrPostdistrikt", column = @Column(name = "ADR_POSTDISTRIKT", length = 30)) })
	public WAdresseId getId() {
		return this.id;
	}

	public void setId(WAdresseId id) {
		this.id = id;
	}

}
