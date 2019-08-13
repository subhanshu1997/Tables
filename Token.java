package com.cg;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="token")
public class Token {
	@Id
	private Integer tokenId;
	
	@Column
	private Integer confirmationToken;
	
	@Column
	private Date dateOfCreation;
	
	@Column
	private Integer userId;

	public Integer getTokenId() {
		return tokenId;
	}

	public void setTokenId(Integer tokenId) {
		this.tokenId = tokenId;
	}

	public Integer getConfirmationToken() {
		return confirmationToken;
	}

	public void setConfirmationToken(Integer confirmationToken) {
		this.confirmationToken = confirmationToken;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Token(Integer tokenId, Integer confirmationToken, Date dateOfCreation, Integer userId) {
		super();
		this.tokenId = tokenId;
		this.confirmationToken = confirmationToken;
		this.dateOfCreation = dateOfCreation;
		this.userId = userId;
	}

	public Token() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
