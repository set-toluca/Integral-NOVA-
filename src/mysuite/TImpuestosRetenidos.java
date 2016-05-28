


package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Suma y desglose de impuestos retenidos.
 * 
 * <p>Clase Java para TImpuestosRetenidos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TImpuestosRetenidos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalRetenciones" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *         &lt;element name="Retencion"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="IVA100" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *                   &lt;element name="IVA4" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *                   &lt;element name="IVA" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *                   &lt;element name="ISR10" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *                   &lt;element name="ISR" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
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
@XmlType(name = "TImpuestosRetenidos", propOrder = {
    "totalRetenciones",
    "retencion"
})
public class TImpuestosRetenidos {

    @XmlElement(name = "TotalRetenciones", required = true)
    protected TNonNegativeAmount totalRetenciones;
    @XmlElement(name = "Retencion", required = true)
    protected TImpuestosRetenidos.Retencion retencion;

    /**
     * Obtiene el valor de la propiedad totalRetenciones.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalRetenciones() {
        return totalRetenciones;
    }

    /**
     * Define el valor de la propiedad totalRetenciones.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalRetenciones(TNonNegativeAmount value) {
        this.totalRetenciones = value;
    }

    /**
     * Obtiene el valor de la propiedad retencion.
     * 
     * @return
     *     possible object is
     *     {@link TImpuestosRetenidos.Retencion }
     *     
     */
    public TImpuestosRetenidos.Retencion getRetencion() {
        return retencion;
    }

    /**
     * Define el valor de la propiedad retencion.
     * 
     * @param value
     *     allowed object is
     *     {@link TImpuestosRetenidos.Retencion }
     *     
     */
    public void setRetencion(TImpuestosRetenidos.Retencion value) {
        this.retencion = value;
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
     *         &lt;element name="IVA100" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
     *         &lt;element name="IVA4" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
     *         &lt;element name="IVA" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
     *         &lt;element name="ISR10" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
     *         &lt;element name="ISR" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
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
    public static class Retencion {

        @XmlElement(name = "IVA100")
        protected TNonNegativeAmount iva100;
        @XmlElement(name = "IVA4")
        protected TNonNegativeAmount iva4;
        @XmlElement(name = "IVA")
        protected TNonNegativeAmount iva;
        @XmlElement(name = "ISR10")
        protected TNonNegativeAmount isr10;
        @XmlElement(name = "ISR")
        protected TNonNegativeAmount isr;

        /**
         * Obtiene el valor de la propiedad iva100.
         * 
         * @return
         *     possible object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public TNonNegativeAmount getIVA100() {
            return iva100;
        }

        /**
         * Define el valor de la propiedad iva100.
         * 
         * @param value
         *     allowed object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public void setIVA100(TNonNegativeAmount value) {
            this.iva100 = value;
        }

        /**
         * Obtiene el valor de la propiedad iva4.
         * 
         * @return
         *     possible object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public TNonNegativeAmount getIVA4() {
            return iva4;
        }

        /**
         * Define el valor de la propiedad iva4.
         * 
         * @param value
         *     allowed object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public void setIVA4(TNonNegativeAmount value) {
            this.iva4 = value;
        }

        /**
         * Obtiene el valor de la propiedad iva.
         * 
         * @return
         *     possible object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public TNonNegativeAmount getIVA() {
            return iva;
        }

        /**
         * Define el valor de la propiedad iva.
         * 
         * @param value
         *     allowed object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public void setIVA(TNonNegativeAmount value) {
            this.iva = value;
        }

        /**
         * Obtiene el valor de la propiedad isr10.
         * 
         * @return
         *     possible object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public TNonNegativeAmount getISR10() {
            return isr10;
        }

        /**
         * Define el valor de la propiedad isr10.
         * 
         * @param value
         *     allowed object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public void setISR10(TNonNegativeAmount value) {
            this.isr10 = value;
        }

        /**
         * Obtiene el valor de la propiedad isr.
         * 
         * @return
         *     possible object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public TNonNegativeAmount getISR() {
            return isr;
        }

        /**
         * Define el valor de la propiedad isr.
         * 
         * @param value
         *     allowed object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public void setISR(TNonNegativeAmount value) {
            this.isr = value;
        }

    }

}
