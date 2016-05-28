
package mysuite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TSpecialServicesType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TSpecialServicesType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ABONO_POR_PUBLICIDAD"/&gt;
 *     &lt;enumeration value="AJUSTES"/&gt;
 *     &lt;enumeration value="CANTIDAD_DESCONTADA"/&gt;
 *     &lt;enumeration value="CARGO_FINANCIERO"/&gt;
 *     &lt;enumeration value="CARGO_POR_FLETE"/&gt;
 *     &lt;enumeration value="CARGO_POR_MANEJO_DE_MERCANCIA"/&gt;
 *     &lt;enumeration value="DESCUENTO"/&gt;
 *     &lt;enumeration value="DESCUENTOS_ESPECIALES"/&gt;
 *     &lt;enumeration value="DESCUENTO_COMERCIAL"/&gt;
 *     &lt;enumeration value="DESCUENTO_DEFECTUOSO"/&gt;
 *     &lt;enumeration value="DESCUENTO_DE_MERCANCIA_INVENDIBLE"/&gt;
 *     &lt;enumeration value="DESCUENTO_EFECTIVO"/&gt;
 *     &lt;enumeration value="DESCUENTO_LOGISTICO"/&gt;
 *     &lt;enumeration value="DESCUENTO_POR_CAMIONETA"/&gt;
 *     &lt;enumeration value="DESCUENTO_POR_FLETE"/&gt;
 *     &lt;enumeration value="DESCUENTO_POR_MERCANCIAS_GRATUITAS"/&gt;
 *     &lt;enumeration value="DESCUENTO_POR_PRONTA_COMPRA_DE_LOS_CLIENTES"/&gt;
 *     &lt;enumeration value="DESCUENTO_POR_PRONTO_PAGO"/&gt;
 *     &lt;enumeration value="DESCUENTO_POR_RECOLECCION"/&gt;
 *     &lt;enumeration value="DESCUENTO_POR_VOLUMEN"/&gt;
 *     &lt;enumeration value="DESCUENTO_PROMOCIONAL"/&gt;
 *     &lt;enumeration value="DESCUENTO_TEMPORAL"/&gt;
 *     &lt;enumeration value="IMPUESTOS"/&gt;
 *     &lt;enumeration value="IMPUESTO_ESTATAL"/&gt;
 *     &lt;enumeration value="MUTUAMENTE_DEFINIDO"/&gt;
 *     &lt;enumeration value="PAGO_CONTRA_ENTREGA"/&gt;
 *     &lt;enumeration value="PEDIDO_DE_UN_PALET_COMPLETO"/&gt;
 *     &lt;enumeration value="REBAJA"/&gt;
 *     &lt;enumeration value="REBAJA_O_DESCUENTO_MISCELANEO"/&gt;
 *     &lt;enumeration value="RECOLECCION"/&gt;
 *     &lt;enumeration value="COPPEL_DESC_POR_DIST_DE_BODEGA_A_TIENDA"/&gt;
 *     &lt;enumeration value="COPPEL_DESC_POR_RESGUARDAR_MERCANCIA"/&gt;
 *     &lt;enumeration value="COPPEL_DESC_POR_ENTREGA_EN_UNA_SOLA_BODEGA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TSpecialServicesType")
@XmlEnum
public enum TSpecialServicesType {

    ABONO_POR_PUBLICIDAD,
    AJUSTES,
    CANTIDAD_DESCONTADA,
    CARGO_FINANCIERO,
    CARGO_POR_FLETE,
    CARGO_POR_MANEJO_DE_MERCANCIA,
    DESCUENTO,
    DESCUENTOS_ESPECIALES,
    DESCUENTO_COMERCIAL,
    DESCUENTO_DEFECTUOSO,
    DESCUENTO_DE_MERCANCIA_INVENDIBLE,
    DESCUENTO_EFECTIVO,
    DESCUENTO_LOGISTICO,
    DESCUENTO_POR_CAMIONETA,
    DESCUENTO_POR_FLETE,
    DESCUENTO_POR_MERCANCIAS_GRATUITAS,
    DESCUENTO_POR_PRONTA_COMPRA_DE_LOS_CLIENTES,
    DESCUENTO_POR_PRONTO_PAGO,
    DESCUENTO_POR_RECOLECCION,
    DESCUENTO_POR_VOLUMEN,
    DESCUENTO_PROMOCIONAL,
    DESCUENTO_TEMPORAL,
    IMPUESTOS,
    IMPUESTO_ESTATAL,
    MUTUAMENTE_DEFINIDO,
    PAGO_CONTRA_ENTREGA,
    PEDIDO_DE_UN_PALET_COMPLETO,
    REBAJA,
    REBAJA_O_DESCUENTO_MISCELANEO,
    RECOLECCION,
    COPPEL_DESC_POR_DIST_DE_BODEGA_A_TIENDA,
    COPPEL_DESC_POR_RESGUARDAR_MERCANCIA,
    COPPEL_DESC_POR_ENTREGA_EN_UNA_SOLA_BODEGA;

    public String value() {
        return name();
    }

    public static TSpecialServicesType fromValue(String v) {
        return valueOf(v);
    }

}
