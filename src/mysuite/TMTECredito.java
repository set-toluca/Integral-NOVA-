package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TMTECredito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMTECredito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pagocon" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="banco" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="numcuenta" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="conducto" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="concepto" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMTECredito", propOrder = {
    "pagocon",
    "banco",
    "numcuenta",
    "conducto",
    "concepto"
})
public class TMTECredito {

    protected String pagocon;
    protected String banco;
    protected String numcuenta;
    protected String conducto;
    protected String concepto;

    /**
     * Obtiene el valor de la propiedad pagocon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagocon() {
        return pagocon;
    }

    /**
     * Define el valor de la propiedad pagocon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagocon(String value) {
        this.pagocon = value;
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
     * Obtiene el valor de la propiedad numcuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumcuenta() {
        return numcuenta;
    }

    /**
     * Define el valor de la propiedad numcuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumcuenta(String value) {
        this.numcuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad conducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConducto() {
        return conducto;
    }

    /**
     * Define el valor de la propiedad conducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConducto(String value) {
        this.conducto = value;
    }

    /**
     * Obtiene el valor de la propiedad concepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * Define el valor de la propiedad concepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcepto(String value) {
        this.concepto = value;
    }

}
