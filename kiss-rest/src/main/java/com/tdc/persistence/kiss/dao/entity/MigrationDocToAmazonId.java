package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MigrationDocToAmazonId generated by hbm2java
 */
@Embeddable
public class MigrationDocToAmazonId implements java.io.Serializable {

	private Serializable id;
	private Serializable fileName;
	private Serializable fullname;
	private Serializable idrivepath;
	private Serializable bucketName;
	private Serializable pathprefix;
	private Serializable cableunitno;
	private Serializable caseno;
	private Serializable customerNumber;
	private Serializable constructionProjectNumber;
	private Serializable constrHierarchyNumber;
	private Serializable sfid;
	private Serializable headendnumber;
	private Serializable contentSize;
	private Serializable fileSizeMb;
	private Serializable timestampcol;
	private Serializable version;
	private Serializable contentType;
	private Serializable fileLabel;
	private Serializable kissDoctype;
	private Serializable centaDocCategory;
	private Serializable centaDoctype;
	private Serializable documentId;
	private Serializable extension;
	private Serializable offerid;
	private Serializable supplierrequestid;
	private Serializable mid;
	private Serializable department;
	private Serializable created;
	private Serializable crd;
	private Serializable lastmodifieddate;
	private Serializable modd;
	private Serializable docremark;
	private Serializable systemid;
	private Serializable amazonpath;
	private Serializable transferstatus;
	private Serializable description;
	private Serializable isactive;
	private Serializable access;

	public MigrationDocToAmazonId() {
	}

	public MigrationDocToAmazonId(Serializable id, Serializable fileName,
			Serializable fullname, Serializable idrivepath,
			Serializable bucketName, Serializable pathprefix,
			Serializable cableunitno, Serializable caseno,
			Serializable customerNumber,
			Serializable constructionProjectNumber,
			Serializable constrHierarchyNumber, Serializable sfid,
			Serializable headendnumber, Serializable contentSize,
			Serializable fileSizeMb, Serializable timestampcol,
			Serializable version, Serializable contentType,
			Serializable fileLabel, Serializable kissDoctype,
			Serializable centaDocCategory, Serializable centaDoctype,
			Serializable documentId, Serializable extension,
			Serializable offerid, Serializable supplierrequestid,
			Serializable mid, Serializable department, Serializable created,
			Serializable crd, Serializable lastmodifieddate, Serializable modd,
			Serializable docremark, Serializable systemid,
			Serializable amazonpath, Serializable transferstatus,
			Serializable description, Serializable isactive, Serializable access) {
		this.id = id;
		this.fileName = fileName;
		this.fullname = fullname;
		this.idrivepath = idrivepath;
		this.bucketName = bucketName;
		this.pathprefix = pathprefix;
		this.cableunitno = cableunitno;
		this.caseno = caseno;
		this.customerNumber = customerNumber;
		this.constructionProjectNumber = constructionProjectNumber;
		this.constrHierarchyNumber = constrHierarchyNumber;
		this.sfid = sfid;
		this.headendnumber = headendnumber;
		this.contentSize = contentSize;
		this.fileSizeMb = fileSizeMb;
		this.timestampcol = timestampcol;
		this.version = version;
		this.contentType = contentType;
		this.fileLabel = fileLabel;
		this.kissDoctype = kissDoctype;
		this.centaDocCategory = centaDocCategory;
		this.centaDoctype = centaDoctype;
		this.documentId = documentId;
		this.extension = extension;
		this.offerid = offerid;
		this.supplierrequestid = supplierrequestid;
		this.mid = mid;
		this.department = department;
		this.created = created;
		this.crd = crd;
		this.lastmodifieddate = lastmodifieddate;
		this.modd = modd;
		this.docremark = docremark;
		this.systemid = systemid;
		this.amazonpath = amazonpath;
		this.transferstatus = transferstatus;
		this.description = description;
		this.isactive = isactive;
		this.access = access;
	}

	@Column(name = "ID")
	public Serializable getId() {
		return this.id;
	}

	public void setId(Serializable id) {
		this.id = id;
	}

	@Column(name = "FILE_NAME")
	public Serializable getFileName() {
		return this.fileName;
	}

