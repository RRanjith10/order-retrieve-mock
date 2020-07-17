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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * OFFER TIME LIMIT SET (collection) definition.
 *             
 * 
 * <p>Java class for OfferTimeLimitSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferTimeLimitSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferExpiration" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType"&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectKeyMetaAttrGroup"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PriceGuaranteeTimeLimit" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType"&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectKeyMetaAttrGroup"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType" minOccurs="0"/&gt;
 *         &lt;element name="OtherLimits" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OtherLimit" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}TicketByTimeLimit"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectKeyMetaAttrGroup"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferTimeLimitSetType", propOrder = {
    "offerExpiration",
    "priceGuaranteeTimeLimit",
    "payment",
    "otherLimits"
})
public class OfferTimeLimitSetType {

    @XmlElement(name = "OfferExpiration")
    protected OfferTimeLimitSetType.OfferExpiration offerExpiration;
    @XmlElement(name = "PriceGuaranteeTimeLimit")
    protected OfferTimeLimitSetType.PriceGuaranteeTimeLimit priceGuaranteeTimeLimit;
    @XmlElement(name = "Payment")
    protected CoreDateGrpType payment;
    @XmlElement(name = "OtherLimits")
    protected OfferTimeLimitSetType.OtherLimits otherLimits;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the offerExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link OfferTimeLimitSetType.OfferExpiration }
     *     
     */
    public OfferTimeLimitSetType.OfferExpiration getOfferExpiration() {
        return offerExpiration;
    }

    /**
     * Sets the value of the offerExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferTimeLimitSetType.OfferExpiration }
     *     
     */
    public void setOfferExpiration(OfferTimeLimitSetType.OfferExpiration value) {
        this.offerExpiration = value;
    }

    /**
     * Gets the value of the priceGuaranteeTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link OfferTimeLimitSetType.PriceGuaranteeTimeLimit }
     *     
     */
    public OfferTimeLimitSetType.PriceGuaranteeTimeLimit getPriceGuaranteeTimeLimit() {
        return priceGuaranteeTimeLimit;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferTimeLimitSetType.PriceGuaranteeTimeLimit }
     *     
     */
    public void setPriceGuaranteeTimeLimit(OfferTimeLimitSetType.PriceGuaranteeTimeLimit value) {
        this.priceGuaranteeTimeLimit = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link CoreDateGrpType }
     *     
     */
    public CoreDateGrpType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoreDateGrpType }
     *     
     */
    public void setPayment(CoreDateGrpType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the otherLimits property.
     * 
     * @return
     *     possible object is
     *     {@link OfferTimeLimitSetType.OtherLimits }
     *     
     */
    public OfferTimeLimitSetType.OtherLimits getOtherLimits() {
        return otherLimits;
    }

    /**
     * Sets the value of the otherLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferTimeLimitSetType.OtherLimits }
     *     
     */
    public void setOtherLimits(OfferTimeLimitSetType.OtherLimits value) {
        this.otherLimits = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Object>();
        }
        return this.refs;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType"&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectKeyMetaAttrGroup"/&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OfferExpiration
        extends CoreDateGrpType
    {

        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ObjectKey")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String objectKey;

        /**
         * Gets the value of the refs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getRefs() {
            if (refs == null) {
                refs = new ArrayList<Object>();
            }
            return this.refs;
        }

        /**
         * Gets the value of the objectKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectKey() {
            return objectKey;
        }

        /**
         * Sets the value of the objectKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjectKey(String value) {
            this.objectKey = value;
        }

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
     *         &lt;element name="OtherLimit" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}TicketByTimeLimit"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectKeyMetaAttrGroup"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "otherLimit"
    })
    public static class OtherLimits {

        @XmlElement(name = "OtherLimit", required = true)
        protected List<OfferTimeLimitSetType.OtherLimits.OtherLimit> otherLimit;

        /**
         * Gets the value of the otherLimit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherLimit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherLimit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OfferTimeLimitSetType.OtherLimits.OtherLimit }
         * 
         * 
         */
        public List<OfferTimeLimitSetType.OtherLimits.OtherLimit> getOtherLimit() {
            if (otherLimit == null) {
                otherLimit = new ArrayList<OfferTimeLimitSetType.OtherLimits.OtherLimit>();
            }
            return this.otherLimit;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}TicketByTimeLimit"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectKeyMetaAttrGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ticketByTimeLimit"
        })
        public static class OtherLimit {

            @XmlElement(name = "TicketByTimeLimit", required = true)
            protected TicketByTimeLimitType ticketByTimeLimit;
            @XmlAttribute(name = "refs")
            @XmlIDREF
            protected List<Object> refs;
            @XmlAttribute(name = "ObjectKey")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String objectKey;

            /**
             * Gets the value of the ticketByTimeLimit property.
             * 
             * @return
             *     possible object is
             *     {@link TicketByTimeLimitType }
             *     
             */
            public TicketByTimeLimitType getTicketByTimeLimit() {
                return ticketByTimeLimit;
            }

            /**
             * Sets the value of the ticketByTimeLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketByTimeLimitType }
             *     
             */
            public void setTicketByTimeLimit(TicketByTimeLimitType value) {
                this.ticketByTimeLimit = value;
            }

            /**
             * Gets the value of the refs property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the refs property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRefs().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getRefs() {
                if (refs == null) {
                    refs = new ArrayList<Object>();
                }
                return this.refs;
            }

            /**
             * Gets the value of the objectKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObjectKey() {
                return objectKey;
            }

            /**
             * Sets the value of the objectKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObjectKey(String value) {
                this.objectKey = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreDateGrpType"&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjectKeyMetaAttrGroup"/&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PriceGuaranteeTimeLimit
        extends CoreDateGrpType
    {

        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ObjectKey")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String objectKey;

        /**
         * Gets the value of the refs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getRefs() {
            if (refs == null) {
                refs = new ArrayList<Object>();
            }
            return this.refs;
        }

        /**
         * Gets the value of the objectKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectKey() {
            return objectKey;
        }

        /**
         * Sets the value of the objectKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjectKey(String value) {
            this.objectKey = value;
        }

    }

}