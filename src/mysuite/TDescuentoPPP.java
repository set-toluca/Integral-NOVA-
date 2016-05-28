package mysuite;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Descuento por pronto pago.
 * 
 * <p>Clase Java para TDescuentoPPP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TDescuentoPPP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PagoHasta" type="{http://www.fact.com.mx/schema/fx}TAllowedDate"/&gt;
 *         &lt;element name="TasaDescuento" type="{http://www.fact.com.mx/schema/fx}TNonNegativePercentage" minOccurs="0"/&gt;
 *         &lt;element name="ImporteDescuento" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="ImporteAPagar" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDescuentoPPP", propOrder = {
    "pagoHasta",
    "tasaDescuento",
    "importeDescuento",
    "importeAPagar"
})
public class TDescuentoPPP {

    @XmlElement(name = "PagoHasta", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pagoHasta;
    @XmlElement(name = "TasaDescuento")
    protected BigDecimal tasaDescuento;
    @XmlElement(name = "ImporteDescuento")
    protected TNonNegativeAmount importeDescuento;
    @XmlElement(name = "ImporteAPagar", required = true)
    protected TNonNegativeAmount importeAPagar;

    /**
     * Obtiene el valor de la propiedad pagoHasta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPagoHasta() {
        return pagoHasta;
    }

    /**
     * Define el valor de la propiedad pagoHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPagoHasta(XMLGregorianCalendar value) {
        this.pagoHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaDescuento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasaDescuento() {
        return tasaDescuento;
    }

    /**
     * Define el valor de la propiedad tasaDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasaDescuento(BigDecimal value) {
        this.tasaDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad importeDescuento.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getImporteDescuento() {
        return importeDescuento;
    }

    /**
     * Define el valor de la propiedad importeDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setImporteDescuento(TNonNegativeAmount value) {
        this.importeDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad importeAPagar.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getImporteAPagar() {
        return importeAPagar;
    }

    /**
     * Define el valor de la propiedad importeAPagar.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setImporteAPagar(TNonNegativeAmount value) {
        this.importeAPagar = value;
    }

}
