/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.print.printdata3;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class CaseReport.
 * 
 * @version $Revision$ $Date$
 */
public class CaseReport implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _accReason.
     */
    private String _accReason;

    /**
     * Field _accReasonName.
     */
    private String _accReasonName;

    /**
     * Field _accDate.
     */
    private String _accDate;

    /**
     * Field _hospitalCode.
     */
    private String _hospitalCode;

    /**
     * Field _hospitalName.
     */
    private String _hospitalName;

    /**
     * Field _claimPay.
     */
    private String _claimPay;

    /**
     * Field _accGrade.
     */
    private String _accGrade;

    /**
     * Field _accGradeName.
     */
    private String _accGradeName;

    /**
     * Field _accSite.
     */
    private String _accSite;

    /**
     * Field _accDesc.
     */
    private String _accDesc;

    /**
     * Field _caseRemark.
     */
    private String _caseRemark;

    /**
     * Field _claimType.
     */
    private String _claimType;


      //----------------/
     //- Constructors -/
    //----------------/

    public CaseReport() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'accDate'.
     * 
     * @return the value of field 'AccDate'.
     */
    public String getAccDate(
    ) {
        return this._accDate;
    }

    /**
     * Returns the value of field 'accDesc'.
     * 
     * @return the value of field 'AccDesc'.
     */
    public String getAccDesc(
    ) {
        return this._accDesc;
    }

    /**
     * Returns the value of field 'accGrade'.
     * 
     * @return the value of field 'AccGrade'.
     */
    public String getAccGrade(
    ) {
        return this._accGrade;
    }

    /**
     * Returns the value of field 'accGradeName'.
     * 
     * @return the value of field 'AccGradeName'.
     */
    public String getAccGradeName(
    ) {
        return this._accGradeName;
    }

    /**
     * Returns the value of field 'accReason'.
     * 
     * @return the value of field 'AccReason'.
     */
    public String getAccReason(
    ) {
        return this._accReason;
    }

    /**
     * Returns the value of field 'accReasonName'.
     * 
     * @return the value of field 'AccReasonName'.
     */
    public String getAccReasonName(
    ) {
        return this._accReasonName;
    }

    /**
     * Returns the value of field 'accSite'.
     * 
     * @return the value of field 'AccSite'.
     */
    public String getAccSite(
    ) {
        return this._accSite;
    }

    /**
     * Returns the value of field 'caseRemark'.
     * 
     * @return the value of field 'CaseRemark'.
     */
    public String getCaseRemark(
    ) {
        return this._caseRemark;
    }

    /**
     * Returns the value of field 'claimPay'.
     * 
     * @return the value of field 'ClaimPay'.
     */
    public String getClaimPay(
    ) {
        return this._claimPay;
    }

    /**
     * Returns the value of field 'claimType'.
     * 
     * @return the value of field 'ClaimType'.
     */
    public String getClaimType(
    ) {
        return this._claimType;
    }

    /**
     * Returns the value of field 'hospitalCode'.
     * 
     * @return the value of field 'HospitalCode'.
     */
    public String getHospitalCode(
    ) {
        return this._hospitalCode;
    }

    /**
     * Returns the value of field 'hospitalName'.
     * 
     * @return the value of field 'HospitalName'.
     */
    public String getHospitalName(
    ) {
        return this._hospitalName;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'accDate'.
     * 
     * @param accDate the value of field 'accDate'.
     */
    public void setAccDate(
            final String accDate) {
        this._accDate = accDate;
    }

    /**
     * Sets the value of field 'accDesc'.
     * 
     * @param accDesc the value of field 'accDesc'.
     */
    public void setAccDesc(
            final String accDesc) {
        this._accDesc = accDesc;
    }

    /**
     * Sets the value of field 'accGrade'.
     * 
     * @param accGrade the value of field 'accGrade'.
     */
    public void setAccGrade(
            final String accGrade) {
        this._accGrade = accGrade;
    }

    /**
     * Sets the value of field 'accGradeName'.
     * 
     * @param accGradeName the value of field 'accGradeName'.
     */
    public void setAccGradeName(
            final String accGradeName) {
        this._accGradeName = accGradeName;
    }

    /**
     * Sets the value of field 'accReason'.
     * 
     * @param accReason the value of field 'accReason'.
     */
    public void setAccReason(
            final String accReason) {
        this._accReason = accReason;
    }

    /**
     * Sets the value of field 'accReasonName'.
     * 
     * @param accReasonName the value of field 'accReasonName'.
     */
    public void setAccReasonName(
            final String accReasonName) {
        this._accReasonName = accReasonName;
    }

    /**
     * Sets the value of field 'accSite'.
     * 
     * @param accSite the value of field 'accSite'.
     */
    public void setAccSite(
            final String accSite) {
        this._accSite = accSite;
    }

    /**
     * Sets the value of field 'caseRemark'.
     * 
     * @param caseRemark the value of field 'caseRemark'.
     */
    public void setCaseRemark(
            final String caseRemark) {
        this._caseRemark = caseRemark;
    }

    /**
     * Sets the value of field 'claimPay'.
     * 
     * @param claimPay the value of field 'claimPay'.
     */
    public void setClaimPay(
            final String claimPay) {
        this._claimPay = claimPay;
    }

    /**
     * Sets the value of field 'claimType'.
     * 
     * @param claimType the value of field 'claimType'.
     */
    public void setClaimType(
            final String claimType) {
        this._claimType = claimType;
    }

    /**
     * Sets the value of field 'hospitalCode'.
     * 
     * @param hospitalCode the value of field 'hospitalCode'.
     */
    public void setHospitalCode(
            final String hospitalCode) {
        this._hospitalCode = hospitalCode;
    }

    /**
     * Sets the value of field 'hospitalName'.
     * 
     * @param hospitalName the value of field 'hospitalName'.
     */
    public void setHospitalName(
            final String hospitalName) {
        this._hospitalName = hospitalName;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.print.printdata3.CaseReport
     */
    public static CaseReport unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (CaseReport) Unmarshaller.unmarshal(CaseReport.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
