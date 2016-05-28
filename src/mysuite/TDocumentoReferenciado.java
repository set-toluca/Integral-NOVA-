

package mysuite;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Para identificar los documentos a los que hace referencia el Comprobante.
 * 
 * <p>Clase Java para TDocumentoReferenciado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TDocumentoReferenciado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tipo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Serie" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *         &lt;element name="Numero" type="{http://www.fact.com.mx/schema/fx}TCode"/&gt;
 *         &lt;element name="Fecha" type="{http://www.fact.com.mx/schema/fx}TAllowedDate" minOccurs="0"/&gt;
 *         &lt;element name="ImporteTotal" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="CodigoReferencia" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Razon" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="250"/&gt;
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
@XmlType(name = "TDocumentoReferenciado", propOrder = {
    "tipo",
    "serie",
    "numero",
    "fecha",
    "importeTotal",
    "codigoReferencia",
    "razon"
})
public class TDocumentoReferenciado {

    @XmlElement(name = "Tipo", required = true)
    protected String tipo;
    @XmlElement(name = "Serie")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serie;
    @XmlElement(name = "Numero", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String numero;
    @XmlElement(name = "Fecha")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "ImporteTotal")
    protected TNonNegativeAmount importeTotal;
    @XmlElement(name = "CodigoReferencia")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger codigoReferencia;
    @XmlElement(name = "Razon")
    protected String razon;

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
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTotal.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getImporteTotal() {
        return importeTotal;
    }

    /**
     * Define el valor de la propiedad importeTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setImporteTotal(TNonNegativeAmount value) {
        this.importeTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoReferencia.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoReferencia() {
        return codigoReferencia;
    }

    /**
     * Define el valor de la propiedad codigoReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoReferencia(BigInteger value) {
        this.codigoReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad razon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazon() {
        return razon;
    }

    /**
     * Define el valor de la propiedad razon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazon(String value) {
        this.razon = value;
    }

}
