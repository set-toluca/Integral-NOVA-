

package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para TWeight complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TWeight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Unit" type="{http://www.fact.com.mx/schema/fx}TCode"/&gt;
 *         &lt;element name="NetWeight" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="TareWeight" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="GrossWeight" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TWeight", propOrder = {
    "unit",
    "netWeight",
    "tareWeight",
    "grossWeight"
})
public class TWeight {

    @XmlElement(name = "Unit", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String unit;
    @XmlElement(name = "NetWeight")
    protected TNonNegativeAmount netWeight;
    @XmlElement(name = "TareWeight")
    protected TNonNegativeAmount tareWeight;
    @XmlElement(name = "GrossWeight")
    protected TNonNegativeAmount grossWeight;

    /**
     * Obtiene el valor de la propiedad unit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Define el valor de la propiedad unit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Obtiene el valor de la propiedad netWeight.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getNetWeight() {
        return netWeight;
    }

    /**
     * Define el valor de la propiedad netWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setNetWeight(TNonNegativeAmount value) {
        this.netWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad tareWeight.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTareWeight() {
        return tareWeight;
    }

    /**
     * Define el valor de la propiedad tareWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTareWeight(TNonNegativeAmount value) {
        this.tareWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad grossWeight.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getGrossWeight() {
        return grossWeight;
    }

    /**
     * Define el valor de la propiedad grossWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setGrossWeight(TNonNegativeAmount value) {
        this.grossWeight = value;
    }

}
