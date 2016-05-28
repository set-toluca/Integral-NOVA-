


package mysuite;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para TVehiculo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TVehiculo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Marca"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Linea" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"/&gt;
 *         &lt;element name="Tipo" type="{http://www.fact.com.mx/schema/fx}TCadenaPermitida" minOccurs="0"/&gt;
 *         &lt;element name="Modelo" type="{http://www.fact.com.mx/schema/fx}TYear"/&gt;
 *         &lt;element name="Color"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="25"/&gt;
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
 *         &lt;element name="SerieEnLetras" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="300"/&gt;
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
 *         &lt;element name="MotorEnLetras" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="300"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Cilindros" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CapacidadDeCarga" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Unidad"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Capacidad" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Combustible" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="GASOLINA"/&gt;
 *               &lt;enumeration value="DIESEL"/&gt;
 *               &lt;enumeration value="GAS LP"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Transmision" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="MANUAL"/&gt;
 *               &lt;enumeration value="AUTOMATICA"/&gt;
 *               &lt;enumeration value="MANUAL Y AUTOMATICA"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Puertas" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="36"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Personas" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Uso" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="PARTICULAR"/&gt;
 *               &lt;enumeration value="COMERCIAL"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ClaveVehicular" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *         &lt;element name="Placas" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *         &lt;element name="Kilometraje" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDeInventario" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *         &lt;element name="Pedido" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *         &lt;element name="CodigoDeLlave" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *         &lt;element name="TipoCodigoDeLlave" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TVehiculo", propOrder = {
    "marca",
    "linea",
    "tipo",
    "modelo",
    "color",
    "serie",
    "serieEnLetras",
    "motor",
    "motorEnLetras",
    "cilindros",
    "capacidadDeCarga",
    "combustible",
    "transmision",
    "puertas",
    "personas",
    "uso",
    "claveVehicular",
    "placas",
    "kilometraje",
    "numeroDeInventario",
    "pedido",
    "codigoDeLlave",
    "tipoCodigoDeLlave"
})
public class TVehiculo {

