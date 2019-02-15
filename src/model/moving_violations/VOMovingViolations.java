package model.moving_violations;


/**
 * Representation of a Trip object
 */
public class VOMovingViolations {

	//	OBJECTID,ROW_,LOCATION,ADDRESS_ID,STREETSEGID,XCOORD,YCOORD,TICKETTYPE,FINEAMT,TOTALPAID,PENALTY1,PENALTY2,ACCIDENTINDICATOR,TICKETISSUEDATE,VIOLATIONCODE,VIOLATIONDESC,ROW_ID


	private int OBJECTID;
	private int ROW;
	private String LOCATION;
	private int ADDRESS_ID;
	private int STREETSEG;
	private int XCOOR;
	private int YCOOR;
	private String TICKETTYPE;
	private int FINEAMT;
	private int TOTALPAID;
	private int PENALTY1;
	private int PENALTY2;
	private String ACCIDENTINDICATOR;
	private String TICKETISSUEDATE;
	private int VIOLATIONCODE;
	private int VIOLATIONDESC;
	private String ROW_ID;


	







	public VOMovingViolations(int oBJECTID, int rOW, String lOCATION, int aDDRESS_ID, int sTREETSEG, int xCOOR,
			int yCOOR, String tICKETTYPE, int fINEAMT, int tOTALPAID, int pENALTY1, int pENALTY2,
			String aCCIDENTINDICATOR, String tICKETISSUEDATE, int vIOLATIONCODE, int vIOLATIONDESC, String rOW_ID) {
		super();
		OBJECTID = oBJECTID;
		ROW = rOW;
		LOCATION = lOCATION;
		ADDRESS_ID = aDDRESS_ID;
		STREETSEG = sTREETSEG;
		XCOOR = xCOOR;
		YCOOR = yCOOR;
		TICKETTYPE = tICKETTYPE;
		FINEAMT = fINEAMT;
		TOTALPAID = tOTALPAID;
		PENALTY1 = pENALTY1;
		PENALTY2 = pENALTY2;
		ACCIDENTINDICATOR = aCCIDENTINDICATOR;
		TICKETISSUEDATE = tICKETISSUEDATE;
		VIOLATIONCODE = vIOLATIONCODE;
		VIOLATIONDESC = vIOLATIONDESC;
		ROW_ID = rOW_ID;
	}





	/**
	 * @return the aCCIDENTINDICATOR
	 */
	public String getACCIDENTINDICATOR() {
		return ACCIDENTINDICATOR;
	}





	/**
	 * @param aCCIDENTINDICATOR the aCCIDENTINDICATOR to set
	 */
	public void setACCIDENTINDICATOR(String aCCIDENTINDICATOR) {
		ACCIDENTINDICATOR = aCCIDENTINDICATOR;
	}





	/**
	 * @return the aDDRESS_ID
	 */
	public int getADDRESS_ID() {
		return ADDRESS_ID;
	}





	/**
	 * @param aDDRESS_ID the aDDRESS_ID to set
	 */
	public void setADDRESS_ID(int aDDRESS_ID) {
		ADDRESS_ID = aDDRESS_ID;
	}





	/**
	 * @return the fINEAMT
	 */
	public int getFINEAMT() {
		return FINEAMT;
	}





	/**
	 * @param fINEAMT the fINEAMT to set
	 */
	public void setFINEAMT(int fINEAMT) {
		FINEAMT = fINEAMT;
	}





	/**
	 * @return the lOCATION
	 */
	public String getLOCATION() {
		return LOCATION;
	}





	/**
	 * @param lOCATION the lOCATION to set
	 */
	public void setLOCATION(String lOCATION) {
		LOCATION = lOCATION;
	}





	/**
	 * @return the oBJECTID
	 */
	public int getOBJECTID() {
		return OBJECTID;
	}





