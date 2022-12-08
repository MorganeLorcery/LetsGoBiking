
package com.baeldung.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetItineraireResult" type="{http://schemas.datacontract.org/2004/07/RootingService}Itineraire" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getItineraireResult"
})
@XmlRootElement(name = "GetItineraireResponse", namespace = "http://tempuri.org/")
public class GetItineraireResponse {

    @XmlElementRef(name = "GetItineraireResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Itineraire> getItineraireResult;

    /**
     * Obtient la valeur de la propriété getItineraireResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Itineraire }{@code >}
     *     
     */
    public JAXBElement<Itineraire> getGetItineraireResult() {
        return getItineraireResult;
    }

    /**
     * Définit la valeur de la propriété getItineraireResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Itineraire }{@code >}
     *     
     */
    public void setGetItineraireResult(JAXBElement<Itineraire> value) {
        this.getItineraireResult = value;
    }

}
