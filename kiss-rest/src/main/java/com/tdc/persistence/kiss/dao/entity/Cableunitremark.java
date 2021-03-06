package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cableunitremark generated by hbm2java
 */
@Entity
@Table(name = "CABLEUNITREMARK", schema = "PCRM")
public class Cableunitremark implements java.io.Serializable {

	private String id;
	private String primecableunit;
	private String primegeneraltypevalueid;
	private String primegeneraltypevaluecode;
	private String remarktext;
	private Date remarkdate;
	private String cru;
	private Date crd;
	private String modu;
	private Date modd;
	private Date deld;
	private String delu;

	public Cableunitremark() {
	}

	public Cableunitremark(String id) {
		this.id = id;
	}

	public Cableunitremark(String id, String primecableunit,
			String primegeneraltypevalueid, String primegeneraltypevaluecode,
			String remarktext, Date remarkdate, String cru, Date crd,
			String modu, Date modd, Date deld, String delu) {
		this.id = id;
		this.primecableunit = primecableunit;
		this.primegeneraltypevalueid = primegeneraltypevalueid;
		this.primegeneraltypevaluecode = primegeneraltypevaluecode;
		this.remarktext = remarktext;
		this.remarkdate = remarkdate;
		this.cru = cru;
		this.crd = crd;
		this.modu = modu;
		this.modd = modd;
		this.deld = deld;
		this.delu = delu;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 19)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "PRIMECABLEUNIT", length = 19)
	public String getPrimecableunit() {
		return this.primecableunit;
	}

	public void setPrimecableunit(String primecableunit) {
		this.primecableunit = primecableunit;
	}

	@Column(name = "PRIMEGENERALTYPEVALUEID", length = 19)
	public String getPrimegeneraltypevalueid() {
		return this.primegeneraltypevalueid;
	}

	public void setPrimegeneraltypevalueid(String primegeneraltypevalueid) {
		this.primegeneraltypevalueid = primegeneraltypevalueid;
	}

	@Column(name = "PRIMEGENERALTYPEVALUECODE", length = 50)
	public String getPrimegeneraltypevaluecode() {
		return this.primegeneraltypevaluecode;
	}

	public void setPrimegeneraltypevaluecode(String primegeneraltypevaluecode) {
		this.primegeneraltypevaluecode = primegeneraltypevaluecode;
	}

	@Column(name = "REMARKTEXT", length = 2000)
	public String getRemarktext() {
		return this.remarktext;
	}

	public void setRemarktext(String remarktext) {
		this.remarktext = remarktext;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "REMARKDATE", length = 7)
	public Date getRemarkdate() {
		return this.remarkdate;
	}

	public void setRemarkdate(Date remarkdate) {
		this.remarkdate = remarkdate;
	}

	@Column(name = "CRU", length = 19)
	public String getCru() {
		return this.cru;
	}

	public void setCru(String cru) {
		this.cru = cru;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRD", length = 7)
	public Date getCrd() {
		return this.crd;
	}

	public void setCrd(Date crd) {
		this.crd = crd;
	}

	@Column(name = "MODU", length = 19)
	public String getModu() {
		return this.modu;
	}

	public void setModu(String modu) {
		this.modu = modu;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MODD", length = 7)
	public Date getModd() {
		return this.modd;
	}

	public void setModd(Date modd) {
		this.modd = modd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DELD", length = 7)
	public Date getDeld() {
		return this.deld;
	}

	public void setDeld(Date deld) {
		this.deld = deld;
	}

	@Column(name = "DELU", length = 19)
	public String getDelu() {
		return this.delu;
	}

	public void setDelu(String delu) {
		this.delu = delu;
	}

}
