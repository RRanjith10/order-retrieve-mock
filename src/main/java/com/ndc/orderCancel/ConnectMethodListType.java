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
 * <p>Java class for ConnectMethodListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectMethodListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DirectWithAirline"/&gt;
 *     &lt;enumeration value="DirectWithOther"/&gt;
 *     &lt;enumeration value="Gateway"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConnectMethodListType")
@XmlEnum
public enum ConnectMethodListType {

    @XmlEnumValue("DirectWithAirline")
    DIRECT_WITH_AIRLINE("DirectWithAirline"),
    @XmlEnumValue("DirectWithOther")
    DIRECT_WITH_OTHER("DirectWithOther"),
    @XmlEnumValue("Gateway")
    GATEWAY("Gateway");
    private final String value;

    ConnectMethodListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectMethodListType fromValue(String v) {
        for (ConnectMethodListType c: ConnectMethodListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
