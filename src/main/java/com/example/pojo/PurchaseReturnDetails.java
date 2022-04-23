package com.example.pojo;
// Generated 23 avr. 2022, 13:06:38 by Hibernate Tools 4.3.6.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * PurchaseReturnDetails generated by hbm2java
 */
public class PurchaseReturnDetails implements java.io.Serializable {

	private int id;
	private ProductVariants productVariants;
	private Products products;
	private PurchaseReturns purchaseReturns;
	private Units units;
	private BigDecimal cost;
	private Double taxnet;
	private String taxMethod;
	private Double discount;
	private String discountMethod;
	private double total;
	private double quantity;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;

	public PurchaseReturnDetails() {
	}

	public PurchaseReturnDetails(int id, Products products, PurchaseReturns purchaseReturns, BigDecimal cost,
			double total, double quantity) {
		this.id = id;
		this.products = products;
		this.purchaseReturns = purchaseReturns;
		this.cost = cost;
		this.total = total;
		this.quantity = quantity;
	}

	public PurchaseReturnDetails(int id, ProductVariants productVariants, Products products,
			PurchaseReturns purchaseReturns, Units units, BigDecimal cost, Double taxnet, String taxMethod,
			Double discount, String discountMethod, double total, double quantity, Date createdAt, Date updatedAt,
			Date deletedAt) {
		this.id = id;
		this.productVariants = productVariants;
		this.products = products;
		this.purchaseReturns = purchaseReturns;
		this.units = units;
		this.cost = cost;
		this.taxnet = taxnet;
		this.taxMethod = taxMethod;
		this.discount = discount;
		this.discountMethod = discountMethod;
		this.total = total;
		this.quantity = quantity;
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

	public PurchaseReturns getPurchaseReturns() {
		return this.purchaseReturns;
	}

	public void setPurchaseReturns(PurchaseReturns purchaseReturns) {
		this.purchaseReturns = purchaseReturns;
	}

	public Units getUnits() {
		return this.units;
	}

	public void setUnits(Units units) {
		this.units = units;
	}

	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
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

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
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
