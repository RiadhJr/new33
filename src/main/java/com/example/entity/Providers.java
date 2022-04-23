package com.example.entity;
// Generated 23 avr. 2022, 13:09:37 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Providers generated by hbm2java
 */
@Entity
@Table(name = "providers", schema = "public")
public class Providers implements java.io.Serializable {

	private int id;
	private String name;
	private int code;
	private String email;
	private String phone;
	private String country;
	private String city;
	private String adresse;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	private Set<PurchaseReturns> purchaseReturnses = new HashSet<PurchaseReturns>(0);
	private Set<Purchases> purchaseses = new HashSet<Purchases>(0);

	public Providers() {
	}

	public Providers(int id, String name, int code, String email, String phone, String country, String city,
			String adresse) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.email = email;
		this.phone = phone;
		this.country = country;
		this.city = city;
		this.adresse = adresse;
	}

	public Providers(int id, String name, int code, String email, String phone, String country, String city,
			String adresse, Date createdAt, Date updatedAt, Date deletedAt, Set<PurchaseReturns> purchaseReturnses,
			Set<Purchases> purchaseses) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.email = email;
		this.phone = phone;
		this.country = country;
		this.city = city;
		this.adresse = adresse;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
		this.purchaseReturnses = purchaseReturnses;
		this.purchaseses = purchaseses;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 191)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "code", nullable = false)
	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Column(name = "email", nullable = false, length = 192)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "phone", nullable = false, length = 192)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "country", nullable = false, length = 191)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "city", nullable = false, length = 191)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "adresse", nullable = false, length = 191)
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 29)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", length = 29)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deleted_at", length = 29)
	public Date getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "providers")
	public Set<PurchaseReturns> getPurchaseReturnses() {
		return this.purchaseReturnses;
	}

	public void setPurchaseReturnses(Set<PurchaseReturns> purchaseReturnses) {
		this.purchaseReturnses = purchaseReturnses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "providers")
	public Set<Purchases> getPurchaseses() {
		return this.purchaseses;
	}

	public void setPurchaseses(Set<Purchases> purchaseses) {
		this.purchaseses = purchaseses;
	}

}
