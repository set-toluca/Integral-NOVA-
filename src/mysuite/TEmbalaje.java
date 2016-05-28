package mysuite;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para TEmbalaje complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TEmbalaje"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Tipo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="EXCHANGE_PALLETS"/&gt;
 *               &lt;enumeration value="RETURN_PALLETS"/&gt;
 *               &lt;enumeration value="PALLET_80x100"/&gt;
 *               &lt;enumeration value="CASE"/&gt;
 *               &lt;enumeration value="BOX"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="PagoDeTransporte"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="PREPAID_BY_SELLER"/&gt;
 *               &lt;enumeration value="PAID_BY_BUYER"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UnidadDeEmpaque" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="128"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
@XmlType(name = "TEmbalaje", propOrder = {
    "cantidad",
    "tipo",
    "descripcion",
    "pagoDeTransporte",
    "unidadDeEmpaque"
})
public class TEmbalaje {

    @XmlElement(name = "Cantidad")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger cantidad;
    @XmlElement(name = "Tipo", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tipo;
    @XmlElement(name = "Descripcion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String descripcion;
    @XmlElement(name = "PagoDeTransporte", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pagoDeTransporte;
    @XmlElement(name = "UnidadDeEmpaque")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unidadDeEmpaque;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCantidad(BigInteger value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
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
     * Obtiene el valor de la propiedad pagoDeTransporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagoDeTransporte() {
        return pagoDeTransporte;
    }

    /**
     * Define el valor de la propiedad pagoDeTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagoDeTransporte(String value) {
        this.pagoDeTransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadDeEmpaque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadDeEmpaque() {
        return unidadDeEmpaque;
    }

    /**
     * Define el valor de la propiedad unidadDeEmpaque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadDeEmpaque(String value) {
        this.unidadDeEmpaque = value;
    }

}
