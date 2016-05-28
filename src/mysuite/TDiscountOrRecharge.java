
package mysuite;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para TDiscountOrRecharge complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TDiscountOrRecharge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Operacion" type="{http://www.fact.com.mx/schema/fx}TAllowanceChargeType"/&gt;
 *         &lt;element name="Imputacion" type="{http://www.fact.com.mx/schema/fx}TSettlementType"/&gt;
 *         &lt;element name="Servicio" type="{http://www.fact.com.mx/schema/fx}TSpecialServicesType"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="Base" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *         &lt;element name="Tasa" type="{http://www.fact.com.mx/schema/fx}TNonNegativePercentage"/&gt;
 *         &lt;element name="Monto" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDiscountOrRecharge", propOrder = {
    "operacion",
    "imputacion",
    "servicio",
    "descripcion",
    "base",
    "tasa",
    "monto"
})
public class TDiscountOrRecharge {

    @XmlElement(name = "Operacion", required = true)
    @XmlSchemaType(name = "string")
    protected TAllowanceChargeType operacion;
    @XmlElement(name = "Imputacion", required = true)
    @XmlSchemaType(name = "token")
    protected TSettlementType imputacion;
    @XmlElement(name = "Servicio", required = true)
    @XmlSchemaType(name = "token")
    protected TSpecialServicesType servicio;
    @XmlElement(name = "Descripcion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String descripcion;
    @XmlElement(name = "Base", required = true)
    protected TNonNegativeAmount base;
    @XmlElement(name = "Tasa", required = true)
    protected BigDecimal tasa;
    @XmlElement(name = "Monto", required = true)
    protected TNonNegativeAmount monto;

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link TAllowanceChargeType }
     *     
     */
    public TAllowanceChargeType getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TAllowanceChargeType }
     *     
     */
    public void setOperacion(TAllowanceChargeType value) {
        this.operacion = value;
    }

    /**
     * Obtiene el valor de la propiedad imputacion.
     * 
     * @return
     *     possible object is
     *     {@link TSettlementType }
     *     
     */
    public TSettlementType getImputacion() {
        return imputacion;
    }

    /**
     * Define el valor de la propiedad imputacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TSettlementType }
     *     
     */
    public void setImputacion(TSettlementType value) {
        this.imputacion = value;
    }

    /**
     * Obtiene el valor de la propiedad servicio.
     * 
     * @return
     *     possible object is
     *     {@link TSpecialServicesType }
     *     
     */
    public TSpecialServicesType getServicio() {
        return servicio;
    }

    /**
     * Define el valor de la propiedad servicio.
     * 
     * @param value
     *     allowed object is
     *     {@link TSpecialServicesType }
     *     
     */
    public void setServicio(TSpecialServicesType value) {
        this.servicio = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad base.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getBase() {
        return base;
    }

    /**
     * Define el valor de la propiedad base.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setBase(TNonNegativeAmount value) {
        this.base = value;
    }

    /**
     * Obtiene el valor de la propiedad tasa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasa() {
        return tasa;
    }

    /**
     * Define el valor de la propiedad tasa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasa(BigDecimal value) {
        this.tasa = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setMonto(TNonNegativeAmount value) {
        this.monto = value;
    }

}
