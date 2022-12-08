
package com.baeldung.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Itineraire complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Itineraire"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Erreur" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Etape1" type="{http://schemas.datacontract.org/2004/07/RootingService}Etape" minOccurs="0"/&gt;
 *         &lt;element name="Etape2" type="{http://schemas.datacontract.org/2004/07/RootingService}Etape" minOccurs="0"/&gt;
 *         &lt;element name="Etape3" type="{http://schemas.datacontract.org/2004/07/RootingService}Etape" minOccurs="0"/&gt;
 *         &lt;element name="Utile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Itineraire", propOrder = {
    "erreur",
    "etape1",
    "etape2",
    "etape3",
    "utile"
})
public class Itineraire {

    @XmlElement(name = "Erreur")
    protected Boolean erreur;
    @XmlElementRef(name = "Etape1", namespace = "http://schemas.datacontract.org/2004/07/RootingService", type = JAXBElement.class, required = false)
    protected JAXBElement<Etape> etape1;
    @XmlElementRef(name = "Etape2", namespace = "http://schemas.datacontract.org/2004/07/RootingService", type = JAXBElement.class, required = false)
    protected JAXBElement<Etape> etape2;
    @XmlElementRef(name = "Etape3", namespace = "http://schemas.datacontract.org/2004/07/RootingService", type = JAXBElement.class, required = false)
    protected JAXBElement<Etape> etape3;
    @XmlElement(name = "Utile")
    protected Boolean utile;

    /**
     * Obtient la valeur de la propriété erreur.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErreur() {
        return erreur;
    }

    /**
     * Définit la valeur de la propriété erreur.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErreur(Boolean value) {
        this.erreur = value;
    }

    /**
     * Obtient la valeur de la propriété etape1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Etape }{@code >}
     *     
     */
    public JAXBElement<Etape> getEtape1() {
        return etape1;
    }

    /**
     * Définit la valeur de la propriété etape1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Etape }{@code >}
     *     
     */
    public void setEtape1(JAXBElement<Etape> value) {
        this.etape1 = value;
    }

    /**
     * Obtient la valeur de la propriété etape2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Etape }{@code >}
     *     
     */
    public JAXBElement<Etape> getEtape2() {
        return etape2;
    }

    /**
     * Définit la valeur de la propriété etape2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Etape }{@code >}
     *     
     */
    public void setEtape2(JAXBElement<Etape> value) {
        this.etape2 = value;
    }

    /**
     * Obtient la valeur de la propriété etape3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Etape }{@code >}
     *     
     */
    public JAXBElement<Etape> getEtape3() {
        return etape3;
    }

    /**
     * Définit la valeur de la propriété etape3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Etape }{@code >}
     *     
     */
    public void setEtape3(JAXBElement<Etape> value) {
        this.etape3 = value;
    }

    /**
     * Obtient la valeur de la propriété utile.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUtile() {
        return utile;
    }

    /**
     * Définit la valeur de la propriété utile.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUtile(Boolean value) {
        this.utile = value;
    }

}
