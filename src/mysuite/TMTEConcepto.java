
package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Addenda MAPFRE.
 * 
 * <p>Clase Java para TMTEConcepto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMTEConcepto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoListaDePrecios"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IndiceListaDePrecios"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Poliza" type="{http://www.fact.com.mx/schema/fx}TMTEPoliza" minOccurs="0"/&gt;
 *         &lt;element name="Servicio" type="{http://www.fact.com.mx/schema/fx}TMTEServicio" minOccurs="0"/&gt;
 *         &lt;element name="Vehiculo" type="{http://www.fact.com.mx/schema/fx}TMTEVehiculo" minOccurs="0"/&gt;
 *         &lt;element name="Local" type="{http://www.fact.com.mx/schema/fx}TMTELocal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMTEConcepto", propOrder = {
    "tipoListaDePrecios",
    "indiceListaDePrecios",
    "poliza",
    "servicio",
    "vehiculo",
    "local"
})
public class TMTEConcepto {

    @XmlElement(name = "TipoListaDePrecios", required = true)
    protected String tipoListaDePrecios;
    @XmlElement(name = "IndiceListaDePrecios", required = true)
    protected String indiceListaDePrecios;
    @XmlElement(name = "Poliza")
    protected TMTEPoliza poliza;
    @XmlElement(name = "Servicio")
    protected TMTEServicio servicio;
    @XmlElement(name = "Vehiculo")
    protected TMTEVehiculo vehiculo;
    @XmlElement(name = "Local")
    protected TMTELocal local;

    /**
     * Obtiene el valor de la propiedad tipoListaDePrecios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoListaDePrecios() {
        return tipoListaDePrecios;
    }

    /**
     * Define el valor de la propiedad tipoListaDePrecios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoListaDePrecios(String value) {
        this.tipoListaDePrecios = value;
    }

    /**
     * Obtiene el valor de la propiedad indiceListaDePrecios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndiceListaDePrecios() {
        return indiceListaDePrecios;
    }

    /**
     * Define el valor de la propiedad indiceListaDePrecios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndiceListaDePrecios(String value) {
        this.indiceListaDePrecios = value;
    }

    /**
     * Obtiene el valor de la propiedad poliza.
     * 
     * @return
     *     possible object is
     *     {@link TMTEPoliza }
     *     
     */
    public TMTEPoliza getPoliza() {
        return poliza;
    }

    /**
     * Define el valor de la propiedad poliza.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTEPoliza }
     *     
     */
    public void setPoliza(TMTEPoliza value) {
        this.poliza = value;
    }

    /**
     * Obtiene el valor de la propiedad servicio.
     * 
     * @return
     *     possible object is
     *     {@link TMTEServicio }
     *     
     */
    public TMTEServicio getServicio() {
        return servicio;
    }

    /**
     * Define el valor de la propiedad servicio.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTEServicio }
     *     
     */
    public void setServicio(TMTEServicio value) {
        this.servicio = value;
    }

    /**
     * Obtiene el valor de la propiedad vehiculo.
     * 
     * @return
     *     possible object is
     *     {@link TMTEVehiculo }
     *     
     */
    public TMTEVehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Define el valor de la propiedad vehiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTEVehiculo }
     *     
     */
    public void setVehiculo(TMTEVehiculo value) {
        this.vehiculo = value;
    }

    /**
     * Obtiene el valor de la propiedad local.
     * 
     * @return
     *     possible object is
     *     {@link TMTELocal }
     *     
     */
    public TMTELocal getLocal() {
        return local;
    }

    /**
     * Define el valor de la propiedad local.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTELocal }
     *     
     */
    public void setLocal(TMTELocal value) {
        this.local = value;
    }

}
