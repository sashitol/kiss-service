package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Support2149 generated by hbm2java
 */
@Entity
@Table(name = "SUPPORT_2149", schema = "PCRM")
public class Support2149 implements java.io.Serializable {

	private Support2149Id id;

	public Support2149() {
	}

	public Support2149(Support2149Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", length = 19)),
			@AttributeOverride(name = "crd", column = @Column(name = "CRD", length = 7)),
			@AttributeOverride(name = "impt", column = @Column(name = "IMPT", length = 7)),
			@AttributeOverride(name = "expt", column = @Column(name = "EXPT", length = 7)),
			@AttributeOverride(name = "impd", column = @Column(name = "IMPD", length = 7)),
			@AttributeOverride(name = "expd", column = @Column(name = "EXPD", length = 7)),
			@AttributeOverride(name = "modt", column = @Column(name = "MODT", length = 7)),
			@AttributeOverride(name = "cru", column = @Column(name = "CRU", length = 19)),
			@AttributeOverride(name = "delt", column = @Column(name = "DELT", length = 7)),
			@AttributeOverride(name = "modd", column = @Column(name = "MODD", length = 7)),
			@AttributeOverride(name = "impu", column = @Column(name = "IMPU", length = 19)),
			@AttributeOverride(name = "expu", column = @Column(name = "EXPU", length = 19)),
			@AttributeOverride(name = "deld", column = @Column(name = "DELD", length = 7)),
			@AttributeOverride(name = "modu", column = @Column(name = "MODU", length = 19)),
			@AttributeOverride(name = "delu", column = @Column(name = "DELU", length = 19)),
			@AttributeOverride(name = "crt", column = @Column(name = "CRT", length = 7)),
			@AttributeOverride(name = "primdwa", column = @Column(name = "PRIMDWA", length = 22)),
			@AttributeOverride(name = "primarysag", column = @Column(name = "PRIMARYSAG", length = 19)),
			@AttributeOverride(name = "primtilbkontr", column = @Column(name = "PRIMTILBKONTR", length = 19)),
			@AttributeOverride(name = "primaddrint", column = @Column(name = "PRIMADDRINT", length = 19)),
			@AttributeOverride(name = "inststatus", column = @Column(name = "INSTSTATUS", precision = 10, scale = 0)),
			@AttributeOverride(name = "varenr", column = @Column(name = "VARENR", length = 15)),
			@AttributeOverride(name = "progpakke", column = @Column(name = "PROGPAKKE")),
			@AttributeOverride(name = "inststattext", column = @Column(name = "INSTSTATTEXT")),
			@AttributeOverride(name = "inkluditilbud", column = @Column(name = "INKLUDITILBUD", length = 1)),
			@AttributeOverride(name = "adddelete", column = @Column(name = "ADDDELETE", length = 1)),
			@AttributeOverride(name = "existing", column = @Column(name = "EXISTING", length = 1)),
			@AttributeOverride(name = "removed", column = @Column(name = "REMOVED", length = 1)),
			@AttributeOverride(name = "added", column = @Column(name = "ADDED", length = 1)),
			@AttributeOverride(name = "primfap", column = @Column(name = "PRIMFAP", length = 19)),
			@AttributeOverride(name = "inststatusaendret", column = @Column(name = "INSTSTATUSAENDRET", length = 1)),
			@AttributeOverride(name = "showincontract", column = @Column(name = "SHOWINCONTRACT", length = 1)),
			@AttributeOverride(name = "tekniskstatus", column = @Column(name = "TEKNISKSTATUS", precision = 10, scale = 0)),
			@AttributeOverride(name = "restjobdone", column = @Column(name = "RESTJOBDONE", length = 7)),
			@AttributeOverride(name = "packageselection", column = @Column(name = "PACKAGESELECTION", length = 1)),
			@AttributeOverride(name = "addressid", column = @Column(name = "ADDRESSID", precision = 10, scale = 0)),
			@AttributeOverride(name = "location", column = @Column(name = "LOCATION", length = 30)),
			@AttributeOverride(name = "installationseq", column = @Column(name = "INSTALLATIONSEQ", precision = 22, scale = 0)) })
	public Support2149Id getId() {
		return this.id;
	}

	public void setId(Support2149Id id) {
		this.id = id;
	}

}