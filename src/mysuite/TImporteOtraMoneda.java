

package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TImporteOtraMoneda complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TImporteOtraMoneda"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Moneda" type="{http://www.fact.com.mx/schema/fx}TCurrencyCode"/&gt;
 *         &lt;element name="Importe" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TImporteOtraMoneda", propOrder = {
    "moneda",
    "importe"
})
public class TImporteOtraMoneda {

    @XmlElement(name = "Moneda", required = true)
    @XmlSchemaType(name = "token")
    protected TCurrencyCode moneda;
    @XmlElement(name = "Importe", required = true)
    protected TNonNegativeAmount importe;

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link TCurrencyCode }
     *     
     */
    public TCurrencyCode getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link TCurrencyCode }
     *     
     */
    public void setMoneda(TCurrencyCode value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setImporte(TNonNegativeAmount value) {
        this.importe = value;
    }

}
