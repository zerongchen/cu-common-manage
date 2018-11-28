//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.13 at 05:53:40 PM CST 
//


package com.aotain.common.utils.model.ismscmd;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="systemidentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commandAck" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="houseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="commandId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="view" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="msgInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "systemidentifier",
    "commandAck",
    "timeStamp"
})
@XmlRootElement(name = "ismsCommandAck")
public class IsmsCommandAck {

    @XmlElement(required = true)
    protected String systemidentifier;
    @XmlElement(required = true)
    protected List<IsmsCommandAck.CommandAck> commandAck;
    @XmlElement(required = true)
    protected String timeStamp;

    /**
     * Gets the value of the systemidentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemidentifier() {
        return systemidentifier;
    }

    /**
     * Sets the value of the systemidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemidentifier(String value) {
        this.systemidentifier = value;
    }

    /**
     * Gets the value of the commandAck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commandAck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommandAck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsmsCommandAck.CommandAck }
     * 
     * 
     */
    public List<IsmsCommandAck.CommandAck> getCommandAck() {
        if (commandAck == null) {
            commandAck = new ArrayList<IsmsCommandAck.CommandAck>();
        }
        return this.commandAck;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="houseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="commandId" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="view" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="msgInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "houseId",
        "commandId",
        "type",
        "resultCode",
        "view",
        "msgInfo"
    })
    public static class CommandAck {

        protected Long houseId;
        protected long commandId;
        @XmlElement(required = true)
        protected BigInteger type;
        @XmlElement(required = true)
        protected BigInteger resultCode;
        protected Long view;
        protected String msgInfo;

        /**
         * Gets the value of the houseId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getHouseId() {
            return houseId;
        }

        /**
         * Sets the value of the houseId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHouseId(Long value) {
            this.houseId = value;
        }

        /**
         * Gets the value of the commandId property.
         * 
         */
        public long getCommandId() {
            return commandId;
        }

        /**
         * Sets the value of the commandId property.
         * 
         */
        public void setCommandId(long value) {
            this.commandId = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setType(BigInteger value) {
            this.type = value;
        }

        /**
         * Gets the value of the resultCode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getResultCode() {
            return resultCode;
        }

        /**
         * Sets the value of the resultCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setResultCode(BigInteger value) {
            this.resultCode = value;
        }

        /**
         * Gets the value of the view property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getView() {
            return view;
        }

        /**
         * Sets the value of the view property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setView(Long value) {
            this.view = value;
        }

        /**
         * Gets the value of the msgInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMsgInfo() {
            return msgInfo;
        }

        /**
         * Sets the value of the msgInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMsgInfo(String value) {
            this.msgInfo = value;
        }

    }

}
