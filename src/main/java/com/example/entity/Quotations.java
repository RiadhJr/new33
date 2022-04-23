package com.example.entity;
// Generated 23 avr. 2022, 13:09:37 by Hibernate Tools 4.3.6.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Quotations generated by hbm2java
 */
@Entity
@Table(name = "quotations", schema = "public")
public class Quotations implements java.io.Serializable {

	private int id;
	private Clients clients;
	private Users users;
	private Warehouses warehouses;
	private Date date;
	private String ref;
	private Double taxRate;
	private Double taxnet;
	private Double discount;
	private Double shipping;
	private double grandtotal;
	private String statut;
	private String notes;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	private Set<QuotationDetails> quotationDetailses = new HashSet<QuotationDetails>(0);

	public Quotations() {
	}

	public Quotations(int id, Clients clients, Users users, Warehouses warehouses, Date date, String ref,
			double grandtotal, String statut) {
		this.id = id;
		this.clients = clients;
		this.users = users;
		this.warehouses = warehouses;
		this.date = date;
		this.ref = ref;
		this.grandtotal = grandtotal;
		this.statut = statut;
	}

	public Quotations(int id, Clients clients, Users users, Warehouses warehouses, Date date, String ref,
			Double taxRate, Double taxnet, Double discount, Double shipping, double grandtotal, String statut,
			String notes, Date createdAt, Date updatedAt, Date deletedAt, Set<QuotationDetails> quotationDetailses) {
		this.id = id;
		this.clients = clients;
		this.users = users;
		this.warehouses = warehouses;
		this.date = date;
		this.ref = ref;
		this.taxRate = taxRate;
		this.taxnet = taxnet;
		this.discount = discount;
		this.shipping = shipping;
		this.grandtotal = grandtotal;
		this.statut = statut;
		this.notes = notes;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
		this.quotationDetailses = quotationDetailses;
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
	@JoinColumn(name = "client_id", nullable = false)
	public Clients getClients() {
		return this.clients;
	}

	public void setClients(Clients clients) {
		this.clients = clients;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "warehouse_id", nullable = false)
	public Warehouses getWarehouses() {
		return this.warehouses;
	}

	public void setWarehouses(Warehouses warehouses) {
		this.warehouses = warehouses;
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

	@Column(name = "tax_rate", precision = 17, scale = 17)
	public Double getTaxRate() {
		return this.taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	@Column(name = "taxnet", precision = 17, scale = 17)
	public Double getTaxnet() {
		return this.taxnet;
	}

	public void setTaxnet(Double taxnet) {
		this.taxnet = taxnet;
	}

	@Column(name = "discount", precision = 17, scale = 17)
	public Double getDiscount() {
		return this.discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	@Column(name = "shipping", precision = 17, scale = 17)
	public Double getShipping() {
		return this.shipping;
	}

	public void setShipping(Double shipping) {
		this.shipping = shipping;
	}

	@Column(name = "grandtotal", nullable = false, precision = 17, scale = 17)
	public double getGrandtotal() {
		return this.grandtotal;
	}

	public void setGrandtotal(double grandtotal) {
		this.grandtotal = grandtotal;
	}

	@Column(name = "statut", nullable = false, length = 192)
	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "quotations")
	public Set<QuotationDetails> getQuotationDetailses() {
		return this.quotationDetailses;
	}

	public void setQuotationDetailses(Set<QuotationDetails> quotationDetailses) {
		this.quotationDetailses = quotationDetailses;
	}

}