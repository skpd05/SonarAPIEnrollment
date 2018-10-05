package com.mc.demo.app.enrollement;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserProfile {

	@JsonProperty(value = "userid", required = true)
	@NotEmpty(message = " UserId is required")
	private String userId;

	@JsonProperty(value = "pswd", required = true)
	@NotEmpty(message = "Password is required")
	private String password;

	@JsonProperty(value = "cardnumber", required = true)
	@NotEmpty(message = "AccountNumber is required")
	private String accountNumber;

	@JsonProperty(value = "emailid", required = true)
	@Email(message = "EmailId is required")
	private String emailId;

	@JsonProperty(value = "mobilenumber", required = true)
	@NotEmpty(message = "Mobile Number is required")
	private String mobileNumber;

	@JsonProperty(value = "communicationaddress", required = true)
	@NotEmpty(message = "Communication Address is required")
	private String communicationAddress;

	@JsonProperty(value = "sq1", required = true)
	@NotEmpty(message = "Security Question1 is required")
	private String SQ1;

	@JsonProperty(value = "sq2", required = true)
	@NotEmpty(message = "Security Question2 is required")
	private String SQ2;

	@JsonProperty(value = "sq3", required = true)
	@NotEmpty(message = "Security Question3 is required")
	private String SQ3;

	@JsonProperty(value = "sqa1", required = true)
	@NotEmpty(message = "Security Answer1 is required")
	private String SQA1;

//	@JsonProperty(value = "sqa2", required = true)
//	@NotEmpty(message = "Security Answer2 is required")
	private String SQA2;

	@JsonProperty(value = "sqa3", required = true)
	@NotEmpty(message = "Security Answer3 is required")
	private String SQA3;

	private String dob;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCommunicationAddress() {
		return communicationAddress;
	}

	public void setCommunicationAddress(String communicationAddress) {
		this.communicationAddress = communicationAddress;
	}

	public String getSQ1() {
		return SQ1;
	}

	public void setSQ1(String sQ1) {
		SQ1 = sQ1;
	}

	public String getSQ2() {
		return SQ2;
	}

	public void setSQ2(String sQ2) {
		SQ2 = sQ2;
	}

	public String getSQ3() {
		return SQ3;
	}

	public void setSQ3(String sQ3) {
		SQ3 = sQ3;
	}

	public String getSQA1() {
		return SQA1;
	}

	public void setSQA1(String sQA1) {
		SQA1 = sQA1;
	}

	public String getSQA2() {
		return SQA2;
	}

	public void setSQA2(String sQA2) {
		SQA2 = sQA2;
	}

	public String getSQA3() {
		return SQA3;
	}

	public void setSQA3(String sQA3) {
		SQA3 = sQA3;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}
