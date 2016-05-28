

package mysuite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TTaxContext.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TTaxContext"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEDERAL"/&gt;
 *     &lt;enumeration value="LOCAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TTaxContext")
@XmlEnum
public enum TTaxContext {

    FEDERAL,
    LOCAL;

    public String value() {
        return name();
    }

    public static TTaxContext fromValue(String v) {
        return valueOf(v);
    }

}
