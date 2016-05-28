package mysuite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TCommercialRelationship.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TCommercialRelationship"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="PROVIDER"/&gt;
 *     &lt;enumeration value="SUPPLIER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TCommercialRelationship")
@XmlEnum
public enum TCommercialRelationship {

    PROVIDER,
    SUPPLIER;

    public String value() {
        return name();
    }

    public static TCommercialRelationship fromValue(String v) {
        return valueOf(v);
    }

}
