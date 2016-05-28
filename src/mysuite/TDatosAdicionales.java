
package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para TDatosAdicionales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TDatosAdicionales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RepresentanteLegal" type="{http://www.fact.com.mx/schema/fx}TRepresentanteLegal" minOccurs="0"/&gt;
 *         &lt;element name="PaginaWeb" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ContactoCorporativo" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="EmailCorporativo" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="TelCorporativo" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="FaxCorporativo" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="DomicilioDeCobro" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContactoDeCobranza" type="{http://www.fact.com.mx/schema/fx}TContacto" minOccurs="0"/&gt;
 *         &lt;element name="RegistroPublico" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EmailContacto1" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="EmailContacto2" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDatosAdicionales", propOrder = {
    "representanteLegal",
    "paginaWeb",
    "contactoCorporativo",
    "emailCorporativo",
    "telCorporativo",
    "faxCorporativo",
    "domicilioDeCobro",
    "contactoDeCobranza",
    "registroPublico",
    "emailContacto1",
    "emailContacto2"
})
public class TDatosAdicionales {

    @XmlElement(name = "RepresentanteLegal")
    protected TRepresentanteLegal representanteLegal;
    @XmlElement(name = "PaginaWeb")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paginaWeb;
    @XmlElement(name = "ContactoCorporativo")
    protected String contactoCorporativo;
    @XmlElement(name = "EmailCorporativo")
    protected String emailCorporativo;
    @XmlElement(name = "TelCorporativo")
    protected String telCorporativo;
    @XmlElement(name = "FaxCorporativo")
    protected String faxCorporativo;
    @XmlElement(name = "DomicilioDeCobro")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String domicilioDeCobro;
    @XmlElement(name = "ContactoDeCobranza")
    protected TContacto contactoDeCobranza;
    @XmlElement(name = "RegistroPublico")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String registroPublico;
    @XmlElement(name = "EmailContacto1")
    protected String emailContacto1;
    @XmlElement(name = "EmailContacto2")
    protected String emailContacto2;

    /**
     * Obtiene el valor de la propiedad representanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link TRepresentanteLegal }
     *     
     */
    public TRepresentanteLegal getRepresentanteLegal() {
        return representanteLegal;
    }

    /**
     * Define el valor de la propiedad representanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link TRepresentanteLegal }
     *     
     */
    public void setRepresentanteLegal(TRepresentanteLegal value) {
        this.representanteLegal = value;
    }

    /**
     * Obtiene el valor de la propiedad paginaWeb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaginaWeb() {
        return paginaWeb;
    }

    /**
     * Define el valor de la propiedad paginaWeb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaginaWeb(String value) {
        this.paginaWeb = value;
    }

    /**
     * Obtiene el valor de la propiedad contactoCorporativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactoCorporativo() {
        return contactoCorporativo;
    }

    /**
     * Define el valor de la propiedad contactoCorporativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactoCorporativo(String value) {
        this.contactoCorporativo = value;
    }

    /**
     * Obtiene el valor de la propiedad emailCorporativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailCorporativo() {
        return emailCorporativo;
    }

    /**
     * Define el valor de la propiedad emailCorporativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailCorporativo(String value) {
        this.emailCorporativo = value;
    }

    /**
     * Obtiene el valor de la propiedad telCorporativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelCorporativo() {
        return telCorporativo;
    }

    /**
     * Define el valor de la propiedad telCorporativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelCorporativo(String value) {
        this.telCorporativo = value;
    }

    /**
     * Obtiene el valor de la propiedad faxCorporativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxCorporativo() {
        return faxCorporativo;
    }

    /**
     * Define el valor de la propiedad faxCorporativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxCorporativo(String value) {
        this.faxCorporativo = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioDeCobro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilioDeCobro() {
        return domicilioDeCobro;
    }

    /**
     * Define el valor de la propiedad domicilioDeCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilioDeCobro(String value) {
        this.domicilioDeCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad contactoDeCobranza.
     * 
     * @return
     *     possible object is
     *     {@link TContacto }
     *     
     */
    public TContacto getContactoDeCobranza() {
        return contactoDeCobranza;
    }

    /**
     * Define el valor de la propiedad contactoDeCobranza.
     * 
     * @param value
     *     allowed object is
     *     {@link TContacto }
     *     
     */
    public void setContactoDeCobranza(TContacto value) {
        this.contactoDeCobranza = value;
    }

    /**
     * Obtiene el valor de la propiedad registroPublico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroPublico() {
        return registroPublico;
    }

    /**
     * Define el valor de la propiedad registroPublico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroPublico(String value) {
        this.registroPublico = value;
    }

    /**
     * Obtiene el valor de la propiedad emailContacto1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailContacto1() {
        return emailContacto1;
    }

    /**
     * Define el valor de la propiedad emailContacto1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailContacto1(String value) {
        this.emailContacto1 = value;
    }

    /**
     * Obtiene el valor de la propiedad emailContacto2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailContacto2() {
        return emailContacto2;
    }

    /**
     * Define el valor de la propiedad emailContacto2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailContacto2(String value) {
        this.emailContacto2 = value;
    }

}
