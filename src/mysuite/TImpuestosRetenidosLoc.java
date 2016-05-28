

package mysuite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Suma y desglose de impuestos retenidos.
 * 
 * <p>Clase Java para TImpuestosRetenidosLoc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TImpuestosRetenidosLoc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalRetenciones" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *         &lt;element name="Retencion" type="{http://www.fact.com.mx/schema/fx}TImpuestoLocal" maxOccurs="12"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TImpuestosRetenidosLoc", propOrder = {
    "totalRetenciones",
    "retencion"
})
public class TImpuestosRetenidosLoc {

    @XmlElement(name = "TotalRetenciones", required = true)
    protected TNonNegativeAmount totalRetenciones;
    @XmlElement(name = "Retencion", required = true)
    protected List<TImpuestoLocal> retencion;

    /**
     * Obtiene el valor de la propiedad totalRetenciones.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalRetenciones() {
        return totalRetenciones;
    }

    /**
     * Define el valor de la propiedad totalRetenciones.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalRetenciones(TNonNegativeAmount value) {
        this.totalRetenciones = value;
    }

    /**
     * Gets the value of the retencion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retencion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetencion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TImpuestoLocal }
     * 
     * 
     */
    public List<TImpuestoLocal> getRetencion() {
        if (retencion == null) {
            retencion = new ArrayList<TImpuestoLocal>();
        }
        return this.retencion;
    }

}
