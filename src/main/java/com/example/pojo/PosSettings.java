package com.example.pojo;
// Generated 23 avr. 2022, 13:06:38 by Hibernate Tools 4.3.6.Final

import java.util.Date;

/**
 * PosSettings generated by hbm2java
 */
public class PosSettings implements java.io.Serializable {

	private int id;
	private String noteCustomer;
	private short showNote;
	private short showBarcode;
	private short showDiscount;
	private short showCustomer;
	private short showEmail;
	private short showPhone;
	private short showAddress;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;

	public PosSettings() {
	}

	public PosSettings(int id, String noteCustomer, short showNote, short showBarcode, short showDiscount,
			short showCustomer, short showEmail, short showPhone, short showAddress) {
		this.id = id;
		this.noteCustomer = noteCustomer;
		this.showNote = showNote;
		this.showBarcode = showBarcode;
		this.showDiscount = showDiscount;
		this.showCustomer = showCustomer;
		this.showEmail = showEmail;
		this.showPhone = showPhone;
		this.showAddress = showAddress;
	}

	public PosSettings(int id, String noteCustomer, short showNote, short showBarcode, short showDiscount,
			short showCustomer, short showEmail, short showPhone, short showAddress, Date createdAt, Date updatedAt,
			Date deletedAt) {
		this.id = id;
		this.noteCustomer = noteCustomer;
		this.showNote = showNote;
		this.showBarcode = showBarcode;
		this.showDiscount = showDiscount;
		this.showCustomer = showCustomer;
		this.showEmail = showEmail;
		this.showPhone = showPhone;
		this.showAddress = showAddress;
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

	public String getNoteCustomer() {
		return this.noteCustomer;
	}

	public void setNoteCustomer(String noteCustomer) {
		this.noteCustomer = noteCustomer;
	}

	public short getShowNote() {
		return this.showNote;
	}

	public void setShowNote(short showNote) {
		this.showNote = showNote;
	}

	public short getShowBarcode() {
		return this.showBarcode;
	}

	public void setShowBarcode(short showBarcode) {
		this.showBarcode = showBarcode;
	}

	public short getShowDiscount() {
		return this.showDiscount;
	}

	public void setShowDiscount(short showDiscount) {
		this.showDiscount = showDiscount;
	}

	public short getShowCustomer() {
		return this.showCustomer;
	}

	public void setShowCustomer(short showCustomer) {
		this.showCustomer = showCustomer;
	}

	public short getShowEmail() {
		return this.showEmail;
	}

	public void setShowEmail(short showEmail) {
		this.showEmail = showEmail;
	}

	public short getShowPhone() {
		return this.showPhone;
	}

	public void setShowPhone(short showPhone) {
		this.showPhone = showPhone;
	}

	public short getShowAddress() {
		return this.showAddress;
	}

	public void setShowAddress(short showAddress) {
		this.showAddress = showAddress;
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