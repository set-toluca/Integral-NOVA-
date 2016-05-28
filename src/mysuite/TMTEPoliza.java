
package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Addenda MAPFRE.
 * 
 * <p>Clase Java para TMTEPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMTEPoliza"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tipo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Numero"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Inciso" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TipoCliente" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="1"/&gt;
 *               &lt;enumeration value="0"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NroReporte" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Siniestro" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="128"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tramitador" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Asegurado" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Endoso" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="Vigencia" type="{http://www.fact.com.mx/schema/fx}TFromTo" minOccurs="0"/&gt;
 *         &lt;element name="SerieRecibo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;maxLength value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FechaDeExpedicion" type="{http://www.fact.com.mx/schema/fx}TAllowedDateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMTEPoliza", propOrder = {
    "tipo",
    "numero",
    "inciso",
    "tipoCliente",
    "nroReporte",
    "siniestro",
    "tramitador",
    "asegurado",
    "endoso",
    "vigencia",
    "serieRecibo",
    "fechaDeExpedicion"
})
public class TMTEPoliza {

    @XmlElement(name = "Tipo", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tipo;
    @XmlElement(name = "Numero", required = true)
    protected String numero;
    @XmlElement(name = "Inciso")
    protected String inciso;
    @XmlElement(name = "TipoCliente")
    protected String tipoCliente;
    @XmlElement(name = "NroReporte")
    protected String nroReporte;
    @XmlElement(name = "Siniestro")
    protected String siniestro;
    @XmlElement(name = "Tramitador")
    protected String tramitador;
    @XmlElement(name = "Asegurado")
    protected String asegurado;
    @XmlElement(name = "Endoso")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String endoso;
    @XmlElement(name = "Vigencia")
    protected TFromTo vigencia;
    @XmlElement(name = "SerieRecibo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String serieRecibo;
    @XmlElement(name = "FechaDeExpedicion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDeExpedicion;

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
     * Obtiene el valor de la propiedad inciso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInciso() {
        return inciso;
    }

    /**
     * Define el valor de la propiedad inciso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInciso(String value) {
        this.inciso = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCliente() {
        return tipoCliente;
    }

    /**
     * Define el valor de la propiedad tipoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCliente(String value) {
        this.tipoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad nroReporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroReporte() {
        return nroReporte;
    }

    /**
     * Define el valor de la propiedad nroReporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroReporte(String value) {
        this.nroReporte = value;
    }

    /**
     * Obtiene el valor de la propiedad siniestro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiniestro() {
        return siniestro;
    }

    /**
     * Define el valor de la propiedad siniestro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiniestro(String value) {
        this.siniestro = value;
    }

    /**
     * Obtiene el valor de la propiedad tramitador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTramitador() {
        return tramitador;
    }

    /**
     * Define el valor de la propiedad tramitador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTramitador(String value) {
        this.tramitador = value;
    }

    /**
     * Obtiene el valor de la propiedad asegurado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsegurado() {
        return asegurado;
    }

    /**
     * Define el valor de la propiedad asegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsegurado(String value) {
        this.asegurado = value;
    }

    /**
     * Obtiene el valor de la propiedad endoso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndoso() {
        return endoso;
    }

    /**
     * Define el valor de la propiedad endoso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndoso(String value) {
        this.endoso = value;
    }

    /**
     * Obtiene el valor de la propiedad vigencia.
     * 
     * @return
     *     possible object is
     *     {@link TFromTo }
     *     
     */
    public TFromTo getVigencia() {
        return vigencia;
    }

    /**
     * Define el valor de la propiedad vigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link TFromTo }
     *     
     */
    public void setVigencia(TFromTo value) {
        this.vigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad serieRecibo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieRecibo() {
        return serieRecibo;
    }

    /**
     * Define el valor de la propiedad serieRecibo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieRecibo(String value) {
        this.serieRecibo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDeExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDeExpedicion() {
        return fechaDeExpedicion;
    }

    /**
     * Define el valor de la propiedad fechaDeExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDeExpedicion(XMLGregorianCalendar value) {
        this.fechaDeExpedicion = value;
    }

}
