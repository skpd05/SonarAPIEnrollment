package com.mc.demo.app.enrollement;

public class LoginResponse{
	private String message;
	private boolean isAuthenticated;
	private String cardnumber;
	private String custid;
	private String userid;
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the isAuthenticated
	 */
	public boolean isAuthenticated() {
		return isAuthenticated;
	}
	/**
	 * @param isAuthenticated the isAuthenticated to set
	 */
	public void setAuthenticated(boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}
	/**
	 * @return the cardnumber
	 */
	public String getCardnumber() {
		return cardnumber;
	}
	/**
	 * @param cardnumber the cardnumber to set
	 */
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	/**
	 * @return the custid
	 */
	public String getCustid() {
		return custid;
	}
	/**
	 * @param custid the custid to set
	 */
	public void setCustid(String custid) {
		this.custid = custid;
	}
	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	
}