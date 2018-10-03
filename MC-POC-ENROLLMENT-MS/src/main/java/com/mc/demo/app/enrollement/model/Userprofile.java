/**
 * 
 */
package com.mc.demo.app.enrollement.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Wipro
 *
 */
@Entity
public class Userprofile {

	@Id
	private String userid;
	private String pswd;
	private String accountnumber;
	private String emailid;
	private String mobilenumber;
	private String communicationaddress;
	private String sq1 ;
	private String sq2;
	private String sq3;
	private String sqa1; 
	private String sqa2;
	private String sqa3; 
	private Timestamp created_at; 
	private Timestamp updated_at;
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
	/**
	 * @return the pswd
	 */
	public String getPswd() {
		return pswd;
	}
	/**
	 * @param pswd the pswd to set
	 */
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	/**
	 * @return the accountnumber
	 */
	public String getAccountnumber() {
		return accountnumber;
	}
	/**
	 * @param accountnumber the accountnumber to set
	 */
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	/**
	 * @return the emailid
	 */
	public String getEmailid() {
		return emailid;
	}
	/**
	 * @param emailid the emailid to set
	 */
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	/**
	 * @return the mobilenumber
	 */
	public String getMobilenumber() {
		return mobilenumber;
	}
	/**
	 * @param mobilenumber the mobilenumber to set
	 */
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	/**
	 * @return the communicationaddress
	 */
	public String getCommunicationaddress() {
		return communicationaddress;
	}
	/**
	 * @param communicationaddress the communicationaddress to set
	 */
	public void setCommunicationaddress(String communicationaddress) {
		this.communicationaddress = communicationaddress;
	}
	/**
	 * @return the sq1
	 */
	public String getSq1() {
		return sq1;
	}
	/**
	 * @param sq1 the sq1 to set
	 */
	public void setSq1(String sq1) {
		this.sq1 = sq1;
	}
	/**
	 * @return the sq2
	 */
	public String getSq2() {
		return sq2;
	}
	/**
	 * @param sq2 the sq2 to set
	 */
	public void setSq2(String sq2) {
		this.sq2 = sq2;
	}
	/**
	 * @return the sq3
	 */
	public String getSq3() {
		return sq3;
	}
	/**
	 * @param sq3 the sq3 to set
	 */
	public void setSq3(String sq3) {
		this.sq3 = sq3;
	}
	/**
	 * @return the sqa1
	 */
	public String getSqa1() {
		return sqa1;
	}
	/**
	 * @param sqa1 the sqa1 to set
	 */
	public void setSqa1(String sqa1) {
		this.sqa1 = sqa1;
	}
	/**
	 * @return the sqa2
	 */
	public String getSqa2() {
		return sqa2;
	}
	/**
	 * @param sqa2 the sqa2 to set
	 */
	public void setSqa2(String sqa2) {
		this.sqa2 = sqa2;
	}
	/**
	 * @return the sqa3
	 */
	public String getSqa3() {
		return sqa3;
	}
	/**
	 * @param sqa3 the sqa3 to set
	 */
	public void setSqa3(String sqa3) {
		this.sqa3 = sqa3;
	}
	/**
	 * @return the created_at
	 */
	public Timestamp getCreated_at() {
		return created_at;
	}
	/**
	 * @param created_at the created_at to set
	 */
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	/**
	 * @return the updated_at
	 */
	public Timestamp getUpdated_at() {
		return updated_at;
	}
	/**
	 * @param updated_at the updated_at to set
	 */
	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	

	
	
	
}
