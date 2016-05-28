package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TMTEFinamadrid complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMTEFinamadrid"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="modelo" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="ano" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="impuesto_numero" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="cuenta_clabe" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="mensualidad" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="amortizacion" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="cat" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="taza_fija" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMTEFinamadrid", propOrder = {
    "modelo",
    "ano",
    "impuestoNumero",
    "cuentaClabe",
    "mensualidad",
    "amortizacion",
    "cat",
    "tazaFija"
})
public class TMTEFinamadrid {

    protected String modelo;
    protected String ano;
    @XmlElement(name = "impuesto_numero")
    protected TNonNegativeAmount impuestoNumero;
    @XmlElement(name = "cuenta_clabe")
    protected String cuentaClabe;
    protected TNonNegativeAmount mensualidad;
    protected TNonNegativeAmount amortizacion;
    protected String cat;
    @XmlElement(name = "taza_fija")
    protected String tazaFija;

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad ano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAno() {
        return ano;
    }

    /**
     * Define el valor de la propiedad ano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAno(String value) {
        this.ano = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestoNumero.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getImpuestoNumero() {
        return impuestoNumero;
    }

    /**
     * Define el valor de la propiedad impuestoNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setImpuestoNumero(TNonNegativeAmount value) {
        this.impuestoNumero = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaClabe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaClabe() {
        return cuentaClabe;
    }

    /**
     * Define el valor de la propiedad cuentaClabe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaClabe(String value) {
        this.cuentaClabe = value;
    }

    /**
     * Obtiene el valor de la propiedad mensualidad.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getMensualidad() {
        return mensualidad;
    }

    /**
     * Define el valor de la propiedad mensualidad.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setMensualidad(TNonNegativeAmount value) {
        this.mensualidad = value;
    }

    /**
     * Obtiene el valor de la propiedad amortizacion.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getAmortizacion() {
        return amortizacion;
    }

    /**
     * Define el valor de la propiedad amortizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setAmortizacion(TNonNegativeAmount value) {
        this.amortizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad cat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCat() {
        return cat;
    }

    /**
     * Define el valor de la propiedad cat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCat(String value) {
        this.cat = value;
    }

    /**
     * Obtiene el valor de la propiedad tazaFija.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTazaFija() {
        return tazaFija;
    }

    /**
     * Define el valor de la propiedad tazaFija.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTazaFija(String value) {
        this.tazaFija = value;
    }

}
