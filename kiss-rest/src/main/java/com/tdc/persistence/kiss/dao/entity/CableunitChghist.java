package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CableunitChghist generated by hbm2java
 */
@Entity
@Table(name = "CABLEUNIT_CHGHIST", schema = "PCRM")
public class CableunitChghist implements java.io.Serializable {

	private String audId;
	private String audAction;
	private Serializable audTimestamp;
	private String audOsuser;
	private String audDbuser;
	private String audUserterminal;
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
	private String anlAnlaegsnr;
	private String anlAnlaegsnavn;
	private Short anlKommunenr;
	private Boolean anlEjerkode;
	private Boolean anlAdmKode;
	private Boolean anlAnlaegsform;
	private String anlAfleveringspunkt;
	private String anlNoegleboks;
	private Date anlIdriftDato;
	private Date anlForvIdriftDato;
	private Byte anlAnlaegsStatus;
	private String anlSalgskoncept;
	private BigDecimal noInst;
	private BigDecimal noDumInst;
	private Integer primhfinfo;
	private String primanltype;
	private String primarykontrakt;
	private String aflpunkt;
	private String nglboxopsat;
	private String primaryfrekvens;
	private String primkommune;
	private String primanlstatus;
	private String signalforskilde;
	private BigDecimal noInstAbnm;
	private Long pottilsl;
	private Character sloejfe;
	private Character stik;
	private Character nyoprettet;
	private String returfrekvens;
	private String primsegmgroup;
	private String primpostcode;
	private Date REtabldate;
	private Character returvejokfn2;
	private Character returvejokfn3;
	private Character returvejok;
	private BigDecimal anlIHusleje;
	private String primaryklumaxhast;
	private String primaryklulntype;
	private String primaryklulnejer;
	private String primarykluintype;
	private String primarykluaftkap;
	private String primproj;
	private Character voip;
	private Long annr;
	private String primdekoder;
	private String primcompany;
	private Character sourceChgBool;
	private Long leasaar;
	private Date anlDatoinaktiv;
	private Short primmunicipality;
	private Character allowPresale;
	private String logtrace;
	private Character dktv;
	private Integer futureNodeId;
	private Date moveDate;
	private Short ophavsretAar;
	private Date flyttedato;
	private String syncFlag;
	private String lastModifiedBy;
	private Date lastModified;
	private String salesforceId;
	private Character blandSelvChk;
	private String currentCaseNumber;
	private String latestCaseNumber;

	public CableunitChghist() {
	}

	public CableunitChghist(String audId) {
		this.audId = audId;
	}

