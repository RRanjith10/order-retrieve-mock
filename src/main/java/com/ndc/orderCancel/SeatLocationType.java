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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * SEAT LOCATION definition.
 * 
 * <p>Java class for SeatLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Column" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[A-Z]{1}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Row" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Number" type="{http://www.iata.org/IATA/EDIST/2017.2}SeatMapRowNbrType" minOccurs="0"/&gt;
 *                   &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/&gt;
 *                   &lt;element name="SeatData" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}SeatDataType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Characteristics" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Characteristic" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CodesetType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Remarks" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Associations" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatLocationType", propOrder = {
    "column",
    "row",
    "characteristics",
    "associations"
})
public class SeatLocationType {

    @XmlElement(name = "Column")
    protected String column;
    @XmlElement(name = "Row")
    protected SeatLocationType.Row row;
    @XmlElement(name = "Characteristics")
    protected SeatLocationType.Characteristics characteristics;
    @XmlElement(name = "Associations")
    protected OrderItemAssociationType associations;

    /**
     * Gets the value of the column property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumn(String value) {
        this.column = value;
    }

    /**
     * Gets the value of the row property.
     * 
     * @return
     *     possible object is
     *     {@link SeatLocationType.Row }
     *     
     */
    public SeatLocationType.Row getRow() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatLocationType.Row }
     *     
     */
    public void setRow(SeatLocationType.Row value) {
        this.row = value;
    }

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link SeatLocationType.Characteristics }
     *     
     */
    public SeatLocationType.Characteristics getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatLocationType.Characteristics }
     *     
     */
    public void setCharacteristics(SeatLocationType.Characteristics value) {
        this.characteristics = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType }
     *     
     */
    public OrderItemAssociationType getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType }
     *     
     */
    public void setAssociations(OrderItemAssociationType value) {
        this.associations = value;
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
     *         &lt;element name="Characteristic" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CodesetType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Remarks" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
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
        "characteristic"
    })
    public static class Characteristics {

        @XmlElement(name = "Characteristic", required = true)
        protected List<SeatLocationType.Characteristics.Characteristic> characteristic;

        /**
         * Gets the value of the characteristic property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the characteristic property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCharacteristic().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SeatLocationType.Characteristics.Characteristic }
         * 
         * 
         */
        public List<SeatLocationType.Characteristics.Characteristic> getCharacteristic() {
            if (characteristic == null) {
                characteristic = new ArrayList<SeatLocationType.Characteristics.Characteristic>();
            }
            return this.characteristic;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CodesetType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Remarks" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "remarks"
        })
        public static class Characteristic
            extends CodesetType
        {

            @XmlElement(name = "Remarks")
            protected RemarkType remarks;

            /**
             * Additional
             *                                                         Seat Remark(s).
             *                                                     
             * 
             * @return
             *     possible object is
             *     {@link RemarkType }
             *     
             */
            public RemarkType getRemarks() {
                return remarks;
            }

            /**
             * Sets the value of the remarks property.
             * 
             * @param value
             *     allowed object is
             *     {@link RemarkType }
             *     
             */
            public void setRemarks(RemarkType value) {
                this.remarks = value;
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
     *         &lt;element name="Number" type="{http://www.iata.org/IATA/EDIST/2017.2}SeatMapRowNbrType" minOccurs="0"/&gt;
     *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST/2017.2}IATA_CodeType" minOccurs="0"/&gt;
     *         &lt;element name="SeatData" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}SeatDataType"&gt;
     *               &lt;/extension&gt;
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
    @XmlType(name = "", propOrder = {
        "number",
        "type",
        "seatData"
    })
    public static class Row {

        @XmlElement(name = "Number")
        protected SeatMapRowNbrType number;
        @XmlElement(name = "Type")
        protected String type;
        @XmlElement(name = "SeatData")
        protected SeatLocationType.Row.SeatData seatData;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link SeatMapRowNbrType }
         *     
         */
        public SeatMapRowNbrType getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeatMapRowNbrType }
         *     
         */
        public void setNumber(SeatMapRowNbrType value) {
            this.number = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the seatData property.
         * 
         * @return
         *     possible object is
         *     {@link SeatLocationType.Row.SeatData }
         *     
         */
        public SeatLocationType.Row.SeatData getSeatData() {
            return seatData;
        }

        /**
         * Sets the value of the seatData property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeatLocationType.Row.SeatData }
         *     
         */
        public void setSeatData(SeatLocationType.Row.SeatData value) {
            this.seatData = value;
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
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}SeatDataType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SeatData
            extends SeatDataType
        {


        }

    }

}
