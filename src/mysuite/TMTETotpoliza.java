
package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TMTETotpoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMTETotpoliza"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="total_pagar" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="iva10_15" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="iva11_16" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="ptjiva10_15" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMTETotpoliza", propOrder = {
    "totalPagar",
    "iva1015",
    "iva1116",
    "ptjiva1015"
})
public class TMTETotpoliza {

    @XmlElement(name = "total_pagar")
    protected TNonNegativeAmount totalPagar;
    @XmlElement(name = "iva10_15")
    protected TNonNegativeAmount iva1015;
    @XmlElement(name = "iva11_16")
    protected TNonNegativeAmount iva1116;
    @XmlElement(name = "ptjiva10_15")
    protected TNonNegativeAmount ptjiva1015;

    /**
     * Obtiene el valor de la propiedad totalPagar.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalPagar() {
        return totalPagar;
    }

    /**
     * Define el valor de la propiedad totalPagar.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalPagar(TNonNegativeAmount value) {
        this.totalPagar = value;
    }

    /**
     * Obtiene el valor de la propiedad iva1015.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getIva1015() {
        return iva1015;
    }

    /**
     * Define el valor de la propiedad iva1015.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setIva1015(TNonNegativeAmount value) {
        this.iva1015 = value;
    }

    /**
     * Obtiene el valor de la propiedad iva1116.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getIva1116() {
        return iva1116;
    }

    /**
     * Define el valor de la propiedad iva1116.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setIva1116(TNonNegativeAmount value) {
        this.iva1116 = value;
    }

    /**
     * Obtiene el valor de la propiedad ptjiva1015.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getPtjiva1015() {
        return ptjiva1015;
    }

    /**
     * Define el valor de la propiedad ptjiva1015.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setPtjiva1015(TNonNegativeAmount value) {
        this.ptjiva1015 = value;
    }

}