	public CableunitChghist(String audId, String audAction,
			Serializable audTimestamp, String audOsuser, String audDbuser,
			String audUserterminal, String id, Date crd, Date crt, String cru,
			Date modd, Date modt, String modu, Date deld, Date delt,
			String delu, String anlAnlaegsnr, String anlAnlaegsnavn,
			Short anlKommunenr, Boolean anlEjerkode, Boolean anlAdmKode,
			Boolean anlAnlaegsform, String anlAfleveringspunkt,
			String anlNoegleboks, Date anlIdriftDato, Date anlForvIdriftDato,
			Byte anlAnlaegsStatus, String anlSalgskoncept, BigDecimal noInst,
			BigDecimal noDumInst, Integer primhfinfo, String primanltype,
			String primarykontrakt, String aflpunkt, String nglboxopsat,
			String primaryfrekvens, String primkommune, String primanlstatus,
			String signalforskilde, BigDecimal noInstAbnm, Long pottilsl,
			Character sloejfe, Character stik, Character nyoprettet,
			String returfrekvens, String primsegmgroup, String primpostcode,
			Date REtabldate, Character returvejokfn2, Character returvejokfn3,
			Character returvejok, BigDecimal anlIHusleje,
			String primaryklumaxhast, String primaryklulntype,
			String primaryklulnejer, String primarykluintype,
			String primarykluaftkap, String primproj, Character voip,
			Long annr, String primdekoder, String primcompany,
			Character sourceChgBool, Long leasaar, Date anlDatoinaktiv,
			Short primmunicipality, Character allowPresale, String logtrace,
			Character dktv, Integer futureNodeId, Date moveDate,
			Short ophavsretAar, Date flyttedato, String syncFlag,
			String lastModifiedBy, Date lastModified, String salesforceId,
			Character blandSelvChk, String currentCaseNumber,
			String latestCaseNumber) {
		this.audId = audId;
		this.audAction = audAction;
		this.audTimestamp = audTimestamp;
		this.audOsuser = audOsuser;
		this.audDbuser = audDbuser;
		this.audUserterminal = audUserterminal;
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
		this.anlAnlaegsnr = anlAnlaegsnr;
		this.anlAnlaegsnavn = anlAnlaegsnavn;
		this.anlKommunenr = anlKommunenr;
		this.anlEjerkode = anlEjerkode;
		this.anlAdmKode = anlAdmKode;
		this.anlAnlaegsform = anlAnlaegsform;
		this.anlAfleveringspunkt = anlAfleveringspunkt;
		this.anlNoegleboks = anlNoegleboks;
		this.anlIdriftDato = anlIdriftDato;
		this.anlForvIdriftDato = anlForvIdriftDato;
		this.anlAnlaegsStatus = anlAnlaegsStatus;
		this.anlSalgskoncept = anlSalgskoncept;
		this.noInst = noInst;
		this.noDumInst = noDumInst;
		this.primhfinfo = primhfinfo;
		this.primanltype = primanltype;
		this.primarykontrakt = primarykontrakt;
		this.aflpunkt = aflpunkt;
		this.nglboxopsat = nglboxopsat;
		this.primaryfrekvens = primaryfrekvens;
		this.primkommune = primkommune;
		this.primanlstatus = primanlstatus;
		this.signalforskilde = signalforskilde;
		this.noInstAbnm = noInstAbnm;
		this.pottilsl = pottilsl;
		this.sloejfe = sloejfe;
		this.stik = stik;
		this.nyoprettet = nyoprettet;
		this.returfrekvens = returfrekvens;
		this.primsegmgroup = primsegmgroup;
		this.primpostcode = primpostcode;
		this.REtabldate = REtabldate;
		this.returvejokfn2 = returvejokfn2;
		this.returvejokfn3 = returvejokfn3;
		this.returvejok = returvejok;
		this.anlIHusleje = anlIHusleje;
		this.primaryklumaxhast = primaryklumaxhast;
		this.primaryklulntype = primaryklulntype;
		this.primaryklulnejer = primaryklulnejer;
		this.primarykluintype = primarykluintype;
		this.primarykluaftkap = primarykluaftkap;
		this.primproj = primproj;
		this.voip = voip;
		this.annr = annr;
		this.primdekoder = primdekoder;
		this.primcompany = primcompany;
		this.sourceChgBool = sourceChgBool;
		this.leasaar = leasaar;
		this.anlDatoinaktiv = anlDatoinaktiv;
		this.primmunicipality = primmunicipality;
		this.allowPresale = allowPresale;
		this.logtrace = logtrace;
		this.dktv = dktv;
		this.futureNodeId = futureNodeId;
		this.moveDate = moveDate;
		this.ophavsretAar = ophavsretAar;
		this.flyttedato = flyttedato;
		this.syncFlag = syncFlag;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModified = lastModified;
		this.salesforceId = salesforceId;
		this.blandSelvChk = blandSelvChk;
		this.currentCaseNumber = currentCaseNumber;
		this.latestCaseNumber = latestCaseNumber;
	}

	@Id
	@Column(name = "AUD_ID", unique = true, nullable = false, length = 19)
	public String getAudId() {
		return this.audId;
	}

	public void setAudId(String audId) {
		this.audId = audId;
	}

	@Column(name = "AUD_ACTION", length = 50)
	public String getAudAction() {
		return this.audAction;
	}

	public void setAudAction(String audAction) {
		this.audAction = audAction;
	}

	@Column(name = "AUD_TIMESTAMP")
	public Serializable getAudTimestamp() {
		return this.audTimestamp;
	}

	public void setAudTimestamp(Serializable audTimestamp) {
		this.audTimestamp = audTimestamp;
	}

	@Column(name = "AUD_OSUSER", length = 50)
	public String getAudOsuser() {
		return this.audOsuser;
	}

