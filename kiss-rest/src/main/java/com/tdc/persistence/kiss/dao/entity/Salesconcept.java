package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Salesconcept generated by hbm2java
 */
@Entity
@Table(name = "SALESCONCEPT", schema = "PCRM", uniqueConstraints = @UniqueConstraint(columnNames = "ORDER_NUMBER"))
public class Salesconcept implements java.io.Serializable {

	private String id;
	private Topgroup topgroup;
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
	private Character active;
	private String primkontrver;
	private String sourceSystem;
	private BigDecimal sortering;
	private String contentkey;
	private String solutioncode;
	private String solutionhead;
	private Character portalactive;
	private Short bindperiode;
	private Short opsvarsel;
	private String programslocked;
	private String amtsudbud;
	private Character allongetilladt;
	private Long gyldigperiode;
	private String oldcode;
	private Date invalidated;
	private Date startDate;
	private Date endDate;
	private String aftaleomfatter;
	private Integer orderNumber;
	private String tooltip;
	private Character sgportal;
	private Set<CrConceptproductspec> crConceptproductspecs = new HashSet<CrConceptproductspec>(
			0);
	private Set<ContractversionOld> contractversionOlds = new HashSet<ContractversionOld>(
			0);
	private Set<Salesconceptcontlink> salesconceptcontlinks = new HashSet<Salesconceptcontlink>(
			0);
	private Set<Conceptconfig> conceptconfigs = new HashSet<Conceptconfig>(0);
	private Set<Offer> offers = new HashSet<Offer>(0);
	private Set<CrDocorigin2concept> crDocorigin2concepts = new HashSet<CrDocorigin2concept>(
			0);
	private Set<Conceptdocconfig> conceptdocconfigs = new HashSet<Conceptdocconfig>(
			0);

	public Salesconcept() {
	}

	public Salesconcept(String id) {
		this.id = id;
	}

