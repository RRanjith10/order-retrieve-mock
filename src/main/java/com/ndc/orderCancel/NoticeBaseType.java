//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.03 at 05:21:33 PM IST 
//


package com.ndc.orderCancel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * COMMON NOTICES definition.
 * 
 * <p>Java class for NoticeBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoticeBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Localization" type="{http://www.iata.org/IATA/EDIST/2017.2}LocalizationNoticeType" minOccurs="0"/&gt;
 *         &lt;element name="InfoPolicies" type="{http://www.iata.org/IATA/EDIST/2017.2}InfoPolicyNoticeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoticeBaseType", propOrder = {
    "localization",
    "infoPolicies"
})
public class NoticeBaseType {

    @XmlElement(name = "Localization")
    protected LocalizationNoticeType localization;
    @XmlElement(name = "InfoPolicies")
    protected InfoPolicyNoticeType infoPolicies;

    /**
     * Gets the value of the localization property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizationNoticeType }
     *     
     */
    public LocalizationNoticeType getLocalization() {
        return localization;
    }

    /**
     * Sets the value of the localization property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizationNoticeType }
     *     
     */
    public void setLocalization(LocalizationNoticeType value) {
        this.localization = value;
    }

    /**
     * Gets the value of the infoPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link InfoPolicyNoticeType }
     *     
     */
    public InfoPolicyNoticeType getInfoPolicies() {
        return infoPolicies;
    }

    /**
     * Sets the value of the infoPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoPolicyNoticeType }
     *     
     */
    public void setInfoPolicies(InfoPolicyNoticeType value) {
        this.infoPolicies = value;
    }

}
