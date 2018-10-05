package com.mc.demo.app.enrollement;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Login {
	
	@JsonProperty(value = "userid", required = true)
	@NotEmpty(message = " UserId is required")
	private String userId;
	
	@JsonProperty(value = "pswd", required = true)
	@NotEmpty(message = "pswd is required")
	private String pswd;

	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the pwdd
	 */
	public String getPswd() {
		return pswd;
	}

	/**
	 * @param pwdd the pwdd to set
	 */
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	@Override
	public String toString() {
		return String.format("Login [userId=%s, pwdd=%s]", userId, pswd);
	}

	
}
