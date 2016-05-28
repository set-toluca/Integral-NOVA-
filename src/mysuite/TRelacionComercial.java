

package mysuite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TRelacionComercial.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TRelacionComercial"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="PROVEEDOR"/&gt;
 *     &lt;enumeration value="CONTRATISTA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TRelacionComercial")
@XmlEnum
public enum TRelacionComercial {

    PROVEEDOR,
    CONTRATISTA;

    public String value() {
        return name();
    }

    public static TRelacionComercial fromValue(String v) {
        return valueOf(v);
    }

}
