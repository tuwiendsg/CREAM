//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.06 at 04:36:48 PM IRST 
//


package org.cloudface.tosca.model.properties.apache;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tApacheWebServerProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tApacheWebServerProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="httpdport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tApacheWebServerProperties", propOrder = {
    "httpdport"
})
@XmlSeeAlso({
    ApacheWebServerProperties.class
})
public class TApacheWebServerProperties {

    @XmlElement(name = "httpdport")
    protected String httpdport;

    /**
     * Gets the value of the httpdport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpdport() {
        return httpdport;
    }

    /**
     * Sets the value of the httpdport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpdport(String value) {
        this.httpdport = value;
    }

}