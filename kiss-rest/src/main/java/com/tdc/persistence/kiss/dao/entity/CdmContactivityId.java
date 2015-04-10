package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CdmContactivityId generated by hbm2java
 */
@Embeddable
public class CdmContactivityId implements java.io.Serializable {

	private String id;
	private Date crd;
	private Date crt;
	private String cru;
	private Date modd;
	private Date modt;
	private String modu;
	private Date deld;
	private Date delt;
	private String delu;
	private Date impd;
	private Date impt;
	private String impu;
	private Date expd;
	private Date expt;
	private String expu;
	private String primcont2comp;
	private String primcontactivity;
	private String activitytype;
	private String prcstatus;
	private Date prcstatusTs;

	public CdmContactivityId() {
	}

	public CdmContactivityId(String id, Date crd, Date crt, String cru,
			Date modd, Date modt, String modu, Date deld, Date delt,
			String delu, Date impd, Date impt, String impu, Date expd,
			Date expt, String expu, String primcont2comp,
			String primcontactivity, String activitytype, String prcstatus,
			Date prcstatusTs) {
		this.id = id;
		this.crd = crd;
		this.crt = crt;
		this.cru = cru;
		this.modd = modd;
		this.modt = modt;
		this.modu = modu;
		this.deld = deld;
		this.delt = delt;
		this.delu = delu;
		this.impd = impd;
		this.impt = impt;
		this.impu = impu;
		this.expd = expd;
		this.expt = expt;
		this.expu = expu;
		this.primcont2comp = primcont2comp;
		this.primcontactivity = primcontactivity;
		this.activitytype = activitytype;
		this.prcstatus = prcstatus;
		this.prcstatusTs = prcstatusTs;
	}

