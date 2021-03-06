package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * DocumentsCentaProd generated by hbm2java
 */
@Entity
@Table(name = "DOCUMENTS_CENTA_PROD", schema = "PCRM")
public class DocumentsCentaProd implements java.io.Serializable {

	private DocumentsCentaProdId id;

	public DocumentsCentaProd() {
	}

	public DocumentsCentaProd(DocumentsCentaProdId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "nodeid", column = @Column(name = "NODEID", precision = 22, scale = 0)),
			@AttributeOverride(name = "documentid", column = @Column(name = "DOCUMENTID", precision = 22, scale = 0)),
			@AttributeOverride(name = "contentsize", column = @Column(name = "CONTENTSIZE", precision = 22, scale = 0)),
			@AttributeOverride(name = "fileextension", column = @Column(name = "FILEEXTENSION", length = 10)),
			@AttributeOverride(name = "timestampcol", column = @Column(name = "TIMESTAMPCOL", length = 3000)),
			@AttributeOverride(name = "filedby", column = @Column(name = "FILEDBY", precision = 10, scale = 0)),
			@AttributeOverride(name = "fileddate", column = @Column(name = "FILEDDATE", length = 7)),
			@AttributeOverride(name = "authortxt", column = @Column(name = "AUTHORTXT")),
			@AttributeOverride(name = "authordate", column = @Column(name = "AUTHORDATE", length = 7)),
			@AttributeOverride(name = "active", column = @Column(name = "ACTIVE", precision = 10, scale = 0)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", precision = 10, scale = 0)),
			@AttributeOverride(name = "parentversion", column = @Column(name = "PARENTVERSION", precision = 10, scale = 0)),
			@AttributeOverride(name = "title", column = @Column(name = "TITLE")),
			@AttributeOverride(name = "documenttype", column = @Column(name = "DOCUMENTTYPE", precision = 10, scale = 0)),
			@AttributeOverride(name = "externalid", column = @Column(name = "EXTERNALID")),
			@AttributeOverride(name = "conflicting", column = @Column(name = "CONFLICTING", precision = 10, scale = 0)),
			@AttributeOverride(name = "md5", column = @Column(name = "MD5", length = 50)),
			@AttributeOverride(name = "deleted", column = @Column(name = "DELETED", length = 7)),
			@AttributeOverride(name = "conflictresolved", column = @Column(name = "CONFLICTRESOLVED", precision = 10, scale = 0)),
			@AttributeOverride(name = "storagetype", column = @Column(name = "STORAGETYPE", precision = 10, scale = 0)),
			@AttributeOverride(name = "originalmd5", column = @Column(name = "ORIGINALMD5", length = 50)) })
	public DocumentsCentaProdId getId() {
		return this.id;
	}

	public void setId(DocumentsCentaProdId id) {
		this.id = id;
	}

}
