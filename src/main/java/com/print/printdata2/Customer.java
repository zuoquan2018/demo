/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.print.printdata2;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Customer.
 * 
 * @version $Revision$ $Date$
 */
public class Customer implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _customerName.
     */
    private String _customerName;

    /**
     * Field _birthday.
     */
    private String _birthday;

    /**
     * Field _IDNo.
     */
    private String _IDNo;

    /**
     * Field _IDType.
     */
    private String _IDType;

    /**
     * Field _IDTypeName.
     */
    private String _IDTypeName;

    /**
     * Field _gender.
     */
    private String _gender;

    /**
     * Field _genderName.
     */
    private String _genderName;

    /**
     * Field _customerRemarks.
     */
    private String _customerRemarks;

    /**
     * Field _customerNo.
     */
    private String _customerNo;


      //----------------/
     //- Constructors -/
    //----------------/

    public Customer() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'birthday'.
     * 
     * @return the value of field 'Birthday'.
     */
    public String getBirthday(
    ) {
        return this._birthday;
    }

    /**
     * Returns the value of field 'customerName'.
     * 
     * @return the value of field 'CustomerName'.
     */
    public String getCustomerName(
    ) {
        return this._customerName;
    }

    /**
     * Returns the value of field 'customerNo'.
     * 
     * @return the value of field 'CustomerNo'.
     */
    public String getCustomerNo(
    ) {
        return this._customerNo;
    }

    /**
     * Returns the value of field 'customerRemarks'.
     * 
     * @return the value of field 'CustomerRemarks'.
     */
    public String getCustomerRemarks(
    ) {
        return this._customerRemarks;
    }

    /**
     * Returns the value of field 'gender'.
     * 
     * @return the value of field 'Gender'.
     */
    public String getGender(
    ) {
        return this._gender;
    }

    /**
     * Returns the value of field 'genderName'.
     * 
     * @return the value of field 'GenderName'.
     */
    public String getGenderName(
    ) {
        return this._genderName;
    }

    /**
     * Returns the value of field 'IDNo'.
     * 
     * @return the value of field 'IDNo'.
     */
    public String getIDNo(
    ) {
        return this._IDNo;
    }

    /**
     * Returns the value of field 'IDType'.
     * 
     * @return the value of field 'IDType'.
     */
    public String getIDType(
    ) {
        return this._IDType;
    }

    /**
     * Returns the value of field 'IDTypeName'.
     * 
     * @return the value of field 'IDTypeName'.
     */
    public String getIDTypeName(
    ) {
        return this._IDTypeName;
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
     * Sets the value of field 'birthday'.
     * 
     * @param birthday the value of field 'birthday'.
     */
    public void setBirthday(
            final String birthday) {
        this._birthday = birthday;
    }

    /**
     * Sets the value of field 'customerName'.
     * 
     * @param customerName the value of field 'customerName'.
     */
    public void setCustomerName(
            final String customerName) {
        this._customerName = customerName;
    }

    /**
     * Sets the value of field 'customerNo'.
     * 
     * @param customerNo the value of field 'customerNo'.
     */
    public void setCustomerNo(
            final String customerNo) {
        this._customerNo = customerNo;
    }

    /**
     * Sets the value of field 'customerRemarks'.
     * 
     * @param customerRemarks the value of field 'customerRemarks'.
     */
    public void setCustomerRemarks(
            final String customerRemarks) {
        this._customerRemarks = customerRemarks;
    }

    /**
     * Sets the value of field 'gender'.
     * 
     * @param gender the value of field 'gender'.
     */
    public void setGender(
            final String gender) {
        this._gender = gender;
    }

    /**
     * Sets the value of field 'genderName'.
     * 
     * @param genderName the value of field 'genderName'.
     */
    public void setGenderName(
            final String genderName) {
        this._genderName = genderName;
    }

    /**
     * Sets the value of field 'IDNo'.
     * 
     * @param IDNo the value of field 'IDNo'.
     */
    public void setIDNo(
            final String IDNo) {
        this._IDNo = IDNo;
    }

    /**
     * Sets the value of field 'IDType'.
     * 
     * @param IDType the value of field 'IDType'.
     */
    public void setIDType(
            final String IDType) {
        this._IDType = IDType;
    }

    /**
     * Sets the value of field 'IDTypeName'.
     * 
     * @param IDTypeName the value of field 'IDTypeName'.
     */
    public void setIDTypeName(
            final String IDTypeName) {
        this._IDTypeName = IDTypeName;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.print.printdata2.Customer
     */
    public static Customer unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (Customer) Unmarshaller.unmarshal(Customer.class, reader);
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