	@Column(name = "ID", unique = true, length = 19)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "CRD", length = 7)
	public Date getCrd() {
		return this.crd;
	}

	public void setCrd(Date crd) {
		this.crd = crd;
	}

	@Column(name = "CRT", length = 7)
	public Date getCrt() {
		return this.crt;
	}

	public void setCrt(Date crt) {
		this.crt = crt;
	}

	@Column(name = "CRU", length = 19)
	public String getCru() {
		return this.cru;
	}

	public void setCru(String cru) {
		this.cru = cru;
	}

	@Column(name = "MODD", length = 7)
	public Date getModd() {
		return this.modd;
	}

	public void setModd(Date modd) {
		this.modd = modd;
	}

	@Column(name = "MODT", length = 7)
	public Date getModt() {
		return this.modt;
	}

	public void setModt(Date modt) {
		this.modt = modt;
	}

	@Column(name = "MODU", length = 19)
	public String getModu() {
		return this.modu;
	}

	public void setModu(String modu) {
		this.modu = modu;
	}

	@Column(name = "DELD", length = 7)
	public Date getDeld() {
		return this.deld;
	}

	public void setDeld(Date deld) {
		this.deld = deld;
	}

	@Column(name = "DELT", length = 7)
	public Date getDelt() {
		return this.delt;
	}

	public void setDelt(Date delt) {
		this.delt = delt;
	}

	@Column(name = "DELU", length = 19)
	public String getDelu() {
		return this.delu;
	}

	public void setDelu(String delu) {
		this.delu = delu;
	}

	@Column(name = "IMPD", length = 7)
	public Date getImpd() {
		return this.impd;
	}

	public void setImpd(Date impd) {
		this.impd = impd;
	}

	@Column(name = "IMPT", length = 7)
	public Date getImpt() {
		return this.impt;
	}

	public void setImpt(Date impt) {
		this.impt = impt;
	}

	@Column(name = "IMPU", length = 19)
	public String getImpu() {
		return this.impu;
	}

	public void setImpu(String impu) {
		this.impu = impu;
	}

	@Column(name = "EXPD", length = 7)
	public Date getExpd() {
		return this.expd;
	}

	public void setExpd(Date expd) {
		this.expd = expd;
	}

	@Column(name = "EXPT", length = 7)
	public Date getExpt() {
		return this.expt;
	}

	public void setExpt(Date expt) {
		this.expt = expt;
	}

	@Column(name = "EXPU", length = 19)
	public String getExpu() {
		return this.expu;
	}

	public void setExpu(String expu) {
		this.expu = expu;
	}

	@Column(name = "PRIMCONT2COMP", length = 19)
	public String getPrimcont2comp() {
		return this.primcont2comp;
	}

	public void setPrimcont2comp(String primcont2comp) {
		this.primcont2comp = primcont2comp;
	}

	@Column(name = "PRIMCONTACTIVITY", length = 19)
	public String getPrimcontactivity() {
		return this.primcontactivity;
	}

	public void setPrimcontactivity(String primcontactivity) {
		this.primcontactivity = primcontactivity;
	}

	@Column(name = "ACTIVITYTYPE", length = 50)
	public String getActivitytype() {
		return this.activitytype;
	}

	public void setActivitytype(String activitytype) {
		this.activitytype = activitytype;
	}

	@Column(name = "PRCSTATUS", length = 50)
	public String getPrcstatus() {
		return this.prcstatus;
	}

	public void setPrcstatus(String prcstatus) {
		this.prcstatus = prcstatus;
	}

	@Column(name = "PRCSTATUS_TS", length = 7)
	public Date getPrcstatusTs() {
		return this.prcstatusTs;
	}

	public void setPrcstatusTs(Date prcstatusTs) {
		this.prcstatusTs = prcstatusTs;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CdmContactivityId))
			return false;
		CdmContactivityId castOther = (CdmContactivityId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getCrd() == castOther.getCrd()) || (this.getCrd() != null
						&& castOther.getCrd() != null && this.getCrd().equals(
						castOther.getCrd())))
				&& ((this.getCrt() == castOther.getCrt()) || (this.getCrt() != null
						&& castOther.getCrt() != null && this.getCrt().equals(
						castOther.getCrt())))
				&& ((this.getCru() == castOther.getCru()) || (this.getCru() != null
						&& castOther.getCru() != null && this.getCru().equals(
						castOther.getCru())))
				&& ((this.getModd() == castOther.getModd()) || (this.getModd() != null
						&& castOther.getModd() != null && this.getModd()
						.equals(castOther.getModd())))
				&& ((this.getModt() == castOther.getModt()) || (this.getModt() != null
						&& castOther.getModt() != null && this.getModt()
						.equals(castOther.getModt())))
				&& ((this.getModu() == castOther.getModu()) || (this.getModu() != null
						&& castOther.getModu() != null && this.getModu()
						.equals(castOther.getModu())))
				&& ((this.getDeld() == castOther.getDeld()) || (this.getDeld() != null
						&& castOther.getDeld() != null && this.getDeld()
						.equals(castOther.getDeld())))
				&& ((this.getDelt() == castOther.getDelt()) || (this.getDelt() != null
						&& castOther.getDelt() != null && this.getDelt()
						.equals(castOther.getDelt())))
				&& ((this.getDelu() == castOther.getDelu()) || (this.getDelu() != null
						&& castOther.getDelu() != null && this.getDelu()
						.equals(castOther.getDelu())))
				&& ((this.getImpd() == castOther.getImpd()) || (this.getImpd() != null
						&& castOther.getImpd() != null && this.getImpd()
						.equals(castOther.getImpd())))
				&& ((this.getImpt() == castOther.getImpt()) || (this.getImpt() != null
						&& castOther.getImpt() != null && this.getImpt()
						.equals(castOther.getImpt())))
				&& ((this.getImpu() == castOther.getImpu()) || (this.getImpu() != null
						&& castOther.getImpu() != null && this.getImpu()
						.equals(castOther.getImpu())))
				&& ((this.getExpd() == castOther.getExpd()) || (this.getExpd() != null
						&& castOther.getExpd() != null && this.getExpd()
						.equals(castOther.getExpd())))
				&& ((this.getExpt() == castOther.getExpt()) || (this.getExpt() != null
						&& castOther.getExpt() != null && this.getExpt()
						.equals(castOther.getExpt())))
				&& ((this.getExpu() == castOther.getExpu()) || (this.getExpu() != null
						&& castOther.getExpu() != null && this.getExpu()
						.equals(castOther.getExpu())))
				&& ((this.getPrimcont2comp() == castOther.getPrimcont2comp()) || (this
						.getPrimcont2comp() != null
						&& castOther.getPrimcont2comp() != null && this
						.getPrimcont2comp()
						.equals(castOther.getPrimcont2comp())))
				&& ((this.getPrimcontactivity() == castOther
						.getPrimcontactivity()) || (this.getPrimcontactivity() != null
						&& castOther.getPrimcontactivity() != null && this
						.getPrimcontactivity().equals(
								castOther.getPrimcontactivity())))
				&& ((this.getActivitytype() == castOther.getActivitytype()) || (this
						.getActivitytype() != null
						&& castOther.getActivitytype() != null && this
						.getActivitytype().equals(castOther.getActivitytype())))
				&& ((this.getPrcstatus() == castOther.getPrcstatus()) || (this
						.getPrcstatus() != null
						&& castOther.getPrcstatus() != null && this
						.getPrcstatus().equals(castOther.getPrcstatus())))
				&& ((this.getPrcstatusTs() == castOther.getPrcstatusTs()) || (this
						.getPrcstatusTs() != null
						&& castOther.getPrcstatusTs() != null && this
						.getPrcstatusTs().equals(castOther.getPrcstatusTs())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getCrd() == null ? 0 : this.getCrd().hashCode());
		result = 37 * result
				+ (getCrt() == null ? 0 : this.getCrt().hashCode());
		result = 37 * result
				+ (getCru() == null ? 0 : this.getCru().hashCode());
		result = 37 * result
				+ (getModd() == null ? 0 : this.getModd().hashCode());
		result = 37 * result
				+ (getModt() == null ? 0 : this.getModt().hashCode());
		result = 37 * result
				+ (getModu() == null ? 0 : this.getModu().hashCode());
		result = 37 * result
				+ (getDeld() == null ? 0 : this.getDeld().hashCode());
		result = 37 * result
				+ (getDelt() == null ? 0 : this.getDelt().hashCode());
		result = 37 * result
				+ (getDelu() == null ? 0 : this.getDelu().hashCode());
		result = 37 * result
				+ (getImpd() == null ? 0 : this.getImpd().hashCode());
		result = 37 * result
				+ (getImpt() == null ? 0 : this.getImpt().hashCode());
		result = 37 * result
				+ (getImpu() == null ? 0 : this.getImpu().hashCode());
		result = 37 * result
				+ (getExpd() == null ? 0 : this.getExpd().hashCode());
		result = 37 * result
				+ (getExpt() == null ? 0 : this.getExpt().hashCode());
		result = 37 * result
				+ (getExpu() == null ? 0 : this.getExpu().hashCode());
		result = 37
				* result
				+ (getPrimcont2comp() == null ? 0 : this.getPrimcont2comp()
						.hashCode());
		result = 37
				* result
				+ (getPrimcontactivity() == null ? 0 : this
						.getPrimcontactivity().hashCode());
		result = 37
				* result
				+ (getActivitytype() == null ? 0 : this.getActivitytype()
						.hashCode());
		result = 37 * result
				+ (getPrcstatus() == null ? 0 : this.getPrcstatus().hashCode());
		result = 37
				* result
				+ (getPrcstatusTs() == null ? 0 : this.getPrcstatusTs()
						.hashCode());
		return result;
	}

}