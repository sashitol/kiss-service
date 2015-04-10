package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

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

/**
 * Postaldistricts generated by hbm2java
 */
@Entity
@Table(name = "POSTALDISTRICTS", schema = "AMS")
public class Postaldistricts implements java.io.Serializable {

	private String postalcode;
	private AccessClasses accessClasses;
	private String postaldistrict;
	private String source;
	private Set<StreetsSearch> streetsSearches = new HashSet<StreetsSearch>(0);

	public Postaldistricts() {
	}

	public Postaldistricts(String postalcode, AccessClasses accessClasses,
			String postaldistrict, String source) {
		this.postalcode = postalcode;
		this.accessClasses = accessClasses;
		this.postaldistrict = postaldistrict;
		this.source = source;
	}

	public Postaldistricts(String postalcode, AccessClasses accessClasses,
			String postaldistrict, String source,
			Set<StreetsSearch> streetsSearches) {
		this.postalcode = postalcode;
		this.accessClasses = accessClasses;
		this.postaldistrict = postaldistrict;
		this.source = source;
		this.streetsSearches = streetsSearches;
	}

	@Id
	@Column(name = "POSTALCODE", unique = true, nullable = false, length = 10)
	public String getPostalcode() {
		return this.postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACCESS_CLASS", nullable = false)
	public AccessClasses getAccessClasses() {
		return this.accessClasses;
	}

	public void setAccessClasses(AccessClasses accessClasses) {
		this.accessClasses = accessClasses;
	}

	@Column(name = "POSTALDISTRICT", nullable = false, length = 40)
	public String getPostaldistrict() {
		return this.postaldistrict;
	}

	public void setPostaldistrict(String postaldistrict) {
		this.postaldistrict = postaldistrict;
	}

	@Column(name = "SOURCE", nullable = false, length = 20)
	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "postaldistricts")
	public Set<StreetsSearch> getStreetsSearches() {
		return this.streetsSearches;
	}

	public void setStreetsSearches(Set<StreetsSearch> streetsSearches) {
		this.streetsSearches = streetsSearches;
	}

}