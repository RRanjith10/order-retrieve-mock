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
 * <p>Java class for SrvceCouponListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SrvceCouponListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="E-Ticket"/&gt;
 *     &lt;enumeration value="Flight"/&gt;
 *     &lt;enumeration value="No_EMD"/&gt;
 *     &lt;enumeration value="Standalone"/&gt;
 *     &lt;enumeration value="Ticket"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SrvceCouponListType")
@XmlEnum
public enum SrvceCouponListType {

    @XmlEnumValue("E-Ticket")
    E_TICKET("E-Ticket"),
    @XmlEnumValue("Flight")
    FLIGHT("Flight"),
    @XmlEnumValue("No_EMD")
    NO_EMD("No_EMD"),
    @XmlEnumValue("Standalone")
    STANDALONE("Standalone"),
    @XmlEnumValue("Ticket")
    TICKET("Ticket"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SrvceCouponListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SrvceCouponListType fromValue(String v) {
        for (SrvceCouponListType c: SrvceCouponListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
