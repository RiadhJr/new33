package com.example.entity;
// Generated 23 avr. 2022, 13:09:37 by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * OauthRefreshTokens generated by hbm2java
 */
@Entity
@Table(name = "oauth_refresh_tokens", schema = "public")
public class OauthRefreshTokens implements java.io.Serializable {

	private OauthRefreshTokensId id;

	public OauthRefreshTokens() {
	}

	public OauthRefreshTokens(OauthRefreshTokensId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "id", nullable = false, length = 100)),
			@AttributeOverride(name = "accessTokenId", column = @Column(name = "access_token_id", nullable = false, length = 100)),
			@AttributeOverride(name = "revoked", column = @Column(name = "revoked", nullable = false)),
			@AttributeOverride(name = "expiresAt", column = @Column(name = "expires_at", length = 13)) })
	public OauthRefreshTokensId getId() {
		return this.id;
	}

	public void setId(OauthRefreshTokensId id) {
		this.id = id;
	}

}
