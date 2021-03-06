package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name = "PRODUCT", schema = "PCRM")
public class Product implements java.io.Serializable {

	private String id;
	private CustomerDrop customerDrop;
	private Actualprice actualprice;
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
	private String primpct;
	private String primdwa;
	private String primanlxg;
	private String instAdresseId;
	private String instLbnr;
	private String cattr1;
	private String cattr2;
	private String cattr3;
	private String cattr4;
	private String cattr5;
	private BigDecimal nattr1;
	private BigDecimal nattr2;
	private BigDecimal nattr3;
	private BigDecimal nattr4;
	private BigDecimal nattr5;
	private Date dattr1;
	private Date dattr2;
	private Date dattr3;
	private Date dattr4;
	private Date dattr5;
	private String sourceSystem;
	private String tmpid;
	private String primfap;
	private String primcompalt;
	private String primproductspec;
	private Long addressid;

	public Product() {
	}

	public Product(String id) {
		this.id = id;
	}

	public Product(String id, CustomerDrop customerDrop,
			Actualprice actualprice, Date crd, Date crt, String cru, Date modd,
			Date modt, String modu, Date deld, Date delt, String delu,
			Date impd, Date impt, String impu, Date expd, Date expt,
			String expu, String primpct, String primdwa, String primanlxg,
			String instAdresseId, String instLbnr, String cattr1,
			String cattr2, String cattr3, String cattr4, String cattr5,
			BigDecimal nattr1, BigDecimal nattr2, BigDecimal nattr3,
			BigDecimal nattr4, BigDecimal nattr5, Date dattr1, Date dattr2,
			Date dattr3, Date dattr4, Date dattr5, String sourceSystem,
			String tmpid, String primfap, String primcompalt,
			String primproductspec, Long addressid) {
		this.id = id;
		this.customerDrop = customerDrop;
		this.actualprice = actualprice;
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
		this.primpct = primpct;
		this.primdwa = primdwa;
		this.primanlxg = primanlxg;
		this.instAdresseId = instAdresseId;
		this.instLbnr = instLbnr;
		this.cattr1 = cattr1;
		this.cattr2 = cattr2;
		this.cattr3 = cattr3;
		this.cattr4 = cattr4;
		this.cattr5 = cattr5;
		this.nattr1 = nattr1;
		this.nattr2 = nattr2;
		this.nattr3 = nattr3;
		this.nattr4 = nattr4;
		this.nattr5 = nattr5;
		this.dattr1 = dattr1;
		this.dattr2 = dattr2;
		this.dattr3 = dattr3;
		this.dattr4 = dattr4;
		this.dattr5 = dattr5;
		this.sourceSystem = sourceSystem;
		this.tmpid = tmpid;
		this.primfap = primfap;
		this.primcompalt = primcompalt;
		this.primproductspec = primproductspec;
		this.addressid = addressid;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 19)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIMCOMP")
	public CustomerDrop getCustomerDrop() {
		return this.customerDrop;
	}

