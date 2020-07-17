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
 * <p>Java class for FlightDurationListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightDurationListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ConnectionTime"/&gt;
 *     &lt;enumeration value="FlightTime"/&gt;
 *     &lt;enumeration value="StopTime"/&gt;
 *     &lt;enumeration value="TotalJourneyTime"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlightDurationListType")
@XmlEnum
public enum FlightDurationListType {

    @XmlEnumValue("ConnectionTime")
    CONNECTION_TIME("ConnectionTime"),
    @XmlEnumValue("FlightTime")
    FLIGHT_TIME("FlightTime"),
    @XmlEnumValue("StopTime")
    STOP_TIME("StopTime"),
    @XmlEnumValue("TotalJourneyTime")
    TOTAL_JOURNEY_TIME("TotalJourneyTime"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FlightDurationListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightDurationListType fromValue(String v) {
        for (FlightDurationListType c: FlightDurationListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
