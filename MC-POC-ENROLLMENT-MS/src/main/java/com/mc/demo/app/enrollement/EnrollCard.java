package com.mc.demo.app.enrollement;

import java.sql.Date;

import javax.validation.constraints.NotEmpty;

public class EnrollCard {

	@NotEmpty(message = "CardNumber is required")
	private String cardnumber;

	@NotEmpty(message = "SSN is required")
	private String ssn;

	//@NotEmpty(message = "DOB is required")
	private String dob;   /**	"2002-10-02" */


	

	private String zipcode;

	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return String.format("EnrollCard [cardnumber=%s, ssn=%s, dob=%s, zipcode=%s]", cardnumber, ssn, dob, zipcode);
	}

}
