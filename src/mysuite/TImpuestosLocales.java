

package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TImpuestosLocales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TImpuestosLocales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Retenciones" type="{http://www.fact.com.mx/schema/fx}TImpuestosRetenidosLoc" minOccurs="0"/&gt;
 *         &lt;element name="Traslados" type="{http://www.fact.com.mx/schema/fx}TImpuestosTrasladadosLoc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TImpuestosLocales", propOrder = {
    "retenciones",
    "traslados"
})
public class TImpuestosLocales {

    @XmlElement(name = "Retenciones")
    protected TImpuestosRetenidosLoc retenciones;
    @XmlElement(name = "Traslados")
    protected TImpuestosTrasladadosLoc traslados;

    /**
     * Obtiene el valor de la propiedad retenciones.
     * 
     * @return
     *     possible object is
     *     {@link TImpuestosRetenidosLoc }
     *     
     */
    public TImpuestosRetenidosLoc getRetenciones() {
        return retenciones;
    }

    /**
     * Define el valor de la propiedad retenciones.
     * 
     * @param value
     *     allowed object is
     *     {@link TImpuestosRetenidosLoc }
     *     
     */
    public void setRetenciones(TImpuestosRetenidosLoc value) {
        this.retenciones = value;
    }

    /**
     * Obtiene el valor de la propiedad traslados.
     * 
     * @return
     *     possible object is
     *     {@link TImpuestosTrasladadosLoc }
     *     
     */
    public TImpuestosTrasladadosLoc getTraslados() {
        return traslados;
    }

    /**
     * Define el valor de la propiedad traslados.
     * 
     * @param value
     *     allowed object is
     *     {@link TImpuestosTrasladadosLoc }
     *     
     */
    public void setTraslados(TImpuestosTrasladadosLoc value) {
        this.traslados = value;
    }

}
