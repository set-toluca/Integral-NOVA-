

package mysuite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TDescuentosYRecargos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TDescuentosYRecargos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DescuentoORecargo" type="{http://www.fact.com.mx/schema/fx}TDiscountOrRecharge" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDescuentosYRecargos", propOrder = {
    "descuentoORecargo"
})
public class TDescuentosYRecargos {

    @XmlElement(name = "DescuentoORecargo", required = true)
    protected List<TDiscountOrRecharge> descuentoORecargo;

    /**
     * Gets the value of the descuentoORecargo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descuentoORecargo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescuentoORecargo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDiscountOrRecharge }
     * 
     * 
     */
    public List<TDiscountOrRecharge> getDescuentoORecargo() {
        if (descuentoORecargo == null) {
            descuentoORecargo = new ArrayList<TDiscountOrRecharge>();
        }
        return this.descuentoORecargo;
    }

}
