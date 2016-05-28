package mysuite;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResumenType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResumenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cuenta" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MesAnteriorMonto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MesAnteriorPorcentaje" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MesActualMonto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MesActualPorcentaje" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResumenType", propOrder = {
    "cuenta",
    "mesAnteriorMonto",
    "mesAnteriorPorcentaje",
    "mesActualMonto",
    "mesActualPorcentaje"
})
public class ResumenType {

    @XmlElement(name = "Cuenta")
    protected BigInteger cuenta;
    @XmlElement(name = "MesAnteriorMonto")
    protected BigDecimal mesAnteriorMonto;
    @XmlElement(name = "MesAnteriorPorcentaje")
    protected BigDecimal mesAnteriorPorcentaje;
    @XmlElement(name = "MesActualMonto")
    protected BigDecimal mesActualMonto;
    @XmlElement(name = "MesActualPorcentaje")
    protected BigDecimal mesActualPorcentaje;

    /**
     * Obtiene el valor de la propiedad cuenta.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCuenta() {
        return cuenta;
    }

    /**
     * Define el valor de la propiedad cuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCuenta(BigInteger value) {
        this.cuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad mesAnteriorMonto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMesAnteriorMonto() {
        return mesAnteriorMonto;
    }

    /**
     * Define el valor de la propiedad mesAnteriorMonto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMesAnteriorMonto(BigDecimal value) {
        this.mesAnteriorMonto = value;
    }

    /**
     * Obtiene el valor de la propiedad mesAnteriorPorcentaje.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMesAnteriorPorcentaje() {
        return mesAnteriorPorcentaje;
    }

    /**
     * Define el valor de la propiedad mesAnteriorPorcentaje.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMesAnteriorPorcentaje(BigDecimal value) {
        this.mesAnteriorPorcentaje = value;
    }

    /**
     * Obtiene el valor de la propiedad mesActualMonto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMesActualMonto() {
        return mesActualMonto;
    }

    /**
     * Define el valor de la propiedad mesActualMonto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMesActualMonto(BigDecimal value) {
        this.mesActualMonto = value;
    }

    /**
     * Obtiene el valor de la propiedad mesActualPorcentaje.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMesActualPorcentaje() {
        return mesActualPorcentaje;
    }

    /**
     * Define el valor de la propiedad mesActualPorcentaje.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMesActualPorcentaje(BigDecimal value) {
        this.mesActualPorcentaje = value;
    }

}
