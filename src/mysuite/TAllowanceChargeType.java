package mysuite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TAllowanceChargeType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TAllowanceChargeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DESCUENTO"/&gt;
 *     &lt;enumeration value="RECARGO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TAllowanceChargeType")
@XmlEnum
public enum TAllowanceChargeType {

    DESCUENTO,
    RECARGO;

    public String value() {
        return name();
    }

    public static TAllowanceChargeType fromValue(String v) {
        return valueOf(v);
    }

}
