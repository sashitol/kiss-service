package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * ZapAddressPoints generated by hbm2java
 */
@Entity
@Table(name = "ZAP_ADDRESS_POINTS", schema = "AMS", uniqueConstraints = @UniqueConstraint(columnNames = {
		"MUNID", "STREETID", "HOUSENO", "FLOORID", "PLACEMENT" }))
public class ZapAddressPoints implements java.io.Serializable {

	private String kvhX;
	private ZapPlacenames zapPlacenames;
	private ZapCoordQuality zapCoordQuality;
	private ZapBbrUsecode zapBbrUsecode;
	private ZapParish zapParish;
	private ZapPostaldistricts zapPostaldistricts;
	private ZapStreets zapStreets;
	private ZapMunicipalities zapMunicipalities;
	private String houseno;
	private String floorid;
	private String placement;
	private BigDecimal propertyidBbr;
	private BigDecimal propertyidEsr;
	private BigDecimal accessOrigin;
	private BigDecimal unitOrigin;
	private BigDecimal x;
	private BigDecimal y;
	private BigDecimal latitude;
	private BigDecimal longitude;

	public ZapAddressPoints() {
	}

	public ZapAddressPoints(String kvhX, ZapCoordQuality zapCoordQuality,
			ZapStreets zapStreets, ZapMunicipalities zapMunicipalities,
			String houseno, BigDecimal x, BigDecimal y) {
		this.kvhX = kvhX;
		this.zapCoordQuality = zapCoordQuality;
		this.zapStreets = zapStreets;
		this.zapMunicipalities = zapMunicipalities;
		this.houseno = houseno;
		this.x = x;
		this.y = y;
	}

	public ZapAddressPoints(String kvhX, ZapPlacenames zapPlacenames,
			ZapCoordQuality zapCoordQuality, ZapBbrUsecode zapBbrUsecode,
			ZapParish zapParish, ZapPostaldistricts zapPostaldistricts,
			ZapStreets zapStreets, ZapMunicipalities zapMunicipalities,
			String houseno, String floorid, String placement,
			BigDecimal propertyidBbr, BigDecimal propertyidEsr,
			BigDecimal accessOrigin, BigDecimal unitOrigin, BigDecimal x,
			BigDecimal y, BigDecimal latitude, BigDecimal longitude) {
		this.kvhX = kvhX;
		this.zapPlacenames = zapPlacenames;
		this.zapCoordQuality = zapCoordQuality;
		this.zapBbrUsecode = zapBbrUsecode;
		this.zapParish = zapParish;
		this.zapPostaldistricts = zapPostaldistricts;
		this.zapStreets = zapStreets;
		this.zapMunicipalities = zapMunicipalities;
		this.houseno = houseno;
		this.floorid = floorid;
		this.placement = placement;
		this.propertyidBbr = propertyidBbr;
		this.propertyidEsr = propertyidEsr;
		this.accessOrigin = accessOrigin;
		this.unitOrigin = unitOrigin;
		this.x = x;
		this.y = y;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Id
	@Column(name = "KVH_X", unique = true, nullable = false, length = 17)
	public String getKvhX() {
		return this.kvhX;
	}

	public void setKvhX(String kvhX) {
		this.kvhX = kvhX;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLACEID")
	public ZapPlacenames getZapPlacenames() {
		return this.zapPlacenames;
	}

	public void setZapPlacenames(ZapPlacenames zapPlacenames) {
		this.zapPlacenames = zapPlacenames;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COORD_Q", nullable = false)
	public ZapCoordQuality getZapCoordQuality() {
		return this.zapCoordQuality;
	}

	public void setZapCoordQuality(ZapCoordQuality zapCoordQuality) {
		this.zapCoordQuality = zapCoordQuality;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BBR_USE")
	public ZapBbrUsecode getZapBbrUsecode() {
		return this.zapBbrUsecode;
	}

	public void setZapBbrUsecode(ZapBbrUsecode zapBbrUsecode) {
		this.zapBbrUsecode = zapBbrUsecode;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARISHID")
	public ZapParish getZapParish() {
		return this.zapParish;
	}

	public void setZapParish(ZapParish zapParish) {
		this.zapParish = zapParish;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "POSTALID")
	public ZapPostaldistricts getZapPostaldistricts() {
		return this.zapPostaldistricts;
	}

	public void setZapPostaldistricts(ZapPostaldistricts zapPostaldistricts) {
		this.zapPostaldistricts = zapPostaldistricts;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "MUNID", referencedColumnName = "MUNID", nullable = false),
			@JoinColumn(name = "STREETID", referencedColumnName = "STREETID", nullable = false) })
	public ZapStreets getZapStreets() {
		return this.zapStreets;
	}

	public void setZapStreets(ZapStreets zapStreets) {
		this.zapStreets = zapStreets;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MUNID", nullable = false, insertable = false, updatable = false)
	public ZapMunicipalities getZapMunicipalities() {
		return this.zapMunicipalities;
	}

	public void setZapMunicipalities(ZapMunicipalities zapMunicipalities) {
		this.zapMunicipalities = zapMunicipalities;
	}

	@Column(name = "HOUSENO", nullable = false, length = 5)
	public String getHouseno() {
		return this.houseno;
	}

	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}

	@Column(name = "FLOORID", length = 2)
	public String getFloorid() {
		return this.floorid;
	}

	public void setFloorid(String floorid) {
		this.floorid = floorid;
	}

	@Column(name = "PLACEMENT", length = 5)
	public String getPlacement() {
		return this.placement;
	}

	public void setPlacement(String placement) {
		this.placement = placement;
	}

	@Column(name = "PROPERTYID_BBR", precision = 22, scale = 0)
	public BigDecimal getPropertyidBbr() {
		return this.propertyidBbr;
	}

	public void setPropertyidBbr(BigDecimal propertyidBbr) {
		this.propertyidBbr = propertyidBbr;
	}

	@Column(name = "PROPERTYID_ESR", precision = 22, scale = 0)
	public BigDecimal getPropertyidEsr() {
		return this.propertyidEsr;
	}

	public void setPropertyidEsr(BigDecimal propertyidEsr) {
		this.propertyidEsr = propertyidEsr;
	}

	@Column(name = "ACCESS_ORIGIN", precision = 22, scale = 0)
	public BigDecimal getAccessOrigin() {
		return this.accessOrigin;
	}

	public void setAccessOrigin(BigDecimal accessOrigin) {
		this.accessOrigin = accessOrigin;
	}

	@Column(name = "UNIT_ORIGIN", precision = 22, scale = 0)
	public BigDecimal getUnitOrigin() {
		return this.unitOrigin;
	}

	public void setUnitOrigin(BigDecimal unitOrigin) {
		this.unitOrigin = unitOrigin;
	}

	@Column(name = "X", nullable = false, precision = 22, scale = 0)
	public BigDecimal getX() {
		return this.x;
	}

	public void setX(BigDecimal x) {
		this.x = x;
	}

	@Column(name = "Y", nullable = false, precision = 22, scale = 0)
	public BigDecimal getY() {
		return this.y;
	}

	public void setY(BigDecimal y) {
		this.y = y;
	}

	@Column(name = "LATITUDE", precision = 21, scale = 18)
	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	@Column(name = "LONGITUDE", precision = 21, scale = 18)
	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

}
