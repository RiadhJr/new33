package com.example.pojo;
// Generated 23 avr. 2022, 13:06:38 by Hibernate Tools 4.3.6.Final

import java.util.Date;

/**
 * TransferDetails generated by hbm2java
 */
public class TransferDetails implements java.io.Serializable {

	private int id;
	private ProductVariants productVariants;
	private Products products;
	private Transfers transfers;
	private Units units;
	private double cost;
	private Double taxnet;
	private String taxMethod;
	private Double discount;
	private String discountMethod;
	private double quantity;
	private double total;
	private Date createdAt;
	private Date updatedAt;

	public TransferDetails() {
	}

	public TransferDetails(int id, Products products, Transfers transfers, double cost, double quantity, double total) {
		this.id = id;
		this.products = products;
		this.transfers = transfers;
		this.cost = cost;
		this.quantity = quantity;
		this.total = total;
	}

	public TransferDetails(int id, ProductVariants productVariants, Products products, Transfers transfers, Units units,
			double cost, Double taxnet, String taxMethod, Double discount, String discountMethod, double quantity,
			double total, Date createdAt, Date updatedAt) {
		this.id = id;
		this.productVariants = productVariants;
		this.products = products;
		this.transfers = transfers;
		this.units = units;
		this.cost = cost;
		this.taxnet = taxnet;
		this.taxMethod = taxMethod;
		this.discount = discount;
		this.discountMethod = discountMethod;
		this.quantity = quantity;
		this.total = total;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ProductVariants getProductVariants() {
		return this.productVariants;
	}

	public void setProductVariants(ProductVariants productVariants) {
		this.productVariants = productVariants;
	}

	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public Transfers getTransfers() {
		return this.transfers;
	}

	public void setTransfers(Transfers transfers) {
		this.transfers = transfers;
	}

	public Units getUnits() {
		return this.units;
	}

	public void setUnits(Units units) {
		this.units = units;
	}

	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Double getTaxnet() {
		return this.taxnet;
	}

	public void setTaxnet(Double taxnet) {
		this.taxnet = taxnet;
	}

	public String getTaxMethod() {
		return this.taxMethod;
	}

	public void setTaxMethod(String taxMethod) {
		this.taxMethod = taxMethod;
	}

	public Double getDiscount() {
		return this.discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getDiscountMethod() {
		return this.discountMethod;
	}

	public void setDiscountMethod(String discountMethod) {
		this.discountMethod = discountMethod;
	}

	public double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
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

}