	public void setFileName(Serializable fileName) {
		this.fileName = fileName;
	}

	@Column(name = "FULLNAME")
	public Serializable getFullname() {
		return this.fullname;
	}

	public void setFullname(Serializable fullname) {
		this.fullname = fullname;
	}

	@Column(name = "IDRIVEPATH")
	public Serializable getIdrivepath() {
		return this.idrivepath;
	}

	public void setIdrivepath(Serializable idrivepath) {
		this.idrivepath = idrivepath;
	}

	@Column(name = "BUCKET_NAME")
	public Serializable getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(Serializable bucketName) {
		this.bucketName = bucketName;
	}

	@Column(name = "PATHPREFIX")
	public Serializable getPathprefix() {
		return this.pathprefix;
	}

	public void setPathprefix(Serializable pathprefix) {
		this.pathprefix = pathprefix;
	}

	@Column(name = "CABLEUNITNO")
	public Serializable getCableunitno() {
		return this.cableunitno;
	}

	public void setCableunitno(Serializable cableunitno) {
		this.cableunitno = cableunitno;
	}

	@Column(name = "CASENO")
	public Serializable getCaseno() {
		return this.caseno;
	}

	public void setCaseno(Serializable caseno) {
		this.caseno = caseno;
	}

	@Column(name = "CUSTOMER_NUMBER")
	public Serializable getCustomerNumber() {
		return this.customerNumber;
	}

