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
 * <p>Java class for PaymentStatusListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentStatusListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Canceled"/&gt;
 *     &lt;enumeration value="Complete"/&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *     &lt;enumeration value="MoreInformation"/&gt;
 *     &lt;enumeration value="Partial"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentStatusListType")
@XmlEnum
public enum PaymentStatusListType {

    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("MoreInformation")
    MORE_INFORMATION("MoreInformation"),
    @XmlEnumValue("Partial")
    PARTIAL("Partial");
    private final String value;

    PaymentStatusListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentStatusListType fromValue(String v) {
        for (PaymentStatusListType c: PaymentStatusListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}