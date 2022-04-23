package com.example.pojo;
// Generated 23 avr. 2022, 13:06:38 by Hibernate Tools 4.3.6.Final

import java.util.Date;

/**
 * QuotationDetails generated by hbm2java
 */
public class QuotationDetails implements java.io.Serializable {

	private int id;
	private ProductVariants productVariants;
	private Products products;
	private Quotations quotations;
	private Units units;
	private double price;
	private Double taxnet;
	private String taxMethod;
	private Double discount;
	private String discountMethod;
	private double total;
	private double quantity;
	private Date createdAt;
	private Date updatedAt;

	public QuotationDetails() {
	}

	public QuotationDetails(int id, Products products, Quotations quotations, double price, double total,
			double quantity) {
		this.id = id;
		this.products = products;
		this.quotations = quotations;
		this.price = price;
		this.total = total;
		this.quantity = quantity;
	}

	public QuotationDetails(int id, ProductVariants productVariants, Products products, Quotations quotations,
			Units units, double price, Double taxnet, String taxMethod, Double discount, String discountMethod,
			double total, double quantity, Date createdAt, Date updatedAt) {
		this.id = id;
		this.productVariants = productVariants;
		this.products = products;
		this.quotations = quotations;
		this.units = units;
		this.price = price;
		this.taxnet = taxnet;
		this.taxMethod = taxMethod;
		this.discount = discount;
		this.discountMethod = discountMethod;
		this.total = total;
		this.quantity = quantity;
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

	public Quotations getQuotations() {
		return this.quotations;
	}

	public void setQuotations(Quotations quotations) {
		this.quotations = quotations;
	}

	public Units getUnits() {
		return this.units;
	}

	public void setUnits(Units units) {
		this.units = units;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
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

}