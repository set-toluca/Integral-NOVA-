//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2015.07.06 a las 11:51:22 AM CDT 
//


package mysuite;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Datos adicionales a nivel Concepto (partida, item, detalle) que sirven para formar las addendas.
 * 
 * <p>Clase Java para TConceptoEx complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TConceptoEx"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrecioCombustibles" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="PrecioSugerido" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="PrecioLista" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="ImporteLista" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="DescuentosYRecargos" type="{http://www.fact.com.mx/schema/fx}TDescuentosYRecargos" minOccurs="0"/&gt;
 *         &lt;element name="Impuestos" type="{http://www.fact.com.mx/schema/fx}TImpuestos" minOccurs="0"/&gt;
 *         &lt;element name="ImporteTotal" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="LineaDeOrdenDeCompra" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="CodigoEAN" type="{http://www.fact.com.mx/schema/fx}TEAN13" minOccurs="0"/&gt;
 *         &lt;element name="CodigoSKU" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *         &lt;element name="SubCantidad" type="{http://www.fact.com.mx/schema/fx}TSubCantidad" minOccurs="0"/&gt;
 *         &lt;element name="Categoria" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="MATERIAL"/&gt;
 *               &lt;enumeration value="MANO DE OBRA"/&gt;
 *               &lt;enumeration value="SUB ARRENDADO"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Modelo" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDeLote" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CantidadDeLote" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDeSerie" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="FechaDeProduccion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaDeCaducidad" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaDeRecepcion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Talla" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *                   &lt;element name="Talla" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Composicion" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Componente" maxOccurs="64"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Material" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *                             &lt;element name="Porcentaje" type="{http://www.fact.com.mx/schema/fx}TNonNegativePercentage" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Composicion2" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Material" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *                   &lt;element name="GramajeRelleno" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Quilataje" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="Peso" type="{http://www.fact.com.mx/schema/fx}TWeight" minOccurs="0"/&gt;
 *         &lt;element name="Volumen" type="{http://www.fact.com.mx/schema/fx}TVolume" minOccurs="0"/&gt;
 *         &lt;element name="Embalaje" type="{http://www.fact.com.mx/schema/fx}TEmbalaje" minOccurs="0"/&gt;
 *         &lt;element name="OrdenDeCompra" type="{http://www.fact.com.mx/schema/fx}TReferenciaCorta" minOccurs="0"/&gt;
 *         &lt;element name="TextosDePosicion" type="{http://www.fact.com.mx/schema/fx}TTextoLibre" minOccurs="0"/&gt;
 *         &lt;element name="Mapfre" type="{http://www.fact.com.mx/schema/fx}TMTEConcepto" minOccurs="0"/&gt;
 *         &lt;element name="FechaDeConsumo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Origen" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="Chrysler" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="References" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OrdenCompra" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="0" minOccurs="0"/&gt;
 *                             &lt;element name="ReleaseRequisicion" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
 *                                   &lt;maxLength value="11"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BillOfLading" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
 *                                   &lt;maxLength value="15"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PackingList" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
 *                                   &lt;maxLength value="15"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="TipoFlete" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                   &lt;enumeration value="A"/&gt;
 *                                   &lt;enumeration value="E"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Ammendment" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OtrosCargos" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OtroCargo" maxOccurs="3"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Codigo"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
 *                                             &lt;enumeration value="P"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Monto" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Volkswagen" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Partes"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Parte" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Referencias"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="tipoCarga"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                     &lt;minLength value="1"/&gt;
 *                                                     &lt;maxLength value="3"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                               &lt;attribute name="numContenedorCajaEconomico"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                     &lt;minLength value="1"/&gt;
 *                                                     &lt;maxLength value="30"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "TConceptoEx", propOrder = {
    "precioCombustibles",
    "precioSugerido",
    "precioLista",
    "importeLista",
    "descuentosYRecargos",
    "impuestos",
    "importeTotal",
    "lineaDeOrdenDeCompra",
    "codigoEAN",
    "codigoSKU",
    "subCantidad",
    "categoria",
    "modelo",
    "numeroDeLote",
    "cantidadDeLote",
    "numeroDeSerie",
    "fechaDeProduccion",
    "fechaDeCaducidad",
    "fechaDeRecepcion",
    "talla",
    "composicion",
    "composicion2",
    "quilataje",
    "peso",
    "volumen",
    "embalaje",
    "ordenDeCompra",
    "textosDePosicion",
    "mapfre",
    "fechaDeConsumo",
    "origen",
    "chrysler",
    "volkswagen"
})
public class TConceptoEx {

