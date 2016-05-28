
package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TResumenDeImpuestos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TResumenDeImpuestos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalTrasladosFederales" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *         &lt;element name="TotalIVATrasladado" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *         &lt;element name="TotalIEPSTrasladado" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *         &lt;element name="TotalRetencionesFederales" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *         &lt;element name="TotalISRRetenido" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *         &lt;element name="TotalIVARetenido" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *         &lt;element name="TotalTrasladosLocales" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *         &lt;element name="TotalRetencionesLocales" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TResumenDeImpuestos", propOrder = {
    "totalTrasladosFederales",
    "totalIVATrasladado",
    "totalIEPSTrasladado",
    "totalRetencionesFederales",
    "totalISRRetenido",
    "totalIVARetenido",
    "totalTrasladosLocales",
    "totalRetencionesLocales"
})
public class TResumenDeImpuestos {

    @XmlElement(name = "TotalTrasladosFederales", required = true)
    protected TNonNegativeAmount totalTrasladosFederales;
    @XmlElement(name = "TotalIVATrasladado", required = true)
    protected TNonNegativeAmount totalIVATrasladado;
    @XmlElement(name = "TotalIEPSTrasladado", required = true)
    protected TNonNegativeAmount totalIEPSTrasladado;
    @XmlElement(name = "TotalRetencionesFederales", required = true)
    protected TNonNegativeAmount totalRetencionesFederales;
    @XmlElement(name = "TotalISRRetenido", required = true)
    protected TNonNegativeAmount totalISRRetenido;
    @XmlElement(name = "TotalIVARetenido", required = true)
    protected TNonNegativeAmount totalIVARetenido;
    @XmlElement(name = "TotalTrasladosLocales", required = true)
    protected TNonNegativeAmount totalTrasladosLocales;
    @XmlElement(name = "TotalRetencionesLocales", required = true)
    protected TNonNegativeAmount totalRetencionesLocales;

    /**
     * Obtiene el valor de la propiedad totalTrasladosFederales.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalTrasladosFederales() {
        return totalTrasladosFederales;
    }

    /**
     * Define el valor de la propiedad totalTrasladosFederales.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalTrasladosFederales(TNonNegativeAmount value) {
        this.totalTrasladosFederales = value;
    }

    /**
     * Obtiene el valor de la propiedad totalIVATrasladado.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalIVATrasladado() {
        return totalIVATrasladado;
    }

    /**
     * Define el valor de la propiedad totalIVATrasladado.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalIVATrasladado(TNonNegativeAmount value) {
        this.totalIVATrasladado = value;
    }

    /**
     * Obtiene el valor de la propiedad totalIEPSTrasladado.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalIEPSTrasladado() {
        return totalIEPSTrasladado;
    }

    /**
     * Define el valor de la propiedad totalIEPSTrasladado.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalIEPSTrasladado(TNonNegativeAmount value) {
        this.totalIEPSTrasladado = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRetencionesFederales.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalRetencionesFederales() {
        return totalRetencionesFederales;
    }

    /**
     * Define el valor de la propiedad totalRetencionesFederales.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalRetencionesFederales(TNonNegativeAmount value) {
        this.totalRetencionesFederales = value;
    }

    /**
     * Obtiene el valor de la propiedad totalISRRetenido.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalISRRetenido() {
        return totalISRRetenido;
    }

    /**
     * Define el valor de la propiedad totalISRRetenido.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalISRRetenido(TNonNegativeAmount value) {
        this.totalISRRetenido = value;
    }

    /**
     * Obtiene el valor de la propiedad totalIVARetenido.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalIVARetenido() {
        return totalIVARetenido;
    }

    /**
     * Define el valor de la propiedad totalIVARetenido.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalIVARetenido(TNonNegativeAmount value) {
        this.totalIVARetenido = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrasladosLocales.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalTrasladosLocales() {
        return totalTrasladosLocales;
    }

    /**
     * Define el valor de la propiedad totalTrasladosLocales.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalTrasladosLocales(TNonNegativeAmount value) {
        this.totalTrasladosLocales = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRetencionesLocales.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalRetencionesLocales() {
        return totalRetencionesLocales;
    }

    /**
     * Define el valor de la propiedad totalRetencionesLocales.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalRetencionesLocales(TNonNegativeAmount value) {
        this.totalRetencionesLocales = value;
    }

}
