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
 * <p>Java class for OtherOrderAssocSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OtherOrderAssocSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PaymentForm"/&gt;
 *     &lt;enumeration value="Penalty"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OtherOrderAssocSimpleType")
@XmlEnum
public enum OtherOrderAssocSimpleType {

    @XmlEnumValue("PaymentForm")
    PAYMENT_FORM("PaymentForm"),
    @XmlEnumValue("Penalty")
    PENALTY("Penalty");
    private final String value;

    OtherOrderAssocSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OtherOrderAssocSimpleType fromValue(String v) {
        for (OtherOrderAssocSimpleType c: OtherOrderAssocSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}