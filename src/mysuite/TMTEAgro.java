

package mysuite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TMTEAgro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMTEAgro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="p_neta_b1" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="p_neta_b2" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="p_neta_ad" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="gast_exp_b1" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="gast_exp_b2" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="gast_exp_ad" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="p_gob_fed_b1" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="p_gob_fed_b2" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="p_gob_fed_ad" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="total_b1" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="total_b2" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *         &lt;element name="total_ad" type="{http://www.fact.com.mx/schema/fx}TNonNegativeAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMTEAgro", propOrder = {
    "pNetaB1",
    "pNetaB2",
    "pNetaAd",
    "gastExpB1",
    "gastExpB2",
    "gastExpAd",
    "pGobFedB1",
    "pGobFedB2",
    "pGobFedAd",
    "totalB1",
    "totalB2",
    "totalAd"
})
public class TMTEAgro {

    @XmlElement(name = "p_neta_b1")
    protected TNonNegativeAmount pNetaB1;
    @XmlElement(name = "p_neta_b2")
    protected TNonNegativeAmount pNetaB2;
    @XmlElement(name = "p_neta_ad")
    protected TNonNegativeAmount pNetaAd;
    @XmlElement(name = "gast_exp_b1")
    protected TNonNegativeAmount gastExpB1;
    @XmlElement(name = "gast_exp_b2")
    protected TNonNegativeAmount gastExpB2;
    @XmlElement(name = "gast_exp_ad")
    protected TNonNegativeAmount gastExpAd;
    @XmlElement(name = "p_gob_fed_b1")
    protected TNonNegativeAmount pGobFedB1;
    @XmlElement(name = "p_gob_fed_b2")
    protected TNonNegativeAmount pGobFedB2;
    @XmlElement(name = "p_gob_fed_ad")
    protected TNonNegativeAmount pGobFedAd;
    @XmlElement(name = "total_b1")
    protected TNonNegativeAmount totalB1;
    @XmlElement(name = "total_b2")
    protected TNonNegativeAmount totalB2;
    @XmlElement(name = "total_ad")
    protected TNonNegativeAmount totalAd;

    /**
     * Obtiene el valor de la propiedad pNetaB1.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getPNetaB1() {
        return pNetaB1;
    }

    /**
     * Define el valor de la propiedad pNetaB1.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setPNetaB1(TNonNegativeAmount value) {
        this.pNetaB1 = value;
    }

    /**
     * Obtiene el valor de la propiedad pNetaB2.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getPNetaB2() {
        return pNetaB2;
    }

    /**
     * Define el valor de la propiedad pNetaB2.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setPNetaB2(TNonNegativeAmount value) {
        this.pNetaB2 = value;
    }

    /**
     * Obtiene el valor de la propiedad pNetaAd.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getPNetaAd() {
        return pNetaAd;
    }

    /**
     * Define el valor de la propiedad pNetaAd.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setPNetaAd(TNonNegativeAmount value) {
        this.pNetaAd = value;
    }

    /**
     * Obtiene el valor de la propiedad gastExpB1.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getGastExpB1() {
        return gastExpB1;
    }

    /**
     * Define el valor de la propiedad gastExpB1.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setGastExpB1(TNonNegativeAmount value) {
        this.gastExpB1 = value;
    }

    /**
     * Obtiene el valor de la propiedad gastExpB2.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getGastExpB2() {
        return gastExpB2;
    }

    /**
     * Define el valor de la propiedad gastExpB2.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setGastExpB2(TNonNegativeAmount value) {
        this.gastExpB2 = value;
    }

    /**
     * Obtiene el valor de la propiedad gastExpAd.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getGastExpAd() {
        return gastExpAd;
    }

    /**
     * Define el valor de la propiedad gastExpAd.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setGastExpAd(TNonNegativeAmount value) {
        this.gastExpAd = value;
    }

    /**
     * Obtiene el valor de la propiedad pGobFedB1.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getPGobFedB1() {
        return pGobFedB1;
    }

    /**
     * Define el valor de la propiedad pGobFedB1.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setPGobFedB1(TNonNegativeAmount value) {
        this.pGobFedB1 = value;
    }

    /**
     * Obtiene el valor de la propiedad pGobFedB2.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getPGobFedB2() {
        return pGobFedB2;
    }

    /**
     * Define el valor de la propiedad pGobFedB2.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setPGobFedB2(TNonNegativeAmount value) {
        this.pGobFedB2 = value;
    }

    /**
     * Obtiene el valor de la propiedad pGobFedAd.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getPGobFedAd() {
        return pGobFedAd;
    }

    /**
     * Define el valor de la propiedad pGobFedAd.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setPGobFedAd(TNonNegativeAmount value) {
        this.pGobFedAd = value;
    }

    /**
     * Obtiene el valor de la propiedad totalB1.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalB1() {
        return totalB1;
    }

    /**
     * Define el valor de la propiedad totalB1.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalB1(TNonNegativeAmount value) {
        this.totalB1 = value;
    }

    /**
     * Obtiene el valor de la propiedad totalB2.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalB2() {
        return totalB2;
    }

    /**
     * Define el valor de la propiedad totalB2.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalB2(TNonNegativeAmount value) {
        this.totalB2 = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAd.
     * 
     * @return
     *     possible object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public TNonNegativeAmount getTotalAd() {
        return totalAd;
    }

    /**
     * Define el valor de la propiedad totalAd.
     * 
     * @param value
     *     allowed object is
     *     {@link TNonNegativeAmount }
     *     
     */
    public void setTotalAd(TNonNegativeAmount value) {
        this.totalAd = value;
    }

}
