
package com.baeldung.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Etape complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Etape"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paths" type="{http://schemas.datacontract.org/2004/07/RootingService}ArrayOfPaths" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Etape", propOrder = {
    "paths"
})
public class Etape {

    @XmlElementRef(name = "paths", namespace = "http://schemas.datacontract.org/2004/07/RootingService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPaths> paths;

    /**
     * Obtient la valeur de la propriété paths.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaths }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPaths> getPaths() {
        return paths;
    }

    /**
     * Définit la valeur de la propriété paths.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaths }{@code >}
     *     
     */
    public void setPaths(JAXBElement<ArrayOfPaths> value) {
        this.paths = value;
    }

}
