package com.example.entity;
// Generated 23 avr. 2022, 13:09:37 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PaymentSales generated by hbm2java
 */
@Entity
@Table(name = "payment_sales", schema = "public")
public class PaymentSales implements java.io.Serializable {

	private int id;
	private Sales sales;
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

	public PaymentSales() {
	}

	public PaymentSales(int id, Sales sales, Users users, Date date, String ref, double montant, double change,
			String reglement) {
		this.id = id;
		this.sales = sales;
		this.users = users;
		this.date = date;
		this.ref = ref;
		this.montant = montant;
		this.change = change;
		this.reglement = reglement;
	}

	public PaymentSales(int id, Sales sales, Users users, Date date, String ref, double montant, double change,
			String reglement, String notes, Date createdAt, Date updatedAt, Date deletedAt) {
		this.id = id;
		this.sales = sales;
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

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sale_id", nullable = false)
	public Sales getSales() {
		return this.sales;
	}

	public void setSales(Sales sales) {
		this.sales = sales;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", nullable = false, length = 13)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "ref", nullable = false, length = 192)
	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	@Column(name = "montant", nullable = false, precision = 17, scale = 17)
	public double getMontant() {
		return this.montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	@Column(name = "change", nullable = false, precision = 17, scale = 17)
	public double getChange() {
		return this.change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	@Column(name = "reglement", nullable = false, length = 192)
	public String getReglement() {
		return this.reglement;
	}

	public void setReglement(String reglement) {
		this.reglement = reglement;
	}

	@Column(name = "notes")
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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

}
