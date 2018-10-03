/**
 * 
 */
package com.mc.demo.app.enrollement;

/**
 * @author skpd
 *
 */
public class CardEnrolled {

	private String cardNumber;

	private String programID;
	
	private String message;
	
	private boolean isEnrolledAlready;
	
	private String userid;

	
	public CardEnrolled(String msg){
		this.message = msg;
	}
	
	public CardEnrolled(){

	}
	
	/**
	 * @return the programID
	 */
	public String getProgramID() {
		return programID;
	}

	/**
	 * @param programID
	 *            the programID to set
	 */
	public void setProgramID(String programID) {
		this.programID = programID;
	}

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
	 * @return the isEnrolledAlready
	 */
	public boolean isEnrolledAlready() {
		return isEnrolledAlready;
	}

	/**
	 * @param isEnrolledAlready the isEnrolledAlready to set
	 */
	public void setEnrolledAlready(boolean isEnrolledAlready) {
		this.isEnrolledAlready = isEnrolledAlready;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
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
