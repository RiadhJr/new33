package com.example.pojo;
// Generated 23 avr. 2022, 13:06:38 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SaleReturns generated by hbm2java
 */
public class SaleReturns implements java.io.Serializable {

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
	private double paidAmount;
	private String paymentStatut;
	private String statut;
	private String notes;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	private Set paymentSaleReturnses = new HashSet(0);
	private Set saleReturnDetailses = new HashSet(0);

	public SaleReturns() {
	}

	public SaleReturns(int id, Clients clients, Users users, Warehouses warehouses, Date date, String ref,
			double grandtotal, double paidAmount, String paymentStatut, String statut) {
		this.id = id;
		this.clients = clients;
		this.users = users;
		this.warehouses = warehouses;
		this.date = date;
		this.ref = ref;
		this.grandtotal = grandtotal;
		this.paidAmount = paidAmount;
		this.paymentStatut = paymentStatut;
		this.statut = statut;
	}

	public SaleReturns(int id, Clients clients, Users users, Warehouses warehouses, Date date, String ref,
			Double taxRate, Double taxnet, Double discount, Double shipping, double grandtotal, double paidAmount,
			String paymentStatut, String statut, String notes, Date createdAt, Date updatedAt, Date deletedAt,
			Set paymentSaleReturnses, Set saleReturnDetailses) {
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
		this.paidAmount = paidAmount;
		this.paymentStatut = paymentStatut;
		this.statut = statut;
		this.notes = notes;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
		this.paymentSaleReturnses = paymentSaleReturnses;
		this.saleReturnDetailses = saleReturnDetailses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Clients getClients() {
		return this.clients;
	}

	public void setClients(Clients clients) {
		this.clients = clients;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Warehouses getWarehouses() {
		return this.warehouses;
	}

	public void setWarehouses(Warehouses warehouses) {
		this.warehouses = warehouses;
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

	public Double getTaxRate() {
		return this.taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public Double getTaxnet() {
		return this.taxnet;
	}

	public void setTaxnet(Double taxnet) {
		this.taxnet = taxnet;
	}

	public Double getDiscount() {
		return this.discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getShipping() {
		return this.shipping;
	}

	public void setShipping(Double shipping) {
		this.shipping = shipping;
	}

	public double getGrandtotal() {
		return this.grandtotal;
	}

	public void setGrandtotal(double grandtotal) {
		this.grandtotal = grandtotal;
	}

	public double getPaidAmount() {
		return this.paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public String getPaymentStatut() {
		return this.paymentStatut;
	}

	public void setPaymentStatut(String paymentStatut) {
		this.paymentStatut = paymentStatut;
	}

	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
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

	public Set getPaymentSaleReturnses() {
		return this.paymentSaleReturnses;
	}

	public void setPaymentSaleReturnses(Set paymentSaleReturnses) {
		this.paymentSaleReturnses = paymentSaleReturnses;
	}

	public Set getSaleReturnDetailses() {
		return this.saleReturnDetailses;
	}

	public void setSaleReturnDetailses(Set saleReturnDetailses) {
		this.saleReturnDetailses = saleReturnDetailses;
	}

}
