
package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TMTEInversiones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMTEInversiones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Poliza_Deudores" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="Capital" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="Intereses" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="Recargos" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="Aplicable" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="TipoPrestamo" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMTEInversiones", propOrder = {
    "polizaDeudores",
    "capital",
    "intereses",
    "recargos",
    "aplicable",
    "tipoPrestamo"
})
public class TMTEInversiones {

    @XmlElement(name = "Poliza_Deudores")
    protected TNonNegativeAmount polizaDeudores;
    @XmlElement(name = "Capital")
    protected TNonNegativeAmount capital;
    @XmlElement(name = "Intereses")
    protected TNonNegativeAmount intereses;
    @XmlElement(name = "Recargos")
    protected TNonNegativeAmount recargos;
    @XmlElement(name = "Aplicable")
    protected String aplicable;
    @XmlElement(name = "TipoPrestamo")
    protected String tipoPrestamo;

    /**
     * Obtiene el valor de la propiedad polizaDeudores.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getPolizaDeudores() {
        return polizaDeudores;
    }

    /**
     * Define el valor de la propiedad polizaDeudores.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setPolizaDeudores(TNonNegativeAmount value) {
        this.polizaDeudores = value;
    }

    /**
     * Obtiene el valor de la propiedad capital.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getCapital() {
        return capital;
    }

    /**
     * Define el valor de la propiedad capital.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setCapital(TNonNegativeAmount value) {
        this.capital = value;
    }

    /**
     * Obtiene el valor de la propiedad intereses.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getIntereses() {
        return intereses;
    }

    /**
     * Define el valor de la propiedad intereses.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setIntereses(TNonNegativeAmount value) {
        this.intereses = value;
    }

    /**
     * Obtiene el valor de la propiedad recargos.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getRecargos() {
        return recargos;
    }

    /**
     * Define el valor de la propiedad recargos.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setRecargos(TNonNegativeAmount value) {
        this.recargos = value;
    }

    /**
     * Obtiene el valor de la propiedad aplicable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAplicable() {
        return aplicable;
    }

    /**
     * Define el valor de la propiedad aplicable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAplicable(String value) {
        this.aplicable = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPrestamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPrestamo() {
        return tipoPrestamo;
    }

    /**
     * Define el valor de la propiedad tipoPrestamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPrestamo(String value) {
        this.tipoPrestamo = value;
    }

}
