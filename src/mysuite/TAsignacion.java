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
 * <p>Clase Java para TAsignacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TAsignacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnoDeAprobacion"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *               &lt;minInclusive value="2004"/&gt;
 *               &lt;maxInclusive value="9999"/&gt;
 *               &lt;fractionDigits value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NumeroDeAprobacion" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="Serie" type="{http://www.fact.com.mx/schema/fx}TSerie" minOccurs="0"/&gt;
 *         &lt;element name="Folio" type="{http://www.fact.com.mx/schema/fx}TFolio"/&gt;
 *         &lt;element name="TiempoDeEmision"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime"&gt;
 *               &lt;minInclusive value="2004-01-01T00:00:00"/&gt;
 *               &lt;maxInclusive value="9000-01-01T00:00:00"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TiempoDeAutorizacion"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime"&gt;
 *               &lt;minInclusive value="2004-01-01T00:00:00"/&gt;
 *               &lt;maxInclusive value="9000-01-01T00:00:00"/&gt;
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
@XmlType(name = "TAsignacion", propOrder = {
    "anoDeAprobacion",
    "numeroDeAprobacion",
    "serie",
    "folio",
    "tiempoDeEmision",
    "tiempoDeAutorizacion"
})
public class TAsignacion {

    @XmlElement(name = "AnoDeAprobacion")
    protected int anoDeAprobacion;
    @XmlElement(name = "NumeroDeAprobacion", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numeroDeAprobacion;
    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "Folio", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String folio;
    @XmlElement(name = "TiempoDeEmision", required = true)
    protected XMLGregorianCalendar tiempoDeEmision;
    @XmlElement(name = "TiempoDeAutorizacion", required = true)
    protected XMLGregorianCalendar tiempoDeAutorizacion;

    /**
     * Obtiene el valor de la propiedad anoDeAprobacion.
     * 
     */
    public int getAnoDeAprobacion() {
        return anoDeAprobacion;
    }

    /**
     * Define el valor de la propiedad anoDeAprobacion.
     * 
     */
    public void setAnoDeAprobacion(int value) {
        this.anoDeAprobacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDeAprobacion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroDeAprobacion() {
        return numeroDeAprobacion;
    }

    /**
     * Define el valor de la propiedad numeroDeAprobacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroDeAprobacion(BigInteger value) {
        this.numeroDeAprobacion = value;
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
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempoDeEmision.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTiempoDeEmision() {
        return tiempoDeEmision;
    }

    /**
     * Define el valor de la propiedad tiempoDeEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTiempoDeEmision(XMLGregorianCalendar value) {
        this.tiempoDeEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempoDeAutorizacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTiempoDeAutorizacion() {
        return tiempoDeAutorizacion;
    }

    /**
     * Define el valor de la propiedad tiempoDeAutorizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTiempoDeAutorizacion(XMLGregorianCalendar value) {
        this.tiempoDeAutorizacion = value;
    }

}
