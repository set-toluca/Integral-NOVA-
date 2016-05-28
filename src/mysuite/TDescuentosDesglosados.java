
package mysuite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Montos desglosado con descripcion libre.
 * 
 * <p>Clase Java para TDescuentosDesglosados complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TDescuentosDesglosados"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Motivo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TasaGlobalDescuento" type="{http://www.fact.com.mx/schema/fx}TNonNegativePercentage" minOccurs="0"/&gt;
 *         &lt;element name="ImporteGlobalDescuento" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *         &lt;element name="Desglose" type="{http://www.fact.com.mx/schema/fx}TImporteDesglosado" maxOccurs="12" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDescuentosDesglosados", propOrder = {
    "motivo",
    "tasaGlobalDescuento",
    "importeGlobalDescuento",
    "desglose"
})
public class TDescuentosDesglosados {

    @XmlElement(name = "Motivo")
    protected String motivo;
    @XmlElement(name = "TasaGlobalDescuento")
    protected BigDecimal tasaGlobalDescuento;
    @XmlElement(name = "ImporteGlobalDescuento", required = true)
    protected TNonNegativeAmount importeGlobalDescuento;
    @XmlElement(name = "Desglose")
    protected List<TImporteDesglosado> desglose;

    /**
     * Obtiene el valor de la propiedad motivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Define el valor de la propiedad motivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivo(String value) {
        this.motivo = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaGlobalDescuento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasaGlobalDescuento() {
        return tasaGlobalDescuento;
    }

    /**
     * Define el valor de la propiedad tasaGlobalDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasaGlobalDescuento(BigDecimal value) {
        this.tasaGlobalDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad importeGlobalDescuento.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getImporteGlobalDescuento() {
        return importeGlobalDescuento;
    }

    /**
     * Define el valor de la propiedad importeGlobalDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setImporteGlobalDescuento(TNonNegativeAmount value) {
        this.importeGlobalDescuento = value;
    }

    /**
     * Gets the value of the desglose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desglose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesglose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TImporteDesglosado }
     * 
     * 
     */
    public List<TImporteDesglosado> getDesglose() {
        if (desglose == null) {
            desglose = new ArrayList<TImporteDesglosado>();
        }
        return this.desglose;
    }

}
