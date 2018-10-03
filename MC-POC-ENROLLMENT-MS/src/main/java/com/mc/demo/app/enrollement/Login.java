package com.mc.demo.app.enrollement;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Login {
	
	@JsonProperty(value = "userid", required = true)
	@NotEmpty(message = " UserId is required")
	private String userId;
	
	@JsonProperty(value = "pwdd", required = true)
	@NotEmpty(message = "Pwd is required")
	private String pwdd;

	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the pwdd
	 */
	public String getPwdd() {
		return pwdd;
	}

	/**
	 * @param pwdd the pwdd to set
	 */
	public void setPwdd(String pwdd) {
		this.pwdd = pwdd;
	}

	@Override
	public String toString() {
		return String.format("Login [userId=%s, pwdd=%s]", userId, pwdd);
	}

	
}
