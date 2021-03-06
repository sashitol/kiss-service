package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Cdmcustprojectsupplier generated by hbm2java
 */
@Entity
@Table(name = "CDMCUSTPROJECTSUPPLIER", schema = "PCRM")
public class Cdmcustprojectsupplier implements java.io.Serializable {

	private CdmcustprojectsupplierId id;

	public Cdmcustprojectsupplier() {
	}

	public Cdmcustprojectsupplier(CdmcustprojectsupplierId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", length = 19)),
			@AttributeOverride(name = "crd", column = @Column(name = "CRD", length = 7)),
			@AttributeOverride(name = "crt", column = @Column(name = "CRT", length = 7)),
			@AttributeOverride(name = "cru", column = @Column(name = "CRU", length = 19)),
			@AttributeOverride(name = "modd", column = @Column(name = "MODD", length = 7)),
			@AttributeOverride(name = "modt", column = @Column(name = "MODT", length = 7)),
			@AttributeOverride(name = "modu", column = @Column(name = "MODU", length = 19)),
			@AttributeOverride(name = "deld", column = @Column(name = "DELD", length = 7)),
			@AttributeOverride(name = "delt", column = @Column(name = "DELT", length = 7)),
			@AttributeOverride(name = "delu", column = @Column(name = "DELU", length = 19)),
			@AttributeOverride(name = "impd", column = @Column(name = "IMPD", length = 7)),
			@AttributeOverride(name = "impt", column = @Column(name = "IMPT", length = 7)),
			@AttributeOverride(name = "impu", column = @Column(name = "IMPU", length = 19)),
			@AttributeOverride(name = "expd", column = @Column(name = "EXPD", length = 7)),
			@AttributeOverride(name = "expt", column = @Column(name = "EXPT", length = 7)),
			@AttributeOverride(name = "expu", column = @Column(name = "EXPU", length = 19)),
			@AttributeOverride(name = "primsalesprodcat", column = @Column(name = "PRIMSALESPRODCAT", length = 19)),
			@AttributeOverride(name = "primcupro", column = @Column(name = "PRIMCUPRO", length = 19)),
			@AttributeOverride(name = "primportaluser", column = @Column(name = "PRIMPORTALUSER", length = 50)),
			@AttributeOverride(name = "competitorname", column = @Column(name = "COMPETITORNAME", length = 64)),
			@AttributeOverride(name = "collective", column = @Column(name = "COLLECTIVE", length = 1)) })
	public CdmcustprojectsupplierId getId() {
		return this.id;
	}

	public void setId(CdmcustprojectsupplierId id) {
		this.id = id;
	}

}
