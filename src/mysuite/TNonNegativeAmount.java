package mysuite;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para TNonNegativeAmount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TNonNegativeAmount"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.fact.com.mx/schema/fx&gt;TNonNegativeAmountBase"&gt;
 *       &lt;attribute name="otraMoneda" type="{http://www.fact.com.mx/schema/fx}TCurrencyCode" /&gt;
 *       &lt;attribute name="tipoCambioVenta" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmountBase" /&gt;
 *       &lt;attribute name="importeOtraMoneda" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmountBase" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNonNegativeAmount", propOrder = {
    "value"
})
public class TNonNegativeAmount {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "otraMoneda")
    protected TCurrencyCode otraMoneda;
    @XmlAttribute(name = "tipoCambioVenta")
    protected BigDecimal tipoCambioVenta;
    @XmlAttribute(name = "importeOtraMoneda")
    protected BigDecimal importeOtraMoneda;

    /**
     *  2014-03-10: SE VAN A PERMITIR NEGATIVOS SIN AFECTAR CONSISTENCIA.
     * MYS-605.
     * Monto no negativo de 20 posiciones con u maximo de 2 decimales.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad otraMoneda.
     * 
     * @return
     *     possible object is
     *     {@link TCurrencyCode }
     *     
     */
    public TCurrencyCode getOtraMoneda() {
        return otraMoneda;
    }

    /**
     * Define el valor de la propiedad otraMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link TCurrencyCode }
     *     
     */
    public void setOtraMoneda(TCurrencyCode value) {
        this.otraMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambioVenta.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoCambioVenta() {
        return tipoCambioVenta;
    }

    /**
     * Define el valor de la propiedad tipoCambioVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipoCambioVenta(BigDecimal value) {
        this.tipoCambioVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad importeOtraMoneda.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteOtraMoneda() {
        return importeOtraMoneda;
    }

    /**
     * Define el valor de la propiedad importeOtraMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteOtraMoneda(BigDecimal value) {
        this.importeOtraMoneda = value;
    }

}
