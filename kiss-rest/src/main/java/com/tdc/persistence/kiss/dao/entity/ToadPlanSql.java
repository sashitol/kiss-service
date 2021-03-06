package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * ToadPlanSql generated by hbm2java
 */
@Entity
@Table(name = "TOAD_PLAN_SQL", schema = "PCRM", uniqueConstraints = @UniqueConstraint(columnNames = "STATEMENT_ID"))
public class ToadPlanSql implements java.io.Serializable {

	private ToadPlanSqlId id;

	public ToadPlanSql() {
	}

	public ToadPlanSql(ToadPlanSqlId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "username", column = @Column(name = "USERNAME", length = 30)),
			@AttributeOverride(name = "statementId", column = @Column(name = "STATEMENT_ID", unique = true, length = 32)),
			@AttributeOverride(name = "timestamp", column = @Column(name = "TIMESTAMP", length = 7)),
			@AttributeOverride(name = "statement", column = @Column(name = "STATEMENT", length = 2000)) })
	public ToadPlanSqlId getId() {
		return this.id;
	}

	public void setId(ToadPlanSqlId id) {
		this.id = id;
	}

}
