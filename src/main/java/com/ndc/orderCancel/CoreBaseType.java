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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A base type definition for Core Entity Object.
 * 
 * <p>Java class for CoreBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoreBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AugPointAssocs" type="{http://www.iata.org/IATA/EDIST/2017.2}AugPointAssocType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Key" type="{http://www.iata.org/IATA/EDIST/2017.2}InstanceClassSimpleType" /&gt;
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
@XmlType(name = "CoreBaseType", propOrder = {
    "augPointAssocs"
})
@XmlSeeAlso({
    PolicyType.class,
    LinkFormattedType.Link.class,
    LinkFormattedType.class
})
public class CoreBaseType {

    @XmlElement(name = "AugPointAssocs")
    protected AugPointAssocType augPointAssocs;
    @XmlAttribute(name = "Key")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String key;
    @XmlAttribute(name = "Owner")
    protected String owner;
    @XmlAttribute(name = "Seq")
    protected BigInteger seq;

    /**
     * Gets the value of the augPointAssocs property.
     * 
     * @return
     *     possible object is
     *     {@link AugPointAssocType }
     *     
     */
    public AugPointAssocType getAugPointAssocs() {
        return augPointAssocs;
    }

    /**
     * Sets the value of the augPointAssocs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AugPointAssocType }
     *     
     */
    public void setAugPointAssocs(AugPointAssocType value) {
        this.augPointAssocs = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
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
