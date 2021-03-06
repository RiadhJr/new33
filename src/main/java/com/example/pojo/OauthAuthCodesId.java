package com.example.pojo;
// Generated 23 avr. 2022, 13:06:38 by Hibernate Tools 4.3.6.Final

import java.util.Date;

/**
 * OauthAuthCodesId generated by hbm2java
 */
public class OauthAuthCodesId implements java.io.Serializable {

	private String id;
	private int userId;
	private int clientId;
	private String scopes;
	private short revoked;
	private Date expiresAt;

	public OauthAuthCodesId() {
	}

	public OauthAuthCodesId(String id, int userId, int clientId, short revoked) {
		this.id = id;
		this.userId = userId;
		this.clientId = clientId;
		this.revoked = revoked;
	}

	public OauthAuthCodesId(String id, int userId, int clientId, String scopes, short revoked, Date expiresAt) {
		this.id = id;
		this.userId = userId;
		this.clientId = clientId;
		this.scopes = scopes;
		this.revoked = revoked;
		this.expiresAt = expiresAt;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getScopes() {
		return this.scopes;
	}

	public void setScopes(String scopes) {
		this.scopes = scopes;
	}

	public short getRevoked() {
		return this.revoked;
	}

	public void setRevoked(short revoked) {
		this.revoked = revoked;
	}

	public Date getExpiresAt() {
		return this.expiresAt;
	}

	public void setExpiresAt(Date expiresAt) {
		this.expiresAt = expiresAt;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OauthAuthCodesId))
			return false;
		OauthAuthCodesId castOther = (OauthAuthCodesId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& (this.getUserId() == castOther.getUserId()) && (this.getClientId() == castOther.getClientId())
				&& ((this.getScopes() == castOther.getScopes()) || (this.getScopes() != null
						&& castOther.getScopes() != null && this.getScopes().equals(castOther.getScopes())))
				&& (this.getRevoked() == castOther.getRevoked())
				&& ((this.getExpiresAt() == castOther.getExpiresAt()) || (this.getExpiresAt() != null
						&& castOther.getExpiresAt() != null && this.getExpiresAt().equals(castOther.getExpiresAt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + this.getUserId();
		result = 37 * result + this.getClientId();
		result = 37 * result + (getScopes() == null ? 0 : this.getScopes().hashCode());
		result = 37 * result + this.getRevoked();
		result = 37 * result + (getExpiresAt() == null ? 0 : this.getExpiresAt().hashCode());
		return result;
	}

}
