

package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Otro domicilio, nacional o extranjero.
 * 
 * <p>Clase Java para TDomicilioComercial complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TDomicilioComercial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nombre" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Codigo" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *         &lt;element name="Codigo2" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *         &lt;element name="GLNPrincipal" type="{http://www.fact.com.mx/schema/fx}TEAN13" minOccurs="0"/&gt;
 *         &lt;element name="GLN" type="{http://www.fact.com.mx/schema/fx}TEAN13" minOccurs="0"/&gt;
 *         &lt;element name="Domicilio" type="{http://www.fact.com.mx/schema/fx}TDomicilio" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDomicilioComercial", propOrder = {
    "nombre",
    "codigo",
    "codigo2",
    "glnPrincipal",
    "gln",
    "domicilio"
})
public class TDomicilioComercial {

    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "Codigo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigo;
    @XmlElement(name = "Codigo2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigo2;
    @XmlElement(name = "GLNPrincipal")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String glnPrincipal;
    @XmlElement(name = "GLN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String gln;
    @XmlElement(name = "Domicilio")
    protected TDomicilio domicilio;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
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
     * Obtiene el valor de la propiedad codigo2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo2() {
        return codigo2;
    }

    /**
     * Define el valor de la propiedad codigo2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo2(String value) {
        this.codigo2 = value;
    }

    /**
     * Obtiene el valor de la propiedad glnPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLNPrincipal() {
        return glnPrincipal;
    }

    /**
     * Define el valor de la propiedad glnPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLNPrincipal(String value) {
        this.glnPrincipal = value;
    }

    /**
     * Obtiene el valor de la propiedad gln.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLN() {
        return gln;
    }

    /**
     * Define el valor de la propiedad gln.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLN(String value) {
        this.gln = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link TDomicilio }
     *     
     */
    public TDomicilio getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link TDomicilio }
     *     
     */
    public void setDomicilio(TDomicilio value) {
        this.domicilio = value;
    }

}
