
package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TMTEInmuebles complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMTEInmuebles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Inmueble" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="nomDueno" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="RfcDueno" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMTEInmuebles", propOrder = {
    "inmueble",
    "nomDueno",
    "rfcDueno"
})
public class TMTEInmuebles {

    @XmlElement(name = "Inmueble")
    protected String inmueble;
    protected String nomDueno;
    @XmlElement(name = "RfcDueno")
    protected String rfcDueno;

    /**
     * Obtiene el valor de la propiedad inmueble.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInmueble() {
        return inmueble;
    }

    /**
     * Define el valor de la propiedad inmueble.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInmueble(String value) {
        this.inmueble = value;
    }

    /**
     * Obtiene el valor de la propiedad nomDueno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomDueno() {
        return nomDueno;
    }

    /**
     * Define el valor de la propiedad nomDueno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomDueno(String value) {
        this.nomDueno = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcDueno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcDueno() {
        return rfcDueno;
    }

    /**
     * Define el valor de la propiedad rfcDueno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcDueno(String value) {
        this.rfcDueno = value;
    }

}
