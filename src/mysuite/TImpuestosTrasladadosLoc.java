
package mysuite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Suma y desglose de impuestos trasladados.
 * 
 * <p>Clase Java para TImpuestosTrasladadosLoc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TImpuestosTrasladadosLoc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalTraslados" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *         &lt;element name="Traslado" type="{http://www.fact.com.mx/schema/fx}TImpuestoLocal" maxOccurs="12"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TImpuestosTrasladadosLoc", propOrder = {
    "totalTraslados",
    "traslado"
})
public class TImpuestosTrasladadosLoc {

    @XmlElement(name = "TotalTraslados", required = true)
    protected TNonNegativeAmount totalTraslados;
    @XmlElement(name = "Traslado", required = true)
    protected List<TImpuestoLocal> traslado;

    /**
     * Obtiene el valor de la propiedad totalTraslados.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalTraslados() {
        return totalTraslados;
    }

    /**
     * Define el valor de la propiedad totalTraslados.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalTraslados(TNonNegativeAmount value) {
        this.totalTraslados = value;
    }

    /**
     * Gets the value of the traslado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traslado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraslado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TImpuestoLocal }
     * 
     * 
     */
    public List<TImpuestoLocal> getTraslado() {
        if (traslado == null) {
            traslado = new ArrayList<TImpuestoLocal>();
        }
        return this.traslado;
    }

}
