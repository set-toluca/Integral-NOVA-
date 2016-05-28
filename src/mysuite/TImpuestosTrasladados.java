

package mysuite;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Suma y desglose de impuestos trasladados.
 * 
 * <p>Clase Java para TImpuestosTrasladados complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TImpuestosTrasladados"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalTraslados" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *         &lt;element name="Traslado"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="IVA16" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *                   &lt;element name="IVA15" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *                   &lt;element name="IVA11" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *                   &lt;element name="IVA10" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *                   &lt;element name="IVA0" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                         &lt;maxInclusive value="0"/&gt;
 *                         &lt;fractionDigits value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "TImpuestosTrasladados", propOrder = {
    "totalTraslados",
    "traslado"
})
public class TImpuestosTrasladados {

    @XmlElement(name = "TotalTraslados", required = true)
    protected TNonNegativeAmount totalTraslados;
    @XmlElement(name = "Traslado", required = true)
    protected TImpuestosTrasladados.Traslado traslado;

    /**
     * Obtiene el valor de la propiedad totalTraslados.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalTraslados() {
        return totalTraslados;
    }

    /**
     * Define el valor de la propiedad totalTraslados.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalTraslados(TNonNegativeAmount value) {
        this.totalTraslados = value;
    }

    /**
     * Obtiene el valor de la propiedad traslado.
     * 
     * @return
     *     possible object is
     *     {@link TImpuestosTrasladados.Traslado }
     *     
     */
    public TImpuestosTrasladados.Traslado getTraslado() {
        return traslado;
    }

    /**
     * Define el valor de la propiedad traslado.
     * 
     * @param value
     *     allowed object is
     *     {@link TImpuestosTrasladados.Traslado }
     *     
     */
    public void setTraslado(TImpuestosTrasladados.Traslado value) {
        this.traslado = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="IVA16" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
     *         &lt;element name="IVA15" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
     *         &lt;element name="IVA11" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
     *         &lt;element name="IVA10" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
     *         &lt;element name="IVA0" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *               &lt;minInclusive value="0"/&gt;
     *               &lt;maxInclusive value="0"/&gt;
     *               &lt;fractionDigits value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Traslado {

        @XmlElement(name = "IVA16")
        protected TNonNegativeAmount iva16;
        @XmlElement(name = "IVA15")
        protected TNonNegativeAmount iva15;
        @XmlElement(name = "IVA11")
        protected TNonNegativeAmount iva11;
        @XmlElement(name = "IVA10")
        protected TNonNegativeAmount iva10;
        @XmlElement(name = "IVA0")
        protected BigDecimal iva0;

        /**
         * Obtiene el valor de la propiedad iva16.
         * 
         * @return
         *     possible object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public TNonNegativeAmount getIVA16() {
            return iva16;
        }

        /**
         * Define el valor de la propiedad iva16.
         * 
         * @param value
         *     allowed object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public void setIVA16(TNonNegativeAmount value) {
            this.iva16 = value;
        }

        /**
         * Obtiene el valor de la propiedad iva15.
         * 
         * @return
         *     possible object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public TNonNegativeAmount getIVA15() {
            return iva15;
        }

        /**
         * Define el valor de la propiedad iva15.
         * 
         * @param value
         *     allowed object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public void setIVA15(TNonNegativeAmount value) {
            this.iva15 = value;
        }

        /**
         * Obtiene el valor de la propiedad iva11.
         * 
         * @return
         *     possible object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public TNonNegativeAmount getIVA11() {
            return iva11;
        }

        /**
         * Define el valor de la propiedad iva11.
         * 
         * @param value
         *     allowed object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public void setIVA11(TNonNegativeAmount value) {
            this.iva11 = value;
        }

        /**
         * Obtiene el valor de la propiedad iva10.
         * 
         * @return
         *     possible object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public TNonNegativeAmount getIVA10() {
            return iva10;
        }

        /**
         * Define el valor de la propiedad iva10.
         * 
         * @param value
         *     allowed object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public void setIVA10(TNonNegativeAmount value) {
            this.iva10 = value;
        }

        /**
         * Obtiene el valor de la propiedad iva0.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getIVA0() {
            return iva0;
        }

        /**
         * Define el valor de la propiedad iva0.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setIVA0(BigDecimal value) {
            this.iva0 = value;
        }

    }

}
