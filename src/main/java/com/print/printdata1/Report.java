/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.print.printdata1;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Report.
 * 
 * @version $Revision$ $Date$
 */
public class Report implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _appntNo.
     */
    private String _appntNo;

    /**
     * Field _appntName.
     */
    private String _appntName;

    /**
     * Field _rptName.
     */
    private String _rptName;

    /**
     * Field _rptPhone.
     */
    private String _rptPhone;

    /**
     * Field _rptMode.
     */
    private String _rptMode;

    /**
     * Field _rptModeName.
     */
    private String _rptModeName;

    /**
     * Field _relation.
     */
    private String _relation;

    /**
     * Field _relationName.
     */
    private String _relationName;

    /**
     * Field _rptDate.
     */
    private String _rptDate;

    /**
     * Field _rptCom.
     */
    private String _rptCom;

    /**
     * Field _rptConfOperator.
     */
    private String _rptConfOperator;

    /**
     * Field _rptConfDate.
     */
    private String _rptConfDate;

    /**
     * Field _rgtClass.
     */
    private String _rgtClass;

    /**
     * Field _customerNoQ.
     */
    private String _customerNoQ;

    /**
     * Field _customerNameQ.
     */
    private String _customerNameQ;


      //----------------/
     //- Constructors -/
    //----------------/

    public Report() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'appntName'.
     * 
     * @return the value of field 'AppntName'.
     */
    public String getAppntName(
    ) {
        return this._appntName;
    }

    /**
     * Returns the value of field 'appntNo'.
     * 
     * @return the value of field 'AppntNo'.
     */
    public String getAppntNo(
    ) {
        return this._appntNo;
    }

    /**
     * Returns the value of field 'customerNameQ'.
     * 
     * @return the value of field 'CustomerNameQ'.
     */
    public String getCustomerNameQ(
    ) {
        return this._customerNameQ;
    }

    /**
     * Returns the value of field 'customerNoQ'.
     * 
     * @return the value of field 'CustomerNoQ'.
     */
    public String getCustomerNoQ(
    ) {
        return this._customerNoQ;
    }

    /**
     * Returns the value of field 'relation'.
     * 
     * @return the value of field 'Relation'.
     */
    public String getRelation(
    ) {
        return this._relation;
    }

    /**
     * Returns the value of field 'relationName'.
     * 
     * @return the value of field 'RelationName'.
     */
    public String getRelationName(
    ) {
        return this._relationName;
    }

    /**
     * Returns the value of field 'rgtClass'.
     * 
     * @return the value of field 'RgtClass'.
     */
    public String getRgtClass(
    ) {
        return this._rgtClass;
    }

    /**
     * Returns the value of field 'rptCom'.
     * 
     * @return the value of field 'RptCom'.
     */
    public String getRptCom(
    ) {
        return this._rptCom;
    }

    /**
     * Returns the value of field 'rptConfDate'.
     * 
     * @return the value of field 'RptConfDate'.
     */
    public String getRptConfDate(
    ) {
        return this._rptConfDate;
    }

    /**
     * Returns the value of field 'rptConfOperator'.
     * 
     * @return the value of field 'RptConfOperator'.
     */
    public String getRptConfOperator(
    ) {
        return this._rptConfOperator;
    }

    /**
     * Returns the value of field 'rptDate'.
     * 
     * @return the value of field 'RptDate'.
     */
    public String getRptDate(
    ) {
        return this._rptDate;
    }

    /**
     * Returns the value of field 'rptMode'.
     * 
     * @return the value of field 'RptMode'.
     */
    public String getRptMode(
    ) {
        return this._rptMode;
    }

    /**
     * Returns the value of field 'rptModeName'.
     * 
     * @return the value of field 'RptModeName'.
     */
    public String getRptModeName(
    ) {
        return this._rptModeName;
    }

    /**
     * Returns the value of field 'rptName'.
     * 
     * @return the value of field 'RptName'.
     */
    public String getRptName(
    ) {
        return this._rptName;
    }

    /**
     * Returns the value of field 'rptPhone'.
     * 
     * @return the value of field 'RptPhone'.
     */
    public String getRptPhone(
    ) {
        return this._rptPhone;
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
     * Sets the value of field 'appntName'.
     * 
     * @param appntName the value of field 'appntName'.
     */
    public void setAppntName(
            final String appntName) {
        this._appntName = appntName;
    }

    /**
     * Sets the value of field 'appntNo'.
     * 
     * @param appntNo the value of field 'appntNo'.
     */
    public void setAppntNo(
            final String appntNo) {
        this._appntNo = appntNo;
    }

    /**
     * Sets the value of field 'customerNameQ'.
     * 
     * @param customerNameQ the value of field 'customerNameQ'.
     */
    public void setCustomerNameQ(
            final String customerNameQ) {
        this._customerNameQ = customerNameQ;
    }

    /**
     * Sets the value of field 'customerNoQ'.
     * 
     * @param customerNoQ the value of field 'customerNoQ'.
     */
    public void setCustomerNoQ(
            final String customerNoQ) {
        this._customerNoQ = customerNoQ;
    }

    /**
     * Sets the value of field 'relation'.
     * 
     * @param relation the value of field 'relation'.
     */
    public void setRelation(
            final String relation) {
        this._relation = relation;
    }

    /**
     * Sets the value of field 'relationName'.
     * 
     * @param relationName the value of field 'relationName'.
     */
    public void setRelationName(
            final String relationName) {
        this._relationName = relationName;
    }

    /**
     * Sets the value of field 'rgtClass'.
     * 
     * @param rgtClass the value of field 'rgtClass'.
     */
    public void setRgtClass(
            final String rgtClass) {
        this._rgtClass = rgtClass;
    }

    /**
     * Sets the value of field 'rptCom'.
     * 
     * @param rptCom the value of field 'rptCom'.
     */
    public void setRptCom(
            final String rptCom) {
        this._rptCom = rptCom;
    }

    /**
     * Sets the value of field 'rptConfDate'.
     * 
     * @param rptConfDate the value of field 'rptConfDate'.
     */
    public void setRptConfDate(
            final String rptConfDate) {
        this._rptConfDate = rptConfDate;
    }

    /**
     * Sets the value of field 'rptConfOperator'.
     * 
     * @param rptConfOperator the value of field 'rptConfOperator'.
     */
    public void setRptConfOperator(
            final String rptConfOperator) {
        this._rptConfOperator = rptConfOperator;
    }

    /**
     * Sets the value of field 'rptDate'.
     * 
     * @param rptDate the value of field 'rptDate'.
     */
    public void setRptDate(
            final String rptDate) {
        this._rptDate = rptDate;
    }

    /**
     * Sets the value of field 'rptMode'.
     * 
     * @param rptMode the value of field 'rptMode'.
     */
    public void setRptMode(
            final String rptMode) {
        this._rptMode = rptMode;
    }

    /**
     * Sets the value of field 'rptModeName'.
     * 
     * @param rptModeName the value of field 'rptModeName'.
     */
    public void setRptModeName(
            final String rptModeName) {
        this._rptModeName = rptModeName;
    }

    /**
     * Sets the value of field 'rptName'.
     * 
     * @param rptName the value of field 'rptName'.
     */
    public void setRptName(
            final String rptName) {
        this._rptName = rptName;
    }

    /**
     * Sets the value of field 'rptPhone'.
     * 
     * @param rptPhone the value of field 'rptPhone'.
     */
    public void setRptPhone(
            final String rptPhone) {
        this._rptPhone = rptPhone;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.print.printdata1.Report
     */
    public static Report unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (Report) Unmarshaller.unmarshal(Report.class, reader);
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
