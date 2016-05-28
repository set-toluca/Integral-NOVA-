
package mysuite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TTipoDeDocumento.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TTipoDeDocumento"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="FACTURA"/&gt;
 *     &lt;enumeration value="NOTA_DE_CREDITO"/&gt;
 *     &lt;enumeration value="NOTA_DE_CARGO"/&gt;
 *     &lt;enumeration value="CARTA_PORTE"/&gt;
 *     &lt;enumeration value="RECIBO_DE_HONORARIOS"/&gt;
 *     &lt;enumeration value="RECIBO_DE_ARRENDAMIENTO"/&gt;
 *     &lt;enumeration value="RECIBO_DE_DONATIVOS"/&gt;
 *     &lt;enumeration value="RECIBO_DE_PAGO_DE_PRIMAS"/&gt;
 *     &lt;enumeration value="COMPROBANTE_DE_PAGO_A_PLAZOS"/&gt;
 *     &lt;enumeration value="BOLETA_DE_EMPENO"/&gt;
 *     &lt;enumeration value="RECIBO_DE_NOMINA"/&gt;
 *     &lt;enumeration value="RECIBO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TTipoDeDocumento")
@XmlEnum
public enum TTipoDeDocumento {

    FACTURA,
    NOTA_DE_CREDITO,
    NOTA_DE_CARGO,
    CARTA_PORTE,
    RECIBO_DE_HONORARIOS,
    RECIBO_DE_ARRENDAMIENTO,
    RECIBO_DE_DONATIVOS,
    RECIBO_DE_PAGO_DE_PRIMAS,
    COMPROBANTE_DE_PAGO_A_PLAZOS,
    BOLETA_DE_EMPENO,
    RECIBO_DE_NOMINA,
    RECIBO;

    public String value() {
        return name();
    }

    public static TTipoDeDocumento fromValue(String v) {
        return valueOf(v);
    }

}