	public void setAudOsuser(String audOsuser) {
		this.audOsuser = audOsuser;
	}

	@Column(name = "AUD_DBUSER", length = 50)
	public String getAudDbuser() {
		return this.audDbuser;
	}

	public void setAudDbuser(String audDbuser) {
		this.audDbuser = audDbuser;
	}

	@Column(name = "AUD_USERTERMINAL", length = 50)
	public String getAudUserterminal() {
		return this.audUserterminal;
	}

	public void setAudUserterminal(String audUserterminal) {
		this.audUserterminal = audUserterminal;
	}

	@Column(name = "ID", length = 19)
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

	@Column(name = "ANL_ANLAEGSNR", length = 10)
	public String getAnlAnlaegsnr() {
		return this.anlAnlaegsnr;
	}

	public void setAnlAnlaegsnr(String anlAnlaegsnr) {
		this.anlAnlaegsnr = anlAnlaegsnr;
	}

	@Column(name = "ANL_ANLAEGSNAVN")
	public String getAnlAnlaegsnavn() {
		return this.anlAnlaegsnavn;
	}

	public void setAnlAnlaegsnavn(String anlAnlaegsnavn) {
		this.anlAnlaegsnavn = anlAnlaegsnavn;
	}

	@Column(name = "ANL_KOMMUNENR", precision = 3, scale = 0)
	public Short getAnlKommunenr() {
		return this.anlKommunenr;
	}

	public void setAnlKommunenr(Short anlKommunenr) {
		this.anlKommunenr = anlKommunenr;
	}

	@Column(name = "ANL_EJERKODE", precision = 1, scale = 0)
	public Boolean getAnlEjerkode() {
		return this.anlEjerkode;
	}

	public void setAnlEjerkode(Boolean anlEjerkode) {
		this.anlEjerkode = anlEjerkode;
	}

	@Column(name = "ANL_ADM_KODE", precision = 1, scale = 0)
	public Boolean getAnlAdmKode() {
		return this.anlAdmKode;
	}

	public void setAnlAdmKode(Boolean anlAdmKode) {
		this.anlAdmKode = anlAdmKode;
	}

	@Column(name = "ANL_ANLAEGSFORM", precision = 1, scale = 0)
	public Boolean getAnlAnlaegsform() {
		return this.anlAnlaegsform;
	}

	public void setAnlAnlaegsform(Boolean anlAnlaegsform) {
		this.anlAnlaegsform = anlAnlaegsform;
	}

	@Column(name = "ANL_AFLEVERINGSPUNKT", length = 60)
	public String getAnlAfleveringspunkt() {
		return this.anlAfleveringspunkt;
	}

	public void setAnlAfleveringspunkt(String anlAfleveringspunkt) {
		this.anlAfleveringspunkt = anlAfleveringspunkt;
	}

	@Column(name = "ANL_NOEGLEBOKS", length = 60)
	public String getAnlNoegleboks() {
		return this.anlNoegleboks;
	}

