package com.linked.systems.registry.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

@Entity
@Table(name = "LKS_ADM_USER")
@Audited
public class UserInformation {

	@Id
	@GeneratedValue
	@Column(name = "ID_USER", unique= true)
	private Long userId;
	@Column(name="ALIAS", nullable=false)
	private String alias;
	@Column(name = "NAME", nullable=false)
	private String name;
	@Column(name = "SECOND_NAME", nullable=false)
	private String secondName;
	@Column(name = "LAST_NAME", nullable=false)
	private String lastName;
	@Column(name = "SECOND_LAST_NAME", nullable=false)
	private String secondLastName;
	@Column(name = "FULL_NAME", nullable=false)
	private String fullName;
	@Column(name = "ADDRESS", nullable=false)
	private String address;
	@Column(name = "DOOR_NUMBER", nullable=false)
	private String doorNumber;
	@Column(name = "CELL_PHONE", nullable=false)
	private String cellPhone;
	@Column(name = "E_MAIL", nullable=false)
	private String email;
	@Column(name = "IMAGE_PATH", nullable=false)
	private String imagePath;
	@Column(name =  "PASSWORD", nullable=false)
	private String password;
	@Column(name = "IS_ACTIVE", nullable=false)
	private boolean isActive;
	@Column(name = "DATE_REGISTRY", nullable=false)
	private Timestamp dateRegistry;
	@Column(name = "DATE_REGISTRY_UPDATE", nullable=false)
	private Timestamp dateRegistryUpdate;
	@Column(name = "POSITION_ID", nullable=false)
	PositionsCatalog positionsCatalog;

	protected UserInformation() {
	}

	public UserInformation(String name, String secondName, String lastName, String secondLastName, String fullName,
			String address, String doorNumber, String cellPhone, String email, String imagePath, String password, 
			boolean isActive, String alias, Timestamp dateRegistry, Timestamp dateRegistryUpdate, PositionsCatalog positionsCatalog) {
		super();
		this.name = name;
		this.secondName = secondName;
		this.lastName = lastName;
		this.secondLastName = secondLastName;
		this.fullName = fullName;
		this.address = address;
		this.doorNumber = doorNumber;
		this.cellPhone = cellPhone;
		this.email = email;
		this.imagePath = imagePath;
		this.password = password;
		this.isActive = isActive;
		this.alias = alias;
		this.dateRegistry = dateRegistry;
		this.dateRegistry = dateRegistry;
		this.positionsCatalog = positionsCatalog;
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

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}