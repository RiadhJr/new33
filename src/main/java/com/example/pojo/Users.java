package com.example.pojo;
// Generated 23 avr. 2022, 13:06:38 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Users generated by hbm2java
 */
public class Users implements java.io.Serializable {

	private int id;
	private String firstname;
	private String lastname;
	private String username;
	private String email;
	private String password;
	private String avatar;
	private String phone;
	private int roleId;
	private short statut;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	private Set paymentSaleReturnses = new HashSet(0);
	private Set purchaseses = new HashSet(0);
	private Set paymentPurchaseses = new HashSet(0);
	private Set saleReturnses = new HashSet(0);
	private Set expenseCategorieses = new HashSet(0);
	private Set paymentPurchaseReturnses = new HashSet(0);
	private Set saleses = new HashSet(0);
	private Set expenseses = new HashSet(0);
	private Set purchaseReturnses = new HashSet(0);
	private Set transferses = new HashSet(0);
	private Set roleUsers = new HashSet(0);
	private Set adjustmentses = new HashSet(0);
	private Set quotationses = new HashSet(0);
	private Set paymentSaleses = new HashSet(0);

	public Users() {
	}

	public Users(int id, String firstname, String lastname, String username, String email, String password,
			String phone, int roleId, short statut) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.roleId = roleId;
		this.statut = statut;
	}

	public Users(int id, String firstname, String lastname, String username, String email, String password,
			String avatar, String phone, int roleId, short statut, Date createdAt, Date updatedAt, Date deletedAt,
			Set paymentSaleReturnses, Set purchaseses, Set paymentPurchaseses, Set saleReturnses,
			Set expenseCategorieses, Set paymentPurchaseReturnses, Set saleses, Set expenseses, Set purchaseReturnses,
			Set transferses, Set roleUsers, Set adjustmentses, Set quotationses, Set paymentSaleses) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.email = email;
		this.password = password;
		this.avatar = avatar;
		this.phone = phone;
		this.roleId = roleId;
		this.statut = statut;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
		this.paymentSaleReturnses = paymentSaleReturnses;
		this.purchaseses = purchaseses;
		this.paymentPurchaseses = paymentPurchaseses;
		this.saleReturnses = saleReturnses;
		this.expenseCategorieses = expenseCategorieses;
		this.paymentPurchaseReturnses = paymentPurchaseReturnses;
		this.saleses = saleses;
		this.expenseses = expenseses;
		this.purchaseReturnses = purchaseReturnses;
		this.transferses = transferses;
		this.roleUsers = roleUsers;
		this.adjustmentses = adjustmentses;
		this.quotationses = quotationses;
		this.paymentSaleses = paymentSaleses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public short getStatut() {
		return this.statut;
	}

	public void setStatut(short statut) {
		this.statut = statut;
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

	public Set getPurchaseses() {
		return this.purchaseses;
	}

	public void setPurchaseses(Set purchaseses) {
		this.purchaseses = purchaseses;
	}

	public Set getPaymentPurchaseses() {
		return this.paymentPurchaseses;
	}

	public void setPaymentPurchaseses(Set paymentPurchaseses) {
		this.paymentPurchaseses = paymentPurchaseses;
	}

	public Set getSaleReturnses() {
		return this.saleReturnses;
	}

	public void setSaleReturnses(Set saleReturnses) {
		this.saleReturnses = saleReturnses;
	}

	public Set getExpenseCategorieses() {
		return this.expenseCategorieses;
	}

	public void setExpenseCategorieses(Set expenseCategorieses) {
		this.expenseCategorieses = expenseCategorieses;
	}

	public Set getPaymentPurchaseReturnses() {
		return this.paymentPurchaseReturnses;
	}

	public void setPaymentPurchaseReturnses(Set paymentPurchaseReturnses) {
		this.paymentPurchaseReturnses = paymentPurchaseReturnses;
	}

	public Set getSaleses() {
		return this.saleses;
	}

	public void setSaleses(Set saleses) {
		this.saleses = saleses;
	}

	public Set getExpenseses() {
		return this.expenseses;
	}

	public void setExpenseses(Set expenseses) {
		this.expenseses = expenseses;
	}

	public Set getPurchaseReturnses() {
		return this.purchaseReturnses;
	}

	public void setPurchaseReturnses(Set purchaseReturnses) {
		this.purchaseReturnses = purchaseReturnses;
	}

	public Set getTransferses() {
		return this.transferses;
	}

	public void setTransferses(Set transferses) {
		this.transferses = transferses;
	}

	public Set getRoleUsers() {
		return this.roleUsers;
	}

	public void setRoleUsers(Set roleUsers) {
		this.roleUsers = roleUsers;
	}

	public Set getAdjustmentses() {
		return this.adjustmentses;
	}

	public void setAdjustmentses(Set adjustmentses) {
		this.adjustmentses = adjustmentses;
	}

	public Set getQuotationses() {
		return this.quotationses;
	}

	public void setQuotationses(Set quotationses) {
		this.quotationses = quotationses;
	}

	public Set getPaymentSaleses() {
		return this.paymentSaleses;
	}

	public void setPaymentSaleses(Set paymentSaleses) {
		this.paymentSaleses = paymentSaleses;
	}

}