	public void setCustomerNumber(Serializable customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Column(name = "CONSTRUCTION_PROJECT_NUMBER")
	public Serializable getConstructionProjectNumber() {
		return this.constructionProjectNumber;
	}

	public void setConstructionProjectNumber(
			Serializable constructionProjectNumber) {
		this.constructionProjectNumber = constructionProjectNumber;
	}

	@Column(name = "CONSTR_HIERARCHY_NUMBER")
	public Serializable getConstrHierarchyNumber() {
		return this.constrHierarchyNumber;
	}

	public void setConstrHierarchyNumber(Serializable constrHierarchyNumber) {
		this.constrHierarchyNumber = constrHierarchyNumber;
	}

	@Column(name = "SFID")
	public Serializable getSfid() {
		return this.sfid;
	}

	public void setSfid(Serializable sfid) {
		this.sfid = sfid;
	}

	@Column(name = "HEADENDNUMBER")
	public Serializable getHeadendnumber() {
		return this.headendnumber;
	}

	public void setHeadendnumber(Serializable headendnumber) {
		this.headendnumber = headendnumber;
	}

	@Column(name = "CONTENT_SIZE")
	public Serializable getContentSize() {
		return this.contentSize;
	}

	public void setContentSize(Serializable contentSize) {
		this.contentSize = contentSize;
	}

	@Column(name = "FILE_SIZE_MB")
	public Serializable getFileSizeMb() {
		return this.fileSizeMb;
	}

	public void setFileSizeMb(Serializable fileSizeMb) {
		this.fileSizeMb = fileSizeMb;
	}

	@Column(name = "TIMESTAMPCOL")
	public Serializable getTimestampcol() {
		return this.timestampcol;
	}

	public void setTimestampcol(Serializable timestampcol) {
		this.timestampcol = timestampcol;
	}

	@Column(name = "VERSION")
	public Serializable getVersion() {
		return this.version;
	}

	public void setVersion(Serializable version) {
		this.version = version;
	}

	@Column(name = "CONTENT_TYPE")
	public Serializable getContentType() {
		return this.contentType;
	}

	public void setContentType(Serializable contentType) {
		this.contentType = contentType;
	}

	@Column(name = "FILE_LABEL")
	public Serializable getFileLabel() {
		return this.fileLabel;
	}

	public void setFileLabel(Serializable fileLabel) {
		this.fileLabel = fileLabel;
	}

	@Column(name = "KISS_DOCTYPE")
	public Serializable getKissDoctype() {
		return this.kissDoctype;
	}

	public void setKissDoctype(Serializable kissDoctype) {
		this.kissDoctype = kissDoctype;
	}

	@Column(name = "CENTA_DOC_CATEGORY")
	public Serializable getCentaDocCategory() {
		return this.centaDocCategory;
	}

	public void setCentaDocCategory(Serializable centaDocCategory) {
		this.centaDocCategory = centaDocCategory;
	}

	@Column(name = "CENTA_DOCTYPE")
	public Serializable getCentaDoctype() {
		return this.centaDoctype;
	}

	public void setCentaDoctype(Serializable centaDoctype) {
		this.centaDoctype = centaDoctype;
	}

	@Column(name = "DOCUMENT_ID")
	public Serializable getDocumentId() {
		return this.documentId;
	}

	public void setDocumentId(Serializable documentId) {
		this.documentId = documentId;
	}

	@Column(name = "EXTENSION")
	public Serializable getExtension() {
		return this.extension;
	}

	public void setExtension(Serializable extension) {
		this.extension = extension;
	}

	@Column(name = "OFFERID")
	public Serializable getOfferid() {
		return this.offerid;
	}

	public void setOfferid(Serializable offerid) {
		this.offerid = offerid;
	}

	@Column(name = "SUPPLIERREQUESTID")
	public Serializable getSupplierrequestid() {
		return this.supplierrequestid;
	}

	public void setSupplierrequestid(Serializable supplierrequestid) {
		this.supplierrequestid = supplierrequestid;
	}

	@Column(name = "MID")
	public Serializable getMid() {
		return this.mid;
	}

	public void setMid(Serializable mid) {
		this.mid = mid;
	}

	@Column(name = "DEPARTMENT")
	public Serializable getDepartment() {
		return this.department;
	}

	public void setDepartment(Serializable department) {
		this.department = department;
	}

	@Column(name = "CREATED")
	public Serializable getCreated() {
		return this.created;
	}

	public void setCreated(Serializable created) {
		this.created = created;
	}

	@Column(name = "CRD")
	public Serializable getCrd() {
		return this.crd;
	}

	public void setCrd(Serializable crd) {
		this.crd = crd;
	}

	@Column(name = "LASTMODIFIEDDATE")
	public Serializable getLastmodifieddate() {
		return this.lastmodifieddate;
	}

	public void setLastmodifieddate(Serializable lastmodifieddate) {
		this.lastmodifieddate = lastmodifieddate;
	}

	@Column(name = "MODD")
	public Serializable getModd() {
		return this.modd;
	}

	public void setModd(Serializable modd) {
		this.modd = modd;
	}

	@Column(name = "DOCREMARK")
	public Serializable getDocremark() {
		return this.docremark;
	}

	public void setDocremark(Serializable docremark) {
		this.docremark = docremark;
	}

	@Column(name = "SYSTEMID")
	public Serializable getSystemid() {
		return this.systemid;
	}

	public void setSystemid(Serializable systemid) {
		this.systemid = systemid;
	}

	@Column(name = "AMAZONPATH")
	public Serializable getAmazonpath() {
		return this.amazonpath;
	}

	public void setAmazonpath(Serializable amazonpath) {
		this.amazonpath = amazonpath;
	}

	@Column(name = "TRANSFERSTATUS")
	public Serializable getTransferstatus() {
		return this.transferstatus;
	}

	public void setTransferstatus(Serializable transferstatus) {
		this.transferstatus = transferstatus;
	}

	@Column(name = "DESCRIPTION")
	public Serializable getDescription() {
		return this.description;
	}

	public void setDescription(Serializable description) {
		this.description = description;
	}

	@Column(name = "ISACTIVE")
	public Serializable getIsactive() {
		return this.isactive;
	}

	public void setIsactive(Serializable isactive) {
		this.isactive = isactive;
	}

	@Column(name = "ACCESS")
	public Serializable getAccess() {
		return this.access;
	}

	public void setAccess(Serializable access) {
		this.access = access;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MigrationDocToAmazonId))
			return false;
		MigrationDocToAmazonId castOther = (MigrationDocToAmazonId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getFileName() == castOther.getFileName()) || (this
						.getFileName() != null
						&& castOther.getFileName() != null && this
						.getFileName().equals(castOther.getFileName())))
				&& ((this.getFullname() == castOther.getFullname()) || (this
						.getFullname() != null
						&& castOther.getFullname() != null && this
						.getFullname().equals(castOther.getFullname())))
				&& ((this.getIdrivepath() == castOther.getIdrivepath()) || (this
						.getIdrivepath() != null
						&& castOther.getIdrivepath() != null && this
						.getIdrivepath().equals(castOther.getIdrivepath())))
				&& ((this.getBucketName() == castOther.getBucketName()) || (this
						.getBucketName() != null
						&& castOther.getBucketName() != null && this
						.getBucketName().equals(castOther.getBucketName())))
				&& ((this.getPathprefix() == castOther.getPathprefix()) || (this
						.getPathprefix() != null
						&& castOther.getPathprefix() != null && this
						.getPathprefix().equals(castOther.getPathprefix())))
				&& ((this.getCableunitno() == castOther.getCableunitno()) || (this
						.getCableunitno() != null
						&& castOther.getCableunitno() != null && this
						.getCableunitno().equals(castOther.getCableunitno())))
				&& ((this.getCaseno() == castOther.getCaseno()) || (this
						.getCaseno() != null && castOther.getCaseno() != null && this
						.getCaseno().equals(castOther.getCaseno())))
				&& ((this.getCustomerNumber() == castOther.getCustomerNumber()) || (this
						.getCustomerNumber() != null
						&& castOther.getCustomerNumber() != null && this
						.getCustomerNumber().equals(
								castOther.getCustomerNumber())))
				&& ((this.getConstructionProjectNumber() == castOther
						.getConstructionProjectNumber()) || (this
						.getConstructionProjectNumber() != null
						&& castOther.getConstructionProjectNumber() != null && this
						.getConstructionProjectNumber().equals(
								castOther.getConstructionProjectNumber())))
				&& ((this.getConstrHierarchyNumber() == castOther
						.getConstrHierarchyNumber()) || (this
						.getConstrHierarchyNumber() != null
						&& castOther.getConstrHierarchyNumber() != null && this
						.getConstrHierarchyNumber().equals(
								castOther.getConstrHierarchyNumber())))
				&& ((this.getSfid() == castOther.getSfid()) || (this.getSfid() != null
						&& castOther.getSfid() != null && this.getSfid()
						.equals(castOther.getSfid())))
				&& ((this.getHeadendnumber() == castOther.getHeadendnumber()) || (this
						.getHeadendnumber() != null
						&& castOther.getHeadendnumber() != null && this
						.getHeadendnumber()
						.equals(castOther.getHeadendnumber())))
				&& ((this.getContentSize() == castOther.getContentSize()) || (this
						.getContentSize() != null
						&& castOther.getContentSize() != null && this
						.getContentSize().equals(castOther.getContentSize())))
				&& ((this.getFileSizeMb() == castOther.getFileSizeMb()) || (this
						.getFileSizeMb() != null
						&& castOther.getFileSizeMb() != null && this
						.getFileSizeMb().equals(castOther.getFileSizeMb())))
				&& ((this.getTimestampcol() == castOther.getTimestampcol()) || (this
						.getTimestampcol() != null
						&& castOther.getTimestampcol() != null && this
						.getTimestampcol().equals(castOther.getTimestampcol())))
				&& ((this.getVersion() == castOther.getVersion()) || (this
						.getVersion() != null && castOther.getVersion() != null && this
						.getVersion().equals(castOther.getVersion())))
				&& ((this.getContentType() == castOther.getContentType()) || (this
						.getContentType() != null
						&& castOther.getContentType() != null && this
						.getContentType().equals(castOther.getContentType())))
				&& ((this.getFileLabel() == castOther.getFileLabel()) || (this
						.getFileLabel() != null
						&& castOther.getFileLabel() != null && this
						.getFileLabel().equals(castOther.getFileLabel())))
				&& ((this.getKissDoctype() == castOther.getKissDoctype()) || (this
						.getKissDoctype() != null
						&& castOther.getKissDoctype() != null && this
						.getKissDoctype().equals(castOther.getKissDoctype())))
				&& ((this.getCentaDocCategory() == castOther
						.getCentaDocCategory()) || (this.getCentaDocCategory() != null
						&& castOther.getCentaDocCategory() != null && this
						.getCentaDocCategory().equals(
								castOther.getCentaDocCategory())))
				&& ((this.getCentaDoctype() == castOther.getCentaDoctype()) || (this
						.getCentaDoctype() != null
						&& castOther.getCentaDoctype() != null && this
						.getCentaDoctype().equals(castOther.getCentaDoctype())))
				&& ((this.getDocumentId() == castOther.getDocumentId()) || (this
						.getDocumentId() != null
						&& castOther.getDocumentId() != null && this
						.getDocumentId().equals(castOther.getDocumentId())))
				&& ((this.getExtension() == castOther.getExtension()) || (this
						.getExtension() != null
						&& castOther.getExtension() != null && this
						.getExtension().equals(castOther.getExtension())))
				&& ((this.getOfferid() == castOther.getOfferid()) || (this
						.getOfferid() != null && castOther.getOfferid() != null && this
						.getOfferid().equals(castOther.getOfferid())))
				&& ((this.getSupplierrequestid() == castOther
						.getSupplierrequestid()) || (this
						.getSupplierrequestid() != null
						&& castOther.getSupplierrequestid() != null && this
						.getSupplierrequestid().equals(
								castOther.getSupplierrequestid())))
				&& ((this.getMid() == castOther.getMid()) || (this.getMid() != null
						&& castOther.getMid() != null && this.getMid().equals(
						castOther.getMid())))
				&& ((this.getDepartment() == castOther.getDepartment()) || (this
						.getDepartment() != null
						&& castOther.getDepartment() != null && this
						.getDepartment().equals(castOther.getDepartment())))
				&& ((this.getCreated() == castOther.getCreated()) || (this
						.getCreated() != null && castOther.getCreated() != null && this
						.getCreated().equals(castOther.getCreated())))
				&& ((this.getCrd() == castOther.getCrd()) || (this.getCrd() != null
						&& castOther.getCrd() != null && this.getCrd().equals(
						castOther.getCrd())))
				&& ((this.getLastmodifieddate() == castOther
						.getLastmodifieddate()) || (this.getLastmodifieddate() != null
						&& castOther.getLastmodifieddate() != null && this
						.getLastmodifieddate().equals(
								castOther.getLastmodifieddate())))
				&& ((this.getModd() == castOther.getModd()) || (this.getModd() != null
						&& castOther.getModd() != null && this.getModd()
						.equals(castOther.getModd())))
				&& ((this.getDocremark() == castOther.getDocremark()) || (this
						.getDocremark() != null
						&& castOther.getDocremark() != null && this
						.getDocremark().equals(castOther.getDocremark())))
				&& ((this.getSystemid() == castOther.getSystemid()) || (this
						.getSystemid() != null
						&& castOther.getSystemid() != null && this
						.getSystemid().equals(castOther.getSystemid())))
				&& ((this.getAmazonpath() == castOther.getAmazonpath()) || (this
						.getAmazonpath() != null
						&& castOther.getAmazonpath() != null && this
						.getAmazonpath().equals(castOther.getAmazonpath())))
				&& ((this.getTransferstatus() == castOther.getTransferstatus()) || (this
						.getTransferstatus() != null
						&& castOther.getTransferstatus() != null && this
						.getTransferstatus().equals(
								castOther.getTransferstatus())))
				&& ((this.getDescription() == castOther.getDescription()) || (this
						.getDescription() != null
						&& castOther.getDescription() != null && this
						.getDescription().equals(castOther.getDescription())))
				&& ((this.getIsactive() == castOther.getIsactive()) || (this
						.getIsactive() != null
						&& castOther.getIsactive() != null && this
						.getIsactive().equals(castOther.getIsactive())))
				&& ((this.getAccess() == castOther.getAccess()) || (this
						.getAccess() != null && castOther.getAccess() != null && this
						.getAccess().equals(castOther.getAccess())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getFileName() == null ? 0 : this.getFileName().hashCode());
		result = 37 * result
				+ (getFullname() == null ? 0 : this.getFullname().hashCode());
		result = 37
				* result
				+ (getIdrivepath() == null ? 0 : this.getIdrivepath()
						.hashCode());
		result = 37
				* result
				+ (getBucketName() == null ? 0 : this.getBucketName()
						.hashCode());
		result = 37
				* result
				+ (getPathprefix() == null ? 0 : this.getPathprefix()
						.hashCode());
		result = 37
				* result
				+ (getCableunitno() == null ? 0 : this.getCableunitno()
						.hashCode());
		result = 37 * result
				+ (getCaseno() == null ? 0 : this.getCaseno().hashCode());
		result = 37
				* result
				+ (getCustomerNumber() == null ? 0 : this.getCustomerNumber()
						.hashCode());
		result = 37
				* result
				+ (getConstructionProjectNumber() == null ? 0 : this
						.getConstructionProjectNumber().hashCode());
		result = 37
				* result
				+ (getConstrHierarchyNumber() == null ? 0 : this
						.getConstrHierarchyNumber().hashCode());
		result = 37 * result
				+ (getSfid() == null ? 0 : this.getSfid().hashCode());
		result = 37
				* result
				+ (getHeadendnumber() == null ? 0 : this.getHeadendnumber()
						.hashCode());
		result = 37
				* result
				+ (getContentSize() == null ? 0 : this.getContentSize()
						.hashCode());
		result = 37
				* result
				+ (getFileSizeMb() == null ? 0 : this.getFileSizeMb()
						.hashCode());
		result = 37
				* result
				+ (getTimestampcol() == null ? 0 : this.getTimestampcol()
						.hashCode());
		result = 37 * result
				+ (getVersion() == null ? 0 : this.getVersion().hashCode());
		result = 37
				* result
				+ (getContentType() == null ? 0 : this.getContentType()
						.hashCode());
		result = 37 * result
				+ (getFileLabel() == null ? 0 : this.getFileLabel().hashCode());
		result = 37
				* result
				+ (getKissDoctype() == null ? 0 : this.getKissDoctype()
						.hashCode());
		result = 37
				* result
				+ (getCentaDocCategory() == null ? 0 : this
						.getCentaDocCategory().hashCode());
		result = 37
				* result
				+ (getCentaDoctype() == null ? 0 : this.getCentaDoctype()
						.hashCode());
		result = 37
				* result
				+ (getDocumentId() == null ? 0 : this.getDocumentId()
						.hashCode());
		result = 37 * result
				+ (getExtension() == null ? 0 : this.getExtension().hashCode());
		result = 37 * result
				+ (getOfferid() == null ? 0 : this.getOfferid().hashCode());
		result = 37
				* result
				+ (getSupplierrequestid() == null ? 0 : this
						.getSupplierrequestid().hashCode());
		result = 37 * result
				+ (getMid() == null ? 0 : this.getMid().hashCode());
		result = 37
				* result
				+ (getDepartment() == null ? 0 : this.getDepartment()
						.hashCode());
		result = 37 * result
				+ (getCreated() == null ? 0 : this.getCreated().hashCode());
		result = 37 * result
				+ (getCrd() == null ? 0 : this.getCrd().hashCode());
		result = 37
				* result
				+ (getLastmodifieddate() == null ? 0 : this
						.getLastmodifieddate().hashCode());
		result = 37 * result
				+ (getModd() == null ? 0 : this.getModd().hashCode());
		result = 37 * result
				+ (getDocremark() == null ? 0 : this.getDocremark().hashCode());
		result = 37 * result
				+ (getSystemid() == null ? 0 : this.getSystemid().hashCode());
		result = 37
				* result
				+ (getAmazonpath() == null ? 0 : this.getAmazonpath()
						.hashCode());
		result = 37
				* result
				+ (getTransferstatus() == null ? 0 : this.getTransferstatus()
						.hashCode());
		result = 37
				* result
				+ (getDescription() == null ? 0 : this.getDescription()
						.hashCode());
		result = 37 * result
				+ (getIsactive() == null ? 0 : this.getIsactive().hashCode());
		result = 37 * result
				+ (getAccess() == null ? 0 : this.getAccess().hashCode());
		return result;
	}

}