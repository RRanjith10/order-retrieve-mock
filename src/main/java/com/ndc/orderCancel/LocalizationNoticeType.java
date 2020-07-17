//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.03 at 05:21:33 PM IST 
//


package com.ndc.orderCancel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Payload Content Localization Notice definition.
 * 
 * <p>Java class for LocalizationNoticeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalizationNoticeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}TrxProcessObjectBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Languages" minOccurs="0"/&gt;
 *         &lt;element name="Currencies" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}CurrCode" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalizationNoticeType", propOrder = {
    "languages",
    "currencies"
})
public class LocalizationNoticeType
    extends TrxProcessObjectBaseType
{

    @XmlElement(name = "Languages")
    protected Languages languages;
    @XmlElement(name = "Currencies")
    protected LocalizationNoticeType.Currencies currencies;

    /**
     * 
     *                                 Payload Content Language Representation Code(s). Notes: 1. Payload content localized
     *                                 language representation in support of I18N aware systems. 2. Language Code context is
     *                                 specified in the @Application attribute, e.g. Requested, Display.
     *                             
     * 
     * @return
     *     possible object is
     *     {@link Languages }
     *     
     */
    public Languages getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Languages }
     *     
     */
    public void setLanguages(Languages value) {
        this.languages = value;
    }

    /**
     * Gets the value of the currencies property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizationNoticeType.Currencies }
     *     
     */
    public LocalizationNoticeType.Currencies getCurrencies() {
        return currencies;
    }

    /**
     * Sets the value of the currencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizationNoticeType.Currencies }
     *     
     */
    public void setCurrencies(LocalizationNoticeType.Currencies value) {
        this.currencies = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}CurrCode" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "currCode"
    })
    public static class Currencies {

        @XmlElement(name = "CurrCode", required = true)
        protected List<CurrCode> currCode;

        /**
         * Gets the value of the currCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the currCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCurrCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CurrCode }
         * 
         * 
         */
        public List<CurrCode> getCurrCode() {
            if (currCode == null) {
                currCode = new ArrayList<CurrCode>();
            }
            return this.currCode;
        }

    }

}