	public Salesconcept(String id, Topgroup topgroup, Date crd, String code,
			Date impt, Date expt, Date impd, Date expd, Date modt, String cru,
			Date delt, Date modd, String impu, String expu, Date deld,
			String modu, String head, String delu, Date crt, Character active,
			String primkontrver, String sourceSystem, BigDecimal sortering,
			String contentkey, String solutioncode, String solutionhead,
			Character portalactive, Short bindperiode, Short opsvarsel,
			String programslocked, String amtsudbud, Character allongetilladt,
			Long gyldigperiode, String oldcode, Date invalidated,
			Date startDate, Date endDate, String aftaleomfatter,
			Integer orderNumber, String tooltip, Character sgportal,
			Set<CrConceptproductspec> crConceptproductspecs,
			Set<ContractversionOld> contractversionOlds,
			Set<Salesconceptcontlink> salesconceptcontlinks,
			Set<Conceptconfig> conceptconfigs, Set<Offer> offers,
			Set<CrDocorigin2concept> crDocorigin2concepts,
			Set<Conceptdocconfig> conceptdocconfigs) {
		this.id = id;
		this.topgroup = topgroup;
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
		this.active = active;
		this.primkontrver = primkontrver;
		this.sourceSystem = sourceSystem;
		this.sortering = sortering;
		this.contentkey = contentkey;
		this.solutioncode = solutioncode;
		this.solutionhead = solutionhead;
		this.portalactive = portalactive;
		this.bindperiode = bindperiode;
		this.opsvarsel = opsvarsel;
		this.programslocked = programslocked;
		this.amtsudbud = amtsudbud;
		this.allongetilladt = allongetilladt;
		this.gyldigperiode = gyldigperiode;
		this.oldcode = oldcode;
		this.invalidated = invalidated;
		this.startDate = startDate;
		this.endDate = endDate;
		this.aftaleomfatter = aftaleomfatter;
		this.orderNumber = orderNumber;
		this.tooltip = tooltip;
		this.sgportal = sgportal;
		this.crConceptproductspecs = crConceptproductspecs;
		this.contractversionOlds = contractversionOlds;
		this.salesconceptcontlinks = salesconceptcontlinks;
		this.conceptconfigs = conceptconfigs;
		this.offers = offers;
		this.crDocorigin2concepts = crDocorigin2concepts;
		this.conceptdocconfigs = conceptdocconfigs;
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
	@JoinColumn(name = "PRIMTOPGRP")
	public Topgroup getTopgroup() {
		return this.topgroup;
	}

	public void setTopgroup(Topgroup topgroup) {
		this.topgroup = topgroup;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRD", length = 7)
	public Date getCrd() {
		return this.crd;
	}

	public void setCrd(Date crd) {
		this.crd = crd;
	}

	@Column(name = "CODE", length = 50)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "IMPT", length = 7)
	public Date getImpt() {
		return this.impt;
	}

	public void setImpt(Date impt) {
		this.impt = impt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPT", length = 7)
	public Date getExpt() {
		return this.expt;
	}

	public void setExpt(Date expt) {
		this.expt = expt;
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
	@Column(name = "EXPD", length = 7)
	public Date getExpd() {
		return this.expd;
	}

	public void setExpd(Date expd) {
		this.expd = expd;
	}

	@Temporal(TemporalType.DATE)
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

	@Temporal(TemporalType.DATE)
	@Column(name = "DELT", length = 7)
	public Date getDelt() {
		return this.delt;
	}

	public void setDelt(Date delt) {
		this.delt = delt;
	}

	@Temporal(TemporalType.DATE)
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

	@Temporal(TemporalType.DATE)
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

	@Temporal(TemporalType.DATE)
	@Column(name = "CRT", length = 7)
	public Date getCrt() {
		return this.crt;
	}

	public void setCrt(Date crt) {
		this.crt = crt;
	}

	@Column(name = "ACTIVE", length = 1)
	public Character getActive() {
		return this.active;
	}

	public void setActive(Character active) {
		this.active = active;
	}

	@Column(name = "PRIMKONTRVER", length = 19)
	public String getPrimkontrver() {
		return this.primkontrver;
	}

	public void setPrimkontrver(String primkontrver) {
		this.primkontrver = primkontrver;
	}

	@Column(name = "SOURCE_SYSTEM", length = 5)
	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	@Column(name = "SORTERING", precision = 22, scale = 0)
	public BigDecimal getSortering() {
		return this.sortering;
	}

	public void setSortering(BigDecimal sortering) {
		this.sortering = sortering;
	}

	@Column(name = "CONTENTKEY", length = 128)
	public String getContentkey() {
		return this.contentkey;
	}

	public void setContentkey(String contentkey) {
		this.contentkey = contentkey;
	}

	@Column(name = "SOLUTIONCODE", length = 50)
	public String getSolutioncode() {
		return this.solutioncode;
	}

	public void setSolutioncode(String solutioncode) {
		this.solutioncode = solutioncode;
	}

	@Column(name = "SOLUTIONHEAD")
	public String getSolutionhead() {
		return this.solutionhead;
	}

	public void setSolutionhead(String solutionhead) {
		this.solutionhead = solutionhead;
	}

	@Column(name = "PORTALACTIVE", length = 1)
	public Character getPortalactive() {
		return this.portalactive;
	}

	public void setPortalactive(Character portalactive) {
		this.portalactive = portalactive;
	}

	@Column(name = "BINDPERIODE", precision = 3, scale = 0)
	public Short getBindperiode() {
		return this.bindperiode;
	}

	public void setBindperiode(Short bindperiode) {
		this.bindperiode = bindperiode;
	}

	@Column(name = "OPSVARSEL", precision = 3, scale = 0)
	public Short getOpsvarsel() {
		return this.opsvarsel;
	}

	public void setOpsvarsel(Short opsvarsel) {
		this.opsvarsel = opsvarsel;
	}

	@Column(name = "PROGRAMSLOCKED", length = 1)
	public String getProgramslocked() {
		return this.programslocked;
	}

	public void setProgramslocked(String programslocked) {
		this.programslocked = programslocked;
	}

	@Column(name = "AMTSUDBUD", length = 1)
	public String getAmtsudbud() {
		return this.amtsudbud;
	}

	public void setAmtsudbud(String amtsudbud) {
		this.amtsudbud = amtsudbud;
	}

	@Column(name = "ALLONGETILLADT", length = 1)
	public Character getAllongetilladt() {
		return this.allongetilladt;
	}

	public void setAllongetilladt(Character allongetilladt) {
		this.allongetilladt = allongetilladt;
	}

	@Column(name = "GYLDIGPERIODE", precision = 10, scale = 0)
	public Long getGyldigperiode() {
		return this.gyldigperiode;
	}

	public void setGyldigperiode(Long gyldigperiode) {
		this.gyldigperiode = gyldigperiode;
	}

	@Column(name = "OLDCODE", length = 50)
	public String getOldcode() {
		return this.oldcode;
	}

	public void setOldcode(String oldcode) {
		this.oldcode = oldcode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INVALIDATED", length = 7)
	public Date getInvalidated() {
		return this.invalidated;
	}

	public void setInvalidated(Date invalidated) {
		this.invalidated = invalidated;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "START_DATE", length = 7)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "END_DATE", length = 7)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "AFTALEOMFATTER", length = 2000)
	public String getAftaleomfatter() {
		return this.aftaleomfatter;
	}

	public void setAftaleomfatter(String aftaleomfatter) {
		this.aftaleomfatter = aftaleomfatter;
	}

	@Column(name = "ORDER_NUMBER", unique = true, precision = 5, scale = 0)
	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Column(name = "TOOLTIP", length = 4000)
	public String getTooltip() {
		return this.tooltip;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

	@Column(name = "SGPORTAL", length = 1)
	public Character getSgportal() {
		return this.sgportal;
	}

	public void setSgportal(Character sgportal) {
		this.sgportal = sgportal;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salesconcept")
	public Set<CrConceptproductspec> getCrConceptproductspecs() {
		return this.crConceptproductspecs;
	}

	public void setCrConceptproductspecs(
			Set<CrConceptproductspec> crConceptproductspecs) {
		this.crConceptproductspecs = crConceptproductspecs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salesconcept")
	public Set<ContractversionOld> getContractversionOlds() {
		return this.contractversionOlds;
	}

	public void setContractversionOlds(
			Set<ContractversionOld> contractversionOlds) {
		this.contractversionOlds = contractversionOlds;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salesconcept")
	public Set<Salesconceptcontlink> getSalesconceptcontlinks() {
		return this.salesconceptcontlinks;
	}

	public void setSalesconceptcontlinks(
			Set<Salesconceptcontlink> salesconceptcontlinks) {
		this.salesconceptcontlinks = salesconceptcontlinks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salesconcept")
	public Set<Conceptconfig> getConceptconfigs() {
		return this.conceptconfigs;
	}

	public void setConceptconfigs(Set<Conceptconfig> conceptconfigs) {
		this.conceptconfigs = conceptconfigs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salesconcept")
	public Set<Offer> getOffers() {
		return this.offers;
	}

	public void setOffers(Set<Offer> offers) {
		this.offers = offers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salesconcept")
	public Set<CrDocorigin2concept> getCrDocorigin2concepts() {
		return this.crDocorigin2concepts;
	}

	public void setCrDocorigin2concepts(
			Set<CrDocorigin2concept> crDocorigin2concepts) {
		this.crDocorigin2concepts = crDocorigin2concepts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salesconcept")
	public Set<Conceptdocconfig> getConceptdocconfigs() {
		return this.conceptdocconfigs;
	}

	public void setConceptdocconfigs(Set<Conceptdocconfig> conceptdocconfigs) {
		this.conceptdocconfigs = conceptdocconfigs;
	}

}
