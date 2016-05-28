

package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TResumenDeDescuentosYRecargos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TResumenDeDescuentosYRecargos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalDescuentos" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *         &lt;element name="TotalRecargos" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TResumenDeDescuentosYRecargos", propOrder = {
    "totalDescuentos",
    "totalRecargos"
})
public class TResumenDeDescuentosYRecargos {

    @XmlElement(name = "TotalDescuentos", required = true)
    protected TNonNegativeAmount totalDescuentos;
    @XmlElement(name = "TotalRecargos", required = true)
    protected TNonNegativeAmount totalRecargos;

    /**
     * Obtiene el valor de la propiedad totalDescuentos.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalDescuentos() {
        return totalDescuentos;
    }

    /**
     * Define el valor de la propiedad totalDescuentos.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalDescuentos(TNonNegativeAmount value) {
        this.totalDescuentos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRecargos.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalRecargos() {
        return totalRecargos;
    }

    /**
     * Define el valor de la propiedad totalRecargos.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalRecargos(TNonNegativeAmount value) {
        this.totalRecargos = value;
    }

}
