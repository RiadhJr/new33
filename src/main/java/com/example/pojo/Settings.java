package com.example.pojo;
// Generated 23 avr. 2022, 13:06:38 by Hibernate Tools 4.3.6.Final

import java.util.Date;

/**
 * Settings generated by hbm2java
 */
public class Settings implements java.io.Serializable {

	private int id;
	private Clients clients;
	private Currencies currencies;
	private Warehouses warehouses;
	private String email;
	private String companyname;
	private String companyphone;
	private String companyadress;
	private String logo;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	private String footer;
	private String developedBy;
	private String defaultLanguage;

	public Settings() {
	}

	public Settings(int id, String email, String companyname, String companyphone, String companyadress, String footer,
			String developedBy, String defaultLanguage) {
		this.id = id;
		this.email = email;
		this.companyname = companyname;
		this.companyphone = companyphone;
		this.companyadress = companyadress;
		this.footer = footer;
		this.developedBy = developedBy;
		this.defaultLanguage = defaultLanguage;
	}

	public Settings(int id, Clients clients, Currencies currencies, Warehouses warehouses, String email,
			String companyname, String companyphone, String companyadress, String logo, Date createdAt, Date updatedAt,
			Date deletedAt, String footer, String developedBy, String defaultLanguage) {
		this.id = id;
		this.clients = clients;
		this.currencies = currencies;
		this.warehouses = warehouses;
		this.email = email;
		this.companyname = companyname;
		this.companyphone = companyphone;
		this.companyadress = companyadress;
		this.logo = logo;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
		this.footer = footer;
		this.developedBy = developedBy;
		this.defaultLanguage = defaultLanguage;
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

	public Currencies getCurrencies() {
		return this.currencies;
	}

	public void setCurrencies(Currencies currencies) {
		this.currencies = currencies;
	}

	public Warehouses getWarehouses() {
		return this.warehouses;
	}

	public void setWarehouses(Warehouses warehouses) {
		this.warehouses = warehouses;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyname() {
		return this.companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCompanyphone() {
		return this.companyphone;
	}

	public void setCompanyphone(String companyphone) {
		this.companyphone = companyphone;
	}

	public String getCompanyadress() {
		return this.companyadress;
	}

	public void setCompanyadress(String companyadress) {
		this.companyadress = companyadress;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
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

	public String getFooter() {
		return this.footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public String getDevelopedBy() {
		return this.developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public String getDefaultLanguage() {
		return this.defaultLanguage;
	}

	public void setDefaultLanguage(String defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}

}