	public void setAnlNoegleboks(String anlNoegleboks) {
		this.anlNoegleboks = anlNoegleboks;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ANL_IDRIFT_DATO", length = 7)
	public Date getAnlIdriftDato() {
		return this.anlIdriftDato;
	}

	public void setAnlIdriftDato(Date anlIdriftDato) {
		this.anlIdriftDato = anlIdriftDato;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ANL_FORV_IDRIFT_DATO", length = 7)
	public Date getAnlForvIdriftDato() {
		return this.anlForvIdriftDato;
	}

	public void setAnlForvIdriftDato(Date anlForvIdriftDato) {
		this.anlForvIdriftDato = anlForvIdriftDato;
	}

	@Column(name = "ANL_ANLAEGS_STATUS", precision = 2, scale = 0)
	public Byte getAnlAnlaegsStatus() {
		return this.anlAnlaegsStatus;
	}

	public void setAnlAnlaegsStatus(Byte anlAnlaegsStatus) {
		this.anlAnlaegsStatus = anlAnlaegsStatus;
	}

	@Column(name = "ANL_SALGSKONCEPT", length = 20)
	public String getAnlSalgskoncept() {
		return this.anlSalgskoncept;
	}

	public void setAnlSalgskoncept(String anlSalgskoncept) {
		this.anlSalgskoncept = anlSalgskoncept;
	}

	@Column(name = "NO_INST", precision = 22, scale = 0)
	public BigDecimal getNoInst() {
		return this.noInst;
	}

	public void setNoInst(BigDecimal noInst) {
		this.noInst = noInst;
	}

	@Column(name = "NO_DUM_INST", precision = 22, scale = 0)
	public BigDecimal getNoDumInst() {
		return this.noDumInst;
	}

	public void setNoDumInst(BigDecimal noDumInst) {
		this.noDumInst = noDumInst;
	}

	@Column(name = "PRIMHFINFO", precision = 9, scale = 0)
	public Integer getPrimhfinfo() {
		return this.primhfinfo;
	}

	public void setPrimhfinfo(Integer primhfinfo) {
		this.primhfinfo = primhfinfo;
	}

	@Column(name = "PRIMANLTYPE", length = 19)
	public String getPrimanltype() {
		return this.primanltype;
	}

	public void setPrimanltype(String primanltype) {
		this.primanltype = primanltype;
	}

	@Column(name = "PRIMARYKONTRAKT", length = 19)
	public String getPrimarykontrakt() {
		return this.primarykontrakt;
	}

	public void setPrimarykontrakt(String primarykontrakt) {
		this.primarykontrakt = primarykontrakt;
	}

	@Column(name = "AFLPUNKT")
	public String getAflpunkt() {
		return this.aflpunkt;
	}

	public void setAflpunkt(String aflpunkt) {
		this.aflpunkt = aflpunkt;
	}

	@Column(name = "NGLBOXOPSAT")
	public String getNglboxopsat() {
		return this.nglboxopsat;
	}

	public void setNglboxopsat(String nglboxopsat) {
		this.nglboxopsat = nglboxopsat;
	}

	@Column(name = "PRIMARYFREKVENS", length = 19)
	public String getPrimaryfrekvens() {
		return this.primaryfrekvens;
	}

	public void setPrimaryfrekvens(String primaryfrekvens) {
		this.primaryfrekvens = primaryfrekvens;
	}

	@Column(name = "PRIMKOMMUNE", length = 19)
	public String getPrimkommune() {
		return this.primkommune;
	}

	public void setPrimkommune(String primkommune) {
		this.primkommune = primkommune;
	}

	@Column(name = "PRIMANLSTATUS", length = 19)
	public String getPrimanlstatus() {
		return this.primanlstatus;
	}

	public void setPrimanlstatus(String primanlstatus) {
		this.primanlstatus = primanlstatus;
	}

	@Column(name = "SIGNALFORSKILDE")
	public String getSignalforskilde() {
		return this.signalforskilde;
	}

	public void setSignalforskilde(String signalforskilde) {
		this.signalforskilde = signalforskilde;
	}

	@Column(name = "NO_INST_ABNM", precision = 22, scale = 0)
	public BigDecimal getNoInstAbnm() {
		return this.noInstAbnm;
	}

	public void setNoInstAbnm(BigDecimal noInstAbnm) {
		this.noInstAbnm = noInstAbnm;
	}

	@Column(name = "POTTILSL", precision = 10, scale = 0)
	public Long getPottilsl() {
		return this.pottilsl;
	}

	public void setPottilsl(Long pottilsl) {
		this.pottilsl = pottilsl;
	}

	@Column(name = "SLOEJFE", length = 1)
	public Character getSloejfe() {
		return this.sloejfe;
	}

	public void setSloejfe(Character sloejfe) {
		this.sloejfe = sloejfe;
	}

	@Column(name = "STIK", length = 1)
	public Character getStik() {
		return this.stik;
	}

	public void setStik(Character stik) {
		this.stik = stik;
	}

	@Column(name = "NYOPRETTET", length = 1)
	public Character getNyoprettet() {
		return this.nyoprettet;
	}

	public void setNyoprettet(Character nyoprettet) {
		this.nyoprettet = nyoprettet;
	}

	@Column(name = "RETURFREKVENS", length = 20)
	public String getReturfrekvens() {
		return this.returfrekvens;
	}

	public void setReturfrekvens(String returfrekvens) {
		this.returfrekvens = returfrekvens;
	}

	@Column(name = "PRIMSEGMGROUP", length = 19)
	public String getPrimsegmgroup() {
		return this.primsegmgroup;
	}

	public void setPrimsegmgroup(String primsegmgroup) {
		this.primsegmgroup = primsegmgroup;
	}

	@Column(name = "PRIMPOSTCODE", length = 10)
	public String getPrimpostcode() {
		return this.primpostcode;
	}

	public void setPrimpostcode(String primpostcode) {
		this.primpostcode = primpostcode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "R_ETABLDATE", length = 7)
	public Date getREtabldate() {
		return this.REtabldate;
	}

	public void setREtabldate(Date REtabldate) {
		this.REtabldate = REtabldate;
	}

	@Column(name = "RETURVEJOKFN2", length = 1)
	public Character getReturvejokfn2() {
		return this.returvejokfn2;
	}

	public void setReturvejokfn2(Character returvejokfn2) {
		this.returvejokfn2 = returvejokfn2;
	}

	@Column(name = "RETURVEJOKFN3", length = 1)
	public Character getReturvejokfn3() {
		return this.returvejokfn3;
	}

	public void setReturvejokfn3(Character returvejokfn3) {
		this.returvejokfn3 = returvejokfn3;
	}

	@Column(name = "RETURVEJOK", length = 1)
	public Character getReturvejok() {
		return this.returvejok;
	}

	public void setReturvejok(Character returvejok) {
		this.returvejok = returvejok;
	}

	@Column(name = "ANL_I_HUSLEJE", precision = 22, scale = 0)
	public BigDecimal getAnlIHusleje() {
		return this.anlIHusleje;
	}

	public void setAnlIHusleje(BigDecimal anlIHusleje) {
		this.anlIHusleje = anlIHusleje;
	}

	@Column(name = "PRIMARYKLUMAXHAST", length = 19)
	public String getPrimaryklumaxhast() {
		return this.primaryklumaxhast;
	}

	public void setPrimaryklumaxhast(String primaryklumaxhast) {
		this.primaryklumaxhast = primaryklumaxhast;
	}

	@Column(name = "PRIMARYKLULNTYPE", length = 19)
	public String getPrimaryklulntype() {
		return this.primaryklulntype;
	}

	public void setPrimaryklulntype(String primaryklulntype) {
		this.primaryklulntype = primaryklulntype;
	}

	@Column(name = "PRIMARYKLULNEJER", length = 19)
	public String getPrimaryklulnejer() {
		return this.primaryklulnejer;
	}

	public void setPrimaryklulnejer(String primaryklulnejer) {
		this.primaryklulnejer = primaryklulnejer;
	}

	@Column(name = "PRIMARYKLUINTYPE", length = 19)
	public String getPrimarykluintype() {
		return this.primarykluintype;
	}

	public void setPrimarykluintype(String primarykluintype) {
		this.primarykluintype = primarykluintype;
	}

	@Column(name = "PRIMARYKLUAFTKAP", length = 19)
	public String getPrimarykluaftkap() {
		return this.primarykluaftkap;
	}

	public void setPrimarykluaftkap(String primarykluaftkap) {
		this.primarykluaftkap = primarykluaftkap;
	}

	@Column(name = "PRIMPROJ", length = 19)
	public String getPrimproj() {
		return this.primproj;
	}

	public void setPrimproj(String primproj) {
		this.primproj = primproj;
	}

	@Column(name = "VOIP", length = 1)
	public Character getVoip() {
		return this.voip;
	}

	public void setVoip(Character voip) {
		this.voip = voip;
	}

	@Column(name = "ANNR", precision = 10, scale = 0)
	public Long getAnnr() {
		return this.annr;
	}

	public void setAnnr(Long annr) {
		this.annr = annr;
	}

	@Column(name = "PRIMDEKODER", length = 19)
	public String getPrimdekoder() {
		return this.primdekoder;
	}

	public void setPrimdekoder(String primdekoder) {
		this.primdekoder = primdekoder;
	}

	@Column(name = "PRIMCOMPANY", length = 19)
	public String getPrimcompany() {
		return this.primcompany;
	}

	public void setPrimcompany(String primcompany) {
		this.primcompany = primcompany;
	}

	@Column(name = "SOURCE_CHG_BOOL", length = 1)
	public Character getSourceChgBool() {
		return this.sourceChgBool;
	}

	public void setSourceChgBool(Character sourceChgBool) {
		this.sourceChgBool = sourceChgBool;
	}

	@Column(name = "LEASAAR", precision = 10, scale = 0)
	public Long getLeasaar() {
		return this.leasaar;
	}

	public void setLeasaar(Long leasaar) {
		this.leasaar = leasaar;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ANL_DATOINAKTIV", length = 7)
	public Date getAnlDatoinaktiv() {
		return this.anlDatoinaktiv;
	}

	public void setAnlDatoinaktiv(Date anlDatoinaktiv) {
		this.anlDatoinaktiv = anlDatoinaktiv;
	}

	@Column(name = "PRIMMUNICIPALITY", precision = 3, scale = 0)
	public Short getPrimmunicipality() {
		return this.primmunicipality;
	}

	public void setPrimmunicipality(Short primmunicipality) {
		this.primmunicipality = primmunicipality;
	}

	@Column(name = "ALLOW_PRESALE", length = 1)
	public Character getAllowPresale() {
		return this.allowPresale;
	}

	public void setAllowPresale(Character allowPresale) {
		this.allowPresale = allowPresale;
	}

	@Column(name = "LOGTRACE", length = 19)
	public String getLogtrace() {
		return this.logtrace;
	}

	public void setLogtrace(String logtrace) {
		this.logtrace = logtrace;
	}

	@Column(name = "DKTV", length = 1)
	public Character getDktv() {
		return this.dktv;
	}

	public void setDktv(Character dktv) {
		this.dktv = dktv;
	}

	@Column(name = "FUTURE_NODE_ID", precision = 9, scale = 0)
	public Integer getFutureNodeId() {
		return this.futureNodeId;
	}

	public void setFutureNodeId(Integer futureNodeId) {
		this.futureNodeId = futureNodeId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MOVE_DATE", length = 7)
	public Date getMoveDate() {
		return this.moveDate;
	}

	public void setMoveDate(Date moveDate) {
		this.moveDate = moveDate;
	}

	@Column(name = "OPHAVSRET_AAR", precision = 4, scale = 0)
	public Short getOphavsretAar() {
		return this.ophavsretAar;
	}

	public void setOphavsretAar(Short ophavsretAar) {
		this.ophavsretAar = ophavsretAar;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FLYTTEDATO", length = 7)
	public Date getFlyttedato() {
		return this.flyttedato;
	}

	public void setFlyttedato(Date flyttedato) {
		this.flyttedato = flyttedato;
	}

	@Column(name = "SYNC_FLAG", length = 1)
	public String getSyncFlag() {
		return this.syncFlag;
	}

	public void setSyncFlag(String syncFlag) {
		this.syncFlag = syncFlag;
	}

	@Column(name = "LAST_MODIFIED_BY", length = 15)
	public String getLastModifiedBy() {
		return this.lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LAST_MODIFIED", length = 7)
	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	@Column(name = "SALESFORCE_ID", length = 18)
	public String getSalesforceId() {
		return this.salesforceId;
	}

	public void setSalesforceId(String salesforceId) {
		this.salesforceId = salesforceId;
	}

	@Column(name = "BLAND_SELV_CHK", length = 1)
	public Character getBlandSelvChk() {
		return this.blandSelvChk;
	}

	public void setBlandSelvChk(Character blandSelvChk) {
		this.blandSelvChk = blandSelvChk;
	}

	@Column(name = "CURRENT_CASE_NUMBER", length = 90)
	public String getCurrentCaseNumber() {
		return this.currentCaseNumber;
	}

	public void setCurrentCaseNumber(String currentCaseNumber) {
		this.currentCaseNumber = currentCaseNumber;
	}

	@Column(name = "LATEST_CASE_NUMBER", length = 90)
	public String getLatestCaseNumber() {
		return this.latestCaseNumber;
	}

	public void setLatestCaseNumber(String latestCaseNumber) {
		this.latestCaseNumber = latestCaseNumber;
	}

}