	/**
	 * @param oBJECTID the oBJECTID to set
	 */
	public void setOBJECTID(int oBJECTID) {
		OBJECTID = oBJECTID;
	}





	/**
	 * @return the pENALTY1
	 */
	public int getPENALTY1() {
		return PENALTY1;
	}





	/**
	 * @param pENALTY1 the pENALTY1 to set
	 */
	public void setPENALTY1(int pENALTY1) {
		PENALTY1 = pENALTY1;
	}





	/**
	 * @return the pENALTY2
	 */
	public int getPENALTY2() {
		return PENALTY2;
	}





	/**
	 * @param pENALTY2 the pENALTY2 to set
	 */
	public void setPENALTY2(int pENALTY2) {
		PENALTY2 = pENALTY2;
	}





	/**
	 * @return the rOW
	 */
	public int getROW() {
		return ROW;
	}





	/**
	 * @param rOW the rOW to set
	 */
	public void setROW(int rOW) {
		ROW = rOW;
	}





	/**
	 * @return the rOW_ID
	 */
	public String getROW_ID() {
		return ROW_ID;
	}





	/**
	 * @param rOW_ID the rOW_ID to set
	 */
	public void setROW_ID(String rOW_ID) {
		ROW_ID = rOW_ID;
	}





	/**
	 * @return the sTREETSEG
	 */
	public int getSTREETSEG() {
		return STREETSEG;
	}





	/**
	 * @param sTREETSEG the sTREETSEG to set
	 */
	public void setSTREETSEG(int sTREETSEG) {
		STREETSEG = sTREETSEG;
	}





	/**
	 * @return the tICKETISSUEDATE
	 */
	public String getTICKETISSUEDATE() {
		return TICKETISSUEDATE;
	}





	/**
	 * @param tICKETISSUEDATE the tICKETISSUEDATE to set
	 */
	public void setTICKETISSUEDATE(String tICKETISSUEDATE) {
		TICKETISSUEDATE = tICKETISSUEDATE;
	}





	/**
	 * @return the tICKETTYPE
	 */
	public String getTICKETTYPE() {
		return TICKETTYPE;
	}





	/**
	 * @param tICKETTYPE the tICKETTYPE to set
	 */
	public void setTICKETTYPE(String tICKETTYPE) {
		TICKETTYPE = tICKETTYPE;
	}





	/**
	 * @return the tOTALPAID
	 */
	public int getTOTALPAID() {
		return TOTALPAID;
	}





	/**
	 * @param tOTALPAID the tOTALPAID to set
	 */
	public void setTOTALPAID(int tOTALPAID) {
		TOTALPAID = tOTALPAID;
	}





	/**
	 * @return the vIOLATIONCODE
	 */
	public int getVIOLATIONCODE() {
		return VIOLATIONCODE;
	}





	/**
	 * @param vIOLATIONCODE the vIOLATIONCODE to set
	 */
	public void setVIOLATIONCODE(int vIOLATIONCODE) {
		VIOLATIONCODE = vIOLATIONCODE;
	}





	/**
	 * @return the vIOLATIONDESC
	 */
	public int getVIOLATIONDESC() {
		return VIOLATIONDESC;
	}





	/**
	 * @param vIOLATIONDESC the vIOLATIONDESC to set
	 */
	public void setVIOLATIONDESC(int vIOLATIONDESC) {
		VIOLATIONDESC = vIOLATIONDESC;
	}





	/**
	 * @return the xCOOR
	 */
	public int getXCOOR() {
		return XCOOR;
	}





	/**
	 * @param xCOOR the xCOOR to set
	 */
	public void setXCOOR(int xCOOR) {
		XCOOR = xCOOR;
	}





	/**
	 * @return the yCOOR
	 */
	public int getYCOOR() {
		return YCOOR;
	}





	/**
	 * @param yCOOR the yCOOR to set
	 */
	public void setYCOOR(int yCOOR) {
		YCOOR = yCOOR;
	}


}
