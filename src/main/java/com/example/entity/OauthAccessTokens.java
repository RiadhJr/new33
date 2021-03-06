package com.example.entity;
// Generated 23 avr. 2022, 13:09:37 by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * OauthAccessTokens generated by hbm2java
 */
@Entity
@Table(name = "oauth_access_tokens", schema = "public")
public class OauthAccessTokens implements java.io.Serializable {

	private OauthAccessTokensId id;

	public OauthAccessTokens() {
	}

	public OauthAccessTokens(OauthAccessTokensId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "id", nullable = false, length = 100)),
			@AttributeOverride(name = "userId", column = @Column(name = "user_id")),
			@AttributeOverride(name = "clientId", column = @Column(name = "client_id", nullable = false)),
			@AttributeOverride(name = "name", column = @Column(name = "name", length = 191)),
			@AttributeOverride(name = "scopes", column = @Column(name = "scopes")),
			@AttributeOverride(name = "revoked", column = @Column(name = "revoked", nullable = false)),
			@AttributeOverride(name = "createdAt", column = @Column(name = "created_at", length = 29)),
			@AttributeOverride(name = "updatedAt", column = @Column(name = "updated_at", length = 29)),
			@AttributeOverride(name = "expiresAt", column = @Column(name = "expires_at", length = 13)) })
	public OauthAccessTokensId getId() {
		return this.id;
	}

	public void setId(OauthAccessTokensId id) {
		this.id = id;
	}

}
