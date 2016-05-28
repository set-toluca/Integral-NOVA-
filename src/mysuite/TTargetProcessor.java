
package mysuite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TTargetProcessor.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TTargetProcessor"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="MYSUITE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TTargetProcessor")
@XmlEnum
public enum TTargetProcessor {

    MYSUITE;

    public String value() {
        return name();
    }

    public static TTargetProcessor fromValue(String v) {
        return valueOf(v);
    }

}
