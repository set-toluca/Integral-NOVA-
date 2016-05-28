package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Complemento Prestadores Autorizados de servicios de CFD.
 * 
 * <p>Clase Java para TComplementoPrestadores complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TComplementoPrestadores"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RFCPrestador" type="{http://www.fact.com.mx/schema/fx}TRFC"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TComplementoPrestadores", propOrder = {
    "rfcPrestador"
})
public class TComplementoPrestadores {

    @XmlElement(name = "RFCPrestador", required = true)
    protected String rfcPrestador;

    /**
     * Obtiene el valor de la propiedad rfcPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCPrestador() {
        return rfcPrestador;
    }

    /**
     * Define el valor de la propiedad rfcPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCPrestador(String value) {
        this.rfcPrestador = value;
    }

}
