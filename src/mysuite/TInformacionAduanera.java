package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Tipo definido para expresar informacion aduanera
 * 
 * <p>Clase Java para TInformacionAduanera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TInformacionAduanera"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumeroDePedimento"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FechaDePedimento" type="{http://www.fact.com.mx/schema/fx}TAllowedDate"/&gt;
 *         &lt;element name="NombreDeAduana"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="60"/&gt;
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
@XmlType(name = "TInformacionAduanera", propOrder = {
    "numeroDePedimento",
    "fechaDePedimento",
    "nombreDeAduana"
})
public class TInformacionAduanera {

    @XmlElement(name = "NumeroDePedimento", required = true)
    protected String numeroDePedimento;
    @XmlElement(name = "FechaDePedimento", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaDePedimento;
    @XmlElement(name = "NombreDeAduana", required = true)
    protected String nombreDeAduana;

    /**
     * Obtiene el valor de la propiedad numeroDePedimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDePedimento() {
        return numeroDePedimento;
    }

    /**
     * Define el valor de la propiedad numeroDePedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDePedimento(String value) {
        this.numeroDePedimento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDePedimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDePedimento() {
        return fechaDePedimento;
    }

    /**
     * Define el valor de la propiedad fechaDePedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDePedimento(XMLGregorianCalendar value) {
        this.fechaDePedimento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDeAduana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDeAduana() {
        return nombreDeAduana;
    }

    /**
     * Define el valor de la propiedad nombreDeAduana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDeAduana(String value) {
        this.nombreDeAduana = value;
    }

}
