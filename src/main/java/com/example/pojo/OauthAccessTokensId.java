package com.example.pojo;
// Generated 23 avr. 2022, 13:06:38 by Hibernate Tools 4.3.6.Final

import java.util.Date;

/**
 * OauthAccessTokensId generated by hbm2java
 */
public class OauthAccessTokensId implements java.io.Serializable {

	private String id;
	private Integer userId;
	private int clientId;
	private String name;
	private String scopes;
	private short revoked;
	private Date createdAt;
	private Date updatedAt;
	private Date expiresAt;

	public OauthAccessTokensId() {
	}

	public OauthAccessTokensId(String id, int clientId, short revoked) {
		this.id = id;
		this.clientId = clientId;
		this.revoked = revoked;
	}

	public OauthAccessTokensId(String id, Integer userId, int clientId, String name, String scopes, short revoked,
			Date createdAt, Date updatedAt, Date expiresAt) {
		this.id = id;
		this.userId = userId;
		this.clientId = clientId;
		this.name = name;
		this.scopes = scopes;
		this.revoked = revoked;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.expiresAt = expiresAt;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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
		if (!(other instanceof OauthAccessTokensId))
			return false;
		OauthAccessTokensId castOther = (OauthAccessTokensId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getUserId() == castOther.getUserId()) || (this.getUserId() != null
						&& castOther.getUserId() != null && this.getUserId().equals(castOther.getUserId())))
				&& (this.getClientId() == castOther.getClientId())
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getScopes() == castOther.getScopes()) || (this.getScopes() != null
						&& castOther.getScopes() != null && this.getScopes().equals(castOther.getScopes())))
				&& (this.getRevoked() == castOther.getRevoked())
				&& ((this.getCreatedAt() == castOther.getCreatedAt()) || (this.getCreatedAt() != null
						&& castOther.getCreatedAt() != null && this.getCreatedAt().equals(castOther.getCreatedAt())))
				&& ((this.getUpdatedAt() == castOther.getUpdatedAt()) || (this.getUpdatedAt() != null
						&& castOther.getUpdatedAt() != null && this.getUpdatedAt().equals(castOther.getUpdatedAt())))
				&& ((this.getExpiresAt() == castOther.getExpiresAt()) || (this.getExpiresAt() != null
						&& castOther.getExpiresAt() != null && this.getExpiresAt().equals(castOther.getExpiresAt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result + this.getClientId();
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getScopes() == null ? 0 : this.getScopes().hashCode());
		result = 37 * result + this.getRevoked();
		result = 37 * result + (getCreatedAt() == null ? 0 : this.getCreatedAt().hashCode());
		result = 37 * result + (getUpdatedAt() == null ? 0 : this.getUpdatedAt().hashCode());
		result = 37 * result + (getExpiresAt() == null ? 0 : this.getExpiresAt().hashCode());
		return result;
	}

}