	public void setCustomerDrop(CustomerDrop customerDrop) {
		this.customerDrop = customerDrop;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIMACTUALPRICE")
	public Actualprice getActualprice() {
		return this.actualprice;
	}

	public void setActualprice(Actualprice actualprice) {
		this.actualprice = actualprice;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRD", length = 7)
	public Date getCrd() {
		return this.crd;
	}

	public void setCrd(Date crd) {
		this.crd = crd;
	}

	@Temporal(TemporalType.DATE)
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

	@Temporal(TemporalType.DATE)
	@Column(name = "MODD", length = 7)
	public Date getModd() {
		return this.modd;
	}

	public void setModd(Date modd) {
		this.modd = modd;
	}

	@Temporal(TemporalType.DATE)
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

	@Temporal(TemporalType.DATE)
	@Column(name = "DELD", length = 7)
	public Date getDeld() {
		return this.deld;
	}

	public void setDeld(Date deld) {
		this.deld = deld;
	}

	@Temporal(TemporalType.DATE)
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

	@Temporal(TemporalType.DATE)
	@Column(name = "IMPD", length = 7)
	public Date getImpd() {
		return this.impd;
	}

	public void setImpd(Date impd) {
		this.impd = impd;
	}

	@Temporal(TemporalType.DATE)
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

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPD", length = 7)
	public Date getExpd() {
		return this.expd;
	}

	public void setExpd(Date expd) {
		this.expd = expd;
	}

	@Temporal(TemporalType.DATE)
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

	@Column(name = "PRIMPCT", length = 19)
	public String getPrimpct() {
		return this.primpct;
	}

	public void setPrimpct(String primpct) {
		this.primpct = primpct;
	}

	@Column(name = "PRIMDWA", length = 22)
	public String getPrimdwa() {
		return this.primdwa;
	}

	public void setPrimdwa(String primdwa) {
		this.primdwa = primdwa;
	}

	@Column(name = "PRIMANLXG", length = 19)
	public String getPrimanlxg() {
		return this.primanlxg;
	}

	public void setPrimanlxg(String primanlxg) {
		this.primanlxg = primanlxg;
	}

	@Column(name = "INST_ADRESSE_ID", length = 19)
	public String getInstAdresseId() {
		return this.instAdresseId;
	}

	public void setInstAdresseId(String instAdresseId) {
		this.instAdresseId = instAdresseId;
	}

	@Column(name = "INST_LBNR", length = 19)
	public String getInstLbnr() {
		return this.instLbnr;
	}

	public void setInstLbnr(String instLbnr) {
		this.instLbnr = instLbnr;
	}

	@Column(name = "CATTR1", length = 50)
	public String getCattr1() {
		return this.cattr1;
	}

	public void setCattr1(String cattr1) {
		this.cattr1 = cattr1;
	}

	@Column(name = "CATTR2", length = 50)
	public String getCattr2() {
		return this.cattr2;
	}

	public void setCattr2(String cattr2) {
		this.cattr2 = cattr2;
	}

	@Column(name = "CATTR3", length = 50)
	public String getCattr3() {
		return this.cattr3;
	}

	public void setCattr3(String cattr3) {
		this.cattr3 = cattr3;
	}

	@Column(name = "CATTR4", length = 50)
	public String getCattr4() {
		return this.cattr4;
	}

	public void setCattr4(String cattr4) {
		this.cattr4 = cattr4;
	}

	@Column(name = "CATTR5", length = 50)
	public String getCattr5() {
		return this.cattr5;
	}

	public void setCattr5(String cattr5) {
		this.cattr5 = cattr5;
	}

	@Column(name = "NATTR1", precision = 22, scale = 0)
	public BigDecimal getNattr1() {
		return this.nattr1;
	}

	public void setNattr1(BigDecimal nattr1) {
		this.nattr1 = nattr1;
	}

	@Column(name = "NATTR2", precision = 22, scale = 0)
	public BigDecimal getNattr2() {
		return this.nattr2;
	}

	public void setNattr2(BigDecimal nattr2) {
		this.nattr2 = nattr2;
	}

	@Column(name = "NATTR3", precision = 22, scale = 0)
	public BigDecimal getNattr3() {
		return this.nattr3;
	}

	public void setNattr3(BigDecimal nattr3) {
		this.nattr3 = nattr3;
	}

	@Column(name = "NATTR4", precision = 22, scale = 0)
	public BigDecimal getNattr4() {
		return this.nattr4;
	}

	public void setNattr4(BigDecimal nattr4) {
		this.nattr4 = nattr4;
	}

	@Column(name = "NATTR5", precision = 22, scale = 0)
	public BigDecimal getNattr5() {
		return this.nattr5;
	}

	public void setNattr5(BigDecimal nattr5) {
		this.nattr5 = nattr5;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATTR1", length = 7)
	public Date getDattr1() {
		return this.dattr1;
	}

	public void setDattr1(Date dattr1) {
		this.dattr1 = dattr1;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATTR2", length = 7)
	public Date getDattr2() {
		return this.dattr2;
	}

	public void setDattr2(Date dattr2) {
		this.dattr2 = dattr2;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATTR3", length = 7)
	public Date getDattr3() {
		return this.dattr3;
	}

	public void setDattr3(Date dattr3) {
		this.dattr3 = dattr3;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATTR4", length = 7)
	public Date getDattr4() {
		return this.dattr4;
	}

	public void setDattr4(Date dattr4) {
		this.dattr4 = dattr4;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATTR5", length = 7)
	public Date getDattr5() {
		return this.dattr5;
	}

	public void setDattr5(Date dattr5) {
		this.dattr5 = dattr5;
	}

	@Column(name = "SOURCE_SYSTEM", length = 5)
	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	@Column(name = "TMPID", length = 19)
	public String getTmpid() {
		return this.tmpid;
	}

	public void setTmpid(String tmpid) {
		this.tmpid = tmpid;
	}

	@Column(name = "PRIMFAP", length = 19)
	public String getPrimfap() {
		return this.primfap;
	}

	public void setPrimfap(String primfap) {
		this.primfap = primfap;
	}

	@Column(name = "PRIMCOMPALT", length = 19)
	public String getPrimcompalt() {
		return this.primcompalt;
	}

	public void setPrimcompalt(String primcompalt) {
		this.primcompalt = primcompalt;
	}

	@Column(name = "PRIMPRODUCTSPEC", length = 50)
	public String getPrimproductspec() {
		return this.primproductspec;
	}

	public void setPrimproductspec(String primproductspec) {
		this.primproductspec = primproductspec;
	}

	@Column(name = "ADDRESSID", precision = 10, scale = 0)
	public Long getAddressid() {
		return this.addressid;
	}

	public void setAddressid(Long addressid) {
		this.addressid = addressid;
	}

}
