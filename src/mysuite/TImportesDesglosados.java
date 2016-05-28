

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
 * <p>Clase Java para TImportesDesglosados complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TImportesDesglosados"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Motivo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tasa" type="{http://www.fact.com.mx/schema/fx}TNonNegativePercentage" minOccurs="0"/&gt;
 *         &lt;element name="Importe" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
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
@XmlType(name = "TImportesDesglosados", propOrder = {
    "motivo",
    "tasa",
    "importe",
    "desglose"
})
public class TImportesDesglosados {

    @XmlElement(name = "Motivo")
    protected String motivo;
    @XmlElement(name = "Tasa")
    protected BigDecimal tasa;
    @XmlElement(name = "Importe", required = true)
    protected TNonNegativeAmount importe;
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
     * Obtiene el valor de la propiedad tasa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasa() {
        return tasa;
    }

    /**
     * Define el valor de la propiedad tasa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasa(BigDecimal value) {
        this.tasa = value;
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
