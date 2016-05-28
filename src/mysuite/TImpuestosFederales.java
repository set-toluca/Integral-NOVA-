


package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TImpuestosFederales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TImpuestosFederales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Retenciones" type="{http://www.fact.com.mx/schema/fx}TImpuestosRetenidos" minOccurs="0"/&gt;
 *         &lt;element name="Traslados" type="{http://www.fact.com.mx/schema/fx}TImpuestosTrasladados" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TImpuestosFederales", propOrder = {
    "retenciones",
    "traslados"
})
public class TImpuestosFederales {

    @XmlElement(name = "Retenciones")
    protected TImpuestosRetenidos retenciones;
    @XmlElement(name = "Traslados")
    protected TImpuestosTrasladados traslados;

    /**
     * Obtiene el valor de la propiedad retenciones.
     * 
     * @return
     *     possible object is
     *     {@link TImpuestosRetenidos }
     *     
     */
    public TImpuestosRetenidos getRetenciones() {
        return retenciones;
    }

    /**
     * Define el valor de la propiedad retenciones.
     * 
     * @param value
     *     allowed object is
     *     {@link TImpuestosRetenidos }
     *     
     */
    public void setRetenciones(TImpuestosRetenidos value) {
        this.retenciones = value;
    }

    /**
     * Obtiene el valor de la propiedad traslados.
     * 
     * @return
     *     possible object is
     *     {@link TImpuestosTrasladados }
     *     
     */
    public TImpuestosTrasladados getTraslados() {
        return traslados;
    }

    /**
     * Define el valor de la propiedad traslados.
     * 
     * @param value
     *     allowed object is
     *     {@link TImpuestosTrasladados }
     *     
     */
    public void setTraslados(TImpuestosTrasladados value) {
        this.traslados = value;
    }

}
