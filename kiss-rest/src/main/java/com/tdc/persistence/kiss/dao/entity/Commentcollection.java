package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Commentcollection generated by hbm2java
 */
@Entity
@Table(name = "COMMENTCOLLECTION", schema = "PCRM")
public class Commentcollection implements java.io.Serializable {

	private String id;
	private Date crd;
	private String cru;
	private Date modd;
	private String modu;
	private Date impd;
	private String impu;
	private Date expd;
	private String expu;
	private String code;
	private String head;
	private Date invalidated;
	private Set<Doccomment> doccomments = new HashSet<Doccomment>(0);

	public Commentcollection() {
	}

	public Commentcollection(String id) {
		this.id = id;
	}

	public Commentcollection(String id, Date crd, String cru, Date modd,
			String modu, Date impd, String impu, Date expd, String expu,
			String code, String head, Date invalidated,
			Set<Doccomment> doccomments) {
		this.id = id;
		this.crd = crd;
		this.cru = cru;
		this.modd = modd;
		this.modu = modu;
		this.impd = impd;
		this.impu = impu;
		this.expd = expd;
		this.expu = expu;
		this.code = code;
		this.head = head;
		this.invalidated = invalidated;
		this.doccomments = doccomments;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 19)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRD", length = 7)
	public Date getCrd() {
		return this.crd;
	}

	public void setCrd(Date crd) {
		this.crd = crd;
	}

	@Column(name = "CRU", length = 19)
	public String getCru() {
		return this.cru;
	}

	public void setCru(String cru) {
		this.cru = cru;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MODD", length = 7)
	public Date getModd() {
		return this.modd;
	}

	public void setModd(Date modd) {
		this.modd = modd;
	}

	@Column(name = "MODU", length = 19)
	public String getModu() {
		return this.modu;
	}

	public void setModu(String modu) {
		this.modu = modu;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "IMPD", length = 7)
	public Date getImpd() {
		return this.impd;
	}

	public void setImpd(Date impd) {
		this.impd = impd;
	}

	@Column(name = "IMPU", length = 19)
	public String getImpu() {
		return this.impu;
	}

	public void setImpu(String impu) {
		this.impu = impu;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPD", length = 7)
	public Date getExpd() {
		return this.expd;
	}

	public void setExpd(Date expd) {
		this.expd = expd;
	}

	@Column(name = "EXPU", length = 19)
	public String getExpu() {
		return this.expu;
	}

	public void setExpu(String expu) {
		this.expu = expu;
	}

	@Column(name = "CODE", length = 50)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "HEAD")
	public String getHead() {
		return this.head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INVALIDATED", length = 7)
	public Date getInvalidated() {
		return this.invalidated;
	}

	public void setInvalidated(Date invalidated) {
		this.invalidated = invalidated;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "CR_COMMCOLL", schema = "PCRM", joinColumns = { @JoinColumn(name = "PRIMCOMMENTCOLLECTION", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "PRIMDOCCOMMENT", nullable = false, updatable = false) })
	public Set<Doccomment> getDoccomments() {
		return this.doccomments;
	}

	public void setDoccomments(Set<Doccomment> doccomments) {
		this.doccomments = doccomments;
	}

}
