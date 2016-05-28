

package mysuite;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TTax complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TTax"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Contexto" type="{http://www.fact.com.mx/schema/fx}TTaxContext"/&gt;
 *         &lt;element name="Operacion" type="{http://www.fact.com.mx/schema/fx}TTaxOperation"/&gt;
 *         &lt;element name="Codigo" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"/&gt;
 *         &lt;element name="Base" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *         &lt;element name="Tasa" type="{http://www.fact.com.mx/schema/fx}TNonNegativePercentage" minOccurs="0"/&gt;
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
@XmlType(name = "TTax", propOrder = {
    "contexto",
    "operacion",
    "codigo",
    "base",
    "tasa",
    "monto"
})
public class TTax {

    @XmlElement(name = "Contexto", required = true)
    @XmlSchemaType(name = "string")
    protected TTaxContext contexto;
    @XmlElement(name = "Operacion", required = true)
    @XmlSchemaType(name = "string")
    protected TTaxOperation operacion;
    @XmlElement(name = "Codigo", required = true)
    protected String codigo;
    @XmlElement(name = "Base", required = true)
    protected TNonNegativeAmount base;
    @XmlElement(name = "Tasa")
    protected BigDecimal tasa;
    @XmlElement(name = "Monto", required = true)
    protected TNonNegativeAmount monto;

    /**
     * Obtiene el valor de la propiedad contexto.
     * 
     * @return
     *     possible object is
     *     {@link TTaxContext }
     *     
     */
    public TTaxContext getContexto() {
        return contexto;
    }

    /**
     * Define el valor de la propiedad contexto.
     * 
     * @param value
     *     allowed object is
     *     {@link TTaxContext }
     *     
     */
    public void setContexto(TTaxContext value) {
        this.contexto = value;
    }

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link TTaxOperation }
     *     
     */
    public TTaxOperation getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TTaxOperation }
     *     
     */
    public void setOperacion(TTaxOperation value) {
        this.operacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
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
