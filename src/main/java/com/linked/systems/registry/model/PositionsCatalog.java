package com.linked.systems.registry.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "LKS_ADM_POSITIONS")
public class PositionsCatalog {

	@Column(name = "POSITION_ID", unique = true)
	@GeneratedValue
	@Id
	private Long id;
	@Column(name ="POSITION_NAME", nullable=false)
	private String positionName;
	@Column(name="POSITION_GRADE", nullable=false)
	private String grade;
	@Column(name = "DATE_REGISTRY", nullable=false)
	private Timestamp dateRegistry;
	@Column(name = "DATE_REGISTRY_UPDATE", nullable=false)
	private Timestamp dateRegistryUpdate;
	@Column(name= "IS_ACTIVE")
	private boolean isActive;

	protected PositionsCatalog() {
		
	}

	public PositionsCatalog(String positionName, String grade, Timestamp dateRegistry,
			Timestamp dateRegistryUpdate, boolean isActive) {
		super();
		this.positionName = positionName;
		this.grade = grade;
		this.dateRegistry = dateRegistry;
		this.dateRegistryUpdate = dateRegistryUpdate;
		this.isActive = isActive;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setNamePosition(String positionName) {
		this.positionName = positionName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Timestamp getDateRegistry() {
		return dateRegistry;
	}

	public void setDateRegistry(Timestamp dateRegistry) {
		this.dateRegistry = dateRegistry;
	}

	public Timestamp getDateRegistryUpdate() {
		return dateRegistryUpdate;
	}

	public void setDateRegistryUpdate(Timestamp dateRegistryUpdate) {
		this.dateRegistryUpdate = dateRegistryUpdate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}