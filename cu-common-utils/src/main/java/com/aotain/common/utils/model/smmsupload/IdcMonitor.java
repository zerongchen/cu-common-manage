//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.14 at 02:35:40 下午 CST 
//


package com.aotain.common.utils.model.smmsupload;

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
 *         &lt;element name="commandId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="houseMonitor" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="reportNA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="firstFound" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="lastFound" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="visitCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="protocol" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="illegalInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="illegalType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="currentState" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ipInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="regError" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="regDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "commandId",
    "idcId",
    "houseMonitor",
    "timeStamp"
})
@XmlRootElement(name = "idcMonitor")
public class IdcMonitor {

    protected Long commandId;
    @XmlElement(required = true)
    protected String idcId;
    protected List<IdcMonitor.HouseMonitor> houseMonitor;
    @XmlElement(required = true)
    protected String timeStamp;

    /**
     * Gets the value of the commandId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCommandId() {
        return commandId;
    }

    /**
     * Sets the value of the commandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCommandId(Long value) {
        this.commandId = value;
    }

    /**
     * Gets the value of the idcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcId() {
        return idcId;
    }

    /**
     * Sets the value of the idcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcId(String value) {
        this.idcId = value;
    }

    /**
     * Gets the value of the houseMonitor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the houseMonitor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHouseMonitor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdcMonitor.HouseMonitor }
     * 
     * 
     */
    public List<IdcMonitor.HouseMonitor> getHouseMonitor() {
        if (houseMonitor == null) {
            houseMonitor = new ArrayList<IdcMonitor.HouseMonitor>();
        }
        return this.houseMonitor;
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
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="reportNA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="firstFound" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="lastFound" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="visitCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="protocol" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="illegalInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="illegalType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="currentState" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ipInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="regError" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="regDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "id",
        "reportNA",
        "ip",
        "port",
        "domain",
        "serviceType",
        "firstFound",
        "lastFound",
        "visitCount",
        "protocol",
        "illegalInfo",
        "ipInfo"
    })
    public static class HouseMonitor {

        protected long id;
        protected String reportNA;
        protected String ip;
        protected Long port;
        protected String domain;
        protected List<BigInteger> serviceType;
        protected String firstFound;
        protected String lastFound;
        protected Long visitCount;
        protected BigInteger protocol;
        protected IdcMonitor.HouseMonitor.IllegalInfo illegalInfo;
        protected IdcMonitor.HouseMonitor.IpInfo ipInfo;

        /**
         * Gets the value of the id property.
         * 
         */
        public long getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         */
        public void setId(long value) {
            this.id = value;
        }

        /**
         * Gets the value of the reportNA property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReportNA() {
            return reportNA;
        }

        /**
         * Sets the value of the reportNA property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReportNA(String value) {
            this.reportNA = value;
        }

        /**
         * Gets the value of the ip property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIp() {
            return ip;
        }

        /**
         * Sets the value of the ip property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIp(String value) {
            this.ip = value;
        }

        /**
         * Gets the value of the port property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPort() {
            return port;
        }

        /**
         * Sets the value of the port property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPort(Long value) {
            this.port = value;
        }

        /**
         * Gets the value of the domain property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomain() {
            return domain;
        }

        /**
         * Sets the value of the domain property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomain(String value) {
            this.domain = value;
        }

        /**
         * Gets the value of the serviceType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getServiceType() {
            if (serviceType == null) {
                serviceType = new ArrayList<BigInteger>();
            }
            return this.serviceType;
        }

        /**
         * Gets the value of the firstFound property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstFound() {
            return firstFound;
        }

        /**
         * Sets the value of the firstFound property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstFound(String value) {
            this.firstFound = value;
        }

        /**
         * Gets the value of the lastFound property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastFound() {
            return lastFound;
        }

        /**
         * Sets the value of the lastFound property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastFound(String value) {
            this.lastFound = value;
        }

        /**
         * Gets the value of the visitCount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getVisitCount() {
            return visitCount;
        }

        /**
         * Sets the value of the visitCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setVisitCount(Long value) {
            this.visitCount = value;
        }

        /**
         * Gets the value of the protocol property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getProtocol() {
            return protocol;
        }

        /**
         * Sets the value of the protocol property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setProtocol(BigInteger value) {
            this.protocol = value;
        }

        /**
         * Gets the value of the illegalInfo property.
         * 
         * @return
         *     possible object is
         *     {@link IdcMonitor.HouseMonitor.IllegalInfo }
         *     
         */
        public IdcMonitor.HouseMonitor.IllegalInfo getIllegalInfo() {
            return illegalInfo;
        }

        /**
         * Sets the value of the illegalInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link IdcMonitor.HouseMonitor.IllegalInfo }
         *     
         */
        public void setIllegalInfo(IdcMonitor.HouseMonitor.IllegalInfo value) {
            this.illegalInfo = value;
        }

        /**
         * Gets the value of the ipInfo property.
         * 
         * @return
         *     possible object is
         *     {@link IdcMonitor.HouseMonitor.IpInfo }
         *     
         */
        public IdcMonitor.HouseMonitor.IpInfo getIpInfo() {
            return ipInfo;
        }

        /**
         * Sets the value of the ipInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link IdcMonitor.HouseMonitor.IpInfo }
         *     
         */
        public void setIpInfo(IdcMonitor.HouseMonitor.IpInfo value) {
            this.ipInfo = value;
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
         *         &lt;element name="illegalType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="currentState" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "illegalType",
            "currentState",
            "user"
        })
        public static class IllegalInfo {

            @XmlElement(required = true)
            protected BigInteger illegalType;
            @XmlElement(required = true)
            protected BigInteger currentState;
            @XmlElement(required = true)
            protected String user;

            /**
             * Gets the value of the illegalType property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getIllegalType() {
                return illegalType;
            }

            /**
             * Sets the value of the illegalType property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setIllegalType(BigInteger value) {
                this.illegalType = value;
            }

            /**
             * Gets the value of the currentState property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCurrentState() {
                return currentState;
            }

            /**
             * Sets the value of the currentState property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCurrentState(BigInteger value) {
                this.currentState = value;
            }

            /**
             * Gets the value of the user property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUser() {
                return user;
            }

            /**
             * Sets the value of the user property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUser(String value) {
                this.user = value;
            }

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
         *         &lt;element name="regError" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="regDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "regError",
            "regDomain"
        })
        public static class IpInfo {

            @XmlElement(required = true)
            protected BigInteger regError;
            protected String regDomain;

            /**
             * Gets the value of the regError property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRegError() {
                return regError;
            }

            /**
             * Sets the value of the regError property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRegError(BigInteger value) {
                this.regError = value;
            }

            /**
             * Gets the value of the regDomain property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegDomain() {
                return regDomain;
            }

            /**
             * Sets the value of the regDomain property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegDomain(String value) {
                this.regDomain = value;
            }

        }

    }

}
