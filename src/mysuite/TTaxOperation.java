
package mysuite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TTaxOperation.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TTaxOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RETENCION"/&gt;
 *     &lt;enumeration value="TRASLADO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TTaxOperation")
@XmlEnum
public enum TTaxOperation {

    RETENCION,
    TRASLADO;

    public String value() {
        return name();
    }

    public static TTaxOperation fromValue(String v) {
        return valueOf(v);
    }

}
