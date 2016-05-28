package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DetalleType1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleType1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaldoPromedio" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TasaBrutaInteresAnual" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DiasDelPeriodo" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SaldoPromedioMinimo" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SaldoInicial" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Depositos" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Retiros" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SaldoActual" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleType1", propOrder = {
    "saldoPromedio",
    "tasaBrutaInteresAnual",
    "diasDelPeriodo",
    "saldoPromedioMinimo",
    "saldoInicial",
    "depositos",
    "retiros",
    "saldoActual"
})
public class DetalleType1 {

    @XmlElement(name = "SaldoPromedio")
    protected Object saldoPromedio;
    @XmlElement(name = "TasaBrutaInteresAnual")
    protected Object tasaBrutaInteresAnual;
    @XmlElement(name = "DiasDelPeriodo")
    protected Object diasDelPeriodo;
    @XmlElement(name = "SaldoPromedioMinimo")
    protected Object saldoPromedioMinimo;
    @XmlElement(name = "SaldoInicial")
    protected Object saldoInicial;
    @XmlElement(name = "Depositos")
    protected Object depositos;
    @XmlElement(name = "Retiros")
    protected Object retiros;
    @XmlElement(name = "SaldoActual")
    protected Object saldoActual;

    /**
     * Obtiene el valor de la propiedad saldoPromedio.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSaldoPromedio() {
        return saldoPromedio;
    }

    /**
     * Define el valor de la propiedad saldoPromedio.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSaldoPromedio(Object value) {
        this.saldoPromedio = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaBrutaInteresAnual.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTasaBrutaInteresAnual() {
        return tasaBrutaInteresAnual;
    }

    /**
     * Define el valor de la propiedad tasaBrutaInteresAnual.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTasaBrutaInteresAnual(Object value) {
        this.tasaBrutaInteresAnual = value;
    }

    /**
     * Obtiene el valor de la propiedad diasDelPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDiasDelPeriodo() {
        return diasDelPeriodo;
    }

    /**
     * Define el valor de la propiedad diasDelPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDiasDelPeriodo(Object value) {
        this.diasDelPeriodo = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoPromedioMinimo.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSaldoPromedioMinimo() {
        return saldoPromedioMinimo;
    }

    /**
     * Define el valor de la propiedad saldoPromedioMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSaldoPromedioMinimo(Object value) {
        this.saldoPromedioMinimo = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoInicial.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * Define el valor de la propiedad saldoInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSaldoInicial(Object value) {
        this.saldoInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad depositos.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDepositos() {
        return depositos;
    }

    /**
     * Define el valor de la propiedad depositos.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDepositos(Object value) {
        this.depositos = value;
    }

    /**
     * Obtiene el valor de la propiedad retiros.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRetiros() {
        return retiros;
    }

    /**
     * Define el valor de la propiedad retiros.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRetiros(Object value) {
        this.retiros = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoActual.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSaldoActual() {
        return saldoActual;
    }

    /**
     * Define el valor de la propiedad saldoActual.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSaldoActual(Object value) {
        this.saldoActual = value;
    }

}
