
package com.baeldung.soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfArrayOfint complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArrayOfint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrayOfint" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfint", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", propOrder = {
    "arrayOfint"
})
public class ArrayOfArrayOfint {

    @XmlElement(name = "ArrayOfint", nillable = true)
    protected List<ArrayOfint> arrayOfint;

    /**
     * Gets the value of the arrayOfint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfint }
     * 
     * 
     */
    public List<ArrayOfint> getArrayOfint() {
        if (arrayOfint == null) {
            arrayOfint = new ArrayList<ArrayOfint>();
        }
        return this.arrayOfint;
    }

}
