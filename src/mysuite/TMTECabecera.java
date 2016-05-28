package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Addenda MAPFRE.
 * 
 * <p>Clase Java para TMTECabecera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMTECabecera"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdAreaAnterior" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="A001"/&gt;
 *               &lt;enumeration value="A003"/&gt;
 *               &lt;enumeration value="A010"/&gt;
 *               &lt;enumeration value="A015"/&gt;
 *               &lt;enumeration value="A016"/&gt;
 *               &lt;enumeration value="A017"/&gt;
 *               &lt;enumeration value="A018"/&gt;
 *               &lt;enumeration value="A019"/&gt;
 *               &lt;enumeration value="A020"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IdArea" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="001"/&gt;
 *               &lt;enumeration value="005"/&gt;
 *               &lt;enumeration value="006"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IdRevision" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="001"/&gt;
 *               &lt;enumeration value="003"/&gt;
 *               &lt;enumeration value="004"/&gt;
 *               &lt;enumeration value="005"/&gt;
 *               &lt;enumeration value="006"/&gt;
 *               &lt;enumeration value="008"/&gt;
 *               &lt;enumeration value="100"/&gt;
 *               &lt;enumeration value="010"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContactoEmisor" type="{http://www.fact.com.mx/schema/fx}TMTEContactoEmisor" minOccurs="0"/&gt;
 *         &lt;element name="ContactoReceptor" type="{http://www.fact.com.mx/schema/fx}TMTEContactoReceptor" minOccurs="0"/&gt;
 *         &lt;element name="Poliza" type="{http://www.fact.com.mx/schema/fx}TMTEPoliza" minOccurs="0"/&gt;
 *         &lt;element name="Servicio" type="{http://www.fact.com.mx/schema/fx}TMTEServicio" minOccurs="0"/&gt;
 *         &lt;element name="Vehiculo" type="{http://www.fact.com.mx/schema/fx}TMTEVehiculo" minOccurs="0"/&gt;
 *         &lt;element name="Local" type="{http://www.fact.com.mx/schema/fx}TMTELocal" minOccurs="0"/&gt;
 *         &lt;element name="ImportesAdicionales" type="{http://www.fact.com.mx/schema/fx}TMTEImportesAdicionales" minOccurs="0"/&gt;
 *         &lt;element name="Agente" type="{http://www.fact.com.mx/schema/fx}TMTEAgente" minOccurs="0"/&gt;
 *         &lt;element name="ReciboDePrimas" type="{http://www.fact.com.mx/schema/fx}TMTEReciboPrimas" minOccurs="0"/&gt;
 *         &lt;element name="Fianza" type="{http://www.fact.com.mx/schema/fx}TMTEFianza" minOccurs="0"/&gt;
 *         &lt;element name="Reaseguradora" type="{http://www.fact.com.mx/schema/fx}TMTEReaseguradora" minOccurs="0"/&gt;
 *         &lt;element name="Oficina" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;maxLength value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RegistroComision" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;maxLength value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Inversiones" type="{http://www.fact.com.mx/schema/fx}TMTEInversiones" minOccurs="0"/&gt;
 *         &lt;element name="Inmuebles" type="{http://www.fact.com.mx/schema/fx}TMTEInmuebles" minOccurs="0"/&gt;
 *         &lt;element name="TotalesPoliza" type="{http://www.fact.com.mx/schema/fx}TMTETotpoliza" minOccurs="0"/&gt;
 *         &lt;element name="TextosVariables" type="{http://www.fact.com.mx/schema/fx}TMTETextosVar" minOccurs="0"/&gt;
 *         &lt;element name="TotalesSunsys" type="{http://www.fact.com.mx/schema/fx}TMTETotSunsys" minOccurs="0"/&gt;
 *         &lt;element name="Finamadrid" type="{http://www.fact.com.mx/schema/fx}TMTEFinamadrid" minOccurs="0"/&gt;
 *         &lt;element name="Credito" type="{http://www.fact.com.mx/schema/fx}TMTECredito" minOccurs="0"/&gt;
 *         &lt;element name="Agropecuario" type="{http://www.fact.com.mx/schema/fx}TMTEAgro" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMTECabecera", propOrder = {
    "idAreaAnterior",
    "idArea",
    "idRevision",
    "contactoEmisor",
    "contactoReceptor",
    "poliza",
    "servicio",
    "vehiculo",
    "local",
    "importesAdicionales",
    "agente",
    "reciboDePrimas",
    "fianza",
    "reaseguradora",
    "oficina",
    "registroComision",
    "inversiones",
    "inmuebles",
    "totalesPoliza",
    "textosVariables",
    "totalesSunsys",
    "finamadrid",
    "credito",
    "agropecuario"
})
public class TMTECabecera {

