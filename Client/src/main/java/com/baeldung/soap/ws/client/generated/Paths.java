
package com.baeldung.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Paths complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Paths"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bbox" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="instructions" type="{http://schemas.datacontract.org/2004/07/RootingService}ArrayOfInstruction" minOccurs="0"/&gt;
 *         &lt;element name="points" type="{http://schemas.datacontract.org/2004/07/RootingService}Points" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Paths", propOrder = {
    "bbox",
    "instructions",
    "points"
})
public class Paths {

    @XmlElementRef(name = "bbox", namespace = "http://schemas.datacontract.org/2004/07/RootingService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> bbox;
    @XmlElementRef(name = "instructions", namespace = "http://schemas.datacontract.org/2004/07/RootingService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInstruction> instructions;
    @XmlElementRef(name = "points", namespace = "http://schemas.datacontract.org/2004/07/RootingService", type = JAXBElement.class, required = false)
    protected JAXBElement<Points> points;

    /**
     * Obtient la valeur de la propriété bbox.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getBbox() {
        return bbox;
    }

    /**
     * Définit la valeur de la propriété bbox.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setBbox(JAXBElement<ArrayOfint> value) {
        this.bbox = value;
    }

    /**
     * Obtient la valeur de la propriété instructions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInstruction }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInstruction> getInstructions() {
        return instructions;
    }

    /**
     * Définit la valeur de la propriété instructions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInstruction }{@code >}
     *     
     */
    public void setInstructions(JAXBElement<ArrayOfInstruction> value) {
        this.instructions = value;
    }

    /**
     * Obtient la valeur de la propriété points.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Points }{@code >}
     *     
     */
    public JAXBElement<Points> getPoints() {
        return points;
    }

    /**
     * Définit la valeur de la propriété points.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Points }{@code >}
     *     
     */
    public void setPoints(JAXBElement<Points> value) {
        this.points = value;
    }

}
