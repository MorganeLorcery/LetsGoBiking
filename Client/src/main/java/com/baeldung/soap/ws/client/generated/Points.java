
package com.baeldung.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Points complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Points"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coordinates" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfArrayOfint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Points", propOrder = {
    "coordinates"
})
public class Points {

    @XmlElementRef(name = "coordinates", namespace = "http://schemas.datacontract.org/2004/07/RootingService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfArrayOfint> coordinates;

    /**
     * Obtient la valeur de la propriété coordinates.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfArrayOfint> getCoordinates() {
        return coordinates;
    }

    /**
     * Définit la valeur de la propriété coordinates.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArrayOfint }{@code >}
     *     
     */
    public void setCoordinates(JAXBElement<ArrayOfArrayOfint> value) {
        this.coordinates = value;
    }

}
