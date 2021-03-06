package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ZapAddressConvertTmp generated by hbm2java
 */
@Entity
@Table(name = "ZAP_ADDRESS_CONVERT_TMP", schema = "AMS")
public class ZapAddressConvertTmp implements java.io.Serializable {

	private String kvhXOld;
	private String kvhXNewNew;
	private String behandlKod;
	private String streetnameOld;
	private String placenameOld;
	private BigDecimal postalidOld;
	private String postaldistrictOld;
	private BigDecimal addressQOld;
	private BigDecimal coordQOld;
	private String kvhXNew;
	private String streetnameNew;
	private String placenameNew;
	private BigDecimal postalidNew;
	private String postaldistrictNew;
	private BigDecimal accessOriginNew;
	private BigDecimal unitOriginNew;

	public ZapAddressConvertTmp() {
	}

	public ZapAddressConvertTmp(String kvhXOld, String kvhXNewNew,
			String kvhXNew) {
		this.kvhXOld = kvhXOld;
		this.kvhXNewNew = kvhXNewNew;
		this.kvhXNew = kvhXNew;
	}

	public ZapAddressConvertTmp(String kvhXOld, String kvhXNewNew,
			String behandlKod, String streetnameOld, String placenameOld,
			BigDecimal postalidOld, String postaldistrictOld,
			BigDecimal addressQOld, BigDecimal coordQOld, String kvhXNew,
			String streetnameNew, String placenameNew, BigDecimal postalidNew,
			String postaldistrictNew, BigDecimal accessOriginNew,
			BigDecimal unitOriginNew) {
		this.kvhXOld = kvhXOld;
		this.kvhXNewNew = kvhXNewNew;
		this.behandlKod = behandlKod;
		this.streetnameOld = streetnameOld;
		this.placenameOld = placenameOld;
		this.postalidOld = postalidOld;
		this.postaldistrictOld = postaldistrictOld;
		this.addressQOld = addressQOld;
		this.coordQOld = coordQOld;
		this.kvhXNew = kvhXNew;
		this.streetnameNew = streetnameNew;
		this.placenameNew = placenameNew;
		this.postalidNew = postalidNew;
		this.postaldistrictNew = postaldistrictNew;
		this.accessOriginNew = accessOriginNew;
		this.unitOriginNew = unitOriginNew;
	}

	@Id
	@Column(name = "KVH_X_OLD", unique = true, nullable = false, length = 17)
	public String getKvhXOld() {
		return this.kvhXOld;
	}

	public void setKvhXOld(String kvhXOld) {
		this.kvhXOld = kvhXOld;
	}

	@Column(name = "KVH_X_NEW_NEW", nullable = false, length = 17)
	public String getKvhXNewNew() {
		return this.kvhXNewNew;
	}

	public void setKvhXNewNew(String kvhXNewNew) {
		this.kvhXNewNew = kvhXNewNew;
	}

	@Column(name = "BEHANDL_KOD", length = 1)
	public String getBehandlKod() {
		return this.behandlKod;
	}

	public void setBehandlKod(String behandlKod) {
		this.behandlKod = behandlKod;
	}

	@Column(name = "STREETNAME_OLD", length = 100)
	public String getStreetnameOld() {
		return this.streetnameOld;
	}

	public void setStreetnameOld(String streetnameOld) {
		this.streetnameOld = streetnameOld;
	}

	@Column(name = "PLACENAME_OLD", length = 100)
	public String getPlacenameOld() {
		return this.placenameOld;
	}

	public void setPlacenameOld(String placenameOld) {
		this.placenameOld = placenameOld;
	}

	@Column(name = "POSTALID_OLD", precision = 22, scale = 0)
	public BigDecimal getPostalidOld() {
		return this.postalidOld;
	}

	public void setPostalidOld(BigDecimal postalidOld) {
		this.postalidOld = postalidOld;
	}

	@Column(name = "POSTALDISTRICT_OLD", length = 50)
	public String getPostaldistrictOld() {
		return this.postaldistrictOld;
	}

	public void setPostaldistrictOld(String postaldistrictOld) {
		this.postaldistrictOld = postaldistrictOld;
	}

	@Column(name = "ADDRESS_Q_OLD", precision = 22, scale = 0)
	public BigDecimal getAddressQOld() {
		return this.addressQOld;
	}

	public void setAddressQOld(BigDecimal addressQOld) {
		this.addressQOld = addressQOld;
	}

	@Column(name = "COORD_Q_OLD", precision = 22, scale = 0)
	public BigDecimal getCoordQOld() {
		return this.coordQOld;
	}

	public void setCoordQOld(BigDecimal coordQOld) {
		this.coordQOld = coordQOld;
	}

	@Column(name = "KVH_X_NEW", nullable = false, length = 17)
	public String getKvhXNew() {
		return this.kvhXNew;
	}

	public void setKvhXNew(String kvhXNew) {
		this.kvhXNew = kvhXNew;
	}

	@Column(name = "STREETNAME_NEW", length = 100)
	public String getStreetnameNew() {
		return this.streetnameNew;
	}

	public void setStreetnameNew(String streetnameNew) {
		this.streetnameNew = streetnameNew;
	}

	@Column(name = "PLACENAME_NEW", length = 50)
	public String getPlacenameNew() {
		return this.placenameNew;
	}

	public void setPlacenameNew(String placenameNew) {
		this.placenameNew = placenameNew;
	}

	@Column(name = "POSTALID_NEW", precision = 22, scale = 0)
	public BigDecimal getPostalidNew() {
		return this.postalidNew;
	}

	public void setPostalidNew(BigDecimal postalidNew) {
		this.postalidNew = postalidNew;
	}

	@Column(name = "POSTALDISTRICT_NEW", length = 50)
	public String getPostaldistrictNew() {
		return this.postaldistrictNew;
	}

	public void setPostaldistrictNew(String postaldistrictNew) {
		this.postaldistrictNew = postaldistrictNew;
	}

	@Column(name = "ACCESS_ORIGIN_NEW", precision = 22, scale = 0)
	public BigDecimal getAccessOriginNew() {
		return this.accessOriginNew;
	}

	public void setAccessOriginNew(BigDecimal accessOriginNew) {
		this.accessOriginNew = accessOriginNew;
	}

	@Column(name = "UNIT_ORIGIN_NEW", precision = 22, scale = 0)
	public BigDecimal getUnitOriginNew() {
		return this.unitOriginNew;
	}

	public void setUnitOriginNew(BigDecimal unitOriginNew) {
		this.unitOriginNew = unitOriginNew;
	}

}
