

package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TMTETextosVar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMTETextosVar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="txtvar1" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="txtvar2" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="txtvar3" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="txtvar4" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="txtvar5" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="txtvar6" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="txtvar7" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="imp_deducible" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="Receptor_I_O" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="mca_estadoUnidad" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="leyenda_terremoto" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMTETextosVar", propOrder = {
    "txtvar1",
    "txtvar2",
    "txtvar3",
    "txtvar4",
    "txtvar5",
    "txtvar6",
    "txtvar7",
    "impDeducible",
    "receptorIO",
    "mcaEstadoUnidad",
    "leyendaTerremoto"
})
public class TMTETextosVar {

    protected String txtvar1;
    protected String txtvar2;
    protected String txtvar3;
    protected String txtvar4;
    protected String txtvar5;
    protected String txtvar6;
    protected String txtvar7;
    @XmlElement(name = "imp_deducible")
    protected String impDeducible;
    @XmlElement(name = "Receptor_I_O")
    protected String receptorIO;
    @XmlElement(name = "mca_estadoUnidad")
    protected String mcaEstadoUnidad;
    @XmlElement(name = "leyenda_terremoto")
    protected String leyendaTerremoto;

    /**
     * Obtiene el valor de la propiedad txtvar1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtvar1() {
        return txtvar1;
    }

    /**
     * Define el valor de la propiedad txtvar1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtvar1(String value) {
        this.txtvar1 = value;
    }

    /**
     * Obtiene el valor de la propiedad txtvar2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtvar2() {
        return txtvar2;
    }

    /**
     * Define el valor de la propiedad txtvar2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtvar2(String value) {
        this.txtvar2 = value;
    }

    /**
     * Obtiene el valor de la propiedad txtvar3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtvar3() {
        return txtvar3;
    }

    /**
     * Define el valor de la propiedad txtvar3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtvar3(String value) {
        this.txtvar3 = value;
    }

    /**
     * Obtiene el valor de la propiedad txtvar4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtvar4() {
        return txtvar4;
    }

    /**
     * Define el valor de la propiedad txtvar4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtvar4(String value) {
        this.txtvar4 = value;
    }

    /**
     * Obtiene el valor de la propiedad txtvar5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtvar5() {
        return txtvar5;
    }

    /**
     * Define el valor de la propiedad txtvar5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtvar5(String value) {
        this.txtvar5 = value;
    }

    /**
     * Obtiene el valor de la propiedad txtvar6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtvar6() {
        return txtvar6;
    }

    /**
     * Define el valor de la propiedad txtvar6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtvar6(String value) {
        this.txtvar6 = value;
    }

    /**
     * Obtiene el valor de la propiedad txtvar7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtvar7() {
        return txtvar7;
    }

    /**
     * Define el valor de la propiedad txtvar7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtvar7(String value) {
        this.txtvar7 = value;
    }

    /**
     * Obtiene el valor de la propiedad impDeducible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpDeducible() {
        return impDeducible;
    }

    /**
     * Define el valor de la propiedad impDeducible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpDeducible(String value) {
        this.impDeducible = value;
    }

    /**
     * Obtiene el valor de la propiedad receptorIO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceptorIO() {
        return receptorIO;
    }

    /**
     * Define el valor de la propiedad receptorIO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceptorIO(String value) {
        this.receptorIO = value;
    }

    /**
     * Obtiene el valor de la propiedad mcaEstadoUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcaEstadoUnidad() {
        return mcaEstadoUnidad;
    }

    /**
     * Define el valor de la propiedad mcaEstadoUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcaEstadoUnidad(String value) {
        this.mcaEstadoUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad leyendaTerremoto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeyendaTerremoto() {
        return leyendaTerremoto;
    }

    /**
     * Define el valor de la propiedad leyendaTerremoto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeyendaTerremoto(String value) {
        this.leyendaTerremoto = value;
    }

}
