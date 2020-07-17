//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.03 at 05:21:33 PM IST 
//


package com.ndc.orderCancel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketMsgAssocSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketMsgAssocSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Media"/&gt;
 *     &lt;enumeration value="OfferItem"/&gt;
 *     &lt;enumeration value="Order"/&gt;
 *     &lt;enumeration value="OrderItem"/&gt;
 *     &lt;enumeration value="Payment"/&gt;
 *     &lt;enumeration value="Service"/&gt;
 *     &lt;enumeration value="ServiceBundle"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketMsgAssocSimpleType")
@XmlEnum
public enum MarketMsgAssocSimpleType {

    @XmlEnumValue("Media")
    MEDIA("Media"),
    @XmlEnumValue("OfferItem")
    OFFER_ITEM("OfferItem"),
    @XmlEnumValue("Order")
    ORDER("Order"),
    @XmlEnumValue("OrderItem")
    ORDER_ITEM("OrderItem"),
    @XmlEnumValue("Payment")
    PAYMENT("Payment"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("ServiceBundle")
    SERVICE_BUNDLE("ServiceBundle");
    private final String value;

    MarketMsgAssocSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarketMsgAssocSimpleType fromValue(String v) {
        for (MarketMsgAssocSimpleType c: MarketMsgAssocSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
