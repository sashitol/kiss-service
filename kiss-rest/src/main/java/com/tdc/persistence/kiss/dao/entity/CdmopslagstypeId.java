package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CdmopslagstypeId generated by hbm2java
 */
@Embeddable
public class CdmopslagstypeId implements java.io.Serializable {

	private String id;
	private Date crd;
	private String code;
	private Date impt;
	private Date expt;
	private Date impd;
	private Date expd;
	private Date modt;
	private String cru;
	private Date delt;
	private Date modd;
	private String impu;
	private String expu;
	private Date deld;
	private String modu;
	private String head;
	private String delu;
	private Date crt;
	private Character multiplechoice;
	private Long rebmun;

	public CdmopslagstypeId() {
	}

	public CdmopslagstypeId(String id, Date crd, String code, Date impt,
			Date expt, Date impd, Date expd, Date modt, String cru, Date delt,
			Date modd, String impu, String expu, Date deld, String modu,
			String head, String delu, Date crt, Character multiplechoice,
			Long rebmun) {
		this.id = id;
		this.crd = crd;
		this.code = code;
		this.impt = impt;
		this.expt = expt;
		this.impd = impd;
		this.expd = expd;
		this.modt = modt;
		this.cru = cru;
		this.delt = delt;
		this.modd = modd;
		this.impu = impu;
		this.expu = expu;
		this.deld = deld;
		this.modu = modu;
		this.head = head;
		this.delu = delu;
		this.crt = crt;
		this.multiplechoice = multiplechoice;
		this.rebmun = rebmun;
	}

	@Column(name = "ID", length = 19)
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

