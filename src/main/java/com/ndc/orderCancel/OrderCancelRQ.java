//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.03 at 05:21:33 PM IST 
//


package com.ndc.orderCancel;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}PointOfSale" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Document"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Party"/&gt;
 *         &lt;element name="OrderCancelParameters" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Reason" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/&gt;
 *                   &lt;element name="RefundFOP_Preference" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice minOccurs="0"&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Voucher" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}PaymentCard" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Cash" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}BankAccount" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Check" minOccurs="0"/&gt;
 *                             &lt;element name="CarrierCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                           &lt;/choice&gt;
 *                           &lt;attribute name="OriginalFOP_Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExpectedRefundAmount" type="{http://www.iata.org/IATA/EDIST/2017.2}DetailCurrencyPriceType" minOccurs="0"/&gt;
 *         &lt;element name="Query"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Order" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="OrderID" use="required" type="{http://www.iata.org/IATA/EDIST/2017.2}UniqueID_SimpleType" /&gt;
 *                           &lt;attribute name="Owner" use="required" type="{http://www.iata.org/IATA/EDIST/2017.2}AirlineDesigSimpleType" /&gt;
 *                           &lt;attribute name="OwnerType"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="ORA"/&gt;
 *                                 &lt;enumeration value="POA"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="WebAddressID" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                           &lt;attribute name="MetadataRefs" type="{http://www.iata.org/IATA/EDIST/2017.2}InstanceClassRefSimpleType" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}BookingReferences" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}IATA_PayloadStdAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pointOfSale",
    "document",
    "party",
    "orderCancelParameters",
    "expectedRefundAmount",
    "query"
})
@XmlRootElement(name = "OrderCancelRQ")
public class OrderCancelRQ {

    @XmlElement(name = "PointOfSale")
    protected PointOfSaleType pointOfSale;
    @XmlElement(name = "Document", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Party", required = true)
    protected MsgPartiesType party;
    @XmlElement(name = "OrderCancelParameters")
    protected OrderCancelRQ.OrderCancelParameters orderCancelParameters;
    @XmlElement(name = "ExpectedRefundAmount")
    protected DetailCurrencyPriceType expectedRefundAmount;
    @XmlElement(name = "Query", required = true)
    protected OrderCancelRQ.Query query;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String target;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transactionStatusCode;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;
    @XmlAttribute(name = "CorrelationID")
    protected String correlationID;
    @XmlAttribute(name = "AsynchronousAllowedInd")
    protected Boolean asynchronousAllowedInd;
    @XmlAttribute(name = "PrimaryLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String altLangID;

    /**
     * Gets the value of the pointOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSaleType }
     *     
     */
    public PointOfSaleType getPointOfSale() {
        return pointOfSale;
    }

    /**
     * Sets the value of the pointOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSaleType }
     *     
     */
    public void setPointOfSale(PointOfSaleType value) {
        this.pointOfSale = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link MsgDocumentType }
     *     
     */
    public MsgDocumentType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgDocumentType }
     *     
     */
    public void setDocument(MsgDocumentType value) {
        this.document = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link MsgPartiesType }
     *     
     */
    public MsgPartiesType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgPartiesType }
     *     
     */
    public void setParty(MsgPartiesType value) {
        this.party = value;
    }

    /**
     * Gets the value of the orderCancelParameters property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCancelRQ.OrderCancelParameters }
     *     
     */
    public OrderCancelRQ.OrderCancelParameters getOrderCancelParameters() {
        return orderCancelParameters;
    }

    /**
     * Sets the value of the orderCancelParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCancelRQ.OrderCancelParameters }
     *     
     */
    public void setOrderCancelParameters(OrderCancelRQ.OrderCancelParameters value) {
        this.orderCancelParameters = value;
    }

    /**
     * Gets the value of the expectedRefundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DetailCurrencyPriceType }
     *     
     */
    public DetailCurrencyPriceType getExpectedRefundAmount() {
        return expectedRefundAmount;
    }

