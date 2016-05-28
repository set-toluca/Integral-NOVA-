package mysuite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para c_TipoSerie.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="c_TipoSerie"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SERIE A"/&gt;
 *     &lt;enumeration value="SERIE B"/&gt;
 *     &lt;enumeration value="SERIE C"/&gt;
 *     &lt;enumeration value="SERIE D"/&gt;
 *     &lt;enumeration value="SERIE E"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "c_TipoSerie")
@XmlEnum
public enum CTipoSerie {

    @XmlEnumValue("SERIE A")
    SERIE_A("SERIE A"),
    @XmlEnumValue("SERIE B")
    SERIE_B("SERIE B"),
    @XmlEnumValue("SERIE C")
    SERIE_C("SERIE C"),
    @XmlEnumValue("SERIE D")
    SERIE_D("SERIE D"),
    @XmlEnumValue("SERIE E")
    SERIE_E("SERIE E");
    private final String value;

    CTipoSerie(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CTipoSerie fromValue(String v) {
        for (CTipoSerie c: CTipoSerie.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
