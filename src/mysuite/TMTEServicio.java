
package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Addenda MAPFRE.
 * 
 * <p>Clase Java para TMTEServicio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMTEServicio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tipo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="ABANDERAMIENTO"/&gt;
 *               &lt;enumeration value="AMBULANCIAS"/&gt;
 *               &lt;enumeration value="ARCHIVO MUERTO"/&gt;
 *               &lt;enumeration value="ARRASTRE"/&gt;
 *               &lt;enumeration value="ARTICULOS DE ESCRITORIO"/&gt;
 *               &lt;enumeration value="ASISTENCIA"/&gt;
 *               &lt;enumeration value="BANDERAZO"/&gt;
 *               &lt;enumeration value="CASETAS DE COBRO"/&gt;
 *               &lt;enumeration value="CONSUMIBLES DE COMPUTO"/&gt;
 *               &lt;enumeration value="ELECTRICO"/&gt;
 *               &lt;enumeration value="EQUIPO DE COMPUTO"/&gt;
 *               &lt;enumeration value="EQUIPO DE TRANSPORTE"/&gt;
 *               &lt;enumeration value="EQUIPO DIVERSO"/&gt;
 *               &lt;enumeration value="EQUIPO PERIFERICO"/&gt;
 *               &lt;enumeration value="FLETES"/&gt;
 *               &lt;enumeration value="FORMATOS IMPRESOS"/&gt;
 *               &lt;enumeration value="GASOLINA"/&gt;
 *               &lt;enumeration value="HOJALATERIA"/&gt;
 *               &lt;enumeration value="HOJALATERIA Y PINTURA"/&gt;
 *               &lt;enumeration value="HOSPITALARIO"/&gt;
 *               &lt;enumeration value="MANIOBRAS"/&gt;
 *               &lt;enumeration value="MANO DE OBRA"/&gt;
 *               &lt;enumeration value="MANTENIMIENTO"/&gt;
 *               &lt;enumeration value="MECANICO"/&gt;
 *               &lt;enumeration value="MEDICO"/&gt;
 *               &lt;enumeration value="MENSAJERIA"/&gt;
 *               &lt;enumeration value="MOBILIARIO Y EQUIPO DE OFICINA"/&gt;
 *               &lt;enumeration value="OTRO"/&gt;
 *               &lt;enumeration value="PENSION"/&gt;
 *               &lt;enumeration value="PINTURA"/&gt;
 *               &lt;enumeration value="PROCEDIMIENTO"/&gt;
 *               &lt;enumeration value="REFACCIONES"/&gt;
 *               &lt;enumeration value="TELEFONICO"/&gt;
 *               &lt;enumeration value="VIAL"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Numero"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.fact.com.mx/schema/fx}TCadenaPermitida"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMTEServicio", propOrder = {
    "tipo",
    "numero"
})
public class TMTEServicio {

    @XmlElement(name = "Tipo", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tipo;
    @XmlElement(name = "Numero", required = true)
    protected String numero;

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

}