    /**
     * Sets the value of the expectedRefundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailCurrencyPriceType }
     *     
     */
    public void setExpectedRefundAmount(DetailCurrencyPriceType value) {
        this.expectedRefundAmount = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCancelRQ.Query }
     *     
     */
    public OrderCancelRQ.Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCancelRQ.Query }
     *     
     */
    public void setQuery(OrderCancelRQ.Query value) {
        this.query = value;
    }

    /**
     * Gets the value of the echoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Sets the value of the echoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        if (target == null) {
            return "Production";
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the transactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets the value of the transactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * Gets the value of the sequenceNmbr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * Sets the value of the sequenceNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNmbr(BigInteger value) {
        this.sequenceNmbr = value;
    }

    /**
     * Gets the value of the transactionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatusCode(String value) {
        this.transactionStatusCode = value;
    }

    /**
     * Gets the value of the retransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetransmissionIndicator() {
        return retransmissionIndicator;
    }

    /**
     * Sets the value of the retransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetransmissionIndicator(Boolean value) {
        this.retransmissionIndicator = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the asynchronousAllowedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsynchronousAllowedInd() {
        return asynchronousAllowedInd;
    }

    /**
     * Sets the value of the asynchronousAllowedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsynchronousAllowedInd(Boolean value) {
        this.asynchronousAllowedInd = value;
    }

    /**
     * Gets the value of the primaryLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * Gets the value of the altLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * Sets the value of the altLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
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
     *         &lt;element name="Reason" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/&gt;
     *         &lt;element name="RefundFOP_Preference" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice minOccurs="0"&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Voucher" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}PaymentCard" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Cash" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}BankAccount" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Check" minOccurs="0"/&gt;
     *                   &lt;element name="CarrierCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                 &lt;/choice&gt;
     *                 &lt;attribute name="OriginalFOP_Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
        "reason",
        "refundFOPPreference"
    })
    public static class OrderCancelParameters {

        @XmlElement(name = "Reason")
        protected String reason;
        @XmlElement(name = "RefundFOP_Preference")
        protected OrderCancelRQ.OrderCancelParameters.RefundFOPPreference refundFOPPreference;

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReason(String value) {
            this.reason = value;
        }

        /**
         * Gets the value of the refundFOPPreference property.
         * 
         * @return
         *     possible object is
         *     {@link OrderCancelRQ.OrderCancelParameters.RefundFOPPreference }
         *     
         */
        public OrderCancelRQ.OrderCancelParameters.RefundFOPPreference getRefundFOPPreference() {
            return refundFOPPreference;
        }

        /**
         * Sets the value of the refundFOPPreference property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderCancelRQ.OrderCancelParameters.RefundFOPPreference }
         *     
         */
        public void setRefundFOPPreference(OrderCancelRQ.OrderCancelParameters.RefundFOPPreference value) {
            this.refundFOPPreference = value;
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
         *       &lt;choice minOccurs="0"&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Voucher" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}PaymentCard" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Cash" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}BankAccount" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Check" minOccurs="0"/&gt;
         *         &lt;element name="CarrierCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *       &lt;/choice&gt;
         *       &lt;attribute name="OriginalFOP_Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "voucher",
            "paymentCard",
            "cash",
            "bankAccount",
            "check",
            "carrierCredit"
        })
        public static class RefundFOPPreference {

            @XmlElement(name = "Voucher")
            protected Voucher voucher;
            @XmlElement(name = "PaymentCard")
            protected PaymentCardType paymentCard;
            @XmlElement(name = "Cash")
            protected Cash cash;
            @XmlElement(name = "BankAccount")
            protected BankAccountType bankAccount;
            @XmlElement(name = "Check")
            protected Check check;
            @XmlElement(name = "CarrierCredit")
            protected Boolean carrierCredit;
            @XmlAttribute(name = "OriginalFOP_Ind")
            protected Boolean originalFOPInd;

            /**
             * Information relating to prepayment vouchers.
             * 
             * @return
             *     possible object is
             *     {@link Voucher }
             *     
             */
            public Voucher getVoucher() {
                return voucher;
            }

            /**
             * Sets the value of the voucher property.
             * 
             * @param value
             *     allowed object is
             *     {@link Voucher }
             *     
             */
            public void setVoucher(Voucher value) {
                this.voucher = value;
            }

            /**
             * Gets the value of the paymentCard property.
             * 
             * @return
             *     possible object is
             *     {@link PaymentCardType }
             *     
             */
            public PaymentCardType getPaymentCard() {
                return paymentCard;
            }

            /**
             * Sets the value of the paymentCard property.
             * 
             * @param value
             *     allowed object is
             *     {@link PaymentCardType }
             *     
             */
            public void setPaymentCard(PaymentCardType value) {
                this.paymentCard = value;
            }

            /**
             * Gets the value of the cash property.
             * 
             * @return
             *     possible object is
             *     {@link Cash }
             *     
             */
            public Cash getCash() {
                return cash;
            }

            /**
             * Sets the value of the cash property.
             * 
             * @param value
             *     allowed object is
             *     {@link Cash }
             *     
             */
            public void setCash(Cash value) {
                this.cash = value;
            }

            /**
             * Gets the value of the bankAccount property.
             * 
             * @return
             *     possible object is
             *     {@link BankAccountType }
             *     
             */
            public BankAccountType getBankAccount() {
                return bankAccount;
            }

            /**
             * Sets the value of the bankAccount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BankAccountType }
             *     
             */
            public void setBankAccount(BankAccountType value) {
                this.bankAccount = value;
            }

            /**
             * Check (Cheque) Payment
             * 
             * @return
             *     possible object is
             *     {@link Check }
             *     
             */
            public Check getCheck() {
                return check;
            }

            /**
             * Sets the value of the check property.
             * 
             * @param value
             *     allowed object is
             *     {@link Check }
             *     
             */
            public void setCheck(Check value) {
                this.check = value;
            }

            /**
             * Gets the value of the carrierCredit property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCarrierCredit() {
                return carrierCredit;
            }

            /**
             * Sets the value of the carrierCredit property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCarrierCredit(Boolean value) {
                this.carrierCredit = value;
            }

            /**
             * Gets the value of the originalFOPInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOriginalFOPInd() {
                return originalFOPInd;
            }

            /**
             * Sets the value of the originalFOPInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOriginalFOPInd(Boolean value) {
                this.originalFOPInd = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Order" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="OrderID" use="required" type="{http://www.iata.org/IATA/EDIST/2017.2}UniqueID_SimpleType" /&gt;
     *                 &lt;attribute name="Owner" use="required" type="{http://www.iata.org/IATA/EDIST/2017.2}AirlineDesigSimpleType" /&gt;
     *                 &lt;attribute name="OwnerType"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="ORA"/&gt;
     *                       &lt;enumeration value="POA"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="WebAddressID" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *                 &lt;attribute name="MetadataRefs" type="{http://www.iata.org/IATA/EDIST/2017.2}InstanceClassRefSimpleType" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}BookingReferences" minOccurs="0"/&gt;
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
        "order",
        "bookingReferences"
    })
    public static class Query {

        @XmlElement(name = "Order")
        protected OrderCancelRQ.Query.Order order;
        @XmlElement(name = "BookingReferences")
        protected BookingReferences bookingReferences;

        /**
         * Gets the value of the order property.
         * 
         * @return
         *     possible object is
         *     {@link OrderCancelRQ.Query.Order }
         *     
         */
        public OrderCancelRQ.Query.Order getOrder() {
            return order;
        }

        /**
         * Sets the value of the order property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderCancelRQ.Query.Order }
         *     
         */
        public void setOrder(OrderCancelRQ.Query.Order value) {
            this.order = value;
        }

        /**
         * Existing Booking Reference (e.g. PNR Record Locator). Example: R1A3SK
         * 
         * @return
         *     possible object is
         *     {@link BookingReferences }
         *     
         */
        public BookingReferences getBookingReferences() {
            return bookingReferences;
        }

        /**
         * Sets the value of the bookingReferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookingReferences }
         *     
         */
        public void setBookingReferences(BookingReferences value) {
            this.bookingReferences = value;
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
         *       &lt;attribute name="OrderID" use="required" type="{http://www.iata.org/IATA/EDIST/2017.2}UniqueID_SimpleType" /&gt;
         *       &lt;attribute name="Owner" use="required" type="{http://www.iata.org/IATA/EDIST/2017.2}AirlineDesigSimpleType" /&gt;
         *       &lt;attribute name="OwnerType"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="ORA"/&gt;
         *             &lt;enumeration value="POA"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="WebAddressID" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
         *       &lt;attribute name="MetadataRefs" type="{http://www.iata.org/IATA/EDIST/2017.2}InstanceClassRefSimpleType" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Order {

            @XmlAttribute(name = "OrderID", required = true)
            protected String orderID;
            @XmlAttribute(name = "Owner", required = true)
            protected String owner;
            @XmlAttribute(name = "OwnerType")
            protected String ownerType;
            @XmlAttribute(name = "WebAddressID")
            @XmlSchemaType(name = "anyURI")
            protected String webAddressID;
            @XmlAttribute(name = "MetadataRefs")
            @XmlIDREF
            protected List<Object> metadataRefs;

            /**
             * Gets the value of the orderID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderID() {
                return orderID;
            }

            /**
             * Sets the value of the orderID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderID(String value) {
                this.orderID = value;
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
             * Gets the value of the ownerType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnerType() {
                return ownerType;
            }

            /**
             * Sets the value of the ownerType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwnerType(String value) {
                this.ownerType = value;
            }

            /**
             * Gets the value of the webAddressID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWebAddressID() {
                return webAddressID;
            }

            /**
             * Sets the value of the webAddressID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWebAddressID(String value) {
                this.webAddressID = value;
            }

            /**
             * Gets the value of the metadataRefs property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the metadataRefs property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMetadataRefs().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getMetadataRefs() {
                if (metadataRefs == null) {
                    metadataRefs = new ArrayList<Object>();
                }
                return this.metadataRefs;
            }

        }

    }

}