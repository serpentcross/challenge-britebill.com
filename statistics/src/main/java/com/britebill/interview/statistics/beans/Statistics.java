//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.07.07 at 05:56:48 PM MSK
//

package com.britebill.interview.statistics.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="TotalNumberOfWords" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="TotalNumberOfUniqueWords" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="AverageCharactersPerWord" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="MostRepeatedWord" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "totalNumberOfWords",
        "totalNumberOfUniqueWords",
        "averageCharactersPerWord",
        "mostRepeatedWord"
})
@XmlRootElement(name = "Statistics")
public class Statistics {

    @XmlElement(name = "TotalNumberOfWords")
    @XmlSchemaType(name = "unsignedInt")
    protected long totalNumberOfWords;
    @XmlElement(name = "TotalNumberOfUniqueWords")
    @XmlSchemaType(name = "unsignedInt")
    protected long totalNumberOfUniqueWords;
    @XmlElement(name = "AverageCharactersPerWord")
    @XmlSchemaType(name = "unsignedInt")
    protected long averageCharactersPerWord;
    @XmlElement(name = "MostRepeatedWord", required = true)
    protected String mostRepeatedWord;

    /**
     * Gets the value of the totalNumberOfWords property.
     *
     */
    public long getTotalNumberOfWords() {
        return totalNumberOfWords;
    }

    /**
     * Sets the value of the totalNumberOfWords property.
     *
     */
    public void setTotalNumberOfWords(long value) {
        this.totalNumberOfWords = value;
    }

    /**
     * Gets the value of the totalNumberOfUniqueWords property.
     *
     */
    public long getTotalNumberOfUniqueWords() {
        return totalNumberOfUniqueWords;
    }

    /**
     * Sets the value of the totalNumberOfUniqueWords property.
     *
     */
    public void setTotalNumberOfUniqueWords(long value) {
        this.totalNumberOfUniqueWords = value;
    }

    /**
     * Gets the value of the averageCharactersPerWord property.
     *
     */
    public long getAverageCharactersPerWord() {
        return averageCharactersPerWord;
    }

    /**
     * Sets the value of the averageCharactersPerWord property.
     *
     */
    public void setAverageCharactersPerWord(long value) {
        this.averageCharactersPerWord = value;
    }

    /**
     * Gets the value of the mostRepeatedWord property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMostRepeatedWord() {
        return mostRepeatedWord;
    }

    /**
     * Sets the value of the mostRepeatedWord property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMostRepeatedWord(String value) {
        this.mostRepeatedWord = value;
    }

}
