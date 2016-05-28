package mysuite;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DetalleType2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleType2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaldoPromedio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DiasDelPeriodo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="SaldoInicial" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Depositos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Retiros" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaldoActual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleType2", propOrder = {
    "saldoPromedio",
    "diasDelPeriodo",
    "saldoInicial",
    "depositos",
    "retiros",
    "saldoActual"
})
public class DetalleType2 {

    @XmlElement(name = "SaldoPromedio")
    protected BigDecimal saldoPromedio;
    @XmlElement(name = "DiasDelPeriodo")
    protected Short diasDelPeriodo;
    @XmlElement(name = "SaldoInicial")
    protected BigDecimal saldoInicial;
    @XmlElement(name = "Depositos")
    protected BigDecimal depositos;
    @XmlElement(name = "Retiros")
    protected BigDecimal retiros;
    @XmlElement(name = "SaldoActual")
    protected BigDecimal saldoActual;

    /**
     * Obtiene el valor de la propiedad saldoPromedio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoPromedio() {
        return saldoPromedio;
    }

    /**
     * Define el valor de la propiedad saldoPromedio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoPromedio(BigDecimal value) {
        this.saldoPromedio = value;
    }

    /**
     * Obtiene el valor de la propiedad diasDelPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDiasDelPeriodo() {
        return diasDelPeriodo;
    }

    /**
     * Define el valor de la propiedad diasDelPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDiasDelPeriodo(Short value) {
        this.diasDelPeriodo = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoInicial.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * Define el valor de la propiedad saldoInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoInicial(BigDecimal value) {
        this.saldoInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad depositos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepositos() {
        return depositos;
    }

    /**
     * Define el valor de la propiedad depositos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepositos(BigDecimal value) {
        this.depositos = value;
    }

    /**
     * Obtiene el valor de la propiedad retiros.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRetiros() {
        return retiros;
    }

    /**
     * Define el valor de la propiedad retiros.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRetiros(BigDecimal value) {
        this.retiros = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoActual.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoActual() {
        return saldoActual;
    }

    /**
     * Define el valor de la propiedad saldoActual.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoActual(BigDecimal value) {
        this.saldoActual = value;
    }

}
