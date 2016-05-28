
package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para TMTEFianza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMTEFianza"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Numero" type="{http://www.fact.com.mx/schema/fx}TCode"/&gt;
 *         &lt;element name="Monto" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="Vigencia" type="{http://www.fact.com.mx/schema/fx}TFromTo" minOccurs="0"/&gt;
 *         &lt;element name="Obligacion" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="Beneficiario" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="Movimiento" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMTEFianza", propOrder = {
    "numero",
    "monto",
    "vigencia",
    "obligacion",
    "beneficiario",
    "movimiento"
})
public class TMTEFianza {

    @XmlElement(name = "Numero", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String numero;
    @XmlElement(name = "Monto")
    protected TNonNegativeAmount monto;
    @XmlElement(name = "Vigencia")
    protected TFromTo vigencia;
    @XmlElement(name = "Obligacion")
    protected String obligacion;
    @XmlElement(name = "Beneficiario")
    protected String beneficiario;
    @XmlElement(name = "Movimiento")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String movimiento;

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setMonto(TNonNegativeAmount value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad vigencia.
     * 
     * @return
     *     possible object is
     *     {@link TFromTo }
     *     
     */
    public TFromTo getVigencia() {
        return vigencia;
    }

    /**
     * Define el valor de la propiedad vigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link TFromTo }
     *     
     */
    public void setVigencia(TFromTo value) {
        this.vigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad obligacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObligacion() {
        return obligacion;
    }

    /**
     * Define el valor de la propiedad obligacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObligacion(String value) {
        this.obligacion = value;
    }

    /**
     * Obtiene el valor de la propiedad beneficiario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiario() {
        return beneficiario;
    }

    /**
     * Define el valor de la propiedad beneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiario(String value) {
        this.beneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad movimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovimiento() {
        return movimiento;
    }

    /**
     * Define el valor de la propiedad movimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovimiento(String value) {
        this.movimiento = value;
    }

}