    @XmlElement(name = "Marca", required = true)
    protected String marca;
    @XmlElement(name = "Linea", required = true)
    protected String linea;
    @XmlElement(name = "Tipo")
    protected String tipo;
    @XmlElement(name = "Modelo", required = true)
    protected BigInteger modelo;
    @XmlElement(name = "Color", required = true)
    protected String color;
    @XmlElement(name = "Serie", required = true)
    protected String serie;
    @XmlElement(name = "SerieEnLetras")
    protected String serieEnLetras;
    @XmlElement(name = "Motor")
    protected String motor;
    @XmlElement(name = "MotorEnLetras")
    protected String motorEnLetras;
    @XmlElement(name = "Cilindros")
    protected Integer cilindros;
    @XmlElement(name = "CapacidadDeCarga")
    protected TVehiculo.CapacidadDeCarga capacidadDeCarga;
    @XmlElement(name = "Combustible")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String combustible;
    @XmlElement(name = "Transmision")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transmision;
    @XmlElement(name = "Puertas")
    protected Integer puertas;
    @XmlElement(name = "Personas")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger personas;
    @XmlElement(name = "Uso")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String uso;
    @XmlElement(name = "ClaveVehicular")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String claveVehicular;
    @XmlElement(name = "Placas")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String placas;
    @XmlElement(name = "Kilometraje")
    protected TNonNegativeAmount kilometraje;
    @XmlElement(name = "NumeroDeInventario")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String numeroDeInventario;
    @XmlElement(name = "Pedido")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pedido;
    @XmlElement(name = "CodigoDeLlave")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoDeLlave;
    @XmlElement(name = "TipoCodigoDeLlave")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tipoCodigoDeLlave;

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
     * Obtiene el valor de la propiedad linea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Define el valor de la propiedad linea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinea(String value) {
        this.linea = value;
    }

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
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModelo(BigInteger value) {
        this.modelo = value;
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
     * Obtiene el valor de la propiedad serieEnLetras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieEnLetras() {
        return serieEnLetras;
    }

    /**
     * Define el valor de la propiedad serieEnLetras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieEnLetras(String value) {
        this.serieEnLetras = value;
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
     * Obtiene el valor de la propiedad motorEnLetras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotorEnLetras() {
        return motorEnLetras;
    }

    /**
     * Define el valor de la propiedad motorEnLetras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotorEnLetras(String value) {
        this.motorEnLetras = value;
    }

    /**
     * Obtiene el valor de la propiedad cilindros.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCilindros() {
        return cilindros;
    }

    /**
     * Define el valor de la propiedad cilindros.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCilindros(Integer value) {
        this.cilindros = value;
    }

    /**
     * Obtiene el valor de la propiedad capacidadDeCarga.
     * 
     * @return
     *     possible object is
     *     {@link TVehiculo.CapacidadDeCarga }
     *     
     */
    public TVehiculo.CapacidadDeCarga getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    /**
     * Define el valor de la propiedad capacidadDeCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link TVehiculo.CapacidadDeCarga }
     *     
     */
    public void setCapacidadDeCarga(TVehiculo.CapacidadDeCarga value) {
        this.capacidadDeCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad combustible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * Define el valor de la propiedad combustible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCombustible(String value) {
        this.combustible = value;
    }

    /**
     * Obtiene el valor de la propiedad transmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmision() {
        return transmision;
    }

    /**
     * Define el valor de la propiedad transmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmision(String value) {
        this.transmision = value;
    }

    /**
     * Obtiene el valor de la propiedad puertas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPuertas() {
        return puertas;
    }

    /**
     * Define el valor de la propiedad puertas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPuertas(Integer value) {
        this.puertas = value;
    }

    /**
     * Obtiene el valor de la propiedad personas.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonas() {
        return personas;
    }

    /**
     * Define el valor de la propiedad personas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonas(BigInteger value) {
        this.personas = value;
    }

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
     * Obtiene el valor de la propiedad claveVehicular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveVehicular() {
        return claveVehicular;
    }

    /**
     * Define el valor de la propiedad claveVehicular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveVehicular(String value) {
        this.claveVehicular = value;
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

    /**
     * Obtiene el valor de la propiedad kilometraje.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getKilometraje() {
        return kilometraje;
    }

    /**
     * Define el valor de la propiedad kilometraje.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setKilometraje(TNonNegativeAmount value) {
        this.kilometraje = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDeInventario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDeInventario() {
        return numeroDeInventario;
    }

    /**
     * Define el valor de la propiedad numeroDeInventario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDeInventario(String value) {
        this.numeroDeInventario = value;
    }

    /**
     * Obtiene el valor de la propiedad pedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPedido() {
        return pedido;
    }

    /**
     * Define el valor de la propiedad pedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPedido(String value) {
        this.pedido = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDeLlave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDeLlave() {
        return codigoDeLlave;
    }

    /**
     * Define el valor de la propiedad codigoDeLlave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDeLlave(String value) {
        this.codigoDeLlave = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCodigoDeLlave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCodigoDeLlave() {
        return tipoCodigoDeLlave;
    }

    /**
     * Define el valor de la propiedad tipoCodigoDeLlave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCodigoDeLlave(String value) {
        this.tipoCodigoDeLlave = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Unidad"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Capacidad" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "unidad",
        "capacidad"
    })
    public static class CapacidadDeCarga {

        @XmlElement(name = "Unidad", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String unidad;
        @XmlElement(name = "Capacidad", required = true)
        protected TNonNegativeAmount capacidad;

        /**
         * Obtiene el valor de la propiedad unidad.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnidad() {
            return unidad;
        }

        /**
         * Define el valor de la propiedad unidad.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnidad(String value) {
            this.unidad = value;
        }

        /**
         * Obtiene el valor de la propiedad capacidad.
         * 
         * @return
         *     possible object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public TNonNegativeAmount getCapacidad() {
            return capacidad;
        }

        /**
         * Define el valor de la propiedad capacidad.
         * 
         * @param value
         *     allowed object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public void setCapacidad(TNonNegativeAmount value) {
            this.capacidad = value;
        }

    }

}
