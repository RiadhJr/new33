package com.example.pojo;
// Generated 23 avr. 2022, 13:06:38 by Hibernate Tools 4.3.6.Final

import java.util.Date;

/**
 * PaymentPurchases generated by hbm2java
 */
public class PaymentPurchases implements java.io.Serializable {

	private int id;
	private Purchases purchases;
	private Users users;
	private Date date;
	private String ref;
	private double montant;
	private double change;
	private String reglement;
	private String notes;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;

	public PaymentPurchases() {
	}

	public PaymentPurchases(int id, Purchases purchases, Users users, Date date, String ref, double montant,
			double change, String reglement) {
		this.id = id;
		this.purchases = purchases;
		this.users = users;
		this.date = date;
		this.ref = ref;
		this.montant = montant;
		this.change = change;
		this.reglement = reglement;
	}

	public PaymentPurchases(int id, Purchases purchases, Users users, Date date, String ref, double montant,
			double change, String reglement, String notes, Date createdAt, Date updatedAt, Date deletedAt) {
		this.id = id;
		this.purchases = purchases;
		this.users = users;
		this.date = date;
		this.ref = ref;
		this.montant = montant;
		this.change = change;
		this.reglement = reglement;
		this.notes = notes;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Purchases getPurchases() {
		return this.purchases;
	}

	public void setPurchases(Purchases purchases) {
		this.purchases = purchases;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public double getMontant() {
		return this.montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public double getChange() {
		return this.change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	public String getReglement() {
		return this.reglement;
	}

	public void setReglement(String reglement) {
		this.reglement = reglement;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

}
