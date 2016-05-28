

package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Addenda MAPFRE.
 * 
 * <p>Clase Java para TMTEContactoReceptor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMTEContactoReceptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoDeContacto" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="COORDINADOR"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NombreDePersona"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EMail" type="{http://www.fact.com.mx/schema/fx}TEmail" minOccurs="0"/&gt;
 *         &lt;element name="Telefono" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="25"/&gt;
 *               &lt;pattern value="[0-9]{1,25}"/&gt;
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
@XmlType(name = "TMTEContactoReceptor", propOrder = {
    "tipoDeContacto",
    "nombreDePersona",
    "eMail",
    "telefono"
})
public class TMTEContactoReceptor {

    @XmlElement(name = "TipoDeContacto")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tipoDeContacto;
    @XmlElement(name = "NombreDePersona", required = true)
    protected String nombreDePersona;
    @XmlElement(name = "EMail")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eMail;
    @XmlElement(name = "Telefono")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String telefono;

    /**
     * Obtiene el valor de la propiedad tipoDeContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeContacto() {
        return tipoDeContacto;
    }

    /**
     * Define el valor de la propiedad tipoDeContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeContacto(String value) {
        this.tipoDeContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDePersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDePersona() {
        return nombreDePersona;
    }

    /**
     * Define el valor de la propiedad nombreDePersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDePersona(String value) {
        this.nombreDePersona = value;
    }

    /**
     * Obtiene el valor de la propiedad eMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Define el valor de la propiedad eMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

}
