package com.example.pojo;
// Generated 23 avr. 2022, 13:06:38 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Transfers generated by hbm2java
 */
public class Transfers implements java.io.Serializable {

	private int id;
	private Users users;
	private Warehouses warehousesByFromWarehouseId;
	private Warehouses warehousesByToWarehouseId;
	private String ref;
	private Date date;
	private double items;
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
	private Set transferDetailses = new HashSet(0);

	public Transfers() {
	}

	public Transfers(int id, Users users, Warehouses warehousesByFromWarehouseId, Warehouses warehousesByToWarehouseId,
			String ref, Date date, double items, double grandtotal, String statut) {
		this.id = id;
		this.users = users;
		this.warehousesByFromWarehouseId = warehousesByFromWarehouseId;
		this.warehousesByToWarehouseId = warehousesByToWarehouseId;
		this.ref = ref;
		this.date = date;
		this.items = items;
		this.grandtotal = grandtotal;
		this.statut = statut;
	}

	public Transfers(int id, Users users, Warehouses warehousesByFromWarehouseId, Warehouses warehousesByToWarehouseId,
			String ref, Date date, double items, Double taxRate, Double taxnet, Double discount, Double shipping,
			double grandtotal, String statut, String notes, Date createdAt, Date updatedAt, Date deletedAt,
			Set transferDetailses) {
		this.id = id;
		this.users = users;
		this.warehousesByFromWarehouseId = warehousesByFromWarehouseId;
		this.warehousesByToWarehouseId = warehousesByToWarehouseId;
		this.ref = ref;
		this.date = date;
		this.items = items;
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
		this.transferDetailses = transferDetailses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Warehouses getWarehousesByFromWarehouseId() {
		return this.warehousesByFromWarehouseId;
	}

	public void setWarehousesByFromWarehouseId(Warehouses warehousesByFromWarehouseId) {
		this.warehousesByFromWarehouseId = warehousesByFromWarehouseId;
	}

	public Warehouses getWarehousesByToWarehouseId() {
		return this.warehousesByToWarehouseId;
	}

	public void setWarehousesByToWarehouseId(Warehouses warehousesByToWarehouseId) {
		this.warehousesByToWarehouseId = warehousesByToWarehouseId;
	}

	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getItems() {
		return this.items;
	}

	public void setItems(double items) {
		this.items = items;
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

	public Set getTransferDetailses() {
		return this.transferDetailses;
	}

	public void setTransferDetailses(Set transferDetailses) {
		this.transferDetailses = transferDetailses;
	}

}