    @XmlElement(name = "IdAreaAnterior")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String idAreaAnterior;
    @XmlElement(name = "IdArea")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String idArea;
    @XmlElement(name = "IdRevision")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String idRevision;
    @XmlElement(name = "ContactoEmisor")
    protected TMTEContactoEmisor contactoEmisor;
    @XmlElement(name = "ContactoReceptor")
    protected TMTEContactoReceptor contactoReceptor;
    @XmlElement(name = "Poliza")
    protected TMTEPoliza poliza;
    @XmlElement(name = "Servicio")
    protected TMTEServicio servicio;
    @XmlElement(name = "Vehiculo")
    protected TMTEVehiculo vehiculo;
    @XmlElement(name = "Local")
    protected TMTELocal local;
    @XmlElement(name = "ImportesAdicionales")
    protected TMTEImportesAdicionales importesAdicionales;
    @XmlElement(name = "Agente")
    protected TMTEAgente agente;
    @XmlElement(name = "ReciboDePrimas")
    protected TMTEReciboPrimas reciboDePrimas;
    @XmlElement(name = "Fianza")
    protected TMTEFianza fianza;
    @XmlElement(name = "Reaseguradora")
    protected TMTEReaseguradora reaseguradora;
    @XmlElement(name = "Oficina")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oficina;
    @XmlElement(name = "RegistroComision")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String registroComision;
    @XmlElement(name = "Inversiones")
    protected TMTEInversiones inversiones;
    @XmlElement(name = "Inmuebles")
    protected TMTEInmuebles inmuebles;
    @XmlElement(name = "TotalesPoliza")
    protected TMTETotpoliza totalesPoliza;
    @XmlElement(name = "TextosVariables")
    protected TMTETextosVar textosVariables;
    @XmlElement(name = "TotalesSunsys")
    protected TMTETotSunsys totalesSunsys;
    @XmlElement(name = "Finamadrid")
    protected TMTEFinamadrid finamadrid;
    @XmlElement(name = "Credito")
    protected TMTECredito credito;
    @XmlElement(name = "Agropecuario")
    protected TMTEAgro agropecuario;

    /**
     * Obtiene el valor de la propiedad idAreaAnterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAreaAnterior() {
        return idAreaAnterior;
    }

    /**
     * Define el valor de la propiedad idAreaAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAreaAnterior(String value) {
        this.idAreaAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad idArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdArea() {
        return idArea;
    }

    /**
     * Define el valor de la propiedad idArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdArea(String value) {
        this.idArea = value;
    }

    /**
     * Obtiene el valor de la propiedad idRevision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRevision() {
        return idRevision;
    }

    /**
     * Define el valor de la propiedad idRevision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRevision(String value) {
        this.idRevision = value;
    }

    /**
     * Obtiene el valor de la propiedad contactoEmisor.
     * 
     * @return
     *     possible object is
     *     {@link TMTEContactoEmisor }
     *     
     */
    public TMTEContactoEmisor getContactoEmisor() {
        return contactoEmisor;
    }

