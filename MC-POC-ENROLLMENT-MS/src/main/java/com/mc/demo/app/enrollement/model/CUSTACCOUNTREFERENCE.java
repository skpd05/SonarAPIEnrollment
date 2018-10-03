/**
 * 
 */
package com.mc.demo.app.enrollement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Wipro
 *
 */

@Entity
public class CUSTACCOUNTREFERENCE {
	
    @Id
	private String  ID; 
	private String  FROMRANGE; 
	private String  TORANGE; 
	private String  PROGRAMID; 
	private String  ICA; 
	private String  CREATED_AT; 
	private String  UPDATED_AT;
	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}
	/**
	 * @return the fROMRANGE
	 */
	public String getFROMRANGE() {
		return FROMRANGE;
	}
	/**
	 * @param fROMRANGE the fROMRANGE to set
	 */
	public void setFROMRANGE(String fROMRANGE) {
		FROMRANGE = fROMRANGE;
	}
	/**
	 * @return the tORANGE
	 */
	public String getTORANGE() {
		return TORANGE;
	}
	/**
	 * @param tORANGE the tORANGE to set
	 */
	public void setTORANGE(String tORANGE) {
		TORANGE = tORANGE;
	}
	/**
	 * @return the pROGRAMID
	 */
	public String getPROGRAMID() {
		return PROGRAMID;
	}
	/**
	 * @param pROGRAMID the pROGRAMID to set
	 */
	public void setPROGRAMID(String pROGRAMID) {
		PROGRAMID = pROGRAMID;
	}
	/**
	 * @return the iCA
	 */
	public String getICA() {
		return ICA;
	}
	/**
	 * @param iCA the iCA to set
	 */
	public void setICA(String iCA) {
		ICA = iCA;
	}
	/**
	 * @return the cREATED_AT
	 */
	public String getCREATED_AT() {
		return CREATED_AT;
	}
	/**
	 * @param cREATED_AT the cREATED_AT to set
	 */
	public void setCREATED_AT(String cREATED_AT) {
		CREATED_AT = cREATED_AT;
	}
	/**
	 * @return the uPDATED_AT
	 */
	public String getUPDATED_AT() {
		return UPDATED_AT;
	}
	/**
	 * @param uPDATED_AT the uPDATED_AT to set
	 */
	public void setUPDATED_AT(String uPDATED_AT) {
		UPDATED_AT = uPDATED_AT;
	}

	
	
	
}
