//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.03 at 05:21:33 PM IST 
//


package com.ndc.orderCancel;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A base type definition for Data List Object.
 * 
 * <p>Java class for ListBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ListToken" type="{http://www.iata.org/IATA/EDIST/2017.2}DescriptionSimpleType" /&gt;
 *       &lt;attribute name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.2}OwnerSimpleType" /&gt;
 *       &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListBaseType")
@XmlSeeAlso({
    AugPointListType.class
})
public class ListBaseType {

    @XmlAttribute(name = "ListToken")
    protected String listToken;
    @XmlAttribute(name = "Owner")
    protected String owner;
    @XmlAttribute(name = "Seq")
    protected BigInteger seq;

    /**
     * Gets the value of the listToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListToken() {
        return listToken;
    }

    /**
     * Sets the value of the listToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListToken(String value) {
        this.listToken = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeq(BigInteger value) {
        this.seq = value;
    }

}