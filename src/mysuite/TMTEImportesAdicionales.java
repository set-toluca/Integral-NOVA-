
package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Addenda MAPFRE.
 * 
 * <p>Clase Java para TMTEImportesAdicionales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMTEImportesAdicionales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Deducible" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="Reaseguro" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="Coaseguro" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="CoaseguroDeHonorarios" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMTEImportesAdicionales", propOrder = {

})
public class TMTEImportesAdicionales {

    @XmlElement(name = "Deducible")
    protected TNonNegativeAmount deducible;
    @XmlElement(name = "Reaseguro")
    protected TNonNegativeAmount reaseguro;
    @XmlElement(name = "Coaseguro")
    protected TNonNegativeAmount coaseguro;
    @XmlElement(name = "CoaseguroDeHonorarios")
    protected TNonNegativeAmount coaseguroDeHonorarios;

    /**
     * Obtiene el valor de la propiedad deducible.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getDeducible() {
        return deducible;
    }

    /**
     * Define el valor de la propiedad deducible.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setDeducible(TNonNegativeAmount value) {
        this.deducible = value;
    }

    /**
     * Obtiene el valor de la propiedad reaseguro.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getReaseguro() {
        return reaseguro;
    }

    /**
     * Define el valor de la propiedad reaseguro.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setReaseguro(TNonNegativeAmount value) {
        this.reaseguro = value;
    }

    /**
     * Obtiene el valor de la propiedad coaseguro.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getCoaseguro() {
        return coaseguro;
    }

    /**
     * Define el valor de la propiedad coaseguro.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setCoaseguro(TNonNegativeAmount value) {
        this.coaseguro = value;
    }

    /**
     * Obtiene el valor de la propiedad coaseguroDeHonorarios.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getCoaseguroDeHonorarios() {
        return coaseguroDeHonorarios;
    }

    /**
     * Define el valor de la propiedad coaseguroDeHonorarios.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setCoaseguroDeHonorarios(TNonNegativeAmount value) {
        this.coaseguroDeHonorarios = value;
    }

}
