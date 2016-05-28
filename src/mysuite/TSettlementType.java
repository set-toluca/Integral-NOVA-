
package mysuite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TSettlementType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TSettlementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="FUERA_DE_FACTURA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TSettlementType")
@XmlEnum
public enum TSettlementType {

    FUERA_DE_FACTURA;

    public String value() {
        return name();
    }

    public static TSettlementType fromValue(String v) {
        return valueOf(v);
    }

}
