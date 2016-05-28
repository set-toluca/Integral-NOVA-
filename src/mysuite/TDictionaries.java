package mysuite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TDictionaries complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TDictionaries"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dictionary" type="{http://www.fact.com.mx/schema/fx}TDictionary" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDictionaries", propOrder = {
    "dictionary"
})
public class TDictionaries {

    @XmlElement(name = "Dictionary", required = true)
    protected List<TDictionary> dictionary;

    /**
     * Gets the value of the dictionary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dictionary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDictionary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDictionary }
     * 
     * 
     */
    public List<TDictionary> getDictionary() {
        if (dictionary == null) {
            dictionary = new ArrayList<TDictionary>();
        }
        return this.dictionary;
    }

}
