package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TabOfferFilteringDate generated by hbm2java
 */
@Entity
@Table(name = "TAB_OFFER_FILTERING_DATE", schema = "PCRM")
public class TabOfferFilteringDate implements java.io.Serializable {

	private TabOfferFilteringDateId id;
	private Offer offer;

	public TabOfferFilteringDate() {
	}

	public TabOfferFilteringDate(TabOfferFilteringDateId id) {
		this.id = id;
	}

	public TabOfferFilteringDate(TabOfferFilteringDateId id, Offer offer) {
		this.id = id;
		this.offer = offer;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", length = 19)),
			@AttributeOverride(name = "offerid", column = @Column(name = "OFFERID", length = 19)),
			@AttributeOverride(name = "filterDate", column = @Column(name = "FILTER_DATE", length = 7)),
			@AttributeOverride(name = "crd", column = @Column(name = "CRD", length = 7)),
			@AttributeOverride(name = "modd", column = @Column(name = "MODD", length = 7)),
			@AttributeOverride(name = "cru", column = @Column(name = "CRU", length = 19)),
			@AttributeOverride(name = "modu", column = @Column(name = "MODU", length = 19)) })
	public TabOfferFilteringDateId getId() {
		return this.id;
	}

	public void setId(TabOfferFilteringDateId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OFFERID", insertable = false, updatable = false)
	public Offer getOffer() {
		return this.offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

}