	@Column(name = "CODE")
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "IMPT", length = 7)
	public Date getImpt() {
		return this.impt;
	}

	public void setImpt(Date impt) {
		this.impt = impt;
	}

	@Column(name = "EXPT", length = 7)
	public Date getExpt() {
		return this.expt;
	}

	public void setExpt(Date expt) {
		this.expt = expt;
	}

	@Column(name = "IMPD", length = 7)
	public Date getImpd() {
		return this.impd;
	}

	public void setImpd(Date impd) {
		this.impd = impd;
	}

	@Column(name = "EXPD", length = 7)
	public Date getExpd() {
		return this.expd;
	}

	public void setExpd(Date expd) {
		this.expd = expd;
	}

	@Column(name = "MODT", length = 7)
	public Date getModt() {
		return this.modt;
	}

	public void setModt(Date modt) {
		this.modt = modt;
	}

	@Column(name = "CRU", length = 19)
	public String getCru() {
		return this.cru;
	}

	public void setCru(String cru) {
		this.cru = cru;
	}

	@Column(name = "DELT", length = 7)
	public Date getDelt() {
		return this.delt;
	}

	public void setDelt(Date delt) {
		this.delt = delt;
	}

	@Column(name = "MODD", length = 7)
	public Date getModd() {
		return this.modd;
	}

	public void setModd(Date modd) {
		this.modd = modd;
	}

	@Column(name = "IMPU", length = 19)
	public String getImpu() {
		return this.impu;
	}

	public void setImpu(String impu) {
		this.impu = impu;
	}

	@Column(name = "EXPU", length = 19)
	public String getExpu() {
		return this.expu;
	}

	public void setExpu(String expu) {
		this.expu = expu;
	}

	@Column(name = "DELD", length = 7)
	public Date getDeld() {
		return this.deld;
	}

	public void setDeld(Date deld) {
		this.deld = deld;
	}

	@Column(name = "MODU", length = 19)
	public String getModu() {
		return this.modu;
	}

	public void setModu(String modu) {
		this.modu = modu;
	}

	@Column(name = "HEAD")
	public String getHead() {
		return this.head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	@Column(name = "DELU", length = 19)
	public String getDelu() {
		return this.delu;
	}

	public void setDelu(String delu) {
		this.delu = delu;
	}

	@Column(name = "CRT", length = 7)
	public Date getCrt() {
		return this.crt;
	}

	public void setCrt(Date crt) {
		this.crt = crt;
	}

	@Column(name = "MULTIPLECHOICE", length = 1)
	public Character getMultiplechoice() {
		return this.multiplechoice;
	}

	public void setMultiplechoice(Character multiplechoice) {
		this.multiplechoice = multiplechoice;
	}

	@Column(name = "REBMUN", precision = 10, scale = 0)
	public Long getRebmun() {
		return this.rebmun;
	}

	public void setRebmun(Long rebmun) {
		this.rebmun = rebmun;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CdmopslagstypeId))
			return false;
		CdmopslagstypeId castOther = (CdmopslagstypeId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getCrd() == castOther.getCrd()) || (this.getCrd() != null
						&& castOther.getCrd() != null && this.getCrd().equals(
						castOther.getCrd())))
				&& ((this.getCode() == castOther.getCode()) || (this.getCode() != null
						&& castOther.getCode() != null && this.getCode()
						.equals(castOther.getCode())))
				&& ((this.getImpt() == castOther.getImpt()) || (this.getImpt() != null
						&& castOther.getImpt() != null && this.getImpt()
						.equals(castOther.getImpt())))
				&& ((this.getExpt() == castOther.getExpt()) || (this.getExpt() != null
						&& castOther.getExpt() != null && this.getExpt()
						.equals(castOther.getExpt())))
				&& ((this.getImpd() == castOther.getImpd()) || (this.getImpd() != null
						&& castOther.getImpd() != null && this.getImpd()
						.equals(castOther.getImpd())))
				&& ((this.getExpd() == castOther.getExpd()) || (this.getExpd() != null
						&& castOther.getExpd() != null && this.getExpd()
						.equals(castOther.getExpd())))
				&& ((this.getModt() == castOther.getModt()) || (this.getModt() != null
						&& castOther.getModt() != null && this.getModt()
						.equals(castOther.getModt())))
				&& ((this.getCru() == castOther.getCru()) || (this.getCru() != null
						&& castOther.getCru() != null && this.getCru().equals(
						castOther.getCru())))
				&& ((this.getDelt() == castOther.getDelt()) || (this.getDelt() != null
						&& castOther.getDelt() != null && this.getDelt()
						.equals(castOther.getDelt())))
				&& ((this.getModd() == castOther.getModd()) || (this.getModd() != null
						&& castOther.getModd() != null && this.getModd()
						.equals(castOther.getModd())))
				&& ((this.getImpu() == castOther.getImpu()) || (this.getImpu() != null
						&& castOther.getImpu() != null && this.getImpu()
						.equals(castOther.getImpu())))
				&& ((this.getExpu() == castOther.getExpu()) || (this.getExpu() != null
						&& castOther.getExpu() != null && this.getExpu()
						.equals(castOther.getExpu())))
				&& ((this.getDeld() == castOther.getDeld()) || (this.getDeld() != null
						&& castOther.getDeld() != null && this.getDeld()
						.equals(castOther.getDeld())))
				&& ((this.getModu() == castOther.getModu()) || (this.getModu() != null
						&& castOther.getModu() != null && this.getModu()
						.equals(castOther.getModu())))
				&& ((this.getHead() == castOther.getHead()) || (this.getHead() != null
						&& castOther.getHead() != null && this.getHead()
						.equals(castOther.getHead())))
				&& ((this.getDelu() == castOther.getDelu()) || (this.getDelu() != null
						&& castOther.getDelu() != null && this.getDelu()
						.equals(castOther.getDelu())))
				&& ((this.getCrt() == castOther.getCrt()) || (this.getCrt() != null
						&& castOther.getCrt() != null && this.getCrt().equals(
						castOther.getCrt())))
				&& ((this.getMultiplechoice() == castOther.getMultiplechoice()) || (this
						.getMultiplechoice() != null
						&& castOther.getMultiplechoice() != null && this
						.getMultiplechoice().equals(
								castOther.getMultiplechoice())))
				&& ((this.getRebmun() == castOther.getRebmun()) || (this
						.getRebmun() != null && castOther.getRebmun() != null && this
						.getRebmun().equals(castOther.getRebmun())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getCrd() == null ? 0 : this.getCrd().hashCode());
		result = 37 * result
				+ (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result
				+ (getImpt() == null ? 0 : this.getImpt().hashCode());
		result = 37 * result
				+ (getExpt() == null ? 0 : this.getExpt().hashCode());
		result = 37 * result
				+ (getImpd() == null ? 0 : this.getImpd().hashCode());
		result = 37 * result
				+ (getExpd() == null ? 0 : this.getExpd().hashCode());
		result = 37 * result
				+ (getModt() == null ? 0 : this.getModt().hashCode());
		result = 37 * result
				+ (getCru() == null ? 0 : this.getCru().hashCode());
		result = 37 * result
				+ (getDelt() == null ? 0 : this.getDelt().hashCode());
		result = 37 * result
				+ (getModd() == null ? 0 : this.getModd().hashCode());
		result = 37 * result
				+ (getImpu() == null ? 0 : this.getImpu().hashCode());
		result = 37 * result
				+ (getExpu() == null ? 0 : this.getExpu().hashCode());
		result = 37 * result
				+ (getDeld() == null ? 0 : this.getDeld().hashCode());
		result = 37 * result
				+ (getModu() == null ? 0 : this.getModu().hashCode());
		result = 37 * result
				+ (getHead() == null ? 0 : this.getHead().hashCode());
		result = 37 * result
				+ (getDelu() == null ? 0 : this.getDelu().hashCode());
		result = 37 * result
				+ (getCrt() == null ? 0 : this.getCrt().hashCode());
		result = 37
				* result
				+ (getMultiplechoice() == null ? 0 : this.getMultiplechoice()
						.hashCode());
		result = 37 * result
				+ (getRebmun() == null ? 0 : this.getRebmun().hashCode());
		return result;
	}

}