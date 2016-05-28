
package mysuite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Corresponde a Response de TransactionTag.
 * 
 * <p>Clase Java para TEmailInstruction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TEmailInstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="To" type="{http://www.fact.com.mx/schema/fx}TEmail"/&gt;
 *         &lt;element name="Cc" type="{http://www.fact.com.mx/schema/fx}TEmail" maxOccurs="10" minOccurs="0"/&gt;
 *         &lt;element name="Bcc" type="{http://www.fact.com.mx/schema/fx}TEmail" maxOccurs="10" minOccurs="0"/&gt;
 *         &lt;element name="Att" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="6" minOccurs="0"/&gt;
 *         &lt;element name="SMTPServer" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;maxLength value="254"/&gt;
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
@XmlType(name = "TEmailInstruction", propOrder = {
    "to",
    "cc",
    "bcc",
    "att",
    "smtpServer"
})
public class TEmailInstruction {

    @XmlElement(name = "To", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String to;
    @XmlElement(name = "Cc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> cc;
    @XmlElement(name = "Bcc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> bcc;
    @XmlElement(name = "Att")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> att;
    @XmlElement(name = "SMTPServer")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String smtpServer;

    /**
     * Obtiene el valor de la propiedad to.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Define el valor de la propiedad to.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the cc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCc() {
        if (cc == null) {
            cc = new ArrayList<String>();
        }
        return this.cc;
    }

    /**
     * Gets the value of the bcc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bcc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBcc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBcc() {
        if (bcc == null) {
            bcc = new ArrayList<String>();
        }
        return this.bcc;
    }

    /**
     * Gets the value of the att property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the att property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAtt() {
        if (att == null) {
            att = new ArrayList<String>();
        }
        return this.att;
    }

    /**
     * Obtiene el valor de la propiedad smtpServer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMTPServer() {
        return smtpServer;
    }

    /**
     * Define el valor de la propiedad smtpServer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMTPServer(String value) {
        this.smtpServer = value;
    }

}
