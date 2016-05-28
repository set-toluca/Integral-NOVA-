

package mysuite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TSenderCountryCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TSenderCountryCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="MX"/&gt;
 *     &lt;enumeration value="GT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TSenderCountryCode")
@XmlEnum
public enum TSenderCountryCode {

    MX,
    GT;

    public String value() {
        return name();
    }

    public static TSenderCountryCode fromValue(String v) {
        return valueOf(v);
    }

}