    /**
     * Define el valor de la propiedad contactoEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTEContactoEmisor }
     *     
     */
    public void setContactoEmisor(TMTEContactoEmisor value) {
        this.contactoEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad contactoReceptor.
     * 
     * @return
     *     possible object is
     *     {@link TMTEContactoReceptor }
     *     
     */
    public TMTEContactoReceptor getContactoReceptor() {
        return contactoReceptor;
    }

    /**
     * Define el valor de la propiedad contactoReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTEContactoReceptor }
     *     
     */
    public void setContactoReceptor(TMTEContactoReceptor value) {
        this.contactoReceptor = value;
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

    /**
     * Obtiene el valor de la propiedad importesAdicionales.
     * 
     * @return
     *     possible object is
     *     {@link TMTEImportesAdicionales }
     *     
     */
    public TMTEImportesAdicionales getImportesAdicionales() {
        return importesAdicionales;
    }

    /**
     * Define el valor de la propiedad importesAdicionales.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTEImportesAdicionales }
     *     
     */
    public void setImportesAdicionales(TMTEImportesAdicionales value) {
        this.importesAdicionales = value;
    }

    /**
     * Obtiene el valor de la propiedad agente.
     * 
     * @return
     *     possible object is
     *     {@link TMTEAgente }
     *     
     */
    public TMTEAgente getAgente() {
        return agente;
    }

    /**
     * Define el valor de la propiedad agente.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTEAgente }
     *     
     */
    public void setAgente(TMTEAgente value) {
        this.agente = value;
    }

    /**
     * Obtiene el valor de la propiedad reciboDePrimas.
     * 
     * @return
     *     possible object is
     *     {@link TMTEReciboPrimas }
     *     
     */
    public TMTEReciboPrimas getReciboDePrimas() {
        return reciboDePrimas;
    }

    /**
     * Define el valor de la propiedad reciboDePrimas.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTEReciboPrimas }
     *     
     */
    public void setReciboDePrimas(TMTEReciboPrimas value) {
        this.reciboDePrimas = value;
    }

    /**
     * Obtiene el valor de la propiedad fianza.
     * 
     * @return
     *     possible object is
     *     {@link TMTEFianza }
     *     
     */
    public TMTEFianza getFianza() {
        return fianza;
    }

    /**
     * Define el valor de la propiedad fianza.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTEFianza }
     *     
     */
    public void setFianza(TMTEFianza value) {
        this.fianza = value;
    }

    /**
     * Obtiene el valor de la propiedad reaseguradora.
     * 
     * @return
     *     possible object is
     *     {@link TMTEReaseguradora }
     *     
     */
    public TMTEReaseguradora getReaseguradora() {
        return reaseguradora;
    }

    /**
     * Define el valor de la propiedad reaseguradora.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTEReaseguradora }
     *     
     */
    public void setReaseguradora(TMTEReaseguradora value) {
        this.reaseguradora = value;
    }

    /**
     * Obtiene el valor de la propiedad oficina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOficina() {
        return oficina;
    }

    /**
     * Define el valor de la propiedad oficina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOficina(String value) {
        this.oficina = value;
    }

    /**
     * Obtiene el valor de la propiedad registroComision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroComision() {
        return registroComision;
    }

    /**
     * Define el valor de la propiedad registroComision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroComision(String value) {
        this.registroComision = value;
    }

    /**
     * Obtiene el valor de la propiedad inversiones.
     * 
     * @return
     *     possible object is
     *     {@link TMTEInversiones }
     *     
     */
    public TMTEInversiones getInversiones() {
        return inversiones;
    }

    /**
     * Define el valor de la propiedad inversiones.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTEInversiones }
     *     
     */
    public void setInversiones(TMTEInversiones value) {
        this.inversiones = value;
    }

    /**
     * Obtiene el valor de la propiedad inmuebles.
     * 
     * @return
     *     possible object is
     *     {@link TMTEInmuebles }
     *     
     */
    public TMTEInmuebles getInmuebles() {
        return inmuebles;
    }

    /**
     * Define el valor de la propiedad inmuebles.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTEInmuebles }
     *     
     */
    public void setInmuebles(TMTEInmuebles value) {
        this.inmuebles = value;
    }

    /**
     * Obtiene el valor de la propiedad totalesPoliza.
     * 
     * @return
     *     possible object is
     *     {@link TMTETotpoliza }
     *     
     */
    public TMTETotpoliza getTotalesPoliza() {
        return totalesPoliza;
    }

    /**
     * Define el valor de la propiedad totalesPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTETotpoliza }
     *     
     */
    public void setTotalesPoliza(TMTETotpoliza value) {
        this.totalesPoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad textosVariables.
     * 
     * @return
     *     possible object is
     *     {@link TMTETextosVar }
     *     
     */
    public TMTETextosVar getTextosVariables() {
        return textosVariables;
    }

    /**
     * Define el valor de la propiedad textosVariables.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTETextosVar }
     *     
     */
    public void setTextosVariables(TMTETextosVar value) {
        this.textosVariables = value;
    }

    /**
     * Obtiene el valor de la propiedad totalesSunsys.
     * 
     * @return
     *     possible object is
     *     {@link TMTETotSunsys }
     *     
     */
    public TMTETotSunsys getTotalesSunsys() {
        return totalesSunsys;
    }

    /**
     * Define el valor de la propiedad totalesSunsys.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTETotSunsys }
     *     
     */
    public void setTotalesSunsys(TMTETotSunsys value) {
        this.totalesSunsys = value;
    }

    /**
     * Obtiene el valor de la propiedad finamadrid.
     * 
     * @return
     *     possible object is
     *     {@link TMTEFinamadrid }
     *     
     */
    public TMTEFinamadrid getFinamadrid() {
        return finamadrid;
    }

    /**
     * Define el valor de la propiedad finamadrid.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTEFinamadrid }
     *     
     */
    public void setFinamadrid(TMTEFinamadrid value) {
        this.finamadrid = value;
    }

    /**
     * Obtiene el valor de la propiedad credito.
     * 
     * @return
     *     possible object is
     *     {@link TMTECredito }
     *     
     */
    public TMTECredito getCredito() {
        return credito;
    }

    /**
     * Define el valor de la propiedad credito.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTECredito }
     *     
     */
    public void setCredito(TMTECredito value) {
        this.credito = value;
    }

    /**
     * Obtiene el valor de la propiedad agropecuario.
     * 
     * @return
     *     possible object is
     *     {@link TMTEAgro }
     *     
     */
    public TMTEAgro getAgropecuario() {
        return agropecuario;
    }

    /**
     * Define el valor de la propiedad agropecuario.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTEAgro }
     *     
     */
    public void setAgropecuario(TMTEAgro value) {
        this.agropecuario = value;
    }

}