    @XmlElement(name = "PrecioCombustibles")
    protected TNonNegativeAmount precioCombustibles=null;
    @XmlElement(name = "PrecioSugerido")
    protected TNonNegativeAmount precioSugerido=null;
    @XmlElement(name = "PrecioLista")
    protected TNonNegativeAmount precioLista=null;
    @XmlElement(name = "ImporteLista")
    protected TNonNegativeAmount importeLista=null;
    @XmlElement(name = "DescuentosYRecargos")
    protected TDescuentosYRecargos descuentosYRecargos=null;
    @XmlElement(name = "Impuestos")
    protected TImpuestos impuestos;
    @XmlElement(name = "ImporteTotal")
    protected TNonNegativeAmount importeTotal;
    @XmlElement(name = "LineaDeOrdenDeCompra")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lineaDeOrdenDeCompra;
    @XmlElement(name = "CodigoEAN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoEAN;
    @XmlElement(name = "CodigoSKU")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codigoSKU;
    @XmlElement(name = "SubCantidad")
    protected TSubCantidad subCantidad;
    @XmlElement(name = "Categoria")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String categoria;
    @XmlElement(name = "Modelo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String modelo;
    @XmlElement(name = "NumeroDeLote")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String numeroDeLote;
    @XmlElement(name = "CantidadDeLote")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger cantidadDeLote;
    @XmlElement(name = "NumeroDeSerie")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String numeroDeSerie;
    @XmlElement(name = "FechaDeProduccion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDeProduccion;
    @XmlElement(name = "FechaDeCaducidad")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDeCaducidad;
    @XmlElement(name = "FechaDeRecepcion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDeRecepcion;
    @XmlElement(name = "Talla")
    protected TConceptoEx.Talla talla;
    @XmlElement(name = "Composicion")
    protected TConceptoEx.Composicion composicion;
    @XmlElement(name = "Composicion2")
    protected TConceptoEx.Composicion2 composicion2;
    @XmlElement(name = "Quilataje")
    protected TNonNegativeAmount quilataje;
    @XmlElement(name = "Peso")
    protected TWeight peso;
    @XmlElement(name = "Volumen")
    protected TVolume volumen;
    @XmlElement(name = "Embalaje")
    protected TEmbalaje embalaje;
    @XmlElement(name = "OrdenDeCompra")
    protected TReferenciaCorta ordenDeCompra;
    @XmlElement(name = "TextosDePosicion")
    protected TTextoLibre textosDePosicion;
    @XmlElement(name = "Mapfre")
    protected TMTEConcepto mapfre;
    @XmlElement(name = "FechaDeConsumo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDeConsumo;
    @XmlElement(name = "Origen")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String origen;
    @XmlElement(name = "Chrysler")
    protected TConceptoEx.Chrysler chrysler;
    @XmlElement(name = "Volkswagen")
    protected TConceptoEx.Volkswagen volkswagen;

    /**
     * Obtiene el valor de la propiedad precioCombustibles.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getPrecioCombustibles() {
        return precioCombustibles;
    }

    /**
     * Define el valor de la propiedad precioCombustibles.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setPrecioCombustibles(TNonNegativeAmount value) {
        this.precioCombustibles = value;
    }

    /**
     * Obtiene el valor de la propiedad precioSugerido.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getPrecioSugerido() {
        return precioSugerido;
    }

    /**
     * Define el valor de la propiedad precioSugerido.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setPrecioSugerido(TNonNegativeAmount value) {
        this.precioSugerido = value;
    }

    /**
     * Obtiene el valor de la propiedad precioLista.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getPrecioLista() {
        return precioLista;
    }

    /**
     * Define el valor de la propiedad precioLista.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setPrecioLista(TNonNegativeAmount value) {
        this.precioLista = value;
    }

    /**
     * Obtiene el valor de la propiedad importeLista.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getImporteLista() {
        return importeLista;
    }

    /**
     * Define el valor de la propiedad importeLista.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setImporteLista(TNonNegativeAmount value) {
        this.importeLista = value;
    }

    /**
     * Obtiene el valor de la propiedad descuentosYRecargos.
     * 
     * @return
     *     possible object is
     *     {@link TDescuentosYRecargos }
     *     
     */
    public TDescuentosYRecargos getDescuentosYRecargos() {
        return descuentosYRecargos;
    }

    /**
     * Define el valor de la propiedad descuentosYRecargos.
     * 
     * @param value
     *     allowed object is
     *     {@link TDescuentosYRecargos }
     *     
     */
    public void setDescuentosYRecargos(TDescuentosYRecargos value) {
        this.descuentosYRecargos = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestos.
     * 
     * @return
     *     possible object is
     *     {@link TImpuestos }
     *     
     */
    public TImpuestos getImpuestos() {
        return impuestos;
    }

    /**
     * Define el valor de la propiedad impuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link TImpuestos }
     *     
     */
    public void setImpuestos(TImpuestos value) {
        this.impuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTotal.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getImporteTotal() {
        return importeTotal;
    }

    /**
     * Define el valor de la propiedad importeTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setImporteTotal(TNonNegativeAmount value) {
        this.importeTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad lineaDeOrdenDeCompra.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineaDeOrdenDeCompra() {
        return lineaDeOrdenDeCompra;
    }

    /**
     * Define el valor de la propiedad lineaDeOrdenDeCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineaDeOrdenDeCompra(BigInteger value) {
        this.lineaDeOrdenDeCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEAN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEAN() {
        return codigoEAN;
    }

    /**
     * Define el valor de la propiedad codigoEAN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEAN(String value) {
        this.codigoEAN = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoSKU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSKU() {
        return codigoSKU;
    }

    /**
     * Define el valor de la propiedad codigoSKU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSKU(String value) {
        this.codigoSKU = value;
    }

    /**
     * Obtiene el valor de la propiedad subCantidad.
     * 
     * @return
     *     possible object is
     *     {@link TSubCantidad }
     *     
     */
    public TSubCantidad getSubCantidad() {
        return subCantidad;
    }

    /**
     * Define el valor de la propiedad subCantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link TSubCantidad }
     *     
     */
    public void setSubCantidad(TSubCantidad value) {
        this.subCantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDeLote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDeLote() {
        return numeroDeLote;
    }

    /**
     * Define el valor de la propiedad numeroDeLote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDeLote(String value) {
        this.numeroDeLote = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadDeLote.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCantidadDeLote() {
        return cantidadDeLote;
    }

    /**
     * Define el valor de la propiedad cantidadDeLote.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCantidadDeLote(BigInteger value) {
        this.cantidadDeLote = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDeSerie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    /**
     * Define el valor de la propiedad numeroDeSerie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDeSerie(String value) {
        this.numeroDeSerie = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDeProduccion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDeProduccion() {
        return fechaDeProduccion;
    }

    /**
     * Define el valor de la propiedad fechaDeProduccion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDeProduccion(XMLGregorianCalendar value) {
        this.fechaDeProduccion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDeCaducidad.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    /**
     * Define el valor de la propiedad fechaDeCaducidad.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDeCaducidad(XMLGregorianCalendar value) {
        this.fechaDeCaducidad = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDeRecepcion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDeRecepcion() {
        return fechaDeRecepcion;
    }

    /**
     * Define el valor de la propiedad fechaDeRecepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDeRecepcion(XMLGregorianCalendar value) {
        this.fechaDeRecepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad talla.
     * 
     * @return
     *     possible object is
     *     {@link TConceptoEx.Talla }
     *     
     */
    public TConceptoEx.Talla getTalla() {
        return talla;
    }

    /**
     * Define el valor de la propiedad talla.
     * 
     * @param value
     *     allowed object is
     *     {@link TConceptoEx.Talla }
     *     
     */
    public void setTalla(TConceptoEx.Talla value) {
        this.talla = value;
    }

    /**
     * Obtiene el valor de la propiedad composicion.
     * 
     * @return
     *     possible object is
     *     {@link TConceptoEx.Composicion }
     *     
     */
    public TConceptoEx.Composicion getComposicion() {
        return composicion;
    }

    /**
     * Define el valor de la propiedad composicion.
     * 
     * @param value
     *     allowed object is
     *     {@link TConceptoEx.Composicion }
     *     
     */
    public void setComposicion(TConceptoEx.Composicion value) {
        this.composicion = value;
    }

    /**
     * Obtiene el valor de la propiedad composicion2.
     * 
     * @return
     *     possible object is
     *     {@link TConceptoEx.Composicion2 }
     *     
     */
    public TConceptoEx.Composicion2 getComposicion2() {
        return composicion2;
    }

    /**
     * Define el valor de la propiedad composicion2.
     * 
     * @param value
     *     allowed object is
     *     {@link TConceptoEx.Composicion2 }
     *     
     */
    public void setComposicion2(TConceptoEx.Composicion2 value) {
        this.composicion2 = value;
    }

    /**
     * Obtiene el valor de la propiedad quilataje.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getQuilataje() {
        return quilataje;
    }

    /**
     * Define el valor de la propiedad quilataje.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setQuilataje(TNonNegativeAmount value) {
        this.quilataje = value;
    }

    /**
     * Obtiene el valor de la propiedad peso.
     * 
     * @return
     *     possible object is
     *     {@link TWeight }
     *     
     */
    public TWeight getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     * @param value
     *     allowed object is
     *     {@link TWeight }
     *     
     */
    public void setPeso(TWeight value) {
        this.peso = value;
    }

    /**
     * Obtiene el valor de la propiedad volumen.
     * 
     * @return
     *     possible object is
     *     {@link TVolume }
     *     
     */
    public TVolume getVolumen() {
        return volumen;
    }

    /**
     * Define el valor de la propiedad volumen.
     * 
     * @param value
     *     allowed object is
     *     {@link TVolume }
     *     
     */
    public void setVolumen(TVolume value) {
        this.volumen = value;
    }

    /**
     * Obtiene el valor de la propiedad embalaje.
     * 
     * @return
     *     possible object is
     *     {@link TEmbalaje }
     *     
     */
    public TEmbalaje getEmbalaje() {
        return embalaje;
    }

    /**
     * Define el valor de la propiedad embalaje.
     * 
     * @param value
     *     allowed object is
     *     {@link TEmbalaje }
     *     
     */
    public void setEmbalaje(TEmbalaje value) {
        this.embalaje = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenDeCompra.
     * 
     * @return
     *     possible object is
     *     {@link TReferenciaCorta }
     *     
     */
    public TReferenciaCorta getOrdenDeCompra() {
        return ordenDeCompra;
    }

    /**
     * Define el valor de la propiedad ordenDeCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link TReferenciaCorta }
     *     
     */
    public void setOrdenDeCompra(TReferenciaCorta value) {
        this.ordenDeCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad textosDePosicion.
     * 
     * @return
     *     possible object is
     *     {@link TTextoLibre }
     *     
     */
    public TTextoLibre getTextosDePosicion() {
        return textosDePosicion;
    }

    /**
     * Define el valor de la propiedad textosDePosicion.
     * 
     * @param value
     *     allowed object is
     *     {@link TTextoLibre }
     *     
     */
    public void setTextosDePosicion(TTextoLibre value) {
        this.textosDePosicion = value;
    }

    /**
     * Obtiene el valor de la propiedad mapfre.
     * 
     * @return
     *     possible object is
     *     {@link TMTEConcepto }
     *     
     */
    public TMTEConcepto getMapfre() {
        return mapfre;
    }

    /**
     * Define el valor de la propiedad mapfre.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTEConcepto }
     *     
     */
    public void setMapfre(TMTEConcepto value) {
        this.mapfre = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDeConsumo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDeConsumo() {
        return fechaDeConsumo;
    }

    /**
     * Define el valor de la propiedad fechaDeConsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDeConsumo(XMLGregorianCalendar value) {
        this.fechaDeConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad origen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Define el valor de la propiedad origen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Obtiene el valor de la propiedad chrysler.
     * 
     * @return
     *     possible object is
     *     {@link TConceptoEx.Chrysler }
     *     
     */
    public TConceptoEx.Chrysler getChrysler() {
        return chrysler;
    }

    /**
     * Define el valor de la propiedad chrysler.
     * 
     * @param value
     *     allowed object is
     *     {@link TConceptoEx.Chrysler }
     *     
     */
    public void setChrysler(TConceptoEx.Chrysler value) {
        this.chrysler = value;
    }

    /**
     * Obtiene el valor de la propiedad volkswagen.
     * 
     * @return
     *     possible object is
     *     {@link TConceptoEx.Volkswagen }
     *     
     */
    public TConceptoEx.Volkswagen getVolkswagen() {
        return volkswagen;
    }

    /**
     * Define el valor de la propiedad volkswagen.
     * 
     * @param value
     *     allowed object is
     *     {@link TConceptoEx.Volkswagen }
     *     
     */
    public void setVolkswagen(TConceptoEx.Volkswagen value) {
        this.volkswagen = value;
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
     *         &lt;element name="References" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OrdenCompra" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="0" minOccurs="0"/&gt;
     *                   &lt;element name="ReleaseRequisicion" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
     *                         &lt;maxLength value="11"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="BillOfLading" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
     *                         &lt;maxLength value="15"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PackingList" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
     *                         &lt;maxLength value="15"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="TipoFlete" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                         &lt;enumeration value="A"/&gt;
     *                         &lt;enumeration value="E"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Ammendment" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OtrosCargos" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OtroCargo" maxOccurs="3"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Codigo"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
     *                                   &lt;enumeration value="P"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Monto" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "references",
        "otrosCargos"
    })
    public static class Chrysler {

        @XmlElement(name = "References")
        protected TConceptoEx.Chrysler.References references;
        @XmlElement(name = "OtrosCargos")
        protected TConceptoEx.Chrysler.OtrosCargos otrosCargos;

        /**
         * Obtiene el valor de la propiedad references.
         * 
         * @return
         *     possible object is
         *     {@link TConceptoEx.Chrysler.References }
         *     
         */
        public TConceptoEx.Chrysler.References getReferences() {
            return references;
        }

        /**
         * Define el valor de la propiedad references.
         * 
         * @param value
         *     allowed object is
         *     {@link TConceptoEx.Chrysler.References }
         *     
         */
        public void setReferences(TConceptoEx.Chrysler.References value) {
            this.references = value;
        }

        /**
         * Obtiene el valor de la propiedad otrosCargos.
         * 
         * @return
         *     possible object is
         *     {@link TConceptoEx.Chrysler.OtrosCargos }
         *     
         */
        public TConceptoEx.Chrysler.OtrosCargos getOtrosCargos() {
            return otrosCargos;
        }

        /**
         * Define el valor de la propiedad otrosCargos.
         * 
         * @param value
         *     allowed object is
         *     {@link TConceptoEx.Chrysler.OtrosCargos }
         *     
         */
        public void setOtrosCargos(TConceptoEx.Chrysler.OtrosCargos value) {
            this.otrosCargos = value;
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
         *         &lt;element name="OtroCargo" maxOccurs="3"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Codigo"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
         *                         &lt;enumeration value="P"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Monto" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
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
        @XmlType(name = "", propOrder = {
            "otroCargo"
        })
        public static class OtrosCargos {

            @XmlElement(name = "OtroCargo", required = true)
            protected List<TConceptoEx.Chrysler.OtrosCargos.OtroCargo> otroCargo;

            /**
             * Gets the value of the otroCargo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the otroCargo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOtroCargo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TConceptoEx.Chrysler.OtrosCargos.OtroCargo }
             * 
             * 
             */
            public List<TConceptoEx.Chrysler.OtrosCargos.OtroCargo> getOtroCargo() {
                if (otroCargo == null) {
                    otroCargo = new ArrayList<TConceptoEx.Chrysler.OtrosCargos.OtroCargo>();
                }
                return this.otroCargo;
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
             *         &lt;element name="Codigo"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
             *               &lt;enumeration value="P"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Monto" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
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
                "codigo",
                "monto"
            })
            public static class OtroCargo {

                @XmlElement(name = "Codigo", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String codigo;
                @XmlElement(name = "Monto", required = true)
                protected TNonNegativeAmount monto;

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
                 * Obtiene el valor de la propiedad monto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TNonNegativeAmount }
                 *     
                 */
                public TNonNegativeAmount getMonto() {
                    return monto;
                }

                /**
                 * Define el valor de la propiedad monto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TNonNegativeAmount }
                 *     
                 */
                public void setMonto(TNonNegativeAmount value) {
                    this.monto = value;
                }

            }

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
         *         &lt;element name="OrdenCompra" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="0" minOccurs="0"/&gt;
         *         &lt;element name="ReleaseRequisicion" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
         *               &lt;maxLength value="11"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="BillOfLading" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
         *               &lt;maxLength value="15"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PackingList" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
         *               &lt;maxLength value="15"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TipoFlete" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *               &lt;enumeration value="A"/&gt;
         *               &lt;enumeration value="E"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Ammendment" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
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
        @XmlType(name = "", propOrder = {
            "releaseRequisicion",
            "billOfLading",
            "packingList",
            "tipoFlete",
            "ammendment"
        })
        public static class References {

            @XmlElement(name = "ReleaseRequisicion")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String releaseRequisicion;
            @XmlElement(name = "BillOfLading")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String billOfLading;
            @XmlElement(name = "PackingList")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String packingList;
            @XmlElement(name = "TipoFlete")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String tipoFlete;
            @XmlElement(name = "Ammendment")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String ammendment;

            /**
             * Obtiene el valor de la propiedad releaseRequisicion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReleaseRequisicion() {
                return releaseRequisicion;
            }

            /**
             * Define el valor de la propiedad releaseRequisicion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReleaseRequisicion(String value) {
                this.releaseRequisicion = value;
            }

            /**
             * Obtiene el valor de la propiedad billOfLading.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBillOfLading() {
                return billOfLading;
            }

            /**
             * Define el valor de la propiedad billOfLading.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBillOfLading(String value) {
                this.billOfLading = value;
            }

            /**
             * Obtiene el valor de la propiedad packingList.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPackingList() {
                return packingList;
            }

            /**
             * Define el valor de la propiedad packingList.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPackingList(String value) {
                this.packingList = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoFlete.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoFlete() {
                return tipoFlete;
            }

            /**
             * Define el valor de la propiedad tipoFlete.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoFlete(String value) {
                this.tipoFlete = value;
            }

            /**
             * Obtiene el valor de la propiedad ammendment.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmmendment() {
                return ammendment;
            }

            /**
             * Define el valor de la propiedad ammendment.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmmendment(String value) {
                this.ammendment = value;
            }

        }

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
     *         &lt;element name="Componente" maxOccurs="64"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Material" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
     *                   &lt;element name="Porcentaje" type="{http://www.fact.com.mx/schema/fx}TNonNegativePercentage" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "componente"
    })
    public static class Composicion {

        @XmlElement(name = "Componente", required = true)
        protected List<TConceptoEx.Composicion.Componente> componente;

        /**
         * Gets the value of the componente property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the componente property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComponente().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TConceptoEx.Composicion.Componente }
         * 
         * 
         */
        public List<TConceptoEx.Composicion.Componente> getComponente() {
            if (componente == null) {
                componente = new ArrayList<TConceptoEx.Composicion.Componente>();
            }
            return this.componente;
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
         *         &lt;element name="Material" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
         *         &lt;element name="Porcentaje" type="{http://www.fact.com.mx/schema/fx}TNonNegativePercentage" minOccurs="0"/&gt;
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
            "material",
            "porcentaje"
        })
        public static class Componente {

            @XmlElement(name = "Material", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String material;
            @XmlElement(name = "Porcentaje")
            protected BigDecimal porcentaje;

            /**
             * Obtiene el valor de la propiedad material.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaterial() {
                return material;
            }

            /**
             * Define el valor de la propiedad material.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaterial(String value) {
                this.material = value;
            }

            /**
             * Obtiene el valor de la propiedad porcentaje.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPorcentaje() {
                return porcentaje;
            }

            /**
             * Define el valor de la propiedad porcentaje.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPorcentaje(BigDecimal value) {
                this.porcentaje = value;
            }

        }

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
     *         &lt;element name="Material" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
     *         &lt;element name="GramajeRelleno" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
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
        "material",
        "gramajeRelleno"
    })
    public static class Composicion2 {

        @XmlElement(name = "Material", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String material;
        @XmlElement(name = "GramajeRelleno")
        protected TNonNegativeAmount gramajeRelleno;

        /**
         * Obtiene el valor de la propiedad material.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaterial() {
            return material;
        }

        /**
         * Define el valor de la propiedad material.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaterial(String value) {
            this.material = value;
        }

        /**
         * Obtiene el valor de la propiedad gramajeRelleno.
         * 
         * @return
         *     possible object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public TNonNegativeAmount getGramajeRelleno() {
            return gramajeRelleno;
        }

        /**
         * Define el valor de la propiedad gramajeRelleno.
         * 
         * @param value
         *     allowed object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public void setGramajeRelleno(TNonNegativeAmount value) {
            this.gramajeRelleno = value;
        }

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
     *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
     *         &lt;element name="Talla" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
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
        "codigo",
        "talla"
    })
    public static class Talla {

        @XmlElement(name = "Codigo")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String codigo;
        @XmlElement(name = "Talla")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String talla;

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
         * Obtiene el valor de la propiedad talla.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTalla() {
            return talla;
        }

        /**
         * Define el valor de la propiedad talla.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTalla(String value) {
            this.talla = value;
        }

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
     *         &lt;element name="Partes"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Parte" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Referencias"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="tipoCarga"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                           &lt;minLength value="1"/&gt;
     *                                           &lt;maxLength value="3"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                     &lt;attribute name="numContenedorCajaEconomico"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                           &lt;minLength value="1"/&gt;
     *                                           &lt;maxLength value="30"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "partes"
    })
    public static class Volkswagen {

        @XmlElement(name = "Partes", required = true)
        protected TConceptoEx.Volkswagen.Partes partes;

        /**
         * Obtiene el valor de la propiedad partes.
         * 
         * @return
         *     possible object is
         *     {@link TConceptoEx.Volkswagen.Partes }
         *     
         */
        public TConceptoEx.Volkswagen.Partes getPartes() {
            return partes;
        }

        /**
         * Define el valor de la propiedad partes.
         * 
         * @param value
         *     allowed object is
         *     {@link TConceptoEx.Volkswagen.Partes }
         *     
         */
        public void setPartes(TConceptoEx.Volkswagen.Partes value) {
            this.partes = value;
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
         *         &lt;element name="Parte" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Referencias"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="tipoCarga"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                 &lt;minLength value="1"/&gt;
         *                                 &lt;maxLength value="3"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                           &lt;attribute name="numContenedorCajaEconomico"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                 &lt;minLength value="1"/&gt;
         *                                 &lt;maxLength value="30"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
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
        @XmlType(name = "", propOrder = {
            "parte"
        })
        public static class Partes {

            @XmlElement(name = "Parte", required = true)
            protected List<TConceptoEx.Volkswagen.Partes.Parte> parte;

            /**
             * Gets the value of the parte property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the parte property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getParte().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TConceptoEx.Volkswagen.Partes.Parte }
             * 
             * 
             */
            public List<TConceptoEx.Volkswagen.Partes.Parte> getParte() {
                if (parte == null) {
                    parte = new ArrayList<TConceptoEx.Volkswagen.Partes.Parte>();
                }
                return this.parte;
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
             *         &lt;element name="Referencias"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="tipoCarga"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                       &lt;minLength value="1"/&gt;
             *                       &lt;maxLength value="3"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *                 &lt;attribute name="numContenedorCajaEconomico"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                       &lt;minLength value="1"/&gt;
             *                       &lt;maxLength value="30"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
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
            @XmlType(name = "", propOrder = {
                "referencias"
            })
            public static class Parte {

                @XmlElement(name = "Referencias", required = true)
                protected TConceptoEx.Volkswagen.Partes.Parte.Referencias referencias;

                /**
                 * Obtiene el valor de la propiedad referencias.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TConceptoEx.Volkswagen.Partes.Parte.Referencias }
                 *     
                 */
                public TConceptoEx.Volkswagen.Partes.Parte.Referencias getReferencias() {
                    return referencias;
                }

                /**
                 * Define el valor de la propiedad referencias.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TConceptoEx.Volkswagen.Partes.Parte.Referencias }
                 *     
                 */
                public void setReferencias(TConceptoEx.Volkswagen.Partes.Parte.Referencias value) {
                    this.referencias = value;
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
                 *       &lt;attribute name="tipoCarga"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *             &lt;minLength value="1"/&gt;
                 *             &lt;maxLength value="3"/&gt;
                 *           &lt;/restriction&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *       &lt;attribute name="numContenedorCajaEconomico"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *             &lt;minLength value="1"/&gt;
                 *             &lt;maxLength value="30"/&gt;
                 *           &lt;/restriction&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Referencias {

                    @XmlAttribute(name = "tipoCarga")
                    protected String tipoCarga;
                    @XmlAttribute(name = "numContenedorCajaEconomico")
                    protected String numContenedorCajaEconomico;

                    /**
                     * Obtiene el valor de la propiedad tipoCarga.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTipoCarga() {
                        return tipoCarga;
                    }

                    /**
                     * Define el valor de la propiedad tipoCarga.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTipoCarga(String value) {
                        this.tipoCarga = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad numContenedorCajaEconomico.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumContenedorCajaEconomico() {
                        return numContenedorCajaEconomico;
                    }

                    /**
                     * Define el valor de la propiedad numContenedorCajaEconomico.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumContenedorCajaEconomico(String value) {
                        this.numContenedorCajaEconomico = value;
                    }

                }

            }

        }

    }

}
