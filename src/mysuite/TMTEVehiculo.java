
package mysuite;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Addenda MAPFRE.
 * 
 * <p>Clase Java para TMTEVehiculo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMTEVehiculo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Uso"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Marca"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubMarca"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AnoDeProduccion" type="{http://www.fact.com.mx/schema/fx}TYear"/&gt;
 *         &lt;element name="Color"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Chasis" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Serie"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Motor" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Placas"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="10"/&gt;
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
@XmlType(name = "TMTEVehiculo", propOrder = {
    "uso",
    "marca",
    "subMarca",
    "anoDeProduccion",
    "color",
    "chasis",
    "serie",
    "motor",
    "placas"
})
public class TMTEVehiculo {

    @XmlElement(name = "Uso", required = true)
    protected String uso;
    @XmlElement(name = "Marca", required = true)
    protected String marca;
    @XmlElement(name = "SubMarca", required = true)
    protected String subMarca;
    @XmlElement(name = "AnoDeProduccion", required = true)
    protected BigInteger anoDeProduccion;
    @XmlElement(name = "Color", required = true)
    protected String color;
    @XmlElement(name = "Chasis")
    protected String chasis;
    @XmlElement(name = "Serie", required = true)
    protected String serie;
    @XmlElement(name = "Motor")
    protected String motor;
    @XmlElement(name = "Placas", required = true)
    protected String placas;

    /**
     * Obtiene el valor de la propiedad uso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUso() {
        return uso;
    }

    /**
     * Define el valor de la propiedad uso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUso(String value) {
        this.uso = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad subMarca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubMarca() {
        return subMarca;
    }

    /**
     * Define el valor de la propiedad subMarca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubMarca(String value) {
        this.subMarca = value;
    }

    /**
     * Obtiene el valor de la propiedad anoDeProduccion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnoDeProduccion() {
        return anoDeProduccion;
    }

    /**
     * Define el valor de la propiedad anoDeProduccion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnoDeProduccion(BigInteger value) {
        this.anoDeProduccion = value;
    }

    /**
     * Obtiene el valor de la propiedad color.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Define el valor de la propiedad color.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Obtiene el valor de la propiedad chasis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChasis() {
        return chasis;
    }

    /**
     * Define el valor de la propiedad chasis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChasis(String value) {
        this.chasis = value;
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
     * Obtiene el valor de la propiedad motor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotor() {
        return motor;
    }

    /**
     * Define el valor de la propiedad motor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotor(String value) {
        this.motor = value;
    }

    /**
     * Obtiene el valor de la propiedad placas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacas() {
        return placas;
    }

    /**
     * Define el valor de la propiedad placas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacas(String value) {
        this.placas = value;
    }

}
