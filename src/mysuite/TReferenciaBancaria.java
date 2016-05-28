

package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Informacion de la cuenta bancaria.
 * 
 * <p>Clase Java para TReferenciaBancaria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TReferenciaBancaria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Moneda" type="{http://www.fact.com.mx/schema/fx}TCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="Banco"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Sucursal" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Plaza" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="Titular" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Cuenta" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CLABE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Convenio" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RefCliente" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TReferenciaBancaria", propOrder = {
    "moneda",
    "banco",
    "sucursal",
    "plaza",
    "titular",
    "cuenta",
    "clabe",
    "convenio",
    "refCliente"
})
public class TReferenciaBancaria {

    @XmlElement(name = "Moneda")
    @XmlSchemaType(name = "token")
    protected TCurrencyCode moneda;
    @XmlElement(name = "Banco", required = true)
    protected String banco;
    @XmlElement(name = "Sucursal")
    protected String sucursal;
    @XmlElement(name = "Plaza")
    protected String plaza;
    @XmlElement(name = "Titular")
    protected String titular;
    @XmlElement(name = "Cuenta")
    protected String cuenta;
    @XmlElement(name = "CLABE")
    protected String clabe;
    @XmlElement(name = "Convenio")
    protected String convenio;
    @XmlElement(name = "RefCliente")
    protected String refCliente;

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link TCurrencyCode }
     *     
     */
    public TCurrencyCode getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link TCurrencyCode }
     *     
     */
    public void setMoneda(TCurrencyCode value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad banco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanco() {
        return banco;
    }

    /**
     * Define el valor de la propiedad banco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanco(String value) {
        this.banco = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSucursal() {
        return sucursal;
    }

    /**
     * Define el valor de la propiedad sucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSucursal(String value) {
        this.sucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad plaza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaza() {
        return plaza;
    }

    /**
     * Define el valor de la propiedad plaza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaza(String value) {
        this.plaza = value;
    }

    /**
     * Obtiene el valor de la propiedad titular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Define el valor de la propiedad titular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitular(String value) {
        this.titular = value;
    }

    /**
     * Obtiene el valor de la propiedad cuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Define el valor de la propiedad cuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuenta(String value) {
        this.cuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad clabe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLABE() {
        return clabe;
    }

    /**
     * Define el valor de la propiedad clabe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLABE(String value) {
        this.clabe = value;
    }

    /**
     * Obtiene el valor de la propiedad convenio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvenio() {
        return convenio;
    }

    /**
     * Define el valor de la propiedad convenio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvenio(String value) {
        this.convenio = value;
    }

    /**
     * Obtiene el valor de la propiedad refCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefCliente() {
        return refCliente;
    }

    /**
     * Define el valor de la propiedad refCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefCliente(String value) {
        this.refCliente = value;
    }

}
