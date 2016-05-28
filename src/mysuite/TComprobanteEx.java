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
 * Datos adicionales a nivel Comprobante que sirven para formar las addendas.
 * 
 * <p>Clase Java para TComprobanteEx complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TComprobanteEx"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatosDeNegocio" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Division" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="128"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LineaDeNegocio" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="128"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Region" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="128"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Sucursal" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="128"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Ejecutivo" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="128"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ElaboradoPor" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="128"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Vendedor" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="128"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DatosDeIntercambio" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SenderId" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *                   &lt;element name="ReceiverId" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DatosComerciales" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice minOccurs="0"&gt;
 *                     &lt;element name="RelacionComercial" type="{http://www.fact.com.mx/schema/fx}TRelacionComercial" minOccurs="0"/&gt;
 *                     &lt;element name="RfcParaAddendaDeTercero" minOccurs="0"&gt;
 *                       &lt;simpleType&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                           &lt;minLength value="12"/&gt;
 *                           &lt;maxLength value="13"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/simpleType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="NumeroDeProveedor" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *                   &lt;element name="SubAddenda1" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *                   &lt;element name="SubAddenda2" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *                   &lt;element name="OrdenDeCompra" type="{http://www.fact.com.mx/schema/fx}TReferenciaCorta" minOccurs="0"/&gt;
 *                   &lt;element name="Contrarrecibo" type="{http://www.fact.com.mx/schema/fx}TReferenciaCorta" minOccurs="0"/&gt;
 *                   &lt;element name="NumeroDeDepartamento" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *                   &lt;element name="NumeroDeCliente" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *                   &lt;element name="OrdenDeVenta" type="{http://www.fact.com.mx/schema/fx}TReferenciaCorta" minOccurs="0"/&gt;
 *                   &lt;element name="Contrato" type="{http://www.fact.com.mx/schema/fx}TReferenciaCorta" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TerminosDePago"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DiasDePago" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
 *                         &lt;maxInclusive value="360"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FechaDeVencimiento" type="{http://www.fact.com.mx/schema/fx}TAllowedDate" minOccurs="0"/&gt;
 *                   &lt;element name="CodigoDeTerminoDePago" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *                   &lt;element name="MetodoDePago"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="1024"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MedioDePago" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="64"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CondicionesDePago" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="64"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PeriodoFacturado" type="{http://www.fact.com.mx/schema/fx}TFromTo" minOccurs="0"/&gt;
 *                   &lt;element name="PeriodoDeLiquidacion" type="{http://www.fact.com.mx/schema/fx}TFromTo" minOccurs="0"/&gt;
 *                   &lt;element name="FechaDePago" type="{http://www.fact.com.mx/schema/fx}TAllowedDate" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DescuentosPorProntoPago" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Descuento" type="{http://www.fact.com.mx/schema/fx}TDescuentoPPP" maxOccurs="6"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DatosDeEmbarque" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LugarDeExpedicion" type="{http://www.fact.com.mx/schema/fx}TDomicilioComercial" minOccurs="0"/&gt;
 *                   &lt;element name="LugarDeEntrega" type="{http://www.fact.com.mx/schema/fx}TDomicilioComercial" minOccurs="0"/&gt;
 *                   &lt;element name="FechaDeEmbarque" type="{http://www.fact.com.mx/schema/fx}TAllowedDate" minOccurs="0"/&gt;
 *                   &lt;element name="MetodoDeEmbarque" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="250"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NumeroDeEmbarque" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="64"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NumeroInternoDeEmbarque" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="64"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Entrada" type="{http://www.fact.com.mx/schema/fx}TReferenciaCorta" minOccurs="0"/&gt;
 *                   &lt;element name="Remision" type="{http://www.fact.com.mx/schema/fx}TReferenciaCorta" minOccurs="0"/&gt;
 *                   &lt;element name="Cita" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
 *                   &lt;element name="FechaDeEntrega" type="{http://www.fact.com.mx/schema/fx}TAllowedDate" minOccurs="0"/&gt;
 *                   &lt;element name="TransporteACargoDe" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="VENDEDOR"/&gt;
 *                         &lt;enumeration value="COMPRADOR"/&gt;
 *                         &lt;enumeration value="TERCERO"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Transportista" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="250"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NumeroDeTransporte" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="64"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Origen" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="64"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Destino" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="64"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="INCOTERMS" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="250"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DatosAdicionalesDeEmisor" type="{http://www.fact.com.mx/schema/fx}TDatosAdicionales" minOccurs="0"/&gt;
 *         &lt;element name="DatosAdicionalesDeReceptor" type="{http://www.fact.com.mx/schema/fx}TDatosAdicionales" minOccurs="0"/&gt;
 *         &lt;element name="ReferenciasBancarias" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ReferenciaBancaria" type="{http://www.fact.com.mx/schema/fx}TReferenciaBancaria" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DocumentosReferenciados" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Documento" type="{http://www.fact.com.mx/schema/fx}TDocumentoReferenciado" maxOccurs="32"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ImportesDesglosados" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Importes" type="{http://www.fact.com.mx/schema/fx}TImportesDesglosados" maxOccurs="32"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Peso" type="{http://www.fact.com.mx/schema/fx}TWeight" minOccurs="0"/&gt;
 *         &lt;element name="Volumen" type="{http://www.fact.com.mx/schema/fx}TVolume" minOccurs="0"/&gt;
 *         &lt;element name="TotalCajas" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="TotalPiezas" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Cotizaciones" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Cotizacion" maxOccurs="12"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Material"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                   &lt;enumeration value="ORO"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PrecioUnitario" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
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
 *         &lt;element name="TextosDeCabecera" type="{http://www.fact.com.mx/schema/fx}TTextoLibre" minOccurs="0"/&gt;
 *         &lt;element name="TextosDePie" type="{http://www.fact.com.mx/schema/fx}TTextoLibre" minOccurs="0"/&gt;
 *         &lt;element name="Mapfre" type="{http://www.fact.com.mx/schema/fx}TMTECabecera" minOccurs="0"/&gt;
 *         &lt;element name="Hotel" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Estancia" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Reserva" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *                             &lt;element name="Habitacion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *                             &lt;element name="Entrada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                             &lt;element name="Salida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                             &lt;element name="NombreHuesped" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *                             &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
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
 *         &lt;element name="Soriana" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoBulto" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                         &lt;enumeration value="CAJAS"/&gt;
 *                         &lt;enumeration value="BOLSAS"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CantidadBultos" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *                   &lt;element name="Servicios" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Tipo"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="Flete"/&gt;
 *                                   &lt;enumeration value="ConsumosInternos"/&gt;
 *                                   &lt;enumeration value="Construccion"/&gt;
 *                                   &lt;enumeration value="Hospedaje"/&gt;
 *                                   &lt;enumeration value="Publicidad"/&gt;
 *                                   &lt;enumeration value="Consumos"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FolioReferencia" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
 *         &lt;element name="Coppel" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TotalLotes" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                   &lt;element name="RegionCel" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="2"/&gt;
 *                         &lt;enumeration value="3"/&gt;
 *                         &lt;enumeration value="4"/&gt;
 *                         &lt;enumeration value="5"/&gt;
 *                         &lt;enumeration value="6"/&gt;
 *                         &lt;enumeration value="7"/&gt;
 *                         &lt;enumeration value="8"/&gt;
 *                         &lt;enumeration value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Transportistas" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DescripcionDeCarga" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Linea" maxOccurs="24" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Columna1" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *                                       &lt;element name="Columna2" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *                                       &lt;element name="Columna3" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *                                       &lt;element name="Columna4" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *                                       &lt;element name="Columna5" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
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
 *                   &lt;element name="ConceptosDeCobro" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Concepto" maxOccurs="24" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Elemento" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *                                       &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
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
 *                   &lt;element name="Unidad" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="250"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Operador" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="250"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Remolque" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="250"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Pedimento" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="250"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Contenedor" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="250"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Automotriz" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Vehiculo" type="{http://www.fact.com.mx/schema/fx}TVehiculo" minOccurs="0"/&gt;
 *                   &lt;element name="OrdenDeTrabajo" type="{http://www.fact.com.mx/schema/fx}TOrdenDeTrabajo" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Chrysler" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Proveedor" type="{http://www.fact.com.mx/schema/fx}TChryslerLocation"/&gt;
 *                   &lt;element name="Origen" type="{http://www.fact.com.mx/schema/fx}TChryslerLocation" minOccurs="0"/&gt;
 *                   &lt;element name="Destino" type="{http://www.fact.com.mx/schema/fx}TChryslerLocation" minOccurs="0"/&gt;
 *                   &lt;element name="Receiving" type="{http://www.fact.com.mx/schema/fx}TChryslerLocation" minOccurs="0"/&gt;
 *                   &lt;choice minOccurs="0"&gt;
 *                     &lt;element name="Departamento" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Numero"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                     &lt;minLength value="1"/&gt;
 *                                     &lt;maxLength value="4"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="NumeroCuenta"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                     &lt;minLength value="1"/&gt;
 *                                     &lt;maxLength value="7"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="Transportistas" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Transportista" maxOccurs="15"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Talon"&gt;
 *                                           &lt;simpleType&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                               &lt;minLength value="1"/&gt;
 *                                               &lt;maxLength value="15"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/simpleType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="NumeroCaja" minOccurs="0"&gt;
 *                                           &lt;simpleType&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                               &lt;minLength value="1"/&gt;
 *                                               &lt;maxLength value="20"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/simpleType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="CodigoTransportista" minOccurs="0"&gt;
 *                                           &lt;simpleType&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                               &lt;minLength value="1"/&gt;
 *                                               &lt;maxLength value="4"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/simpleType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="FechaRecibo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                         &lt;element name="NombreUsuario" minOccurs="0"&gt;
 *                                           &lt;simpleType&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                               &lt;minLength value="1"/&gt;
 *                                               &lt;maxLength value="50"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/simpleType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="DireccionOrigen" minOccurs="0"&gt;
 *                                           &lt;simpleType&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                               &lt;minLength value="1"/&gt;
 *                                               &lt;maxLength value="150"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/simpleType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="DireccionDestino" minOccurs="0"&gt;
 *                                           &lt;simpleType&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                               &lt;minLength value="1"/&gt;
 *                                               &lt;maxLength value="150"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/simpleType&gt;
 *                                         &lt;/element&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="Proyecto" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Numero"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="15"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NumeroTrabajo"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="15"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ChargeUnit" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="15"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AETC" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Status"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                   &lt;enumeration value="09"/&gt;
 *                                   &lt;enumeration value="10"/&gt;
 *                                   &lt;enumeration value="11"/&gt;
 *                                   &lt;enumeration value="12"/&gt;
 *                                   &lt;enumeration value="13"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Numero"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Responsable"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="15"/&gt;
 *                                   &lt;pattern value="CE|SR|CR[\w]{0,13}"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CargosCreditos" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CargoCredito" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ReferenciaChrysler" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
 *                                             &lt;maxLength value="15"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Consecutivo" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
 *                                             &lt;maxLength value="14"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="MontoLinea"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                             &lt;fractionDigits value="2"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Factura" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
 *                                             &lt;maxLength value="15"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Archivo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="3" minOccurs="0"/&gt;
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
 *                   &lt;element name="Origen" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Codigo"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Nombre" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="35"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Destino" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Codigo"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="4"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NaveReciboMaterial" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="7"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Transportistas" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Transportista"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="numeroBFL"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;length value="12"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="guiaAereaMaster"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;maxLength value="20"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="guiaAereaHouse"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;maxLength value="20"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="BLMaster"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;maxLength value="20"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="BLHouse"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;maxLength value="20"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="codigoFlete" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;maxLength value="20"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="ETD" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                                     &lt;attribute name="ETA" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                                     &lt;attribute name="Usuario"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;maxLength value="50"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="direccionOrigen"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="direccionDestino"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
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
 *                   &lt;element name="Referencias" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="referenciaProveedor"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="16"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="remision"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="16"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="numeroASN"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="20"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="unidadNegocios"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="0"/&gt;
 *                                 &lt;maxLength value="80"/&gt;
 *                                 &lt;enumeration value="INFODE"/&gt;
 *                                 &lt;enumeration value="VWSP"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Archivo" maxOccurs="3" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="datos" use="required" type="{http://www.w3.org/2001/XMLSchema}base64Binary" /&gt;
 *                           &lt;attribute name="tipo" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="XLS"/&gt;
 *                                 &lt;enumeration value="PDF"/&gt;
 *                                 &lt;enumeration value="ZIP"/&gt;
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
 *         &lt;element name="ServiciosDeAviacion" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FechaDeOperacion" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="NumeroDeVuelo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Llegada"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                                   &lt;maxLength value="100"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Salida"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                                   &lt;maxLength value="100"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Aeronave" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="100"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Matricula" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Ruta" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="100"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Estacion" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;maxLength value="100"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="HoraDeLlegada" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *                   &lt;element name="HoraDeSalida" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *                   &lt;element name="PasajerosDeLlegada" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                   &lt;element name="PasajerosDeSalida" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                   &lt;element name="CombustibleCargadoLitros" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="Linea" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AltosHornos" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Documento"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Detalle" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Pedido" maxOccurs="20" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Recepcion" maxOccurs="20" minOccurs="0"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="200"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="HojaServicio" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="Num"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                     &lt;maxLength value="10"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Transporte" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="CtaxPag" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="Ejercicio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Anexos" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Anexo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Clase"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="PE"/&gt;
 *                                 &lt;enumeration value="PS"/&gt;
 *                                 &lt;enumeration value="PA"/&gt;
 *                                 &lt;enumeration value="AS"/&gt;
 *                                 &lt;enumeration value="HS"/&gt;
 *                                 &lt;enumeration value="FC"/&gt;
 *                                 &lt;enumeration value="FV"/&gt;
 *                                 &lt;enumeration value="AA"/&gt;
 *                                 &lt;enumeration value="CO"/&gt;
 *                                 &lt;enumeration value="KT"/&gt;
 *                                 &lt;enumeration value="PT"/&gt;
 *                                 &lt;enumeration value="AC"/&gt;
 *                                 &lt;enumeration value="NC"/&gt;
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
 *         &lt;element name="EdoCuentaBanco" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Encabezado" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NumeroCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CodigoBarras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CodigoQR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TipoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TipoPublicidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TituloEstadoDeCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DetalleInicial" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TasaInteresOrdinaria" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="InteresesEfectivamentePagados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="ComisionesEfectivamenteCobradas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="SaldoAlCorte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="PagoParaNoGenerarIntereses" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="PagoMinimo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="FechaLimiteDePago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MontoAPagar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ResumenDeCuenta" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ClienteNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TarjetaNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LimiteDeCredito" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="CreditoDisponible" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="FechaDeCorte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DiasTranscurridosEnElCiclo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="PeriodoAlQueCorresponde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ComprasPlazosPromociones" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="SaldoVencido" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="Sobregiro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="Graficos" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence minOccurs="0"&gt;
 *                                       &lt;element name="Grafico" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence minOccurs="0"&gt;
 *                                                 &lt;element name="Datos" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="valor" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                                                         &lt;attribute name="etiqueta" use="required"&gt;
 *                                                           &lt;simpleType&gt;
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                               &lt;maxLength value="50"/&gt;
 *                                                             &lt;/restriction&gt;
 *                                                           &lt;/simpleType&gt;
 *                                                         &lt;/attribute&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
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
 *                   &lt;element name="ResumenDeSaldo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SaldoAnterior" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="Pagos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="OtrosAbonos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="Debitos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="Compras" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="Intereses" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="Comisiones" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="DisposicionesEnEfectivo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="IVA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="SaldoNuevo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ResumenDeIntereses" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SaldoPromedio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="TasaInteresAnual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="TasaInteresMensual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="InteresesGravados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="InteresesExentos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Comisiones" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CuotasYComisiones" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="CargoPorDisposicionEfectivo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="ComisionPagoTardio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="ComisionReposicionTarjeta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="Anualidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DetalleMovimientos" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FechaTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FechaDeCargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NumeroReferencia" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="50"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Conceptos" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence minOccurs="0"&gt;
 *                                       &lt;element name="InfoExtra" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Depositos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="Retiros" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Publicidad" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Identificador" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Linea" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *                   &lt;element name="Productos" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ConsucuentaBasica" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Resumen" type="{http://www.fact.com.mx/schema/fx}ResumenType" minOccurs="0"/&gt;
 *                                       &lt;element name="Detalle" type="{http://www.fact.com.mx/schema/fx}DetalleType1" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ConsuinversionVista" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Resumen" type="{http://www.fact.com.mx/schema/fx}ResumenType" minOccurs="0"/&gt;
 *                                       &lt;element name="Detalle" type="{http://www.fact.com.mx/schema/fx}DetalleType1" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ConsupagarePRLV" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Resumen" type="{http://www.fact.com.mx/schema/fx}ResumenType"/&gt;
 *                                       &lt;element name="Detalle" type="{http://www.fact.com.mx/schema/fx}DetalleType2"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ConsuinversionCEDE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Resumen" type="{http://www.fact.com.mx/schema/fx}ResumenType" minOccurs="0"/&gt;
 *                                       &lt;element name="Detalle" type="{http://www.fact.com.mx/schema/fx}DetalleType2" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="TotalProductos" type="{http://www.fact.com.mx/schema/fx}ResumenType" minOccurs="0"/&gt;
 *                             &lt;element name="Grafica" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Abonos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="Retiros" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="OtrosCargos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "TComprobanteEx", propOrder = {
    "datosDeNegocio",
    "datosDeIntercambio",
    "datosComerciales",
    "terminosDePago",
    "descuentosPorProntoPago",
    "datosDeEmbarque",
    "datosAdicionalesDeEmisor",
    "datosAdicionalesDeReceptor",
    "referenciasBancarias",
    "documentosReferenciados",
    "importesDesglosados",
    "peso",
    "volumen",
    "totalCajas",
    "totalPiezas",
    "cotizaciones",
    "textosDeCabecera",
    "textosDePie",
    "mapfre",
    "hotel",
    "soriana",
    "coppel",
    "transportistas",
    "automotriz",
    "chrysler",
    "volkswagen",
    "serviciosDeAviacion",
    "altosHornos",
    "edoCuentaBanco"
})
public class TComprobanteEx {

    @XmlElement(name = "DatosDeNegocio")
    protected TComprobanteEx.DatosDeNegocio datosDeNegocio;
    @XmlElement(name = "DatosDeIntercambio")
    protected TComprobanteEx.DatosDeIntercambio datosDeIntercambio;
    @XmlElement(name = "DatosComerciales")
    protected TComprobanteEx.DatosComerciales datosComerciales;
    @XmlElement(name = "TerminosDePago", required = true)
    protected TComprobanteEx.TerminosDePago terminosDePago;
    @XmlElement(name = "DescuentosPorProntoPago")
    protected TComprobanteEx.DescuentosPorProntoPago descuentosPorProntoPago;
    @XmlElement(name = "DatosDeEmbarque")
    protected TComprobanteEx.DatosDeEmbarque datosDeEmbarque;
    @XmlElement(name = "DatosAdicionalesDeEmisor")
    protected TDatosAdicionales datosAdicionalesDeEmisor;
    @XmlElement(name = "DatosAdicionalesDeReceptor")
    protected TDatosAdicionales datosAdicionalesDeReceptor;
    @XmlElement(name = "ReferenciasBancarias")
    protected TComprobanteEx.ReferenciasBancarias referenciasBancarias;
    @XmlElement(name = "DocumentosReferenciados")
    protected TComprobanteEx.DocumentosReferenciados documentosReferenciados;
    @XmlElement(name = "ImportesDesglosados")
    protected TComprobanteEx.ImportesDesglosados importesDesglosados;
    @XmlElement(name = "Peso")
    protected TWeight peso;
    @XmlElement(name = "Volumen")
    protected TVolume volumen;
    @XmlElement(name = "TotalCajas")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalCajas;
    @XmlElement(name = "TotalPiezas")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalPiezas;
    @XmlElement(name = "Cotizaciones")
    protected TComprobanteEx.Cotizaciones cotizaciones;
    @XmlElement(name = "TextosDeCabecera")
    protected TTextoLibre textosDeCabecera;
    @XmlElement(name = "TextosDePie")
    protected TTextoLibre textosDePie;
    @XmlElement(name = "Mapfre")
    protected TMTECabecera mapfre;
    @XmlElement(name = "Hotel")
    protected TComprobanteEx.Hotel hotel;
    @XmlElement(name = "Soriana")
    protected TComprobanteEx.Soriana soriana;
    @XmlElement(name = "Coppel")
    protected TComprobanteEx.Coppel coppel;
    @XmlElement(name = "Transportistas")
    protected TComprobanteEx.Transportistas transportistas;
    @XmlElement(name = "Automotriz")
    protected TComprobanteEx.Automotriz automotriz;
    @XmlElement(name = "Chrysler")
    protected TComprobanteEx.Chrysler chrysler;
    @XmlElement(name = "Volkswagen")
    protected TComprobanteEx.Volkswagen volkswagen;
    @XmlElement(name = "ServiciosDeAviacion")
    protected TComprobanteEx.ServiciosDeAviacion serviciosDeAviacion;
    @XmlElement(name = "AltosHornos")
    protected TComprobanteEx.AltosHornos altosHornos;
    @XmlElement(name = "EdoCuentaBanco")
    protected TComprobanteEx.EdoCuentaBanco edoCuentaBanco;

    /**
     * Obtiene el valor de la propiedad datosDeNegocio.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.DatosDeNegocio }
     *     
     */
    public TComprobanteEx.DatosDeNegocio getDatosDeNegocio() {
        return datosDeNegocio;
    }

    /**
     * Define el valor de la propiedad datosDeNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.DatosDeNegocio }
     *     
     */
    public void setDatosDeNegocio(TComprobanteEx.DatosDeNegocio value) {
        this.datosDeNegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad datosDeIntercambio.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.DatosDeIntercambio }
     *     
     */
    public TComprobanteEx.DatosDeIntercambio getDatosDeIntercambio() {
        return datosDeIntercambio;
    }

    /**
     * Define el valor de la propiedad datosDeIntercambio.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.DatosDeIntercambio }
     *     
     */
    public void setDatosDeIntercambio(TComprobanteEx.DatosDeIntercambio value) {
        this.datosDeIntercambio = value;
    }

    /**
     * Obtiene el valor de la propiedad datosComerciales.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.DatosComerciales }
     *     
     */
    public TComprobanteEx.DatosComerciales getDatosComerciales() {
        return datosComerciales;
    }

    /**
     * Define el valor de la propiedad datosComerciales.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.DatosComerciales }
     *     
     */
    public void setDatosComerciales(TComprobanteEx.DatosComerciales value) {
        this.datosComerciales = value;
    }

    /**
     * Obtiene el valor de la propiedad terminosDePago.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.TerminosDePago }
     *     
     */
    public TComprobanteEx.TerminosDePago getTerminosDePago() {
        return terminosDePago;
    }

    /**
     * Define el valor de la propiedad terminosDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.TerminosDePago }
     *     
     */
    public void setTerminosDePago(TComprobanteEx.TerminosDePago value) {
        this.terminosDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad descuentosPorProntoPago.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.DescuentosPorProntoPago }
     *     
     */
    public TComprobanteEx.DescuentosPorProntoPago getDescuentosPorProntoPago() {
        return descuentosPorProntoPago;
    }

    /**
     * Define el valor de la propiedad descuentosPorProntoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.DescuentosPorProntoPago }
     *     
     */
    public void setDescuentosPorProntoPago(TComprobanteEx.DescuentosPorProntoPago value) {
        this.descuentosPorProntoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad datosDeEmbarque.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.DatosDeEmbarque }
     *     
     */
    public TComprobanteEx.DatosDeEmbarque getDatosDeEmbarque() {
        return datosDeEmbarque;
    }

    /**
     * Define el valor de la propiedad datosDeEmbarque.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.DatosDeEmbarque }
     *     
     */
    public void setDatosDeEmbarque(TComprobanteEx.DatosDeEmbarque value) {
        this.datosDeEmbarque = value;
    }

    /**
     * Obtiene el valor de la propiedad datosAdicionalesDeEmisor.
     * 
     * @return
     *     possible object is
     *     {@link TDatosAdicionales }
     *     
     */
    public TDatosAdicionales getDatosAdicionalesDeEmisor() {
        return datosAdicionalesDeEmisor;
    }

    /**
     * Define el valor de la propiedad datosAdicionalesDeEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link TDatosAdicionales }
     *     
     */
    public void setDatosAdicionalesDeEmisor(TDatosAdicionales value) {
        this.datosAdicionalesDeEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad datosAdicionalesDeReceptor.
     * 
     * @return
     *     possible object is
     *     {@link TDatosAdicionales }
     *     
     */
    public TDatosAdicionales getDatosAdicionalesDeReceptor() {
        return datosAdicionalesDeReceptor;
    }

    /**
     * Define el valor de la propiedad datosAdicionalesDeReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link TDatosAdicionales }
     *     
     */
    public void setDatosAdicionalesDeReceptor(TDatosAdicionales value) {
        this.datosAdicionalesDeReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciasBancarias.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.ReferenciasBancarias }
     *     
     */
    public TComprobanteEx.ReferenciasBancarias getReferenciasBancarias() {
        return referenciasBancarias;
    }

    /**
     * Define el valor de la propiedad referenciasBancarias.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.ReferenciasBancarias }
     *     
     */
    public void setReferenciasBancarias(TComprobanteEx.ReferenciasBancarias value) {
        this.referenciasBancarias = value;
    }

    /**
     * Obtiene el valor de la propiedad documentosReferenciados.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.DocumentosReferenciados }
     *     
     */
    public TComprobanteEx.DocumentosReferenciados getDocumentosReferenciados() {
        return documentosReferenciados;
    }

    /**
     * Define el valor de la propiedad documentosReferenciados.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.DocumentosReferenciados }
     *     
     */
    public void setDocumentosReferenciados(TComprobanteEx.DocumentosReferenciados value) {
        this.documentosReferenciados = value;
    }

    /**
     * Obtiene el valor de la propiedad importesDesglosados.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.ImportesDesglosados }
     *     
     */
    public TComprobanteEx.ImportesDesglosados getImportesDesglosados() {
        return importesDesglosados;
    }

    /**
     * Define el valor de la propiedad importesDesglosados.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.ImportesDesglosados }
     *     
     */
    public void setImportesDesglosados(TComprobanteEx.ImportesDesglosados value) {
        this.importesDesglosados = value;
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
     * Obtiene el valor de la propiedad totalCajas.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCajas() {
        return totalCajas;
    }

    /**
     * Define el valor de la propiedad totalCajas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCajas(BigInteger value) {
        this.totalCajas = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPiezas.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPiezas() {
        return totalPiezas;
    }

    /**
     * Define el valor de la propiedad totalPiezas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPiezas(BigInteger value) {
        this.totalPiezas = value;
    }

    /**
     * Obtiene el valor de la propiedad cotizaciones.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.Cotizaciones }
     *     
     */
    public TComprobanteEx.Cotizaciones getCotizaciones() {
        return cotizaciones;
    }

    /**
     * Define el valor de la propiedad cotizaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.Cotizaciones }
     *     
     */
    public void setCotizaciones(TComprobanteEx.Cotizaciones value) {
        this.cotizaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad textosDeCabecera.
     * 
     * @return
     *     possible object is
     *     {@link TTextoLibre }
     *     
     */
    public TTextoLibre getTextosDeCabecera() {
        return textosDeCabecera;
    }

    /**
     * Define el valor de la propiedad textosDeCabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link TTextoLibre }
     *     
     */
    public void setTextosDeCabecera(TTextoLibre value) {
        this.textosDeCabecera = value;
    }

    /**
     * Obtiene el valor de la propiedad textosDePie.
     * 
     * @return
     *     possible object is
     *     {@link TTextoLibre }
     *     
     */
    public TTextoLibre getTextosDePie() {
        return textosDePie;
    }

    /**
     * Define el valor de la propiedad textosDePie.
     * 
     * @param value
     *     allowed object is
     *     {@link TTextoLibre }
     *     
     */
    public void setTextosDePie(TTextoLibre value) {
        this.textosDePie = value;
    }

    /**
     * Obtiene el valor de la propiedad mapfre.
     * 
     * @return
     *     possible object is
     *     {@link TMTECabecera }
     *     
     */
    public TMTECabecera getMapfre() {
        return mapfre;
    }

    /**
     * Define el valor de la propiedad mapfre.
     * 
     * @param value
     *     allowed object is
     *     {@link TMTECabecera }
     *     
     */
    public void setMapfre(TMTECabecera value) {
        this.mapfre = value;
    }

    /**
     * Obtiene el valor de la propiedad hotel.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.Hotel }
     *     
     */
    public TComprobanteEx.Hotel getHotel() {
        return hotel;
    }

    /**
     * Define el valor de la propiedad hotel.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.Hotel }
     *     
     */
    public void setHotel(TComprobanteEx.Hotel value) {
        this.hotel = value;
    }

    /**
     * Obtiene el valor de la propiedad soriana.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.Soriana }
     *     
     */
    public TComprobanteEx.Soriana getSoriana() {
        return soriana;
    }

    /**
     * Define el valor de la propiedad soriana.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.Soriana }
     *     
     */
    public void setSoriana(TComprobanteEx.Soriana value) {
        this.soriana = value;
    }

    /**
     * Obtiene el valor de la propiedad coppel.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.Coppel }
     *     
     */
    public TComprobanteEx.Coppel getCoppel() {
        return coppel;
    }

    /**
     * Define el valor de la propiedad coppel.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.Coppel }
     *     
     */
    public void setCoppel(TComprobanteEx.Coppel value) {
        this.coppel = value;
    }

    /**
     * Obtiene el valor de la propiedad transportistas.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.Transportistas }
     *     
     */
    public TComprobanteEx.Transportistas getTransportistas() {
        return transportistas;
    }

    /**
     * Define el valor de la propiedad transportistas.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.Transportistas }
     *     
     */
    public void setTransportistas(TComprobanteEx.Transportistas value) {
        this.transportistas = value;
    }

    /**
     * Obtiene el valor de la propiedad automotriz.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.Automotriz }
     *     
     */
    public TComprobanteEx.Automotriz getAutomotriz() {
        return automotriz;
    }

    /**
     * Define el valor de la propiedad automotriz.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.Automotriz }
     *     
     */
    public void setAutomotriz(TComprobanteEx.Automotriz value) {
        this.automotriz = value;
    }

    /**
     * Obtiene el valor de la propiedad chrysler.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.Chrysler }
     *     
     */
    public TComprobanteEx.Chrysler getChrysler() {
        return chrysler;
    }

    /**
     * Define el valor de la propiedad chrysler.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.Chrysler }
     *     
     */
    public void setChrysler(TComprobanteEx.Chrysler value) {
        this.chrysler = value;
    }

    /**
     * Obtiene el valor de la propiedad volkswagen.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.Volkswagen }
     *     
     */
    public TComprobanteEx.Volkswagen getVolkswagen() {
        return volkswagen;
    }

    /**
     * Define el valor de la propiedad volkswagen.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.Volkswagen }
     *     
     */
    public void setVolkswagen(TComprobanteEx.Volkswagen value) {
        this.volkswagen = value;
    }

    /**
     * Obtiene el valor de la propiedad serviciosDeAviacion.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.ServiciosDeAviacion }
     *     
     */
    public TComprobanteEx.ServiciosDeAviacion getServiciosDeAviacion() {
        return serviciosDeAviacion;
    }

    /**
     * Define el valor de la propiedad serviciosDeAviacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.ServiciosDeAviacion }
     *     
     */
    public void setServiciosDeAviacion(TComprobanteEx.ServiciosDeAviacion value) {
        this.serviciosDeAviacion = value;
    }

    /**
     * Obtiene el valor de la propiedad altosHornos.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.AltosHornos }
     *     
     */
    public TComprobanteEx.AltosHornos getAltosHornos() {
        return altosHornos;
    }

    /**
     * Define el valor de la propiedad altosHornos.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.AltosHornos }
     *     
     */
    public void setAltosHornos(TComprobanteEx.AltosHornos value) {
        this.altosHornos = value;
    }

    /**
     * Obtiene el valor de la propiedad edoCuentaBanco.
     * 
     * @return
     *     possible object is
     *     {@link TComprobanteEx.EdoCuentaBanco }
     *     
     */
    public TComprobanteEx.EdoCuentaBanco getEdoCuentaBanco() {
        return edoCuentaBanco;
    }

    /**
     * Define el valor de la propiedad edoCuentaBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link TComprobanteEx.EdoCuentaBanco }
     *     
     */
    public void setEdoCuentaBanco(TComprobanteEx.EdoCuentaBanco value) {
        this.edoCuentaBanco = value;
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
     *         &lt;element name="Documento"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Detalle" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Pedido" maxOccurs="20" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Recepcion" maxOccurs="20" minOccurs="0"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="200"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="HojaServicio" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="Num"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                           &lt;maxLength value="10"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Transporte" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="CtaxPag" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="Ejercicio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Anexos" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Anexo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Clase"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="PE"/&gt;
     *                       &lt;enumeration value="PS"/&gt;
     *                       &lt;enumeration value="PA"/&gt;
     *                       &lt;enumeration value="AS"/&gt;
     *                       &lt;enumeration value="HS"/&gt;
     *                       &lt;enumeration value="FC"/&gt;
     *                       &lt;enumeration value="FV"/&gt;
     *                       &lt;enumeration value="AA"/&gt;
     *                       &lt;enumeration value="CO"/&gt;
     *                       &lt;enumeration value="KT"/&gt;
     *                       &lt;enumeration value="PT"/&gt;
     *                       &lt;enumeration value="AC"/&gt;
     *                       &lt;enumeration value="NC"/&gt;
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
        "documento"
    })
    public static class AltosHornos {

        @XmlElement(name = "Documento", required = true)
        protected TComprobanteEx.AltosHornos.Documento documento;

        /**
         * Obtiene el valor de la propiedad documento.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.AltosHornos.Documento }
         *     
         */
        public TComprobanteEx.AltosHornos.Documento getDocumento() {
            return documento;
        }

        /**
         * Define el valor de la propiedad documento.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.AltosHornos.Documento }
         *     
         */
        public void setDocumento(TComprobanteEx.AltosHornos.Documento value) {
            this.documento = value;
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
         *         &lt;element name="Detalle" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Pedido" maxOccurs="20" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Recepcion" maxOccurs="20" minOccurs="0"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="200"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="HojaServicio" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="Num"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                 &lt;maxLength value="10"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Transporte" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="CtaxPag" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="Ejercicio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Anexos" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Anexo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Clase"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="PE"/&gt;
         *             &lt;enumeration value="PS"/&gt;
         *             &lt;enumeration value="PA"/&gt;
         *             &lt;enumeration value="AS"/&gt;
         *             &lt;enumeration value="HS"/&gt;
         *             &lt;enumeration value="FC"/&gt;
         *             &lt;enumeration value="FV"/&gt;
         *             &lt;enumeration value="AA"/&gt;
         *             &lt;enumeration value="CO"/&gt;
         *             &lt;enumeration value="KT"/&gt;
         *             &lt;enumeration value="PT"/&gt;
         *             &lt;enumeration value="AC"/&gt;
         *             &lt;enumeration value="NC"/&gt;
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
        @XmlType(name = "", propOrder = {
            "detalle",
            "anexos"
        })
        public static class Documento {

            @XmlElement(name = "Detalle")
            protected TComprobanteEx.AltosHornos.Documento.Detalle detalle;
            @XmlElement(name = "Anexos")
            protected TComprobanteEx.AltosHornos.Documento.Anexos anexos;
            @XmlAttribute(name = "Clase")
            protected String clase;

            /**
             * Obtiene el valor de la propiedad detalle.
             * 
             * @return
             *     possible object is
             *     {@link TComprobanteEx.AltosHornos.Documento.Detalle }
             *     
             */
            public TComprobanteEx.AltosHornos.Documento.Detalle getDetalle() {
                return detalle;
            }

            /**
             * Define el valor de la propiedad detalle.
             * 
             * @param value
             *     allowed object is
             *     {@link TComprobanteEx.AltosHornos.Documento.Detalle }
             *     
             */
            public void setDetalle(TComprobanteEx.AltosHornos.Documento.Detalle value) {
                this.detalle = value;
            }

            /**
             * Obtiene el valor de la propiedad anexos.
             * 
             * @return
             *     possible object is
             *     {@link TComprobanteEx.AltosHornos.Documento.Anexos }
             *     
             */
            public TComprobanteEx.AltosHornos.Documento.Anexos getAnexos() {
                return anexos;
            }

            /**
             * Define el valor de la propiedad anexos.
             * 
             * @param value
             *     allowed object is
             *     {@link TComprobanteEx.AltosHornos.Documento.Anexos }
             *     
             */
            public void setAnexos(TComprobanteEx.AltosHornos.Documento.Anexos value) {
                this.anexos = value;
            }

            /**
             * Obtiene el valor de la propiedad clase.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClase() {
                return clase;
            }

            /**
             * Define el valor de la propiedad clase.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClase(String value) {
                this.clase = value;
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
             *         &lt;element name="Anexo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/&gt;
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
                "anexo"
            })
            public static class Anexos {

                @XmlElement(name = "Anexo")
                protected List<String> anexo;

                /**
                 * Gets the value of the anexo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the anexo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAnexo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getAnexo() {
                    if (anexo == null) {
                        anexo = new ArrayList<String>();
                    }
                    return this.anexo;
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
             *         &lt;element name="Pedido" maxOccurs="20" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Recepcion" maxOccurs="20" minOccurs="0"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="200"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="HojaServicio" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="Num"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                       &lt;maxLength value="10"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Transporte" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="CtaxPag" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="Ejercicio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
                "pedido",
                "hojaServicio",
                "transporte",
                "ctaxPag"
            })
            public static class Detalle {

                @XmlElement(name = "Pedido")
                protected List<TComprobanteEx.AltosHornos.Documento.Detalle.Pedido> pedido;
                @XmlElement(name = "HojaServicio")
                protected TComprobanteEx.AltosHornos.Documento.Detalle.HojaServicio hojaServicio;
                @XmlElement(name = "Transporte")
                protected TComprobanteEx.AltosHornos.Documento.Detalle.Transporte transporte;
                @XmlElement(name = "CtaxPag")
                protected TComprobanteEx.AltosHornos.Documento.Detalle.CtaxPag ctaxPag;

                /**
                 * Gets the value of the pedido property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the pedido property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPedido().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TComprobanteEx.AltosHornos.Documento.Detalle.Pedido }
                 * 
                 * 
                 */
                public List<TComprobanteEx.AltosHornos.Documento.Detalle.Pedido> getPedido() {
                    if (pedido == null) {
                        pedido = new ArrayList<TComprobanteEx.AltosHornos.Documento.Detalle.Pedido>();
                    }
                    return this.pedido;
                }

                /**
                 * Obtiene el valor de la propiedad hojaServicio.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TComprobanteEx.AltosHornos.Documento.Detalle.HojaServicio }
                 *     
                 */
                public TComprobanteEx.AltosHornos.Documento.Detalle.HojaServicio getHojaServicio() {
                    return hojaServicio;
                }

                /**
                 * Define el valor de la propiedad hojaServicio.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TComprobanteEx.AltosHornos.Documento.Detalle.HojaServicio }
                 *     
                 */
                public void setHojaServicio(TComprobanteEx.AltosHornos.Documento.Detalle.HojaServicio value) {
                    this.hojaServicio = value;
                }

                /**
                 * Obtiene el valor de la propiedad transporte.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TComprobanteEx.AltosHornos.Documento.Detalle.Transporte }
                 *     
                 */
                public TComprobanteEx.AltosHornos.Documento.Detalle.Transporte getTransporte() {
                    return transporte;
                }

                /**
                 * Define el valor de la propiedad transporte.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TComprobanteEx.AltosHornos.Documento.Detalle.Transporte }
                 *     
                 */
                public void setTransporte(TComprobanteEx.AltosHornos.Documento.Detalle.Transporte value) {
                    this.transporte = value;
                }

                /**
                 * Obtiene el valor de la propiedad ctaxPag.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TComprobanteEx.AltosHornos.Documento.Detalle.CtaxPag }
                 *     
                 */
                public TComprobanteEx.AltosHornos.Documento.Detalle.CtaxPag getCtaxPag() {
                    return ctaxPag;
                }

                /**
                 * Define el valor de la propiedad ctaxPag.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TComprobanteEx.AltosHornos.Documento.Detalle.CtaxPag }
                 *     
                 */
                public void setCtaxPag(TComprobanteEx.AltosHornos.Documento.Detalle.CtaxPag value) {
                    this.ctaxPag = value;
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
                 *       &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="Ejercicio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class CtaxPag {

                    @XmlAttribute(name = "Num")
                    protected String num;
                    @XmlAttribute(name = "Ejercicio")
                    protected String ejercicio;

                    /**
                     * Obtiene el valor de la propiedad num.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNum() {
                        return num;
                    }

                    /**
                     * Define el valor de la propiedad num.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNum(String value) {
                        this.num = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad ejercicio.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEjercicio() {
                        return ejercicio;
                    }

                    /**
                     * Define el valor de la propiedad ejercicio.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEjercicio(String value) {
                        this.ejercicio = value;
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
                 *       &lt;attribute name="Num"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *             &lt;maxLength value="10"/&gt;
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
                public static class HojaServicio {

                    @XmlAttribute(name = "Num")
                    protected String num;

                    /**
                     * Obtiene el valor de la propiedad num.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNum() {
                        return num;
                    }

                    /**
                     * Define el valor de la propiedad num.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNum(String value) {
                        this.num = value;
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
                 *         &lt;element name="Recepcion" maxOccurs="20" minOccurs="0"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="200"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "recepcion"
                })
                public static class Pedido {

                    @XmlElement(name = "Recepcion", nillable = true)
                    protected List<String> recepcion;
                    @XmlAttribute(name = "Num")
                    protected String num;

                    /**
                     * Gets the value of the recepcion property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the recepcion property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRecepcion().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getRecepcion() {
                        if (recepcion == null) {
                            recepcion = new ArrayList<String>();
                        }
                        return this.recepcion;
                    }

                    /**
                     * Obtiene el valor de la propiedad num.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNum() {
                        return num;
                    }

                    /**
                     * Define el valor de la propiedad num.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNum(String value) {
                        this.num = value;
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
                 *       &lt;attribute name="Num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Transporte {

                    @XmlAttribute(name = "Num")
                    protected String num;

                    /**
                     * Obtiene el valor de la propiedad num.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNum() {
                        return num;
                    }

                    /**
                     * Define el valor de la propiedad num.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNum(String value) {
                        this.num = value;
                    }

                }

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
     *         &lt;element name="Vehiculo" type="{http://www.fact.com.mx/schema/fx}TVehiculo" minOccurs="0"/&gt;
     *         &lt;element name="OrdenDeTrabajo" type="{http://www.fact.com.mx/schema/fx}TOrdenDeTrabajo" minOccurs="0"/&gt;
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
        "vehiculo",
        "ordenDeTrabajo"
    })
    public static class Automotriz {

        @XmlElement(name = "Vehiculo")
        protected TVehiculo vehiculo;
        @XmlElement(name = "OrdenDeTrabajo")
        protected TOrdenDeTrabajo ordenDeTrabajo;

        /**
         * Obtiene el valor de la propiedad vehiculo.
         * 
         * @return
         *     possible object is
         *     {@link TVehiculo }
         *     
         */
        public TVehiculo getVehiculo() {
            return vehiculo;
        }

        /**
         * Define el valor de la propiedad vehiculo.
         * 
         * @param value
         *     allowed object is
         *     {@link TVehiculo }
         *     
         */
        public void setVehiculo(TVehiculo value) {
            this.vehiculo = value;
        }

        /**
         * Obtiene el valor de la propiedad ordenDeTrabajo.
         * 
         * @return
         *     possible object is
         *     {@link TOrdenDeTrabajo }
         *     
         */
        public TOrdenDeTrabajo getOrdenDeTrabajo() {
            return ordenDeTrabajo;
        }

        /**
         * Define el valor de la propiedad ordenDeTrabajo.
         * 
         * @param value
         *     allowed object is
         *     {@link TOrdenDeTrabajo }
         *     
         */
        public void setOrdenDeTrabajo(TOrdenDeTrabajo value) {
            this.ordenDeTrabajo = value;
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
     *         &lt;element name="Proveedor" type="{http://www.fact.com.mx/schema/fx}TChryslerLocation"/&gt;
     *         &lt;element name="Origen" type="{http://www.fact.com.mx/schema/fx}TChryslerLocation" minOccurs="0"/&gt;
     *         &lt;element name="Destino" type="{http://www.fact.com.mx/schema/fx}TChryslerLocation" minOccurs="0"/&gt;
     *         &lt;element name="Receiving" type="{http://www.fact.com.mx/schema/fx}TChryslerLocation" minOccurs="0"/&gt;
     *         &lt;choice minOccurs="0"&gt;
     *           &lt;element name="Departamento" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="Numero"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                           &lt;minLength value="1"/&gt;
     *                           &lt;maxLength value="4"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="NumeroCuenta"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                           &lt;minLength value="1"/&gt;
     *                           &lt;maxLength value="7"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="Transportistas" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="Transportista" maxOccurs="15"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="Talon"&gt;
     *                                 &lt;simpleType&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                                     &lt;minLength value="1"/&gt;
     *                                     &lt;maxLength value="15"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/simpleType&gt;
     *                               &lt;/element&gt;
     *                               &lt;element name="NumeroCaja" minOccurs="0"&gt;
     *                                 &lt;simpleType&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                                     &lt;minLength value="1"/&gt;
     *                                     &lt;maxLength value="20"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/simpleType&gt;
     *                               &lt;/element&gt;
     *                               &lt;element name="CodigoTransportista" minOccurs="0"&gt;
     *                                 &lt;simpleType&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                                     &lt;minLength value="1"/&gt;
     *                                     &lt;maxLength value="4"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/simpleType&gt;
     *                               &lt;/element&gt;
     *                               &lt;element name="FechaRecibo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                               &lt;element name="NombreUsuario" minOccurs="0"&gt;
     *                                 &lt;simpleType&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                                     &lt;minLength value="1"/&gt;
     *                                     &lt;maxLength value="50"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/simpleType&gt;
     *                               &lt;/element&gt;
     *                               &lt;element name="DireccionOrigen" minOccurs="0"&gt;
     *                                 &lt;simpleType&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                                     &lt;minLength value="1"/&gt;
     *                                     &lt;maxLength value="150"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/simpleType&gt;
     *                               &lt;/element&gt;
     *                               &lt;element name="DireccionDestino" minOccurs="0"&gt;
     *                                 &lt;simpleType&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                                     &lt;minLength value="1"/&gt;
     *                                     &lt;maxLength value="150"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/simpleType&gt;
     *                               &lt;/element&gt;
     *                             &lt;/sequence&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="Proyecto" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Numero"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="15"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NumeroTrabajo"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="15"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ChargeUnit" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="15"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AETC" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Status"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                         &lt;enumeration value="09"/&gt;
     *                         &lt;enumeration value="10"/&gt;
     *                         &lt;enumeration value="11"/&gt;
     *                         &lt;enumeration value="12"/&gt;
     *                         &lt;enumeration value="13"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Numero"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Responsable"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="15"/&gt;
     *                         &lt;pattern value="CE|SR|CR[\w]{0,13}"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CargosCreditos" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CargoCredito" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ReferenciaChrysler" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
     *                                   &lt;maxLength value="15"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Consecutivo" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
     *                                   &lt;maxLength value="14"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="MontoLinea"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                   &lt;fractionDigits value="2"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Factura" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
     *                                   &lt;maxLength value="15"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Archivo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="3" minOccurs="0"/&gt;
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
        "proveedor",
        "origen",
        "destino",
        "receiving",
        "departamento",
        "transportistas",
        "proyecto",
        "aetc",
        "cargosCreditos"
    })
    public static class Chrysler {

        @XmlElement(name = "Proveedor", required = true)
        protected TChryslerLocation proveedor;
        @XmlElement(name = "Origen")
        protected TChryslerLocation origen;
        @XmlElement(name = "Destino")
        protected TChryslerLocation destino;
        @XmlElement(name = "Receiving")
        protected TChryslerLocation receiving;
        @XmlElement(name = "Departamento")
        protected TComprobanteEx.Chrysler.Departamento departamento;
        @XmlElement(name = "Transportistas")
        protected TComprobanteEx.Chrysler.Transportistas transportistas;
        @XmlElement(name = "Proyecto")
        protected TComprobanteEx.Chrysler.Proyecto proyecto;
        @XmlElement(name = "AETC")
        protected TComprobanteEx.Chrysler.AETC aetc;
        @XmlElement(name = "CargosCreditos")
        protected TComprobanteEx.Chrysler.CargosCreditos cargosCreditos;

        /**
         * Obtiene el valor de la propiedad proveedor.
         * 
         * @return
         *     possible object is
         *     {@link TChryslerLocation }
         *     
         */
        public TChryslerLocation getProveedor() {
            return proveedor;
        }

        /**
         * Define el valor de la propiedad proveedor.
         * 
         * @param value
         *     allowed object is
         *     {@link TChryslerLocation }
         *     
         */
        public void setProveedor(TChryslerLocation value) {
            this.proveedor = value;
        }

        /**
         * Obtiene el valor de la propiedad origen.
         * 
         * @return
         *     possible object is
         *     {@link TChryslerLocation }
         *     
         */
        public TChryslerLocation getOrigen() {
            return origen;
        }

        /**
         * Define el valor de la propiedad origen.
         * 
         * @param value
         *     allowed object is
         *     {@link TChryslerLocation }
         *     
         */
        public void setOrigen(TChryslerLocation value) {
            this.origen = value;
        }

        /**
         * Obtiene el valor de la propiedad destino.
         * 
         * @return
         *     possible object is
         *     {@link TChryslerLocation }
         *     
         */
        public TChryslerLocation getDestino() {
            return destino;
        }

        /**
         * Define el valor de la propiedad destino.
         * 
         * @param value
         *     allowed object is
         *     {@link TChryslerLocation }
         *     
         */
        public void setDestino(TChryslerLocation value) {
            this.destino = value;
        }

        /**
         * Obtiene el valor de la propiedad receiving.
         * 
         * @return
         *     possible object is
         *     {@link TChryslerLocation }
         *     
         */
        public TChryslerLocation getReceiving() {
            return receiving;
        }

        /**
         * Define el valor de la propiedad receiving.
         * 
         * @param value
         *     allowed object is
         *     {@link TChryslerLocation }
         *     
         */
        public void setReceiving(TChryslerLocation value) {
            this.receiving = value;
        }

        /**
         * Obtiene el valor de la propiedad departamento.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.Chrysler.Departamento }
         *     
         */
        public TComprobanteEx.Chrysler.Departamento getDepartamento() {
            return departamento;
        }

        /**
         * Define el valor de la propiedad departamento.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.Chrysler.Departamento }
         *     
         */
        public void setDepartamento(TComprobanteEx.Chrysler.Departamento value) {
            this.departamento = value;
        }

        /**
         * Obtiene el valor de la propiedad transportistas.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.Chrysler.Transportistas }
         *     
         */
        public TComprobanteEx.Chrysler.Transportistas getTransportistas() {
            return transportistas;
        }

        /**
         * Define el valor de la propiedad transportistas.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.Chrysler.Transportistas }
         *     
         */
        public void setTransportistas(TComprobanteEx.Chrysler.Transportistas value) {
            this.transportistas = value;
        }

        /**
         * Obtiene el valor de la propiedad proyecto.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.Chrysler.Proyecto }
         *     
         */
        public TComprobanteEx.Chrysler.Proyecto getProyecto() {
            return proyecto;
        }

        /**
         * Define el valor de la propiedad proyecto.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.Chrysler.Proyecto }
         *     
         */
        public void setProyecto(TComprobanteEx.Chrysler.Proyecto value) {
            this.proyecto = value;
        }

        /**
         * Obtiene el valor de la propiedad aetc.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.Chrysler.AETC }
         *     
         */
        public TComprobanteEx.Chrysler.AETC getAETC() {
            return aetc;
        }

        /**
         * Define el valor de la propiedad aetc.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.Chrysler.AETC }
         *     
         */
        public void setAETC(TComprobanteEx.Chrysler.AETC value) {
            this.aetc = value;
        }

        /**
         * Obtiene el valor de la propiedad cargosCreditos.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.Chrysler.CargosCreditos }
         *     
         */
        public TComprobanteEx.Chrysler.CargosCreditos getCargosCreditos() {
            return cargosCreditos;
        }

        /**
         * Define el valor de la propiedad cargosCreditos.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.Chrysler.CargosCreditos }
         *     
         */
        public void setCargosCreditos(TComprobanteEx.Chrysler.CargosCreditos value) {
            this.cargosCreditos = value;
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
         *         &lt;element name="Status"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *               &lt;enumeration value="09"/&gt;
         *               &lt;enumeration value="10"/&gt;
         *               &lt;enumeration value="11"/&gt;
         *               &lt;enumeration value="12"/&gt;
         *               &lt;enumeration value="13"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Numero"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="20"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Responsable"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="15"/&gt;
         *               &lt;pattern value="CE|SR|CR[\w]{0,13}"/&gt;
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
            "status",
            "numero",
            "responsable"
        })
        public static class AETC {

            @XmlElement(name = "Status", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String status;
            @XmlElement(name = "Numero", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String numero;
            @XmlElement(name = "Responsable", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String responsable;

            /**
             * Obtiene el valor de la propiedad status.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Define el valor de la propiedad status.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Obtiene el valor de la propiedad numero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumero() {
                return numero;
            }

            /**
             * Define el valor de la propiedad numero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumero(String value) {
                this.numero = value;
            }

            /**
             * Obtiene el valor de la propiedad responsable.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResponsable() {
                return responsable;
            }

            /**
             * Define el valor de la propiedad responsable.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResponsable(String value) {
                this.responsable = value;
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
         *         &lt;element name="CargoCredito" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ReferenciaChrysler" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
         *                         &lt;maxLength value="15"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Consecutivo" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
         *                         &lt;maxLength value="14"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="MontoLinea"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                         &lt;fractionDigits value="2"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Factura" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
         *                         &lt;maxLength value="15"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Archivo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="3" minOccurs="0"/&gt;
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
            "cargoCredito"
        })
        public static class CargosCreditos {

            @XmlElement(name = "CargoCredito", required = true)
            protected List<TComprobanteEx.Chrysler.CargosCreditos.CargoCredito> cargoCredito;

            /**
             * Gets the value of the cargoCredito property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cargoCredito property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCargoCredito().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TComprobanteEx.Chrysler.CargosCreditos.CargoCredito }
             * 
             * 
             */
            public List<TComprobanteEx.Chrysler.CargosCreditos.CargoCredito> getCargoCredito() {
                if (cargoCredito == null) {
                    cargoCredito = new ArrayList<TComprobanteEx.Chrysler.CargosCreditos.CargoCredito>();
                }
                return this.cargoCredito;
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
             *         &lt;element name="ReferenciaChrysler" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
             *               &lt;maxLength value="15"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Consecutivo" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
             *               &lt;maxLength value="14"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="MontoLinea"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *               &lt;fractionDigits value="2"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Factura" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCode"&gt;
             *               &lt;maxLength value="15"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Archivo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="3" minOccurs="0"/&gt;
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
                "referenciaChrysler",
                "consecutivo",
                "montoLinea",
                "factura",
                "archivo"
            })
            public static class CargoCredito {

                @XmlElement(name = "ReferenciaChrysler")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String referenciaChrysler;
                @XmlElement(name = "Consecutivo")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String consecutivo;
                @XmlElement(name = "MontoLinea", required = true)
                protected BigDecimal montoLinea;
                @XmlElement(name = "Factura")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String factura;
                @XmlElement(name = "Archivo")
                protected List<byte[]> archivo;

                /**
                 * Obtiene el valor de la propiedad referenciaChrysler.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReferenciaChrysler() {
                    return referenciaChrysler;
                }

                /**
                 * Define el valor de la propiedad referenciaChrysler.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReferenciaChrysler(String value) {
                    this.referenciaChrysler = value;
                }

                /**
                 * Obtiene el valor de la propiedad consecutivo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConsecutivo() {
                    return consecutivo;
                }

                /**
                 * Define el valor de la propiedad consecutivo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConsecutivo(String value) {
                    this.consecutivo = value;
                }

                /**
                 * Obtiene el valor de la propiedad montoLinea.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMontoLinea() {
                    return montoLinea;
                }

                /**
                 * Define el valor de la propiedad montoLinea.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMontoLinea(BigDecimal value) {
                    this.montoLinea = value;
                }

                /**
                 * Obtiene el valor de la propiedad factura.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFactura() {
                    return factura;
                }

                /**
                 * Define el valor de la propiedad factura.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFactura(String value) {
                    this.factura = value;
                }

                /**
                 * Gets the value of the archivo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the archivo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getArchivo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * byte[]
                 * 
                 */
                public List<byte[]> getArchivo() {
                    if (archivo == null) {
                        archivo = new ArrayList<byte[]>();
                    }
                    return this.archivo;
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
         *         &lt;element name="Numero"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="4"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NumeroCuenta"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="7"/&gt;
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
            "numero",
            "numeroCuenta"
        })
        public static class Departamento {

            @XmlElement(name = "Numero", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String numero;
            @XmlElement(name = "NumeroCuenta", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String numeroCuenta;

            /**
             * Obtiene el valor de la propiedad numero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumero() {
                return numero;
            }

            /**
             * Define el valor de la propiedad numero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumero(String value) {
                this.numero = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroCuenta.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroCuenta() {
                return numeroCuenta;
            }

            /**
             * Define el valor de la propiedad numeroCuenta.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroCuenta(String value) {
                this.numeroCuenta = value;
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
         *         &lt;element name="Numero"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="15"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NumeroTrabajo"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="15"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ChargeUnit" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="15"/&gt;
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
            "numero",
            "numeroTrabajo",
            "chargeUnit"
        })
        public static class Proyecto {

            @XmlElement(name = "Numero", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String numero;
            @XmlElement(name = "NumeroTrabajo", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String numeroTrabajo;
            @XmlElement(name = "ChargeUnit")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String chargeUnit;

            /**
             * Obtiene el valor de la propiedad numero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumero() {
                return numero;
            }

            /**
             * Define el valor de la propiedad numero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumero(String value) {
                this.numero = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroTrabajo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroTrabajo() {
                return numeroTrabajo;
            }

            /**
             * Define el valor de la propiedad numeroTrabajo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroTrabajo(String value) {
                this.numeroTrabajo = value;
            }

            /**
             * Obtiene el valor de la propiedad chargeUnit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChargeUnit() {
                return chargeUnit;
            }

            /**
             * Define el valor de la propiedad chargeUnit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChargeUnit(String value) {
                this.chargeUnit = value;
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
         *         &lt;element name="Transportista" maxOccurs="15"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Talon"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="15"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="NumeroCaja" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="20"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="CodigoTransportista" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="4"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="FechaRecibo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                   &lt;element name="NombreUsuario" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="50"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="DireccionOrigen" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="150"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="DireccionDestino" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="150"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
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
            "transportista"
        })
        public static class Transportistas {

            @XmlElement(name = "Transportista", required = true)
            protected List<TComprobanteEx.Chrysler.Transportistas.Transportista> transportista;

            /**
             * Gets the value of the transportista property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the transportista property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTransportista().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TComprobanteEx.Chrysler.Transportistas.Transportista }
             * 
             * 
             */
            public List<TComprobanteEx.Chrysler.Transportistas.Transportista> getTransportista() {
                if (transportista == null) {
                    transportista = new ArrayList<TComprobanteEx.Chrysler.Transportistas.Transportista>();
                }
                return this.transportista;
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
             *         &lt;element name="Talon"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="15"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="NumeroCaja" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="20"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="CodigoTransportista" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="4"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="FechaRecibo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *         &lt;element name="NombreUsuario" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="50"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="DireccionOrigen" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="150"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="DireccionDestino" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="150"/&gt;
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
                "talon",
                "numeroCaja",
                "codigoTransportista",
                "fechaRecibo",
                "nombreUsuario",
                "direccionOrigen",
                "direccionDestino"
            })
            public static class Transportista {

                @XmlElement(name = "Talon", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String talon;
                @XmlElement(name = "NumeroCaja")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String numeroCaja;
                @XmlElement(name = "CodigoTransportista")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String codigoTransportista;
                @XmlElement(name = "FechaRecibo")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar fechaRecibo;
                @XmlElement(name = "NombreUsuario")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String nombreUsuario;
                @XmlElement(name = "DireccionOrigen")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String direccionOrigen;
                @XmlElement(name = "DireccionDestino")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String direccionDestino;

                /**
                 * Obtiene el valor de la propiedad talon.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTalon() {
                    return talon;
                }

                /**
                 * Define el valor de la propiedad talon.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTalon(String value) {
                    this.talon = value;
                }

                /**
                 * Obtiene el valor de la propiedad numeroCaja.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroCaja() {
                    return numeroCaja;
                }

                /**
                 * Define el valor de la propiedad numeroCaja.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroCaja(String value) {
                    this.numeroCaja = value;
                }

                /**
                 * Obtiene el valor de la propiedad codigoTransportista.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodigoTransportista() {
                    return codigoTransportista;
                }

                /**
                 * Define el valor de la propiedad codigoTransportista.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodigoTransportista(String value) {
                    this.codigoTransportista = value;
                }

                /**
                 * Obtiene el valor de la propiedad fechaRecibo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFechaRecibo() {
                    return fechaRecibo;
                }

                /**
                 * Define el valor de la propiedad fechaRecibo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFechaRecibo(XMLGregorianCalendar value) {
                    this.fechaRecibo = value;
                }

                /**
                 * Obtiene el valor de la propiedad nombreUsuario.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNombreUsuario() {
                    return nombreUsuario;
                }

                /**
                 * Define el valor de la propiedad nombreUsuario.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNombreUsuario(String value) {
                    this.nombreUsuario = value;
                }

                /**
                 * Obtiene el valor de la propiedad direccionOrigen.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDireccionOrigen() {
                    return direccionOrigen;
                }

                /**
                 * Define el valor de la propiedad direccionOrigen.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDireccionOrigen(String value) {
                    this.direccionOrigen = value;
                }

                /**
                 * Obtiene el valor de la propiedad direccionDestino.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDireccionDestino() {
                    return direccionDestino;
                }

                /**
                 * Define el valor de la propiedad direccionDestino.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDireccionDestino(String value) {
                    this.direccionDestino = value;
                }

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
     *         &lt;element name="TotalLotes" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *         &lt;element name="RegionCel" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="2"/&gt;
     *               &lt;enumeration value="3"/&gt;
     *               &lt;enumeration value="4"/&gt;
     *               &lt;enumeration value="5"/&gt;
     *               &lt;enumeration value="6"/&gt;
     *               &lt;enumeration value="7"/&gt;
     *               &lt;enumeration value="8"/&gt;
     *               &lt;enumeration value="9"/&gt;
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
        "totalLotes",
        "regionCel"
    })
    public static class Coppel {

        @XmlElement(name = "TotalLotes")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger totalLotes;
        @XmlElement(name = "RegionCel")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String regionCel;

        /**
         * Obtiene el valor de la propiedad totalLotes.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalLotes() {
            return totalLotes;
        }

        /**
         * Define el valor de la propiedad totalLotes.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalLotes(BigInteger value) {
            this.totalLotes = value;
        }

        /**
         * Obtiene el valor de la propiedad regionCel.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegionCel() {
            return regionCel;
        }

        /**
         * Define el valor de la propiedad regionCel.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegionCel(String value) {
            this.regionCel = value;
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
     *         &lt;element name="Cotizacion" maxOccurs="12"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Material"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                         &lt;enumeration value="ORO"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PrecioUnitario" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
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
        "cotizacion"
    })
    public static class Cotizaciones {

        @XmlElement(name = "Cotizacion", required = true)
        protected List<TComprobanteEx.Cotizaciones.Cotizacion> cotizacion;

        /**
         * Gets the value of the cotizacion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cotizacion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCotizacion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TComprobanteEx.Cotizaciones.Cotizacion }
         * 
         * 
         */
        public List<TComprobanteEx.Cotizaciones.Cotizacion> getCotizacion() {
            if (cotizacion == null) {
                cotizacion = new ArrayList<TComprobanteEx.Cotizaciones.Cotizacion>();
            }
            return this.cotizacion;
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
         *         &lt;element name="Material"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *               &lt;enumeration value="ORO"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PrecioUnitario" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount"/&gt;
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
            "precioUnitario"
        })
        public static class Cotizacion {

            @XmlElement(name = "Material", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String material;
            @XmlElement(name = "PrecioUnitario", required = true)
            protected TNonNegativeAmount precioUnitario;

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
             * Obtiene el valor de la propiedad precioUnitario.
             * 
             * @return
             *     possible object is
             *     {@link TNonNegativeAmount }
             *     
             */
            public TNonNegativeAmount getPrecioUnitario() {
                return precioUnitario;
            }

            /**
             * Define el valor de la propiedad precioUnitario.
             * 
             * @param value
             *     allowed object is
             *     {@link TNonNegativeAmount }
             *     
             */
            public void setPrecioUnitario(TNonNegativeAmount value) {
                this.precioUnitario = value;
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
     *         &lt;choice minOccurs="0"&gt;
     *           &lt;element name="RelacionComercial" type="{http://www.fact.com.mx/schema/fx}TRelacionComercial" minOccurs="0"/&gt;
     *           &lt;element name="RfcParaAddendaDeTercero" minOccurs="0"&gt;
     *             &lt;simpleType&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                 &lt;minLength value="12"/&gt;
     *                 &lt;maxLength value="13"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/simpleType&gt;
     *           &lt;/element&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="NumeroDeProveedor" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
     *         &lt;element name="SubAddenda1" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
     *         &lt;element name="SubAddenda2" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
     *         &lt;element name="OrdenDeCompra" type="{http://www.fact.com.mx/schema/fx}TReferenciaCorta" minOccurs="0"/&gt;
     *         &lt;element name="Contrarrecibo" type="{http://www.fact.com.mx/schema/fx}TReferenciaCorta" minOccurs="0"/&gt;
     *         &lt;element name="NumeroDeDepartamento" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
     *         &lt;element name="NumeroDeCliente" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
     *         &lt;element name="OrdenDeVenta" type="{http://www.fact.com.mx/schema/fx}TReferenciaCorta" minOccurs="0"/&gt;
     *         &lt;element name="Contrato" type="{http://www.fact.com.mx/schema/fx}TReferenciaCorta" minOccurs="0"/&gt;
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
        "relacionComercial",
        "rfcParaAddendaDeTercero",
        "numeroDeProveedor",
        "subAddenda1",
        "subAddenda2",
        "ordenDeCompra",
        "contrarrecibo",
        "numeroDeDepartamento",
        "numeroDeCliente",
        "ordenDeVenta",
        "contrato"
    })
    public static class DatosComerciales {

        @XmlElement(name = "RelacionComercial")
        @XmlSchemaType(name = "token")
        protected TRelacionComercial relacionComercial;
        @XmlElement(name = "RfcParaAddendaDeTercero")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String rfcParaAddendaDeTercero;
        @XmlElement(name = "NumeroDeProveedor")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String numeroDeProveedor;
        @XmlElement(name = "SubAddenda1")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String subAddenda1;
        @XmlElement(name = "SubAddenda2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String subAddenda2;
        @XmlElement(name = "OrdenDeCompra")
        protected TReferenciaCorta ordenDeCompra;
        @XmlElement(name = "Contrarrecibo")
        protected TReferenciaCorta contrarrecibo;
        @XmlElement(name = "NumeroDeDepartamento")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String numeroDeDepartamento;
        @XmlElement(name = "NumeroDeCliente")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String numeroDeCliente;
        @XmlElement(name = "OrdenDeVenta")
        protected TReferenciaCorta ordenDeVenta;
        @XmlElement(name = "Contrato")
        protected TReferenciaCorta contrato;

        /**
         * Obtiene el valor de la propiedad relacionComercial.
         * 
         * @return
         *     possible object is
         *     {@link TRelacionComercial }
         *     
         */
        public TRelacionComercial getRelacionComercial() {
            return relacionComercial;
        }

        /**
         * Define el valor de la propiedad relacionComercial.
         * 
         * @param value
         *     allowed object is
         *     {@link TRelacionComercial }
         *     
         */
        public void setRelacionComercial(TRelacionComercial value) {
            this.relacionComercial = value;
        }

        /**
         * Obtiene el valor de la propiedad rfcParaAddendaDeTercero.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRfcParaAddendaDeTercero() {
            return rfcParaAddendaDeTercero;
        }

        /**
         * Define el valor de la propiedad rfcParaAddendaDeTercero.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRfcParaAddendaDeTercero(String value) {
            this.rfcParaAddendaDeTercero = value;
        }

        /**
         * Obtiene el valor de la propiedad numeroDeProveedor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroDeProveedor() {
            return numeroDeProveedor;
        }

        /**
         * Define el valor de la propiedad numeroDeProveedor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroDeProveedor(String value) {
            this.numeroDeProveedor = value;
        }

        /**
         * Obtiene el valor de la propiedad subAddenda1.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubAddenda1() {
            return subAddenda1;
        }

        /**
         * Define el valor de la propiedad subAddenda1.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubAddenda1(String value) {
            this.subAddenda1 = value;
        }

        /**
         * Obtiene el valor de la propiedad subAddenda2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubAddenda2() {
            return subAddenda2;
        }

        /**
         * Define el valor de la propiedad subAddenda2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubAddenda2(String value) {
            this.subAddenda2 = value;
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
         * Obtiene el valor de la propiedad contrarrecibo.
         * 
         * @return
         *     possible object is
         *     {@link TReferenciaCorta }
         *     
         */
        public TReferenciaCorta getContrarrecibo() {
            return contrarrecibo;
        }

        /**
         * Define el valor de la propiedad contrarrecibo.
         * 
         * @param value
         *     allowed object is
         *     {@link TReferenciaCorta }
         *     
         */
        public void setContrarrecibo(TReferenciaCorta value) {
            this.contrarrecibo = value;
        }

        /**
         * Obtiene el valor de la propiedad numeroDeDepartamento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroDeDepartamento() {
            return numeroDeDepartamento;
        }

        /**
         * Define el valor de la propiedad numeroDeDepartamento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroDeDepartamento(String value) {
            this.numeroDeDepartamento = value;
        }

        /**
         * Obtiene el valor de la propiedad numeroDeCliente.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroDeCliente() {
            return numeroDeCliente;
        }

        /**
         * Define el valor de la propiedad numeroDeCliente.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroDeCliente(String value) {
            this.numeroDeCliente = value;
        }

        /**
         * Obtiene el valor de la propiedad ordenDeVenta.
         * 
         * @return
         *     possible object is
         *     {@link TReferenciaCorta }
         *     
         */
        public TReferenciaCorta getOrdenDeVenta() {
            return ordenDeVenta;
        }

        /**
         * Define el valor de la propiedad ordenDeVenta.
         * 
         * @param value
         *     allowed object is
         *     {@link TReferenciaCorta }
         *     
         */
        public void setOrdenDeVenta(TReferenciaCorta value) {
            this.ordenDeVenta = value;
        }

        /**
         * Obtiene el valor de la propiedad contrato.
         * 
         * @return
         *     possible object is
         *     {@link TReferenciaCorta }
         *     
         */
        public TReferenciaCorta getContrato() {
            return contrato;
        }

        /**
         * Define el valor de la propiedad contrato.
         * 
         * @param value
         *     allowed object is
         *     {@link TReferenciaCorta }
         *     
         */
        public void setContrato(TReferenciaCorta value) {
            this.contrato = value;
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
     *         &lt;element name="LugarDeExpedicion" type="{http://www.fact.com.mx/schema/fx}TDomicilioComercial" minOccurs="0"/&gt;
     *         &lt;element name="LugarDeEntrega" type="{http://www.fact.com.mx/schema/fx}TDomicilioComercial" minOccurs="0"/&gt;
     *         &lt;element name="FechaDeEmbarque" type="{http://www.fact.com.mx/schema/fx}TAllowedDate" minOccurs="0"/&gt;
     *         &lt;element name="MetodoDeEmbarque" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="250"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NumeroDeEmbarque" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="64"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NumeroInternoDeEmbarque" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="64"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Entrada" type="{http://www.fact.com.mx/schema/fx}TReferenciaCorta" minOccurs="0"/&gt;
     *         &lt;element name="Remision" type="{http://www.fact.com.mx/schema/fx}TReferenciaCorta" minOccurs="0"/&gt;
     *         &lt;element name="Cita" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
     *         &lt;element name="FechaDeEntrega" type="{http://www.fact.com.mx/schema/fx}TAllowedDate" minOccurs="0"/&gt;
     *         &lt;element name="TransporteACargoDe" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="VENDEDOR"/&gt;
     *               &lt;enumeration value="COMPRADOR"/&gt;
     *               &lt;enumeration value="TERCERO"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Transportista" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="250"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NumeroDeTransporte" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="64"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Origen" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="64"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Destino" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="64"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="INCOTERMS" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="250"/&gt;
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
        "lugarDeExpedicion",
        "lugarDeEntrega",
        "fechaDeEmbarque",
        "metodoDeEmbarque",
        "numeroDeEmbarque",
        "numeroInternoDeEmbarque",
        "entrada",
        "remision",
        "cita",
        "fechaDeEntrega",
        "transporteACargoDe",
        "transportista",
        "numeroDeTransporte",
        "origen",
        "destino",
        "incoterms"
    })
    public static class DatosDeEmbarque {

        @XmlElement(name = "LugarDeExpedicion")
        protected TDomicilioComercial lugarDeExpedicion;
        @XmlElement(name = "LugarDeEntrega")
        protected TDomicilioComercial lugarDeEntrega;
        @XmlElement(name = "FechaDeEmbarque")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaDeEmbarque;
        @XmlElement(name = "MetodoDeEmbarque")
        protected String metodoDeEmbarque;
        @XmlElement(name = "NumeroDeEmbarque")
        protected String numeroDeEmbarque;
        @XmlElement(name = "NumeroInternoDeEmbarque")
        protected String numeroInternoDeEmbarque;
        @XmlElement(name = "Entrada")
        protected TReferenciaCorta entrada;
        @XmlElement(name = "Remision")
        protected TReferenciaCorta remision;
        @XmlElement(name = "Cita")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String cita;
        @XmlElement(name = "FechaDeEntrega")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaDeEntrega;
        @XmlElement(name = "TransporteACargoDe")
        protected String transporteACargoDe;
        @XmlElement(name = "Transportista")
        protected String transportista;
        @XmlElement(name = "NumeroDeTransporte")
        protected String numeroDeTransporte;
        @XmlElement(name = "Origen")
        protected String origen;
        @XmlElement(name = "Destino")
        protected String destino;
        @XmlElement(name = "INCOTERMS")
        protected String incoterms;

        /**
         * Obtiene el valor de la propiedad lugarDeExpedicion.
         * 
         * @return
         *     possible object is
         *     {@link TDomicilioComercial }
         *     
         */
        public TDomicilioComercial getLugarDeExpedicion() {
            return lugarDeExpedicion;
        }

        /**
         * Define el valor de la propiedad lugarDeExpedicion.
         * 
         * @param value
         *     allowed object is
         *     {@link TDomicilioComercial }
         *     
         */
        public void setLugarDeExpedicion(TDomicilioComercial value) {
            this.lugarDeExpedicion = value;
        }

        /**
         * Obtiene el valor de la propiedad lugarDeEntrega.
         * 
         * @return
         *     possible object is
         *     {@link TDomicilioComercial }
         *     
         */
        public TDomicilioComercial getLugarDeEntrega() {
            return lugarDeEntrega;
        }

        /**
         * Define el valor de la propiedad lugarDeEntrega.
         * 
         * @param value
         *     allowed object is
         *     {@link TDomicilioComercial }
         *     
         */
        public void setLugarDeEntrega(TDomicilioComercial value) {
            this.lugarDeEntrega = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaDeEmbarque.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaDeEmbarque() {
            return fechaDeEmbarque;
        }

        /**
         * Define el valor de la propiedad fechaDeEmbarque.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaDeEmbarque(XMLGregorianCalendar value) {
            this.fechaDeEmbarque = value;
        }

        /**
         * Obtiene el valor de la propiedad metodoDeEmbarque.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetodoDeEmbarque() {
            return metodoDeEmbarque;
        }

        /**
         * Define el valor de la propiedad metodoDeEmbarque.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetodoDeEmbarque(String value) {
            this.metodoDeEmbarque = value;
        }

        /**
         * Obtiene el valor de la propiedad numeroDeEmbarque.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroDeEmbarque() {
            return numeroDeEmbarque;
        }

        /**
         * Define el valor de la propiedad numeroDeEmbarque.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroDeEmbarque(String value) {
            this.numeroDeEmbarque = value;
        }

        /**
         * Obtiene el valor de la propiedad numeroInternoDeEmbarque.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroInternoDeEmbarque() {
            return numeroInternoDeEmbarque;
        }

        /**
         * Define el valor de la propiedad numeroInternoDeEmbarque.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroInternoDeEmbarque(String value) {
            this.numeroInternoDeEmbarque = value;
        }

        /**
         * Obtiene el valor de la propiedad entrada.
         * 
         * @return
         *     possible object is
         *     {@link TReferenciaCorta }
         *     
         */
        public TReferenciaCorta getEntrada() {
            return entrada;
        }

        /**
         * Define el valor de la propiedad entrada.
         * 
         * @param value
         *     allowed object is
         *     {@link TReferenciaCorta }
         *     
         */
        public void setEntrada(TReferenciaCorta value) {
            this.entrada = value;
        }

        /**
         * Obtiene el valor de la propiedad remision.
         * 
         * @return
         *     possible object is
         *     {@link TReferenciaCorta }
         *     
         */
        public TReferenciaCorta getRemision() {
            return remision;
        }

        /**
         * Define el valor de la propiedad remision.
         * 
         * @param value
         *     allowed object is
         *     {@link TReferenciaCorta }
         *     
         */
        public void setRemision(TReferenciaCorta value) {
            this.remision = value;
        }

        /**
         * Obtiene el valor de la propiedad cita.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCita() {
            return cita;
        }

        /**
         * Define el valor de la propiedad cita.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCita(String value) {
            this.cita = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaDeEntrega.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaDeEntrega() {
            return fechaDeEntrega;
        }

        /**
         * Define el valor de la propiedad fechaDeEntrega.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaDeEntrega(XMLGregorianCalendar value) {
            this.fechaDeEntrega = value;
        }

        /**
         * Obtiene el valor de la propiedad transporteACargoDe.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransporteACargoDe() {
            return transporteACargoDe;
        }

        /**
         * Define el valor de la propiedad transporteACargoDe.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransporteACargoDe(String value) {
            this.transporteACargoDe = value;
        }

        /**
         * Obtiene el valor de la propiedad transportista.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportista() {
            return transportista;
        }

        /**
         * Define el valor de la propiedad transportista.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransportista(String value) {
            this.transportista = value;
        }

        /**
         * Obtiene el valor de la propiedad numeroDeTransporte.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroDeTransporte() {
            return numeroDeTransporte;
        }

        /**
         * Define el valor de la propiedad numeroDeTransporte.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroDeTransporte(String value) {
            this.numeroDeTransporte = value;
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
         * Obtiene el valor de la propiedad destino.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestino() {
            return destino;
        }

        /**
         * Define el valor de la propiedad destino.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestino(String value) {
            this.destino = value;
        }

        /**
         * Obtiene el valor de la propiedad incoterms.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINCOTERMS() {
            return incoterms;
        }

        /**
         * Define el valor de la propiedad incoterms.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINCOTERMS(String value) {
            this.incoterms = value;
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
     *         &lt;element name="SenderId" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
     *         &lt;element name="ReceiverId" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
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
        "senderId",
        "receiverId"
    })
    public static class DatosDeIntercambio {

        @XmlElement(name = "SenderId", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String senderId;
        @XmlElement(name = "ReceiverId", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String receiverId;

        /**
         * Obtiene el valor de la propiedad senderId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSenderId() {
            return senderId;
        }

        /**
         * Define el valor de la propiedad senderId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSenderId(String value) {
            this.senderId = value;
        }

        /**
         * Obtiene el valor de la propiedad receiverId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceiverId() {
            return receiverId;
        }

        /**
         * Define el valor de la propiedad receiverId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceiverId(String value) {
            this.receiverId = value;
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
     *         &lt;element name="Division" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="128"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LineaDeNegocio" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="128"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Region" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="128"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Sucursal" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="128"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Ejecutivo" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="128"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ElaboradoPor" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="128"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Vendedor" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="128"/&gt;
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
        "division",
        "lineaDeNegocio",
        "region",
        "sucursal",
        "ejecutivo",
        "elaboradoPor",
        "vendedor"
    })
    public static class DatosDeNegocio {

        @XmlElement(name = "Division")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String division;
        @XmlElement(name = "LineaDeNegocio")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String lineaDeNegocio;
        @XmlElement(name = "Region")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String region=null;
        @XmlElement(name = "Sucursal")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String sucursal;
        @XmlElement(name = "Ejecutivo")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String ejecutivo;
        @XmlElement(name = "ElaboradoPor")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String elaboradoPor;
        @XmlElement(name = "Vendedor")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String vendedor;

        /**
         * Obtiene el valor de la propiedad division.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDivision() {
            return division;
        }

        /**
         * Define el valor de la propiedad division.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDivision(String value) {
            this.division = value;
        }

        /**
         * Obtiene el valor de la propiedad lineaDeNegocio.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLineaDeNegocio() {
            return lineaDeNegocio;
        }

        /**
         * Define el valor de la propiedad lineaDeNegocio.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLineaDeNegocio(String value) {
            this.lineaDeNegocio = value;
        }

        /**
         * Obtiene el valor de la propiedad region.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegion() {
            return region;
        }

        /**
         * Define el valor de la propiedad region.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegion(String value) {
            this.region = value;
        }

        /**
         * Obtiene el valor de la propiedad sucursal.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSucursal() {
            return sucursal;
        }

        /**
         * Define el valor de la propiedad sucursal.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSucursal(String value) {
            this.sucursal = value;
        }

        /**
         * Obtiene el valor de la propiedad ejecutivo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEjecutivo() {
            return ejecutivo;
        }

        /**
         * Define el valor de la propiedad ejecutivo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEjecutivo(String value) {
            this.ejecutivo = value;
        }

        /**
         * Obtiene el valor de la propiedad elaboradoPor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getElaboradoPor() {
            return elaboradoPor;
        }

        /**
         * Define el valor de la propiedad elaboradoPor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setElaboradoPor(String value) {
            this.elaboradoPor = value;
        }

        /**
         * Obtiene el valor de la propiedad vendedor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendedor() {
            return vendedor;
        }

        /**
         * Define el valor de la propiedad vendedor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendedor(String value) {
            this.vendedor = value;
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
     *         &lt;element name="Descuento" type="{http://www.fact.com.mx/schema/fx}TDescuentoPPP" maxOccurs="6"/&gt;
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
        "descuento"
    })
    public static class DescuentosPorProntoPago {

        @XmlElement(name = "Descuento", required = true)
        protected List<TDescuentoPPP> descuento;

        /**
         * Gets the value of the descuento property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the descuento property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescuento().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TDescuentoPPP }
         * 
         * 
         */
        public List<TDescuentoPPP> getDescuento() {
            if (descuento == null) {
                descuento = new ArrayList<TDescuentoPPP>();
            }
            return this.descuento;
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
     *         &lt;element name="Documento" type="{http://www.fact.com.mx/schema/fx}TDocumentoReferenciado" maxOccurs="32"/&gt;
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
        "documento"
    })
    public static class DocumentosReferenciados {

        @XmlElement(name = "Documento", required = true)
        protected List<TDocumentoReferenciado> documento;

        /**
         * Gets the value of the documento property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documento property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumento().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TDocumentoReferenciado }
         * 
         * 
         */
        public List<TDocumentoReferenciado> getDocumento() {
            if (documento == null) {
                documento = new ArrayList<TDocumentoReferenciado>();
            }
            return this.documento;
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
     *         &lt;element name="Encabezado" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NumeroCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CodigoBarras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CodigoQR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TipoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TipoPublicidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TituloEstadoDeCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DetalleInicial" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TasaInteresOrdinaria" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="InteresesEfectivamentePagados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="ComisionesEfectivamenteCobradas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="SaldoAlCorte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="PagoParaNoGenerarIntereses" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="PagoMinimo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="FechaLimiteDePago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MontoAPagar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ResumenDeCuenta" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ClienteNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TarjetaNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LimiteDeCredito" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="CreditoDisponible" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="FechaDeCorte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DiasTranscurridosEnElCiclo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="PeriodoAlQueCorresponde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ComprasPlazosPromociones" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="SaldoVencido" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="Sobregiro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="Graficos" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence minOccurs="0"&gt;
     *                             &lt;element name="Grafico" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence minOccurs="0"&gt;
     *                                       &lt;element name="Datos" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="valor" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                                               &lt;attribute name="etiqueta" use="required"&gt;
     *                                                 &lt;simpleType&gt;
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                     &lt;maxLength value="50"/&gt;
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
     *         &lt;element name="ResumenDeSaldo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SaldoAnterior" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="Pagos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="OtrosAbonos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="Debitos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="Compras" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="Intereses" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="Comisiones" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="DisposicionesEnEfectivo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="IVA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="SaldoNuevo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ResumenDeIntereses" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SaldoPromedio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="TasaInteresAnual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="TasaInteresMensual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="InteresesGravados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="InteresesExentos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Comisiones" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CuotasYComisiones" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="CargoPorDisposicionEfectivo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="ComisionPagoTardio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="ComisionReposicionTarjeta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="Anualidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DetalleMovimientos" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FechaTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FechaDeCargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NumeroReferencia" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="50"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Conceptos" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence minOccurs="0"&gt;
     *                             &lt;element name="InfoExtra" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Depositos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="Retiros" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Publicidad" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Identificador" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Linea" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
     *         &lt;element name="Productos" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ConsucuentaBasica" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Resumen" type="{http://www.fact.com.mx/schema/fx}ResumenType" minOccurs="0"/&gt;
     *                             &lt;element name="Detalle" type="{http://www.fact.com.mx/schema/fx}DetalleType1" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ConsuinversionVista" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Resumen" type="{http://www.fact.com.mx/schema/fx}ResumenType" minOccurs="0"/&gt;
     *                             &lt;element name="Detalle" type="{http://www.fact.com.mx/schema/fx}DetalleType1" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ConsupagarePRLV" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Resumen" type="{http://www.fact.com.mx/schema/fx}ResumenType"/&gt;
     *                             &lt;element name="Detalle" type="{http://www.fact.com.mx/schema/fx}DetalleType2"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ConsuinversionCEDE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Resumen" type="{http://www.fact.com.mx/schema/fx}ResumenType" minOccurs="0"/&gt;
     *                             &lt;element name="Detalle" type="{http://www.fact.com.mx/schema/fx}DetalleType2" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="TotalProductos" type="{http://www.fact.com.mx/schema/fx}ResumenType" minOccurs="0"/&gt;
     *                   &lt;element name="Grafica" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Abonos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="Retiros" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="OtrosCargos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "encabezado",
        "detalleInicial",
        "resumenDeCuenta",
        "resumenDeSaldo",
        "resumenDeIntereses",
        "comisiones",
        "detalleMovimientos",
        "publicidad",
        "productos"
    })
    public static class EdoCuentaBanco {

        @XmlElement(name = "Encabezado")
        protected TComprobanteEx.EdoCuentaBanco.Encabezado encabezado;
        @XmlElement(name = "DetalleInicial")
        protected TComprobanteEx.EdoCuentaBanco.DetalleInicial detalleInicial;
        @XmlElement(name = "ResumenDeCuenta")
        protected TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta resumenDeCuenta;
        @XmlElement(name = "ResumenDeSaldo")
        protected TComprobanteEx.EdoCuentaBanco.ResumenDeSaldo resumenDeSaldo;
        @XmlElement(name = "ResumenDeIntereses")
        protected TComprobanteEx.EdoCuentaBanco.ResumenDeIntereses resumenDeIntereses;
        @XmlElement(name = "Comisiones")
        protected TComprobanteEx.EdoCuentaBanco.Comisiones comisiones;
        @XmlElement(name = "DetalleMovimientos")
        protected List<TComprobanteEx.EdoCuentaBanco.DetalleMovimientos> detalleMovimientos;
        @XmlElement(name = "Publicidad")
        protected TComprobanteEx.EdoCuentaBanco.Publicidad publicidad;
        @XmlElement(name = "Productos")
        protected TComprobanteEx.EdoCuentaBanco.Productos productos;

        /**
         * Obtiene el valor de la propiedad encabezado.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.EdoCuentaBanco.Encabezado }
         *     
         */
        public TComprobanteEx.EdoCuentaBanco.Encabezado getEncabezado() {
            return encabezado;
        }

        /**
         * Define el valor de la propiedad encabezado.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.EdoCuentaBanco.Encabezado }
         *     
         */
        public void setEncabezado(TComprobanteEx.EdoCuentaBanco.Encabezado value) {
            this.encabezado = value;
        }

        /**
         * Obtiene el valor de la propiedad detalleInicial.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.EdoCuentaBanco.DetalleInicial }
         *     
         */
        public TComprobanteEx.EdoCuentaBanco.DetalleInicial getDetalleInicial() {
            return detalleInicial;
        }

        /**
         * Define el valor de la propiedad detalleInicial.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.EdoCuentaBanco.DetalleInicial }
         *     
         */
        public void setDetalleInicial(TComprobanteEx.EdoCuentaBanco.DetalleInicial value) {
            this.detalleInicial = value;
        }

        /**
         * Obtiene el valor de la propiedad resumenDeCuenta.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta }
         *     
         */
        public TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta getResumenDeCuenta() {
            return resumenDeCuenta;
        }

        /**
         * Define el valor de la propiedad resumenDeCuenta.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta }
         *     
         */
        public void setResumenDeCuenta(TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta value) {
            this.resumenDeCuenta = value;
        }

        /**
         * Obtiene el valor de la propiedad resumenDeSaldo.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.EdoCuentaBanco.ResumenDeSaldo }
         *     
         */
        public TComprobanteEx.EdoCuentaBanco.ResumenDeSaldo getResumenDeSaldo() {
            return resumenDeSaldo;
        }

        /**
         * Define el valor de la propiedad resumenDeSaldo.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.EdoCuentaBanco.ResumenDeSaldo }
         *     
         */
        public void setResumenDeSaldo(TComprobanteEx.EdoCuentaBanco.ResumenDeSaldo value) {
            this.resumenDeSaldo = value;
        }

        /**
         * Obtiene el valor de la propiedad resumenDeIntereses.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.EdoCuentaBanco.ResumenDeIntereses }
         *     
         */
        public TComprobanteEx.EdoCuentaBanco.ResumenDeIntereses getResumenDeIntereses() {
            return resumenDeIntereses;
        }

        /**
         * Define el valor de la propiedad resumenDeIntereses.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.EdoCuentaBanco.ResumenDeIntereses }
         *     
         */
        public void setResumenDeIntereses(TComprobanteEx.EdoCuentaBanco.ResumenDeIntereses value) {
            this.resumenDeIntereses = value;
        }

        /**
         * Obtiene el valor de la propiedad comisiones.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.EdoCuentaBanco.Comisiones }
         *     
         */
        public TComprobanteEx.EdoCuentaBanco.Comisiones getComisiones() {
            return comisiones;
        }

        /**
         * Define el valor de la propiedad comisiones.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.EdoCuentaBanco.Comisiones }
         *     
         */
        public void setComisiones(TComprobanteEx.EdoCuentaBanco.Comisiones value) {
            this.comisiones = value;
        }

        /**
         * Gets the value of the detalleMovimientos property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detalleMovimientos property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetalleMovimientos().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TComprobanteEx.EdoCuentaBanco.DetalleMovimientos }
         * 
         * 
         */
        public List<TComprobanteEx.EdoCuentaBanco.DetalleMovimientos> getDetalleMovimientos() {
            if (detalleMovimientos == null) {
                detalleMovimientos = new ArrayList<TComprobanteEx.EdoCuentaBanco.DetalleMovimientos>();
            }
            return this.detalleMovimientos;
        }

        /**
         * Obtiene el valor de la propiedad publicidad.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.EdoCuentaBanco.Publicidad }
         *     
         */
        public TComprobanteEx.EdoCuentaBanco.Publicidad getPublicidad() {
            return publicidad;
        }

        /**
         * Define el valor de la propiedad publicidad.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.EdoCuentaBanco.Publicidad }
         *     
         */
        public void setPublicidad(TComprobanteEx.EdoCuentaBanco.Publicidad value) {
            this.publicidad = value;
        }

        /**
         * Obtiene el valor de la propiedad productos.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.EdoCuentaBanco.Productos }
         *     
         */
        public TComprobanteEx.EdoCuentaBanco.Productos getProductos() {
            return productos;
        }

        /**
         * Define el valor de la propiedad productos.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.EdoCuentaBanco.Productos }
         *     
         */
        public void setProductos(TComprobanteEx.EdoCuentaBanco.Productos value) {
            this.productos = value;
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
         *         &lt;element name="CuotasYComisiones" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="CargoPorDisposicionEfectivo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="ComisionPagoTardio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="ComisionReposicionTarjeta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="Anualidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
            "cuotasYComisiones",
            "cargoPorDisposicionEfectivo",
            "comisionPagoTardio",
            "comisionReposicionTarjeta",
            "anualidad",
            "total"
        })
        public static class Comisiones {

            @XmlElement(name = "CuotasYComisiones")
            protected BigDecimal cuotasYComisiones;
            @XmlElement(name = "CargoPorDisposicionEfectivo")
            protected BigDecimal cargoPorDisposicionEfectivo;
            @XmlElement(name = "ComisionPagoTardio")
            protected BigDecimal comisionPagoTardio;
            @XmlElement(name = "ComisionReposicionTarjeta")
            protected BigDecimal comisionReposicionTarjeta;
            @XmlElement(name = "Anualidad")
            protected BigDecimal anualidad;
            @XmlElement(name = "Total")
            protected BigDecimal total;

            /**
             * Obtiene el valor de la propiedad cuotasYComisiones.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCuotasYComisiones() {
                return cuotasYComisiones;
            }

            /**
             * Define el valor de la propiedad cuotasYComisiones.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCuotasYComisiones(BigDecimal value) {
                this.cuotasYComisiones = value;
            }

            /**
             * Obtiene el valor de la propiedad cargoPorDisposicionEfectivo.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCargoPorDisposicionEfectivo() {
                return cargoPorDisposicionEfectivo;
            }

            /**
             * Define el valor de la propiedad cargoPorDisposicionEfectivo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCargoPorDisposicionEfectivo(BigDecimal value) {
                this.cargoPorDisposicionEfectivo = value;
            }

            /**
             * Obtiene el valor de la propiedad comisionPagoTardio.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getComisionPagoTardio() {
                return comisionPagoTardio;
            }

            /**
             * Define el valor de la propiedad comisionPagoTardio.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setComisionPagoTardio(BigDecimal value) {
                this.comisionPagoTardio = value;
            }

            /**
             * Obtiene el valor de la propiedad comisionReposicionTarjeta.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getComisionReposicionTarjeta() {
                return comisionReposicionTarjeta;
            }

            /**
             * Define el valor de la propiedad comisionReposicionTarjeta.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setComisionReposicionTarjeta(BigDecimal value) {
                this.comisionReposicionTarjeta = value;
            }

            /**
             * Obtiene el valor de la propiedad anualidad.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAnualidad() {
                return anualidad;
            }

            /**
             * Define el valor de la propiedad anualidad.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAnualidad(BigDecimal value) {
                this.anualidad = value;
            }

            /**
             * Obtiene el valor de la propiedad total.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotal() {
                return total;
            }

            /**
             * Define el valor de la propiedad total.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotal(BigDecimal value) {
                this.total = value;
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
         *         &lt;element name="CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TasaInteresOrdinaria" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="InteresesEfectivamentePagados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="ComisionesEfectivamenteCobradas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="SaldoAlCorte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="PagoParaNoGenerarIntereses" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="PagoMinimo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="FechaLimiteDePago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MontoAPagar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "cat",
            "tasaInteresOrdinaria",
            "interesesEfectivamentePagados",
            "comisionesEfectivamenteCobradas",
            "saldoAlCorte",
            "pagoParaNoGenerarIntereses",
            "pagoMinimo",
            "fechaLimiteDePago",
            "montoAPagar"
        })
        public static class DetalleInicial {

            @XmlElement(name = "CAT")
            protected String cat;
            @XmlElement(name = "TasaInteresOrdinaria")
            protected BigDecimal tasaInteresOrdinaria;
            @XmlElement(name = "InteresesEfectivamentePagados")
            protected BigDecimal interesesEfectivamentePagados;
            @XmlElement(name = "ComisionesEfectivamenteCobradas")
            protected BigDecimal comisionesEfectivamenteCobradas;
            @XmlElement(name = "SaldoAlCorte")
            protected BigDecimal saldoAlCorte;
            @XmlElement(name = "PagoParaNoGenerarIntereses")
            protected BigDecimal pagoParaNoGenerarIntereses;
            @XmlElement(name = "PagoMinimo")
            protected BigDecimal pagoMinimo;
            @XmlElement(name = "FechaLimiteDePago")
            protected String fechaLimiteDePago;
            @XmlElement(name = "MontoAPagar")
            protected String montoAPagar;

            /**
             * Obtiene el valor de la propiedad cat.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAT() {
                return cat;
            }

            /**
             * Define el valor de la propiedad cat.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAT(String value) {
                this.cat = value;
            }

            /**
             * Obtiene el valor de la propiedad tasaInteresOrdinaria.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTasaInteresOrdinaria() {
                return tasaInteresOrdinaria;
            }

            /**
             * Define el valor de la propiedad tasaInteresOrdinaria.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTasaInteresOrdinaria(BigDecimal value) {
                this.tasaInteresOrdinaria = value;
            }

            /**
             * Obtiene el valor de la propiedad interesesEfectivamentePagados.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getInteresesEfectivamentePagados() {
                return interesesEfectivamentePagados;
            }

            /**
             * Define el valor de la propiedad interesesEfectivamentePagados.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setInteresesEfectivamentePagados(BigDecimal value) {
                this.interesesEfectivamentePagados = value;
            }

            /**
             * Obtiene el valor de la propiedad comisionesEfectivamenteCobradas.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getComisionesEfectivamenteCobradas() {
                return comisionesEfectivamenteCobradas;
            }

            /**
             * Define el valor de la propiedad comisionesEfectivamenteCobradas.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setComisionesEfectivamenteCobradas(BigDecimal value) {
                this.comisionesEfectivamenteCobradas = value;
            }

            /**
             * Obtiene el valor de la propiedad saldoAlCorte.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSaldoAlCorte() {
                return saldoAlCorte;
            }

            /**
             * Define el valor de la propiedad saldoAlCorte.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSaldoAlCorte(BigDecimal value) {
                this.saldoAlCorte = value;
            }

            /**
             * Obtiene el valor de la propiedad pagoParaNoGenerarIntereses.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPagoParaNoGenerarIntereses() {
                return pagoParaNoGenerarIntereses;
            }

            /**
             * Define el valor de la propiedad pagoParaNoGenerarIntereses.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPagoParaNoGenerarIntereses(BigDecimal value) {
                this.pagoParaNoGenerarIntereses = value;
            }

            /**
             * Obtiene el valor de la propiedad pagoMinimo.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPagoMinimo() {
                return pagoMinimo;
            }

            /**
             * Define el valor de la propiedad pagoMinimo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPagoMinimo(BigDecimal value) {
                this.pagoMinimo = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaLimiteDePago.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaLimiteDePago() {
                return fechaLimiteDePago;
            }

            /**
             * Define el valor de la propiedad fechaLimiteDePago.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaLimiteDePago(String value) {
                this.fechaLimiteDePago = value;
            }

            /**
             * Obtiene el valor de la propiedad montoAPagar.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMontoAPagar() {
                return montoAPagar;
            }

            /**
             * Define el valor de la propiedad montoAPagar.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMontoAPagar(String value) {
                this.montoAPagar = value;
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
         *         &lt;element name="FechaTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FechaDeCargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NumeroReferencia" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="50"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Conceptos" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence minOccurs="0"&gt;
         *                   &lt;element name="InfoExtra" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Depositos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="Retiros" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
            "fechaTransaccion",
            "fechaDeCargo",
            "numeroReferencia",
            "conceptos",
            "monto",
            "folio",
            "depositos",
            "retiros"
        })
        public static class DetalleMovimientos {

            @XmlElement(name = "FechaTransaccion")
            protected String fechaTransaccion;
            @XmlElement(name = "FechaDeCargo")
            protected String fechaDeCargo;
            @XmlElement(name = "NumeroReferencia")
            protected String numeroReferencia;
            @XmlElement(name = "Conceptos")
            protected TComprobanteEx.EdoCuentaBanco.DetalleMovimientos.Conceptos conceptos;
            @XmlElement(name = "Monto")
            protected BigDecimal monto;
            @XmlElement(name = "Folio")
            protected String folio;
            @XmlElement(name = "Depositos")
            protected BigDecimal depositos;
            @XmlElement(name = "Retiros")
            protected BigDecimal retiros;

            /**
             * Obtiene el valor de la propiedad fechaTransaccion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaTransaccion() {
                return fechaTransaccion;
            }

            /**
             * Define el valor de la propiedad fechaTransaccion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaTransaccion(String value) {
                this.fechaTransaccion = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaDeCargo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaDeCargo() {
                return fechaDeCargo;
            }

            /**
             * Define el valor de la propiedad fechaDeCargo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaDeCargo(String value) {
                this.fechaDeCargo = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroReferencia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroReferencia() {
                return numeroReferencia;
            }

            /**
             * Define el valor de la propiedad numeroReferencia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroReferencia(String value) {
                this.numeroReferencia = value;
            }

            /**
             * Obtiene el valor de la propiedad conceptos.
             * 
             * @return
             *     possible object is
             *     {@link TComprobanteEx.EdoCuentaBanco.DetalleMovimientos.Conceptos }
             *     
             */
            public TComprobanteEx.EdoCuentaBanco.DetalleMovimientos.Conceptos getConceptos() {
                return conceptos;
            }

            /**
             * Define el valor de la propiedad conceptos.
             * 
             * @param value
             *     allowed object is
             *     {@link TComprobanteEx.EdoCuentaBanco.DetalleMovimientos.Conceptos }
             *     
             */
            public void setConceptos(TComprobanteEx.EdoCuentaBanco.DetalleMovimientos.Conceptos value) {
                this.conceptos = value;
            }

            /**
             * Obtiene el valor de la propiedad monto.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMonto() {
                return monto;
            }

            /**
             * Define el valor de la propiedad monto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMonto(BigDecimal value) {
                this.monto = value;
            }

            /**
             * Obtiene el valor de la propiedad folio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFolio() {
                return folio;
            }

            /**
             * Define el valor de la propiedad folio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFolio(String value) {
                this.folio = value;
            }

            /**
             * Obtiene el valor de la propiedad depositos.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDepositos() {
                return depositos;
            }

            /**
             * Define el valor de la propiedad depositos.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDepositos(BigDecimal value) {
                this.depositos = value;
            }

            /**
             * Obtiene el valor de la propiedad retiros.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getRetiros() {
                return retiros;
            }

            /**
             * Define el valor de la propiedad retiros.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setRetiros(BigDecimal value) {
                this.retiros = value;
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
             *       &lt;sequence minOccurs="0"&gt;
             *         &lt;element name="InfoExtra" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                "infoExtra"
            })
            public static class Conceptos {

                @XmlElement(name = "InfoExtra")
                protected List<String> infoExtra;

                /**
                 * Gets the value of the infoExtra property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infoExtra property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfoExtra().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getInfoExtra() {
                    if (infoExtra == null) {
                        infoExtra = new ArrayList<String>();
                    }
                    return this.infoExtra;
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
         *         &lt;element name="NumeroCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CodigoBarras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CodigoQR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TipoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TipoPublicidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TituloEstadoDeCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "numeroCliente",
            "codigoBarras",
            "codigoQR",
            "sucursal",
            "telefono",
            "periodo",
            "tipoProducto",
            "tipoPublicidad",
            "tituloEstadoDeCuenta"
        })
        public static class Encabezado {

            @XmlElement(name = "NumeroCliente")
            protected String numeroCliente;
            @XmlElement(name = "CodigoBarras")
            protected String codigoBarras;
            @XmlElement(name = "CodigoQR")
            protected String codigoQR;
            @XmlElement(name = "Sucursal")
            protected String sucursal;
            @XmlElement(name = "Telefono")
            protected String telefono;
            @XmlElement(name = "Periodo")
            protected String periodo;
            @XmlElement(name = "TipoProducto")
            protected String tipoProducto;
            @XmlElement(name = "TipoPublicidad")
            protected String tipoPublicidad;
            @XmlElement(name = "TituloEstadoDeCuenta")
            protected String tituloEstadoDeCuenta;

            /**
             * Obtiene el valor de la propiedad numeroCliente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroCliente() {
                return numeroCliente;
            }

            /**
             * Define el valor de la propiedad numeroCliente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroCliente(String value) {
                this.numeroCliente = value;
            }

            /**
             * Obtiene el valor de la propiedad codigoBarras.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoBarras() {
                return codigoBarras;
            }

            /**
             * Define el valor de la propiedad codigoBarras.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoBarras(String value) {
                this.codigoBarras = value;
            }

            /**
             * Obtiene el valor de la propiedad codigoQR.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoQR() {
                return codigoQR;
            }

            /**
             * Define el valor de la propiedad codigoQR.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoQR(String value) {
                this.codigoQR = value;
            }

            /**
             * Obtiene el valor de la propiedad sucursal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSucursal() {
                return sucursal;
            }

            /**
             * Define el valor de la propiedad sucursal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSucursal(String value) {
                this.sucursal = value;
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

            /**
             * Obtiene el valor de la propiedad periodo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPeriodo() {
                return periodo;
            }

            /**
             * Define el valor de la propiedad periodo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPeriodo(String value) {
                this.periodo = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoProducto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoProducto() {
                return tipoProducto;
            }

            /**
             * Define el valor de la propiedad tipoProducto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoProducto(String value) {
                this.tipoProducto = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoPublicidad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoPublicidad() {
                return tipoPublicidad;
            }

            /**
             * Define el valor de la propiedad tipoPublicidad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoPublicidad(String value) {
                this.tipoPublicidad = value;
            }

            /**
             * Obtiene el valor de la propiedad tituloEstadoDeCuenta.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTituloEstadoDeCuenta() {
                return tituloEstadoDeCuenta;
            }

            /**
             * Define el valor de la propiedad tituloEstadoDeCuenta.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTituloEstadoDeCuenta(String value) {
                this.tituloEstadoDeCuenta = value;
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
         *         &lt;element name="ConsucuentaBasica" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Resumen" type="{http://www.fact.com.mx/schema/fx}ResumenType" minOccurs="0"/&gt;
         *                   &lt;element name="Detalle" type="{http://www.fact.com.mx/schema/fx}DetalleType1" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ConsuinversionVista" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Resumen" type="{http://www.fact.com.mx/schema/fx}ResumenType" minOccurs="0"/&gt;
         *                   &lt;element name="Detalle" type="{http://www.fact.com.mx/schema/fx}DetalleType1" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ConsupagarePRLV" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Resumen" type="{http://www.fact.com.mx/schema/fx}ResumenType"/&gt;
         *                   &lt;element name="Detalle" type="{http://www.fact.com.mx/schema/fx}DetalleType2"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ConsuinversionCEDE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Resumen" type="{http://www.fact.com.mx/schema/fx}ResumenType" minOccurs="0"/&gt;
         *                   &lt;element name="Detalle" type="{http://www.fact.com.mx/schema/fx}DetalleType2" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TotalProductos" type="{http://www.fact.com.mx/schema/fx}ResumenType" minOccurs="0"/&gt;
         *         &lt;element name="Grafica" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Abonos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="Retiros" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="OtrosCargos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
            "consucuentaBasica",
            "consuinversionVista",
            "consupagarePRLV",
            "consuinversionCEDE",
            "totalProductos",
            "grafica"
        })
        public static class Productos {

            @XmlElement(name = "ConsucuentaBasica")
            protected TComprobanteEx.EdoCuentaBanco.Productos.ConsucuentaBasica consucuentaBasica;
            @XmlElement(name = "ConsuinversionVista")
            protected TComprobanteEx.EdoCuentaBanco.Productos.ConsuinversionVista consuinversionVista;
            @XmlElement(name = "ConsupagarePRLV")
            protected TComprobanteEx.EdoCuentaBanco.Productos.ConsupagarePRLV consupagarePRLV;
            @XmlElement(name = "ConsuinversionCEDE")
            protected TComprobanteEx.EdoCuentaBanco.Productos.ConsuinversionCEDE consuinversionCEDE;
            @XmlElement(name = "TotalProductos")
            protected ResumenType totalProductos;
            @XmlElement(name = "Grafica")
            protected TComprobanteEx.EdoCuentaBanco.Productos.Grafica grafica;

            /**
             * Obtiene el valor de la propiedad consucuentaBasica.
             * 
             * @return
             *     possible object is
             *     {@link TComprobanteEx.EdoCuentaBanco.Productos.ConsucuentaBasica }
             *     
             */
            public TComprobanteEx.EdoCuentaBanco.Productos.ConsucuentaBasica getConsucuentaBasica() {
                return consucuentaBasica;
            }

            /**
             * Define el valor de la propiedad consucuentaBasica.
             * 
             * @param value
             *     allowed object is
             *     {@link TComprobanteEx.EdoCuentaBanco.Productos.ConsucuentaBasica }
             *     
             */
            public void setConsucuentaBasica(TComprobanteEx.EdoCuentaBanco.Productos.ConsucuentaBasica value) {
                this.consucuentaBasica = value;
            }

            /**
             * Obtiene el valor de la propiedad consuinversionVista.
             * 
             * @return
             *     possible object is
             *     {@link TComprobanteEx.EdoCuentaBanco.Productos.ConsuinversionVista }
             *     
             */
            public TComprobanteEx.EdoCuentaBanco.Productos.ConsuinversionVista getConsuinversionVista() {
                return consuinversionVista;
            }

            /**
             * Define el valor de la propiedad consuinversionVista.
             * 
             * @param value
             *     allowed object is
             *     {@link TComprobanteEx.EdoCuentaBanco.Productos.ConsuinversionVista }
             *     
             */
            public void setConsuinversionVista(TComprobanteEx.EdoCuentaBanco.Productos.ConsuinversionVista value) {
                this.consuinversionVista = value;
            }

            /**
             * Obtiene el valor de la propiedad consupagarePRLV.
             * 
             * @return
             *     possible object is
             *     {@link TComprobanteEx.EdoCuentaBanco.Productos.ConsupagarePRLV }
             *     
             */
            public TComprobanteEx.EdoCuentaBanco.Productos.ConsupagarePRLV getConsupagarePRLV() {
                return consupagarePRLV;
            }

            /**
             * Define el valor de la propiedad consupagarePRLV.
             * 
             * @param value
             *     allowed object is
             *     {@link TComprobanteEx.EdoCuentaBanco.Productos.ConsupagarePRLV }
             *     
             */
            public void setConsupagarePRLV(TComprobanteEx.EdoCuentaBanco.Productos.ConsupagarePRLV value) {
                this.consupagarePRLV = value;
            }

            /**
             * Obtiene el valor de la propiedad consuinversionCEDE.
             * 
             * @return
             *     possible object is
             *     {@link TComprobanteEx.EdoCuentaBanco.Productos.ConsuinversionCEDE }
             *     
             */
            public TComprobanteEx.EdoCuentaBanco.Productos.ConsuinversionCEDE getConsuinversionCEDE() {
                return consuinversionCEDE;
            }

            /**
             * Define el valor de la propiedad consuinversionCEDE.
             * 
             * @param value
             *     allowed object is
             *     {@link TComprobanteEx.EdoCuentaBanco.Productos.ConsuinversionCEDE }
             *     
             */
            public void setConsuinversionCEDE(TComprobanteEx.EdoCuentaBanco.Productos.ConsuinversionCEDE value) {
                this.consuinversionCEDE = value;
            }

            /**
             * Obtiene el valor de la propiedad totalProductos.
             * 
             * @return
             *     possible object is
             *     {@link ResumenType }
             *     
             */
            public ResumenType getTotalProductos() {
                return totalProductos;
            }

            /**
             * Define el valor de la propiedad totalProductos.
             * 
             * @param value
             *     allowed object is
             *     {@link ResumenType }
             *     
             */
            public void setTotalProductos(ResumenType value) {
                this.totalProductos = value;
            }

            /**
             * Obtiene el valor de la propiedad grafica.
             * 
             * @return
             *     possible object is
             *     {@link TComprobanteEx.EdoCuentaBanco.Productos.Grafica }
             *     
             */
            public TComprobanteEx.EdoCuentaBanco.Productos.Grafica getGrafica() {
                return grafica;
            }

            /**
             * Define el valor de la propiedad grafica.
             * 
             * @param value
             *     allowed object is
             *     {@link TComprobanteEx.EdoCuentaBanco.Productos.Grafica }
             *     
             */
            public void setGrafica(TComprobanteEx.EdoCuentaBanco.Productos.Grafica value) {
                this.grafica = value;
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
             *         &lt;element name="Resumen" type="{http://www.fact.com.mx/schema/fx}ResumenType" minOccurs="0"/&gt;
             *         &lt;element name="Detalle" type="{http://www.fact.com.mx/schema/fx}DetalleType1" minOccurs="0"/&gt;
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
                "resumen",
                "detalle"
            })
            public static class ConsucuentaBasica {

                @XmlElement(name = "Resumen")
                protected ResumenType resumen;
                @XmlElement(name = "Detalle")
                protected DetalleType1 detalle;

                /**
                 * Obtiene el valor de la propiedad resumen.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ResumenType }
                 *     
                 */
                public ResumenType getResumen() {
                    return resumen;
                }

                /**
                 * Define el valor de la propiedad resumen.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ResumenType }
                 *     
                 */
                public void setResumen(ResumenType value) {
                    this.resumen = value;
                }

                /**
                 * Obtiene el valor de la propiedad detalle.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DetalleType1 }
                 *     
                 */
                public DetalleType1 getDetalle() {
                    return detalle;
                }

                /**
                 * Define el valor de la propiedad detalle.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DetalleType1 }
                 *     
                 */
                public void setDetalle(DetalleType1 value) {
                    this.detalle = value;
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
             *         &lt;element name="Resumen" type="{http://www.fact.com.mx/schema/fx}ResumenType" minOccurs="0"/&gt;
             *         &lt;element name="Detalle" type="{http://www.fact.com.mx/schema/fx}DetalleType2" minOccurs="0"/&gt;
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
                "resumen",
                "detalle"
            })
            public static class ConsuinversionCEDE {

                @XmlElement(name = "Resumen")
                protected ResumenType resumen;
                @XmlElement(name = "Detalle")
                protected DetalleType2 detalle;

                /**
                 * Obtiene el valor de la propiedad resumen.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ResumenType }
                 *     
                 */
                public ResumenType getResumen() {
                    return resumen;
                }

                /**
                 * Define el valor de la propiedad resumen.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ResumenType }
                 *     
                 */
                public void setResumen(ResumenType value) {
                    this.resumen = value;
                }

                /**
                 * Obtiene el valor de la propiedad detalle.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DetalleType2 }
                 *     
                 */
                public DetalleType2 getDetalle() {
                    return detalle;
                }

                /**
                 * Define el valor de la propiedad detalle.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DetalleType2 }
                 *     
                 */
                public void setDetalle(DetalleType2 value) {
                    this.detalle = value;
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
             *         &lt;element name="Resumen" type="{http://www.fact.com.mx/schema/fx}ResumenType" minOccurs="0"/&gt;
             *         &lt;element name="Detalle" type="{http://www.fact.com.mx/schema/fx}DetalleType1" minOccurs="0"/&gt;
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
                "resumen",
                "detalle"
            })
            public static class ConsuinversionVista {

                @XmlElement(name = "Resumen")
                protected ResumenType resumen;
                @XmlElement(name = "Detalle")
                protected DetalleType1 detalle;

                /**
                 * Obtiene el valor de la propiedad resumen.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ResumenType }
                 *     
                 */
                public ResumenType getResumen() {
                    return resumen;
                }

                /**
                 * Define el valor de la propiedad resumen.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ResumenType }
                 *     
                 */
                public void setResumen(ResumenType value) {
                    this.resumen = value;
                }

                /**
                 * Obtiene el valor de la propiedad detalle.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DetalleType1 }
                 *     
                 */
                public DetalleType1 getDetalle() {
                    return detalle;
                }

                /**
                 * Define el valor de la propiedad detalle.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DetalleType1 }
                 *     
                 */
                public void setDetalle(DetalleType1 value) {
                    this.detalle = value;
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
             *         &lt;element name="Resumen" type="{http://www.fact.com.mx/schema/fx}ResumenType"/&gt;
             *         &lt;element name="Detalle" type="{http://www.fact.com.mx/schema/fx}DetalleType2"/&gt;
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
                "resumen",
                "detalle"
            })
            public static class ConsupagarePRLV {

                @XmlElement(name = "Resumen", required = true)
                protected ResumenType resumen;
                @XmlElement(name = "Detalle", required = true)
                protected DetalleType2 detalle;

                /**
                 * Obtiene el valor de la propiedad resumen.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ResumenType }
                 *     
                 */
                public ResumenType getResumen() {
                    return resumen;
                }

                /**
                 * Define el valor de la propiedad resumen.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ResumenType }
                 *     
                 */
                public void setResumen(ResumenType value) {
                    this.resumen = value;
                }

                /**
                 * Obtiene el valor de la propiedad detalle.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DetalleType2 }
                 *     
                 */
                public DetalleType2 getDetalle() {
                    return detalle;
                }

                /**
                 * Define el valor de la propiedad detalle.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DetalleType2 }
                 *     
                 */
                public void setDetalle(DetalleType2 value) {
                    this.detalle = value;
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
             *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Abonos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="Retiros" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="OtrosCargos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                "descripcion",
                "abonos",
                "retiros",
                "otrosCargos"
            })
            public static class Grafica {

                @XmlElement(name = "Descripcion")
                protected String descripcion;
                @XmlElement(name = "Abonos")
                protected BigDecimal abonos;
                @XmlElement(name = "Retiros")
                protected BigDecimal retiros;
                @XmlElement(name = "OtrosCargos")
                protected BigDecimal otrosCargos;

                /**
                 * Obtiene el valor de la propiedad descripcion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescripcion() {
                    return descripcion;
                }

                /**
                 * Define el valor de la propiedad descripcion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescripcion(String value) {
                    this.descripcion = value;
                }

                /**
                 * Obtiene el valor de la propiedad abonos.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAbonos() {
                    return abonos;
                }

                /**
                 * Define el valor de la propiedad abonos.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAbonos(BigDecimal value) {
                    this.abonos = value;
                }

                /**
                 * Obtiene el valor de la propiedad retiros.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getRetiros() {
                    return retiros;
                }

                /**
                 * Define el valor de la propiedad retiros.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setRetiros(BigDecimal value) {
                    this.retiros = value;
                }

                /**
                 * Obtiene el valor de la propiedad otrosCargos.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getOtrosCargos() {
                    return otrosCargos;
                }

                /**
                 * Define el valor de la propiedad otrosCargos.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setOtrosCargos(BigDecimal value) {
                    this.otrosCargos = value;
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
         *         &lt;element name="Identificador" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Linea" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "identificador"
        })
        public static class Publicidad {

            @XmlElement(name = "Identificador")
            protected TComprobanteEx.EdoCuentaBanco.Publicidad.Identificador identificador;

            /**
             * Obtiene el valor de la propiedad identificador.
             * 
             * @return
             *     possible object is
             *     {@link TComprobanteEx.EdoCuentaBanco.Publicidad.Identificador }
             *     
             */
            public TComprobanteEx.EdoCuentaBanco.Publicidad.Identificador getIdentificador() {
                return identificador;
            }

            /**
             * Define el valor de la propiedad identificador.
             * 
             * @param value
             *     allowed object is
             *     {@link TComprobanteEx.EdoCuentaBanco.Publicidad.Identificador }
             *     
             */
            public void setIdentificador(TComprobanteEx.EdoCuentaBanco.Publicidad.Identificador value) {
                this.identificador = value;
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
             *         &lt;element name="Linea" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                "linea"
            })
            public static class Identificador {

                @XmlElement(name = "Linea")
                protected List<String> linea;

                /**
                 * Gets the value of the linea property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the linea property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLinea().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getLinea() {
                    if (linea == null) {
                        linea = new ArrayList<String>();
                    }
                    return this.linea;
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
         *         &lt;element name="ClienteNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TarjetaNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LimiteDeCredito" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="CreditoDisponible" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="FechaDeCorte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DiasTranscurridosEnElCiclo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="PeriodoAlQueCorresponde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ComprasPlazosPromociones" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="SaldoVencido" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="Sobregiro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="Graficos" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence minOccurs="0"&gt;
         *                   &lt;element name="Grafico" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence minOccurs="0"&gt;
         *                             &lt;element name="Datos" maxOccurs="unbounded" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="valor" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *                                     &lt;attribute name="etiqueta" use="required"&gt;
         *                                       &lt;simpleType&gt;
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                           &lt;maxLength value="50"/&gt;
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
            "clienteNumero",
            "tarjetaNumero",
            "limiteDeCredito",
            "creditoDisponible",
            "fechaDeCorte",
            "diasTranscurridosEnElCiclo",
            "periodoAlQueCorresponde",
            "comprasPlazosPromociones",
            "saldoVencido",
            "sobregiro",
            "graficos"
        })
        public static class ResumenDeCuenta {

            @XmlElement(name = "ClienteNumero")
            protected String clienteNumero;
            @XmlElement(name = "TarjetaNumero")
            protected String tarjetaNumero;
            @XmlElement(name = "LimiteDeCredito")
            protected BigDecimal limiteDeCredito;
            @XmlElement(name = "CreditoDisponible")
            protected BigDecimal creditoDisponible;
            @XmlElement(name = "FechaDeCorte")
            protected String fechaDeCorte;
            @XmlElement(name = "DiasTranscurridosEnElCiclo")
            protected BigInteger diasTranscurridosEnElCiclo;
            @XmlElement(name = "PeriodoAlQueCorresponde")
            protected String periodoAlQueCorresponde;
            @XmlElement(name = "ComprasPlazosPromociones")
            protected BigDecimal comprasPlazosPromociones;
            @XmlElement(name = "SaldoVencido")
            protected BigDecimal saldoVencido;
            @XmlElement(name = "Sobregiro")
            protected BigDecimal sobregiro;
            @XmlElement(name = "Graficos")
            protected TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta.Graficos graficos;

            /**
             * Obtiene el valor de la propiedad clienteNumero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClienteNumero() {
                return clienteNumero;
            }

            /**
             * Define el valor de la propiedad clienteNumero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClienteNumero(String value) {
                this.clienteNumero = value;
            }

            /**
             * Obtiene el valor de la propiedad tarjetaNumero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTarjetaNumero() {
                return tarjetaNumero;
            }

            /**
             * Define el valor de la propiedad tarjetaNumero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTarjetaNumero(String value) {
                this.tarjetaNumero = value;
            }

            /**
             * Obtiene el valor de la propiedad limiteDeCredito.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLimiteDeCredito() {
                return limiteDeCredito;
            }

            /**
             * Define el valor de la propiedad limiteDeCredito.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLimiteDeCredito(BigDecimal value) {
                this.limiteDeCredito = value;
            }

            /**
             * Obtiene el valor de la propiedad creditoDisponible.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCreditoDisponible() {
                return creditoDisponible;
            }

            /**
             * Define el valor de la propiedad creditoDisponible.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCreditoDisponible(BigDecimal value) {
                this.creditoDisponible = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaDeCorte.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaDeCorte() {
                return fechaDeCorte;
            }

            /**
             * Define el valor de la propiedad fechaDeCorte.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaDeCorte(String value) {
                this.fechaDeCorte = value;
            }

            /**
             * Obtiene el valor de la propiedad diasTranscurridosEnElCiclo.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDiasTranscurridosEnElCiclo() {
                return diasTranscurridosEnElCiclo;
            }

            /**
             * Define el valor de la propiedad diasTranscurridosEnElCiclo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDiasTranscurridosEnElCiclo(BigInteger value) {
                this.diasTranscurridosEnElCiclo = value;
            }

            /**
             * Obtiene el valor de la propiedad periodoAlQueCorresponde.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPeriodoAlQueCorresponde() {
                return periodoAlQueCorresponde;
            }

            /**
             * Define el valor de la propiedad periodoAlQueCorresponde.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPeriodoAlQueCorresponde(String value) {
                this.periodoAlQueCorresponde = value;
            }

            /**
             * Obtiene el valor de la propiedad comprasPlazosPromociones.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getComprasPlazosPromociones() {
                return comprasPlazosPromociones;
            }

            /**
             * Define el valor de la propiedad comprasPlazosPromociones.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setComprasPlazosPromociones(BigDecimal value) {
                this.comprasPlazosPromociones = value;
            }

            /**
             * Obtiene el valor de la propiedad saldoVencido.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSaldoVencido() {
                return saldoVencido;
            }

            /**
             * Define el valor de la propiedad saldoVencido.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSaldoVencido(BigDecimal value) {
                this.saldoVencido = value;
            }

            /**
             * Obtiene el valor de la propiedad sobregiro.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSobregiro() {
                return sobregiro;
            }

            /**
             * Define el valor de la propiedad sobregiro.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSobregiro(BigDecimal value) {
                this.sobregiro = value;
            }

            /**
             * Obtiene el valor de la propiedad graficos.
             * 
             * @return
             *     possible object is
             *     {@link TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta.Graficos }
             *     
             */
            public TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta.Graficos getGraficos() {
                return graficos;
            }

            /**
             * Define el valor de la propiedad graficos.
             * 
             * @param value
             *     allowed object is
             *     {@link TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta.Graficos }
             *     
             */
            public void setGraficos(TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta.Graficos value) {
                this.graficos = value;
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
             *       &lt;sequence minOccurs="0"&gt;
             *         &lt;element name="Grafico" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence minOccurs="0"&gt;
             *                   &lt;element name="Datos" maxOccurs="unbounded" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="valor" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
             *                           &lt;attribute name="etiqueta" use="required"&gt;
             *                             &lt;simpleType&gt;
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                 &lt;maxLength value="50"/&gt;
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
                "grafico"
            })
            public static class Graficos {

                @XmlElement(name = "Grafico")
                protected List<TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta.Graficos.Grafico> grafico;

                /**
                 * Gets the value of the grafico property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the grafico property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getGrafico().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta.Graficos.Grafico }
                 * 
                 * 
                 */
                public List<TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta.Graficos.Grafico> getGrafico() {
                    if (grafico == null) {
                        grafico = new ArrayList<TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta.Graficos.Grafico>();
                    }
                    return this.grafico;
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
                 *       &lt;sequence minOccurs="0"&gt;
                 *         &lt;element name="Datos" maxOccurs="unbounded" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="valor" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
                 *                 &lt;attribute name="etiqueta" use="required"&gt;
                 *                   &lt;simpleType&gt;
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                       &lt;maxLength value="50"/&gt;
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
                    "datos"
                })
                public static class Grafico {

                    @XmlElement(name = "Datos")
                    protected List<TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta.Graficos.Grafico.Datos> datos;

                    /**
                     * Gets the value of the datos property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the datos property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getDatos().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta.Graficos.Grafico.Datos }
                     * 
                     * 
                     */
                    public List<TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta.Graficos.Grafico.Datos> getDatos() {
                        if (datos == null) {
                            datos = new ArrayList<TComprobanteEx.EdoCuentaBanco.ResumenDeCuenta.Graficos.Grafico.Datos>();
                        }
                        return this.datos;
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
                     *       &lt;attribute name="valor" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
                     *       &lt;attribute name="etiqueta" use="required"&gt;
                     *         &lt;simpleType&gt;
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *             &lt;maxLength value="50"/&gt;
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
                    public static class Datos {

                        @XmlAttribute(name = "valor", required = true)
                        protected BigDecimal valor;
                        @XmlAttribute(name = "etiqueta", required = true)
                        protected String etiqueta;

                        /**
                         * Obtiene el valor de la propiedad valor.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getValor() {
                            return valor;
                        }

                        /**
                         * Define el valor de la propiedad valor.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setValor(BigDecimal value) {
                            this.valor = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad etiqueta.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEtiqueta() {
                            return etiqueta;
                        }

                        /**
                         * Define el valor de la propiedad etiqueta.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEtiqueta(String value) {
                            this.etiqueta = value;
                        }

                    }

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
         *         &lt;element name="SaldoPromedio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="TasaInteresAnual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="TasaInteresMensual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="InteresesGravados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="InteresesExentos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
            "saldoPromedio",
            "tasaInteresAnual",
            "tasaInteresMensual",
            "interesesGravados",
            "interesesExentos",
            "total"
        })
        public static class ResumenDeIntereses {

            @XmlElement(name = "SaldoPromedio")
            protected BigDecimal saldoPromedio;
            @XmlElement(name = "TasaInteresAnual")
            protected BigDecimal tasaInteresAnual;
            @XmlElement(name = "TasaInteresMensual")
            protected BigDecimal tasaInteresMensual;
            @XmlElement(name = "InteresesGravados")
            protected BigDecimal interesesGravados;
            @XmlElement(name = "InteresesExentos")
            protected BigDecimal interesesExentos;
            @XmlElement(name = "Total")
            protected BigDecimal total;

            /**
             * Obtiene el valor de la propiedad saldoPromedio.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSaldoPromedio() {
                return saldoPromedio;
            }

            /**
             * Define el valor de la propiedad saldoPromedio.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSaldoPromedio(BigDecimal value) {
                this.saldoPromedio = value;
            }

            /**
             * Obtiene el valor de la propiedad tasaInteresAnual.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTasaInteresAnual() {
                return tasaInteresAnual;
            }

            /**
             * Define el valor de la propiedad tasaInteresAnual.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTasaInteresAnual(BigDecimal value) {
                this.tasaInteresAnual = value;
            }

            /**
             * Obtiene el valor de la propiedad tasaInteresMensual.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTasaInteresMensual() {
                return tasaInteresMensual;
            }

            /**
             * Define el valor de la propiedad tasaInteresMensual.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTasaInteresMensual(BigDecimal value) {
                this.tasaInteresMensual = value;
            }

            /**
             * Obtiene el valor de la propiedad interesesGravados.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getInteresesGravados() {
                return interesesGravados;
            }

            /**
             * Define el valor de la propiedad interesesGravados.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setInteresesGravados(BigDecimal value) {
                this.interesesGravados = value;
            }

            /**
             * Obtiene el valor de la propiedad interesesExentos.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getInteresesExentos() {
                return interesesExentos;
            }

            /**
             * Define el valor de la propiedad interesesExentos.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setInteresesExentos(BigDecimal value) {
                this.interesesExentos = value;
            }

            /**
             * Obtiene el valor de la propiedad total.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotal() {
                return total;
            }

            /**
             * Define el valor de la propiedad total.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotal(BigDecimal value) {
                this.total = value;
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
         *         &lt;element name="SaldoAnterior" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="Pagos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="OtrosAbonos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="Debitos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="Compras" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="Intereses" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="Comisiones" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="DisposicionesEnEfectivo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="IVA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="SaldoNuevo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
            "saldoAnterior",
            "pagos",
            "otrosAbonos",
            "debitos",
            "compras",
            "intereses",
            "comisiones",
            "disposicionesEnEfectivo",
            "iva",
            "saldoNuevo"
        })
        public static class ResumenDeSaldo {

            @XmlElement(name = "SaldoAnterior")
            protected BigDecimal saldoAnterior;
            @XmlElement(name = "Pagos")
            protected BigDecimal pagos;
            @XmlElement(name = "OtrosAbonos")
            protected BigDecimal otrosAbonos;
            @XmlElement(name = "Debitos")
            protected BigDecimal debitos;
            @XmlElement(name = "Compras")
            protected BigDecimal compras;
            @XmlElement(name = "Intereses")
            protected BigDecimal intereses;
            @XmlElement(name = "Comisiones")
            protected BigDecimal comisiones;
            @XmlElement(name = "DisposicionesEnEfectivo")
            protected BigDecimal disposicionesEnEfectivo;
            @XmlElement(name = "IVA")
            protected BigDecimal iva;
            @XmlElement(name = "SaldoNuevo")
            protected BigDecimal saldoNuevo;

            /**
             * Obtiene el valor de la propiedad saldoAnterior.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSaldoAnterior() {
                return saldoAnterior;
            }

            /**
             * Define el valor de la propiedad saldoAnterior.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSaldoAnterior(BigDecimal value) {
                this.saldoAnterior = value;
            }

            /**
             * Obtiene el valor de la propiedad pagos.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPagos() {
                return pagos;
            }

            /**
             * Define el valor de la propiedad pagos.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPagos(BigDecimal value) {
                this.pagos = value;
            }

            /**
             * Obtiene el valor de la propiedad otrosAbonos.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getOtrosAbonos() {
                return otrosAbonos;
            }

            /**
             * Define el valor de la propiedad otrosAbonos.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setOtrosAbonos(BigDecimal value) {
                this.otrosAbonos = value;
            }

            /**
             * Obtiene el valor de la propiedad debitos.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDebitos() {
                return debitos;
            }

            /**
             * Define el valor de la propiedad debitos.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDebitos(BigDecimal value) {
                this.debitos = value;
            }

            /**
             * Obtiene el valor de la propiedad compras.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCompras() {
                return compras;
            }

            /**
             * Define el valor de la propiedad compras.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCompras(BigDecimal value) {
                this.compras = value;
            }

            /**
             * Obtiene el valor de la propiedad intereses.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getIntereses() {
                return intereses;
            }

            /**
             * Define el valor de la propiedad intereses.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setIntereses(BigDecimal value) {
                this.intereses = value;
            }

            /**
             * Obtiene el valor de la propiedad comisiones.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getComisiones() {
                return comisiones;
            }

            /**
             * Define el valor de la propiedad comisiones.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setComisiones(BigDecimal value) {
                this.comisiones = value;
            }

            /**
             * Obtiene el valor de la propiedad disposicionesEnEfectivo.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDisposicionesEnEfectivo() {
                return disposicionesEnEfectivo;
            }

            /**
             * Define el valor de la propiedad disposicionesEnEfectivo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDisposicionesEnEfectivo(BigDecimal value) {
                this.disposicionesEnEfectivo = value;
            }

            /**
             * Obtiene el valor de la propiedad iva.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getIVA() {
                return iva;
            }

            /**
             * Define el valor de la propiedad iva.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setIVA(BigDecimal value) {
                this.iva = value;
            }

            /**
             * Obtiene el valor de la propiedad saldoNuevo.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSaldoNuevo() {
                return saldoNuevo;
            }

            /**
             * Define el valor de la propiedad saldoNuevo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSaldoNuevo(BigDecimal value) {
                this.saldoNuevo = value;
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
     *         &lt;element name="Estancia" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Reserva" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
     *                   &lt;element name="Habitacion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
     *                   &lt;element name="Entrada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *                   &lt;element name="Salida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *                   &lt;element name="NombreHuesped" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
     *                   &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
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
        "estancia"
    })
    public static class Hotel {

        @XmlElement(name = "Estancia")
        protected TComprobanteEx.Hotel.Estancia estancia;

        /**
         * Obtiene el valor de la propiedad estancia.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.Hotel.Estancia }
         *     
         */
        public TComprobanteEx.Hotel.Estancia getEstancia() {
            return estancia;
        }

        /**
         * Define el valor de la propiedad estancia.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.Hotel.Estancia }
         *     
         */
        public void setEstancia(TComprobanteEx.Hotel.Estancia value) {
            this.estancia = value;
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
         *         &lt;element name="Reserva" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
         *         &lt;element name="Habitacion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
         *         &lt;element name="Entrada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
         *         &lt;element name="Salida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
         *         &lt;element name="NombreHuesped" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
         *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
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
            "reserva",
            "habitacion",
            "entrada",
            "salida",
            "nombreHuesped",
            "referencia"
        })
        public static class Estancia {

            @XmlElement(name = "Reserva")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String reserva;
            @XmlElement(name = "Habitacion")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String habitacion;
            @XmlElement(name = "Entrada")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar entrada;
            @XmlElement(name = "Salida")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar salida;
            @XmlElement(name = "NombreHuesped")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String nombreHuesped;
            @XmlElement(name = "Referencia")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String referencia;

            /**
             * Obtiene el valor de la propiedad reserva.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReserva() {
                return reserva;
            }

            /**
             * Define el valor de la propiedad reserva.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReserva(String value) {
                this.reserva = value;
            }

            /**
             * Obtiene el valor de la propiedad habitacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHabitacion() {
                return habitacion;
            }

            /**
             * Define el valor de la propiedad habitacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHabitacion(String value) {
                this.habitacion = value;
            }

            /**
             * Obtiene el valor de la propiedad entrada.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEntrada() {
                return entrada;
            }

            /**
             * Define el valor de la propiedad entrada.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEntrada(XMLGregorianCalendar value) {
                this.entrada = value;
            }

            /**
             * Obtiene el valor de la propiedad salida.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getSalida() {
                return salida;
            }

            /**
             * Define el valor de la propiedad salida.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setSalida(XMLGregorianCalendar value) {
                this.salida = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreHuesped.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreHuesped() {
                return nombreHuesped;
            }

            /**
             * Define el valor de la propiedad nombreHuesped.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreHuesped(String value) {
                this.nombreHuesped = value;
            }

            /**
             * Obtiene el valor de la propiedad referencia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferencia() {
                return referencia;
            }

            /**
             * Define el valor de la propiedad referencia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferencia(String value) {
                this.referencia = value;
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
     *         &lt;element name="Importes" type="{http://www.fact.com.mx/schema/fx}TImportesDesglosados" maxOccurs="32"/&gt;
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
        "importes"
    })
    public static class ImportesDesglosados {

        @XmlElement(name = "Importes", required = true)
        protected List<TImportesDesglosados> importes;

        /**
         * Gets the value of the importes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the importes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImportes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TImportesDesglosados }
         * 
         * 
         */
        public List<TImportesDesglosados> getImportes() {
            if (importes == null) {
                importes = new ArrayList<TImportesDesglosados>();
            }
            return this.importes;
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
     *         &lt;element name="ReferenciaBancaria" type="{http://www.fact.com.mx/schema/fx}TReferenciaBancaria" maxOccurs="unbounded"/&gt;
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
        "referenciaBancaria"
    })
    public static class ReferenciasBancarias {

        @XmlElement(name = "ReferenciaBancaria", required = true)
        protected List<TReferenciaBancaria> referenciaBancaria;

        /**
         * Gets the value of the referenciaBancaria property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the referenciaBancaria property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReferenciaBancaria().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TReferenciaBancaria }
         * 
         * 
         */
        public List<TReferenciaBancaria> getReferenciaBancaria() {
            if (referenciaBancaria == null) {
                referenciaBancaria = new ArrayList<TReferenciaBancaria>();
            }
            return this.referenciaBancaria;
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
     *         &lt;element name="FechaDeOperacion" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="NumeroDeVuelo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Llegada"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *                         &lt;maxLength value="100"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Salida"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *                         &lt;maxLength value="100"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Aeronave" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="100"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Matricula" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="50"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Ruta" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="100"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Estacion" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="100"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="HoraDeLlegada" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
     *         &lt;element name="HoraDeSalida" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
     *         &lt;element name="PasajerosDeLlegada" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *         &lt;element name="PasajerosDeSalida" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *         &lt;element name="CombustibleCargadoLitros" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="Linea" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="3"/&gt;
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
        "fechaDeOperacion",
        "numeroDeVuelo",
        "aeronave",
        "matricula",
        "ruta",
        "estacion",
        "horaDeLlegada",
        "horaDeSalida",
        "pasajerosDeLlegada",
        "pasajerosDeSalida",
        "combustibleCargadoLitros",
        "linea"
    })
    public static class ServiciosDeAviacion {

        @XmlElement(name = "FechaDeOperacion", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaDeOperacion;
        @XmlElement(name = "NumeroDeVuelo")
        protected TComprobanteEx.ServiciosDeAviacion.NumeroDeVuelo numeroDeVuelo;
        @XmlElement(name = "Aeronave")
        protected String aeronave;
        @XmlElement(name = "Matricula")
        protected String matricula;
        @XmlElement(name = "Ruta")
        protected String ruta;
        @XmlElement(name = "Estacion")
        protected String estacion;
        @XmlElement(name = "HoraDeLlegada")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar horaDeLlegada;
        @XmlElement(name = "HoraDeSalida")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar horaDeSalida;
        @XmlElement(name = "PasajerosDeLlegada")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger pasajerosDeLlegada;
        @XmlElement(name = "PasajerosDeSalida")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger pasajerosDeSalida;
        @XmlElement(name = "CombustibleCargadoLitros")
        protected BigDecimal combustibleCargadoLitros;
        @XmlElement(name = "Linea")
        protected String linea;

        /**
         * Obtiene el valor de la propiedad fechaDeOperacion.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaDeOperacion() {
            return fechaDeOperacion;
        }

        /**
         * Define el valor de la propiedad fechaDeOperacion.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaDeOperacion(XMLGregorianCalendar value) {
            this.fechaDeOperacion = value;
        }

        /**
         * Obtiene el valor de la propiedad numeroDeVuelo.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.ServiciosDeAviacion.NumeroDeVuelo }
         *     
         */
        public TComprobanteEx.ServiciosDeAviacion.NumeroDeVuelo getNumeroDeVuelo() {
            return numeroDeVuelo;
        }

        /**
         * Define el valor de la propiedad numeroDeVuelo.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.ServiciosDeAviacion.NumeroDeVuelo }
         *     
         */
        public void setNumeroDeVuelo(TComprobanteEx.ServiciosDeAviacion.NumeroDeVuelo value) {
            this.numeroDeVuelo = value;
        }

        /**
         * Obtiene el valor de la propiedad aeronave.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAeronave() {
            return aeronave;
        }

        /**
         * Define el valor de la propiedad aeronave.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAeronave(String value) {
            this.aeronave = value;
        }

        /**
         * Obtiene el valor de la propiedad matricula.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMatricula() {
            return matricula;
        }

        /**
         * Define el valor de la propiedad matricula.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMatricula(String value) {
            this.matricula = value;
        }

        /**
         * Obtiene el valor de la propiedad ruta.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuta() {
            return ruta;
        }

        /**
         * Define el valor de la propiedad ruta.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuta(String value) {
            this.ruta = value;
        }

        /**
         * Obtiene el valor de la propiedad estacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstacion() {
            return estacion;
        }

        /**
         * Define el valor de la propiedad estacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstacion(String value) {
            this.estacion = value;
        }

        /**
         * Obtiene el valor de la propiedad horaDeLlegada.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getHoraDeLlegada() {
            return horaDeLlegada;
        }

        /**
         * Define el valor de la propiedad horaDeLlegada.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setHoraDeLlegada(XMLGregorianCalendar value) {
            this.horaDeLlegada = value;
        }

        /**
         * Obtiene el valor de la propiedad horaDeSalida.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getHoraDeSalida() {
            return horaDeSalida;
        }

        /**
         * Define el valor de la propiedad horaDeSalida.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setHoraDeSalida(XMLGregorianCalendar value) {
            this.horaDeSalida = value;
        }

        /**
         * Obtiene el valor de la propiedad pasajerosDeLlegada.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPasajerosDeLlegada() {
            return pasajerosDeLlegada;
        }

        /**
         * Define el valor de la propiedad pasajerosDeLlegada.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPasajerosDeLlegada(BigInteger value) {
            this.pasajerosDeLlegada = value;
        }

        /**
         * Obtiene el valor de la propiedad pasajerosDeSalida.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPasajerosDeSalida() {
            return pasajerosDeSalida;
        }

        /**
         * Define el valor de la propiedad pasajerosDeSalida.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPasajerosDeSalida(BigInteger value) {
            this.pasajerosDeSalida = value;
        }

        /**
         * Obtiene el valor de la propiedad combustibleCargadoLitros.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCombustibleCargadoLitros() {
            return combustibleCargadoLitros;
        }

        /**
         * Define el valor de la propiedad combustibleCargadoLitros.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCombustibleCargadoLitros(BigDecimal value) {
            this.combustibleCargadoLitros = value;
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
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Llegada"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
         *               &lt;maxLength value="100"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Salida"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
         *               &lt;maxLength value="100"/&gt;
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
            "llegada",
            "salida"
        })
        public static class NumeroDeVuelo {

            @XmlElement(name = "Llegada", required = true)
            protected String llegada;
            @XmlElement(name = "Salida", required = true)
            protected String salida;

            /**
             * Obtiene el valor de la propiedad llegada.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLlegada() {
                return llegada;
            }

            /**
             * Define el valor de la propiedad llegada.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLlegada(String value) {
                this.llegada = value;
            }

            /**
             * Obtiene el valor de la propiedad salida.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSalida() {
                return salida;
            }

            /**
             * Define el valor de la propiedad salida.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSalida(String value) {
                this.salida = value;
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
     *         &lt;element name="TipoBulto" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *               &lt;enumeration value="CAJAS"/&gt;
     *               &lt;enumeration value="BOLSAS"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CantidadBultos" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
     *         &lt;element name="Servicios" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Tipo"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="Flete"/&gt;
     *                         &lt;enumeration value="ConsumosInternos"/&gt;
     *                         &lt;enumeration value="Construccion"/&gt;
     *                         &lt;enumeration value="Hospedaje"/&gt;
     *                         &lt;enumeration value="Publicidad"/&gt;
     *                         &lt;enumeration value="Consumos"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="FolioReferencia" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "tipoBulto",
        "cantidadBultos",
        "servicios"
    })
    public static class Soriana {

        @XmlElement(name = "TipoBulto")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String tipoBulto;
        @XmlElement(name = "CantidadBultos")
        protected TNonNegativeAmount cantidadBultos;
        @XmlElement(name = "Servicios")
        protected TComprobanteEx.Soriana.Servicios servicios;

        /**
         * Obtiene el valor de la propiedad tipoBulto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoBulto() {
            return tipoBulto;
        }

        /**
         * Define el valor de la propiedad tipoBulto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoBulto(String value) {
            this.tipoBulto = value;
        }

        /**
         * Obtiene el valor de la propiedad cantidadBultos.
         * 
         * @return
         *     possible object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public TNonNegativeAmount getCantidadBultos() {
            return cantidadBultos;
        }

        /**
         * Define el valor de la propiedad cantidadBultos.
         * 
         * @param value
         *     allowed object is
         *     {@link TNonNegativeAmount }
         *     
         */
        public void setCantidadBultos(TNonNegativeAmount value) {
            this.cantidadBultos = value;
        }

        /**
         * Obtiene el valor de la propiedad servicios.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.Soriana.Servicios }
         *     
         */
        public TComprobanteEx.Soriana.Servicios getServicios() {
            return servicios;
        }

        /**
         * Define el valor de la propiedad servicios.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.Soriana.Servicios }
         *     
         */
        public void setServicios(TComprobanteEx.Soriana.Servicios value) {
            this.servicios = value;
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
         *         &lt;element name="Tipo"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="Flete"/&gt;
         *               &lt;enumeration value="ConsumosInternos"/&gt;
         *               &lt;enumeration value="Construccion"/&gt;
         *               &lt;enumeration value="Hospedaje"/&gt;
         *               &lt;enumeration value="Publicidad"/&gt;
         *               &lt;enumeration value="Consumos"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="FolioReferencia" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
            "tipo",
            "folioReferencia"
        })
        public static class Servicios {

            @XmlElement(name = "Tipo", required = true)
            protected String tipo;
            @XmlElement(name = "FolioReferencia", required = true)
            protected BigInteger folioReferencia;

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
             * Obtiene el valor de la propiedad folioReferencia.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getFolioReferencia() {
                return folioReferencia;
            }

            /**
             * Define el valor de la propiedad folioReferencia.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setFolioReferencia(BigInteger value) {
                this.folioReferencia = value;
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
     *         &lt;element name="DiasDePago" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
     *               &lt;maxInclusive value="360"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FechaDeVencimiento" type="{http://www.fact.com.mx/schema/fx}TAllowedDate" minOccurs="0"/&gt;
     *         &lt;element name="CodigoDeTerminoDePago" type="{http://www.fact.com.mx/schema/fx}TCode" minOccurs="0"/&gt;
     *         &lt;element name="MetodoDePago"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="1024"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MedioDePago" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="64"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CondicionesDePago" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="64"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PeriodoFacturado" type="{http://www.fact.com.mx/schema/fx}TFromTo" minOccurs="0"/&gt;
     *         &lt;element name="PeriodoDeLiquidacion" type="{http://www.fact.com.mx/schema/fx}TFromTo" minOccurs="0"/&gt;
     *         &lt;element name="FechaDePago" type="{http://www.fact.com.mx/schema/fx}TAllowedDate" minOccurs="0"/&gt;
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
        "diasDePago",
        "fechaDeVencimiento",
        "codigoDeTerminoDePago",
        "metodoDePago",
        "medioDePago",
        "condicionesDePago",
        "periodoFacturado",
        "periodoDeLiquidacion",
        "fechaDePago"
    })
    public static class TerminosDePago {

        @XmlElement(name = "DiasDePago")
        protected Integer diasDePago;
        @XmlElement(name = "FechaDeVencimiento")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaDeVencimiento;
        @XmlElement(name = "CodigoDeTerminoDePago")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String codigoDeTerminoDePago;
        @XmlElement(name = "MetodoDePago", required = true)
        protected String metodoDePago;
        @XmlElement(name = "MedioDePago")
        protected String medioDePago;
        @XmlElement(name = "CondicionesDePago")
        protected String condicionesDePago;
        @XmlElement(name = "PeriodoFacturado")
        protected TFromTo periodoFacturado;
        @XmlElement(name = "PeriodoDeLiquidacion")
        protected TFromTo periodoDeLiquidacion;
        @XmlElement(name = "FechaDePago")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaDePago;

        /**
         * Obtiene el valor de la propiedad diasDePago.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDiasDePago() {
            return diasDePago;
        }

        /**
         * Define el valor de la propiedad diasDePago.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDiasDePago(Integer value) {
            this.diasDePago = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaDeVencimiento.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaDeVencimiento() {
            return fechaDeVencimiento;
        }

        /**
         * Define el valor de la propiedad fechaDeVencimiento.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaDeVencimiento(XMLGregorianCalendar value) {
            this.fechaDeVencimiento = value;
        }

        /**
         * Obtiene el valor de la propiedad codigoDeTerminoDePago.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoDeTerminoDePago() {
            return codigoDeTerminoDePago;
        }

        /**
         * Define el valor de la propiedad codigoDeTerminoDePago.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoDeTerminoDePago(String value) {
            this.codigoDeTerminoDePago = value;
        }

        /**
         * Obtiene el valor de la propiedad metodoDePago.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetodoDePago() {
            return metodoDePago;
        }

        /**
         * Define el valor de la propiedad metodoDePago.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetodoDePago(String value) {
            this.metodoDePago = value;
        }

        /**
         * Obtiene el valor de la propiedad medioDePago.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMedioDePago() {
            return medioDePago;
        }

        /**
         * Define el valor de la propiedad medioDePago.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMedioDePago(String value) {
            this.medioDePago = value;
        }

        /**
         * Obtiene el valor de la propiedad condicionesDePago.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCondicionesDePago() {
            return condicionesDePago;
        }

        /**
         * Define el valor de la propiedad condicionesDePago.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCondicionesDePago(String value) {
            this.condicionesDePago = value;
        }

        /**
         * Obtiene el valor de la propiedad periodoFacturado.
         * 
         * @return
         *     possible object is
         *     {@link TFromTo }
         *     
         */
        public TFromTo getPeriodoFacturado() {
            return periodoFacturado;
        }

        /**
         * Define el valor de la propiedad periodoFacturado.
         * 
         * @param value
         *     allowed object is
         *     {@link TFromTo }
         *     
         */
        public void setPeriodoFacturado(TFromTo value) {
            this.periodoFacturado = value;
        }

        /**
         * Obtiene el valor de la propiedad periodoDeLiquidacion.
         * 
         * @return
         *     possible object is
         *     {@link TFromTo }
         *     
         */
        public TFromTo getPeriodoDeLiquidacion() {
            return periodoDeLiquidacion;
        }

        /**
         * Define el valor de la propiedad periodoDeLiquidacion.
         * 
         * @param value
         *     allowed object is
         *     {@link TFromTo }
         *     
         */
        public void setPeriodoDeLiquidacion(TFromTo value) {
            this.periodoDeLiquidacion = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaDePago.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaDePago() {
            return fechaDePago;
        }

        /**
         * Define el valor de la propiedad fechaDePago.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaDePago(XMLGregorianCalendar value) {
            this.fechaDePago = value;
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
     *         &lt;element name="DescripcionDeCarga" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Linea" maxOccurs="24" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Columna1" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
     *                             &lt;element name="Columna2" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
     *                             &lt;element name="Columna3" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
     *                             &lt;element name="Columna4" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
     *                             &lt;element name="Columna5" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
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
     *         &lt;element name="ConceptosDeCobro" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Concepto" maxOccurs="24" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Elemento" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
     *                             &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
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
     *         &lt;element name="Unidad" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="250"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Operador" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="250"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Remolque" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="250"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Pedimento" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="250"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Contenedor" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
     *               &lt;maxLength value="250"/&gt;
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
        "descripcionDeCarga",
        "conceptosDeCobro",
        "unidad",
        "operador",
        "remolque",
        "pedimento",
        "contenedor"
    })
    public static class Transportistas {

        @XmlElement(name = "DescripcionDeCarga")
        protected TComprobanteEx.Transportistas.DescripcionDeCarga descripcionDeCarga;
        @XmlElement(name = "ConceptosDeCobro")
        protected TComprobanteEx.Transportistas.ConceptosDeCobro conceptosDeCobro;
        @XmlElement(name = "Unidad")
        protected String unidad;
        @XmlElement(name = "Operador")
        protected String operador;
        @XmlElement(name = "Remolque")
        protected String remolque;
        @XmlElement(name = "Pedimento")
        protected String pedimento;
        @XmlElement(name = "Contenedor")
        protected String contenedor;

        /**
         * Obtiene el valor de la propiedad descripcionDeCarga.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.Transportistas.DescripcionDeCarga }
         *     
         */
        public TComprobanteEx.Transportistas.DescripcionDeCarga getDescripcionDeCarga() {
            return descripcionDeCarga;
        }

        /**
         * Define el valor de la propiedad descripcionDeCarga.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.Transportistas.DescripcionDeCarga }
         *     
         */
        public void setDescripcionDeCarga(TComprobanteEx.Transportistas.DescripcionDeCarga value) {
            this.descripcionDeCarga = value;
        }

        /**
         * Obtiene el valor de la propiedad conceptosDeCobro.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.Transportistas.ConceptosDeCobro }
         *     
         */
        public TComprobanteEx.Transportistas.ConceptosDeCobro getConceptosDeCobro() {
            return conceptosDeCobro;
        }

        /**
         * Define el valor de la propiedad conceptosDeCobro.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.Transportistas.ConceptosDeCobro }
         *     
         */
        public void setConceptosDeCobro(TComprobanteEx.Transportistas.ConceptosDeCobro value) {
            this.conceptosDeCobro = value;
        }

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
         * Obtiene el valor de la propiedad operador.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperador() {
            return operador;
        }

        /**
         * Define el valor de la propiedad operador.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperador(String value) {
            this.operador = value;
        }

        /**
         * Obtiene el valor de la propiedad remolque.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemolque() {
            return remolque;
        }

        /**
         * Define el valor de la propiedad remolque.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemolque(String value) {
            this.remolque = value;
        }

        /**
         * Obtiene el valor de la propiedad pedimento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPedimento() {
            return pedimento;
        }

        /**
         * Define el valor de la propiedad pedimento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPedimento(String value) {
            this.pedimento = value;
        }

        /**
         * Obtiene el valor de la propiedad contenedor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContenedor() {
            return contenedor;
        }

        /**
         * Define el valor de la propiedad contenedor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContenedor(String value) {
            this.contenedor = value;
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
         *         &lt;element name="Concepto" maxOccurs="24" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Elemento" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
         *                   &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
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
            "concepto"
        })
        public static class ConceptosDeCobro {

            @XmlElement(name = "Concepto")
            protected List<TComprobanteEx.Transportistas.ConceptosDeCobro.Concepto> concepto;

            /**
             * Gets the value of the concepto property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the concepto property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getConcepto().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TComprobanteEx.Transportistas.ConceptosDeCobro.Concepto }
             * 
             * 
             */
            public List<TComprobanteEx.Transportistas.ConceptosDeCobro.Concepto> getConcepto() {
                if (concepto == null) {
                    concepto = new ArrayList<TComprobanteEx.Transportistas.ConceptosDeCobro.Concepto>();
                }
                return this.concepto;
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
             *         &lt;element name="Elemento" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
             *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
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
                "elemento",
                "valor"
            })
            public static class Concepto {

                @XmlElement(name = "Elemento", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String elemento;
                @XmlElement(name = "Valor", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String valor;

                /**
                 * Obtiene el valor de la propiedad elemento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getElemento() {
                    return elemento;
                }

                /**
                 * Define el valor de la propiedad elemento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setElemento(String value) {
                    this.elemento = value;
                }

                /**
                 * Obtiene el valor de la propiedad valor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValor() {
                    return valor;
                }

                /**
                 * Define el valor de la propiedad valor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValor(String value) {
                    this.valor = value;
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
         *         &lt;element name="Linea" maxOccurs="24" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Columna1" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
         *                   &lt;element name="Columna2" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
         *                   &lt;element name="Columna3" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
         *                   &lt;element name="Columna4" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
         *                   &lt;element name="Columna5" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
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
            "linea"
        })
        public static class DescripcionDeCarga {

            @XmlElement(name = "Linea")
            protected List<TComprobanteEx.Transportistas.DescripcionDeCarga.Linea> linea;

            /**
             * Gets the value of the linea property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the linea property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLinea().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TComprobanteEx.Transportistas.DescripcionDeCarga.Linea }
             * 
             * 
             */
            public List<TComprobanteEx.Transportistas.DescripcionDeCarga.Linea> getLinea() {
                if (linea == null) {
                    linea = new ArrayList<TComprobanteEx.Transportistas.DescripcionDeCarga.Linea>();
                }
                return this.linea;
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
             *         &lt;element name="Columna1" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
             *         &lt;element name="Columna2" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
             *         &lt;element name="Columna3" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
             *         &lt;element name="Columna4" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
             *         &lt;element name="Columna5" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
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
                "columna1",
                "columna2",
                "columna3",
                "columna4",
                "columna5"
            })
            public static class Linea {

                @XmlElement(name = "Columna1", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String columna1;
                @XmlElement(name = "Columna2", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String columna2;
                @XmlElement(name = "Columna3", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String columna3;
                @XmlElement(name = "Columna4", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String columna4;
                @XmlElement(name = "Columna5", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String columna5;

                /**
                 * Obtiene el valor de la propiedad columna1.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getColumna1() {
                    return columna1;
                }

                /**
                 * Define el valor de la propiedad columna1.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setColumna1(String value) {
                    this.columna1 = value;
                }

                /**
                 * Obtiene el valor de la propiedad columna2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getColumna2() {
                    return columna2;
                }

                /**
                 * Define el valor de la propiedad columna2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setColumna2(String value) {
                    this.columna2 = value;
                }

                /**
                 * Obtiene el valor de la propiedad columna3.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getColumna3() {
                    return columna3;
                }

                /**
                 * Define el valor de la propiedad columna3.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setColumna3(String value) {
                    this.columna3 = value;
                }

                /**
                 * Obtiene el valor de la propiedad columna4.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getColumna4() {
                    return columna4;
                }

                /**
                 * Define el valor de la propiedad columna4.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setColumna4(String value) {
                    this.columna4 = value;
                }

                /**
                 * Obtiene el valor de la propiedad columna5.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getColumna5() {
                    return columna5;
                }

                /**
                 * Define el valor de la propiedad columna5.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setColumna5(String value) {
                    this.columna5 = value;
                }

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
     *         &lt;element name="Origen" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Codigo"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Nombre" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="35"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Destino" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Codigo"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="4"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NaveReciboMaterial" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="7"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Transportistas" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Transportista"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="numeroBFL"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;length value="12"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="guiaAereaMaster"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;maxLength value="20"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="guiaAereaHouse"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;maxLength value="20"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="BLMaster"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;maxLength value="20"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="BLHouse"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;maxLength value="20"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="codigoFlete" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;maxLength value="20"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="ETD" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *                           &lt;attribute name="ETA" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *                           &lt;attribute name="Usuario"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;maxLength value="50"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="direccionOrigen"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="direccionDestino"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
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
     *         &lt;element name="Referencias" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="referenciaProveedor"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="16"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="remision"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="16"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="numeroASN"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="20"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="unidadNegocios"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="0"/&gt;
     *                       &lt;maxLength value="80"/&gt;
     *                       &lt;enumeration value="INFODE"/&gt;
     *                       &lt;enumeration value="VWSP"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Archivo" maxOccurs="3" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="datos" use="required" type="{http://www.w3.org/2001/XMLSchema}base64Binary" /&gt;
     *                 &lt;attribute name="tipo" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="XLS"/&gt;
     *                       &lt;enumeration value="PDF"/&gt;
     *                       &lt;enumeration value="ZIP"/&gt;
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
        "origen",
        "destino",
        "transportistas",
        "referencias",
        "archivo"
    })
    public static class Volkswagen {

        @XmlElement(name = "Origen")
        protected TComprobanteEx.Volkswagen.Origen origen;
        @XmlElement(name = "Destino")
        protected TComprobanteEx.Volkswagen.Destino destino;
        @XmlElement(name = "Transportistas")
        protected TComprobanteEx.Volkswagen.Transportistas transportistas;
        @XmlElement(name = "Referencias")
        protected TComprobanteEx.Volkswagen.Referencias referencias;
        @XmlElement(name = "Archivo")
        protected List<TComprobanteEx.Volkswagen.Archivo> archivo;

        /**
         * Obtiene el valor de la propiedad origen.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.Volkswagen.Origen }
         *     
         */
        public TComprobanteEx.Volkswagen.Origen getOrigen() {
            return origen;
        }

        /**
         * Define el valor de la propiedad origen.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.Volkswagen.Origen }
         *     
         */
        public void setOrigen(TComprobanteEx.Volkswagen.Origen value) {
            this.origen = value;
        }

        /**
         * Obtiene el valor de la propiedad destino.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.Volkswagen.Destino }
         *     
         */
        public TComprobanteEx.Volkswagen.Destino getDestino() {
            return destino;
        }

        /**
         * Define el valor de la propiedad destino.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.Volkswagen.Destino }
         *     
         */
        public void setDestino(TComprobanteEx.Volkswagen.Destino value) {
            this.destino = value;
        }

        /**
         * Obtiene el valor de la propiedad transportistas.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.Volkswagen.Transportistas }
         *     
         */
        public TComprobanteEx.Volkswagen.Transportistas getTransportistas() {
            return transportistas;
        }

        /**
         * Define el valor de la propiedad transportistas.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.Volkswagen.Transportistas }
         *     
         */
        public void setTransportistas(TComprobanteEx.Volkswagen.Transportistas value) {
            this.transportistas = value;
        }

        /**
         * Obtiene el valor de la propiedad referencias.
         * 
         * @return
         *     possible object is
         *     {@link TComprobanteEx.Volkswagen.Referencias }
         *     
         */
        public TComprobanteEx.Volkswagen.Referencias getReferencias() {
            return referencias;
        }

        /**
         * Define el valor de la propiedad referencias.
         * 
         * @param value
         *     allowed object is
         *     {@link TComprobanteEx.Volkswagen.Referencias }
         *     
         */
        public void setReferencias(TComprobanteEx.Volkswagen.Referencias value) {
            this.referencias = value;
        }

        /**
         * Gets the value of the archivo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the archivo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArchivo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TComprobanteEx.Volkswagen.Archivo }
         * 
         * 
         */
        public List<TComprobanteEx.Volkswagen.Archivo> getArchivo() {
            if (archivo == null) {
                archivo = new ArrayList<TComprobanteEx.Volkswagen.Archivo>();
            }
            return this.archivo;
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
         *       &lt;attribute name="datos" use="required" type="{http://www.w3.org/2001/XMLSchema}base64Binary" /&gt;
         *       &lt;attribute name="tipo" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="XLS"/&gt;
         *             &lt;enumeration value="PDF"/&gt;
         *             &lt;enumeration value="ZIP"/&gt;
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
        public static class Archivo {

            @XmlAttribute(name = "datos", required = true)
            protected byte[] datos;
            @XmlAttribute(name = "tipo", required = true)
            protected String tipo;

            /**
             * Obtiene el valor de la propiedad datos.
             * 
             * @return
             *     possible object is
             *     byte[]
             */
            public byte[] getDatos() {
                return datos;
            }

            /**
             * Define el valor de la propiedad datos.
             * 
             * @param value
             *     allowed object is
             *     byte[]
             */
            public void setDatos(byte[] value) {
                this.datos = value;
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
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="4"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NaveReciboMaterial" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="7"/&gt;
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
            "codigo",
            "naveReciboMaterial"
        })
        public static class Destino {

            @XmlElement(name = "Codigo", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String codigo;
            @XmlElement(name = "NaveReciboMaterial")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String naveReciboMaterial;

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
             * Obtiene el valor de la propiedad naveReciboMaterial.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNaveReciboMaterial() {
                return naveReciboMaterial;
            }

            /**
             * Define el valor de la propiedad naveReciboMaterial.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNaveReciboMaterial(String value) {
                this.naveReciboMaterial = value;
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
         *         &lt;element name="Codigo"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="10"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Nombre" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="35"/&gt;
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
            "codigo",
            "nombre"
        })
        public static class Origen {

            @XmlElement(name = "Codigo", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String codigo;
            @XmlElement(name = "Nombre")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String nombre;

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
         *       &lt;attribute name="referenciaProveedor"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="16"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="remision"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="16"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="numeroASN"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="20"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="unidadNegocios"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="0"/&gt;
         *             &lt;maxLength value="80"/&gt;
         *             &lt;enumeration value="INFODE"/&gt;
         *             &lt;enumeration value="VWSP"/&gt;
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

            @XmlAttribute(name = "referenciaProveedor")
            protected String referenciaProveedor;
            @XmlAttribute(name = "remision")
            protected String remision;
            @XmlAttribute(name = "numeroASN")
            protected String numeroASN;
            @XmlAttribute(name = "unidadNegocios")
            protected String unidadNegocios;

            /**
             * Obtiene el valor de la propiedad referenciaProveedor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferenciaProveedor() {
                return referenciaProveedor;
            }

            /**
             * Define el valor de la propiedad referenciaProveedor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferenciaProveedor(String value) {
                this.referenciaProveedor = value;
            }

            /**
             * Obtiene el valor de la propiedad remision.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemision() {
                return remision;
            }

            /**
             * Define el valor de la propiedad remision.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemision(String value) {
                this.remision = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroASN.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroASN() {
                return numeroASN;
            }

            /**
             * Define el valor de la propiedad numeroASN.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroASN(String value) {
                this.numeroASN = value;
            }

            /**
             * Obtiene el valor de la propiedad unidadNegocios.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnidadNegocios() {
                return unidadNegocios;
            }

            /**
             * Define el valor de la propiedad unidadNegocios.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnidadNegocios(String value) {
                this.unidadNegocios = value;
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
         *         &lt;element name="Transportista"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="numeroBFL"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;length value="12"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="guiaAereaMaster"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;maxLength value="20"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="guiaAereaHouse"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;maxLength value="20"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="BLMaster"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;maxLength value="20"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="BLHouse"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;maxLength value="20"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="codigoFlete" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;maxLength value="20"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="ETD" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
         *                 &lt;attribute name="ETA" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
         *                 &lt;attribute name="Usuario"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;maxLength value="50"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="direccionOrigen"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="direccionDestino"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
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
            "transportista"
        })
        public static class Transportistas {

            @XmlElement(name = "Transportista", required = true)
            protected TComprobanteEx.Volkswagen.Transportistas.Transportista transportista;

            /**
             * Obtiene el valor de la propiedad transportista.
             * 
             * @return
             *     possible object is
             *     {@link TComprobanteEx.Volkswagen.Transportistas.Transportista }
             *     
             */
            public TComprobanteEx.Volkswagen.Transportistas.Transportista getTransportista() {
                return transportista;
            }

            /**
             * Define el valor de la propiedad transportista.
             * 
             * @param value
             *     allowed object is
             *     {@link TComprobanteEx.Volkswagen.Transportistas.Transportista }
             *     
             */
            public void setTransportista(TComprobanteEx.Volkswagen.Transportistas.Transportista value) {
                this.transportista = value;
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
             *       &lt;attribute name="numeroBFL"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;length value="12"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="guiaAereaMaster"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="20"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="guiaAereaHouse"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="20"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="BLMaster"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="20"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="BLHouse"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="20"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="codigoFlete" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="20"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="ETD" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
             *       &lt;attribute name="ETA" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
             *       &lt;attribute name="Usuario"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="50"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="direccionOrigen"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="direccionDestino"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
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
            public static class Transportista {

                @XmlAttribute(name = "numeroBFL")
                protected String numeroBFL;
                @XmlAttribute(name = "guiaAereaMaster")
                protected String guiaAereaMaster;
                @XmlAttribute(name = "guiaAereaHouse")
                protected String guiaAereaHouse;
                @XmlAttribute(name = "BLMaster")
                protected String blMaster;
                @XmlAttribute(name = "BLHouse")
                protected String blHouse;
                @XmlAttribute(name = "codigoFlete", required = true)
                protected String codigoFlete;
                @XmlAttribute(name = "ETD")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar etd;
                @XmlAttribute(name = "ETA")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar eta;
                @XmlAttribute(name = "Usuario")
                protected String usuario;
                @XmlAttribute(name = "direccionOrigen")
                protected String direccionOrigen;
                @XmlAttribute(name = "direccionDestino")
                protected String direccionDestino;

                /**
                 * Obtiene el valor de la propiedad numeroBFL.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroBFL() {
                    return numeroBFL;
                }

                /**
                 * Define el valor de la propiedad numeroBFL.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroBFL(String value) {
                    this.numeroBFL = value;
                }

                /**
                 * Obtiene el valor de la propiedad guiaAereaMaster.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGuiaAereaMaster() {
                    return guiaAereaMaster;
                }

                /**
                 * Define el valor de la propiedad guiaAereaMaster.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGuiaAereaMaster(String value) {
                    this.guiaAereaMaster = value;
                }

                /**
                 * Obtiene el valor de la propiedad guiaAereaHouse.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGuiaAereaHouse() {
                    return guiaAereaHouse;
                }

                /**
                 * Define el valor de la propiedad guiaAereaHouse.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGuiaAereaHouse(String value) {
                    this.guiaAereaHouse = value;
                }

                /**
                 * Obtiene el valor de la propiedad blMaster.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBLMaster() {
                    return blMaster;
                }

                /**
                 * Define el valor de la propiedad blMaster.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBLMaster(String value) {
                    this.blMaster = value;
                }

                /**
                 * Obtiene el valor de la propiedad blHouse.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBLHouse() {
                    return blHouse;
                }

                /**
                 * Define el valor de la propiedad blHouse.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBLHouse(String value) {
                    this.blHouse = value;
                }

                /**
                 * Obtiene el valor de la propiedad codigoFlete.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodigoFlete() {
                    return codigoFlete;
                }

                /**
                 * Define el valor de la propiedad codigoFlete.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodigoFlete(String value) {
                    this.codigoFlete = value;
                }

                /**
                 * Obtiene el valor de la propiedad etd.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getETD() {
                    return etd;
                }

                /**
                 * Define el valor de la propiedad etd.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setETD(XMLGregorianCalendar value) {
                    this.etd = value;
                }

                /**
                 * Obtiene el valor de la propiedad eta.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getETA() {
                    return eta;
                }

                /**
                 * Define el valor de la propiedad eta.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setETA(XMLGregorianCalendar value) {
                    this.eta = value;
                }

                /**
                 * Obtiene el valor de la propiedad usuario.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUsuario() {
                    return usuario;
                }

                /**
                 * Define el valor de la propiedad usuario.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUsuario(String value) {
                    this.usuario = value;
                }

                /**
                 * Obtiene el valor de la propiedad direccionOrigen.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDireccionOrigen() {
                    return direccionOrigen;
                }

                /**
                 * Define el valor de la propiedad direccionOrigen.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDireccionOrigen(String value) {
                    this.direccionOrigen = value;
                }

                /**
                 * Obtiene el valor de la propiedad direccionDestino.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDireccionDestino() {
                    return direccionDestino;
                }

                /**
                 * Define el valor de la propiedad direccionDestino.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDireccionDestino(String value) {
                    this.direccionDestino = value;
                }

            }

        }

    }

}
