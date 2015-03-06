
package org.openestate.io.immoxml.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.immoxml.de}zimmer" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.immoxml.de}wohnung" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.immoxml.de}haus" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.immoxml.de}grundstueck" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.immoxml.de}buero_praxen" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.immoxml.de}einzelhandel" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.immoxml.de}gastgewerbe" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.immoxml.de}hallen_lager_prod" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.immoxml.de}land_und_forstwirtschaft" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.immoxml.de}sonstige" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.immoxml.de}freizeitimmobilie_gewerblich" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.immoxml.de}zinshaus_renditeobjekt" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zimmer",
    "wohnung",
    "haus",
    "grundstueck",
    "bueroPraxen",
    "einzelhandel",
    "gastgewerbe",
    "hallenLagerProd",
    "landUndForstwirtschaft",
    "sonstige",
    "freizeitimmobilieGewerblich",
    "zinshausRenditeobjekt"
})
@XmlRootElement(name = "objektart")
public class Objektart
    implements Cloneable, CopyTo, Equals, ToString
{

    protected List<Zimmer> zimmer;
    protected List<Wohnung> wohnung;
    protected List<Haus> haus;
    protected List<Grundstueck> grundstueck;
    @XmlElement(name = "buero_praxen")
    protected List<BueroPraxen> bueroPraxen;
    protected List<Einzelhandel> einzelhandel;
    protected List<Gastgewerbe> gastgewerbe;
    @XmlElement(name = "hallen_lager_prod")
    protected List<HallenLagerProd> hallenLagerProd;
    @XmlElement(name = "land_und_forstwirtschaft")
    protected List<LandUndForstwirtschaft> landUndForstwirtschaft;
    protected List<Sonstige> sonstige;
    @XmlElement(name = "freizeitimmobilie_gewerblich")
    protected List<FreizeitimmobilieGewerblich> freizeitimmobilieGewerblich;
    @XmlElement(name = "zinshaus_renditeobjekt")
    protected List<ZinshausRenditeobjekt> zinshausRenditeobjekt;

    /**
     * Gets the value of the zimmer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zimmer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZimmer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Zimmer }
     * 
     * 
     */
    public List<Zimmer> getZimmer() {
        if (zimmer == null) {
            zimmer = new ArrayList<Zimmer>();
        }
        return this.zimmer;
    }

    /**
     * Gets the value of the wohnung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wohnung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWohnung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Wohnung }
     * 
     * 
     */
    public List<Wohnung> getWohnung() {
        if (wohnung == null) {
            wohnung = new ArrayList<Wohnung>();
        }
        return this.wohnung;
    }

    /**
     * Gets the value of the haus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the haus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHaus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Haus }
     * 
     * 
     */
    public List<Haus> getHaus() {
        if (haus == null) {
            haus = new ArrayList<Haus>();
        }
        return this.haus;
    }

    /**
     * Gets the value of the grundstueck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grundstueck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrundstueck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Grundstueck }
     * 
     * 
     */
    public List<Grundstueck> getGrundstueck() {
        if (grundstueck == null) {
            grundstueck = new ArrayList<Grundstueck>();
        }
        return this.grundstueck;
    }

    /**
     * Gets the value of the bueroPraxen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bueroPraxen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBueroPraxen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BueroPraxen }
     * 
     * 
     */
    public List<BueroPraxen> getBueroPraxen() {
        if (bueroPraxen == null) {
            bueroPraxen = new ArrayList<BueroPraxen>();
        }
        return this.bueroPraxen;
    }

    /**
     * Gets the value of the einzelhandel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the einzelhandel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEinzelhandel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Einzelhandel }
     * 
     * 
     */
    public List<Einzelhandel> getEinzelhandel() {
        if (einzelhandel == null) {
            einzelhandel = new ArrayList<Einzelhandel>();
        }
        return this.einzelhandel;
    }

    /**
     * Gets the value of the gastgewerbe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gastgewerbe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGastgewerbe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Gastgewerbe }
     * 
     * 
     */
    public List<Gastgewerbe> getGastgewerbe() {
        if (gastgewerbe == null) {
            gastgewerbe = new ArrayList<Gastgewerbe>();
        }
        return this.gastgewerbe;
    }

    /**
     * Gets the value of the hallenLagerProd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hallenLagerProd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHallenLagerProd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HallenLagerProd }
     * 
     * 
     */
    public List<HallenLagerProd> getHallenLagerProd() {
        if (hallenLagerProd == null) {
            hallenLagerProd = new ArrayList<HallenLagerProd>();
        }
        return this.hallenLagerProd;
    }

    /**
     * Gets the value of the landUndForstwirtschaft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the landUndForstwirtschaft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandUndForstwirtschaft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LandUndForstwirtschaft }
     * 
     * 
     */
    public List<LandUndForstwirtschaft> getLandUndForstwirtschaft() {
        if (landUndForstwirtschaft == null) {
            landUndForstwirtschaft = new ArrayList<LandUndForstwirtschaft>();
        }
        return this.landUndForstwirtschaft;
    }

    /**
     * Gets the value of the sonstige property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sonstige property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSonstige().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sonstige }
     * 
     * 
     */
    public List<Sonstige> getSonstige() {
        if (sonstige == null) {
            sonstige = new ArrayList<Sonstige>();
        }
        return this.sonstige;
    }

    /**
     * Gets the value of the freizeitimmobilieGewerblich property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freizeitimmobilieGewerblich property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreizeitimmobilieGewerblich().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreizeitimmobilieGewerblich }
     * 
     * 
     */
    public List<FreizeitimmobilieGewerblich> getFreizeitimmobilieGewerblich() {
        if (freizeitimmobilieGewerblich == null) {
            freizeitimmobilieGewerblich = new ArrayList<FreizeitimmobilieGewerblich>();
        }
        return this.freizeitimmobilieGewerblich;
    }

    /**
     * Gets the value of the zinshausRenditeobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zinshausRenditeobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZinshausRenditeobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZinshausRenditeobjekt }
     * 
     * 
     */
    public List<ZinshausRenditeobjekt> getZinshausRenditeobjekt() {
        if (zinshausRenditeobjekt == null) {
            zinshausRenditeobjekt = new ArrayList<ZinshausRenditeobjekt>();
        }
        return this.zinshausRenditeobjekt;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<Zimmer> theZimmer;
            theZimmer = (((this.zimmer!= null)&&(!this.zimmer.isEmpty()))?this.getZimmer():null);
            strategy.appendField(locator, this, "zimmer", buffer, theZimmer);
        }
        {
            List<Wohnung> theWohnung;
            theWohnung = (((this.wohnung!= null)&&(!this.wohnung.isEmpty()))?this.getWohnung():null);
            strategy.appendField(locator, this, "wohnung", buffer, theWohnung);
        }
        {
            List<Haus> theHaus;
            theHaus = (((this.haus!= null)&&(!this.haus.isEmpty()))?this.getHaus():null);
            strategy.appendField(locator, this, "haus", buffer, theHaus);
        }
        {
            List<Grundstueck> theGrundstueck;
            theGrundstueck = (((this.grundstueck!= null)&&(!this.grundstueck.isEmpty()))?this.getGrundstueck():null);
            strategy.appendField(locator, this, "grundstueck", buffer, theGrundstueck);
        }
        {
            List<BueroPraxen> theBueroPraxen;
            theBueroPraxen = (((this.bueroPraxen!= null)&&(!this.bueroPraxen.isEmpty()))?this.getBueroPraxen():null);
            strategy.appendField(locator, this, "bueroPraxen", buffer, theBueroPraxen);
        }
        {
            List<Einzelhandel> theEinzelhandel;
            theEinzelhandel = (((this.einzelhandel!= null)&&(!this.einzelhandel.isEmpty()))?this.getEinzelhandel():null);
            strategy.appendField(locator, this, "einzelhandel", buffer, theEinzelhandel);
        }
        {
            List<Gastgewerbe> theGastgewerbe;
            theGastgewerbe = (((this.gastgewerbe!= null)&&(!this.gastgewerbe.isEmpty()))?this.getGastgewerbe():null);
            strategy.appendField(locator, this, "gastgewerbe", buffer, theGastgewerbe);
        }
        {
            List<HallenLagerProd> theHallenLagerProd;
            theHallenLagerProd = (((this.hallenLagerProd!= null)&&(!this.hallenLagerProd.isEmpty()))?this.getHallenLagerProd():null);
            strategy.appendField(locator, this, "hallenLagerProd", buffer, theHallenLagerProd);
        }
        {
            List<LandUndForstwirtschaft> theLandUndForstwirtschaft;
            theLandUndForstwirtschaft = (((this.landUndForstwirtschaft!= null)&&(!this.landUndForstwirtschaft.isEmpty()))?this.getLandUndForstwirtschaft():null);
            strategy.appendField(locator, this, "landUndForstwirtschaft", buffer, theLandUndForstwirtschaft);
        }
        {
            List<Sonstige> theSonstige;
            theSonstige = (((this.sonstige!= null)&&(!this.sonstige.isEmpty()))?this.getSonstige():null);
            strategy.appendField(locator, this, "sonstige", buffer, theSonstige);
        }
        {
            List<FreizeitimmobilieGewerblich> theFreizeitimmobilieGewerblich;
            theFreizeitimmobilieGewerblich = (((this.freizeitimmobilieGewerblich!= null)&&(!this.freizeitimmobilieGewerblich.isEmpty()))?this.getFreizeitimmobilieGewerblich():null);
            strategy.appendField(locator, this, "freizeitimmobilieGewerblich", buffer, theFreizeitimmobilieGewerblich);
        }
        {
            List<ZinshausRenditeobjekt> theZinshausRenditeobjekt;
            theZinshausRenditeobjekt = (((this.zinshausRenditeobjekt!= null)&&(!this.zinshausRenditeobjekt.isEmpty()))?this.getZinshausRenditeobjekt():null);
            strategy.appendField(locator, this, "zinshausRenditeobjekt", buffer, theZinshausRenditeobjekt);
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Objektart) {
            final Objektart copy = ((Objektart) draftCopy);
            if ((this.zimmer!= null)&&(!this.zimmer.isEmpty())) {
                List<Zimmer> sourceZimmer;
                sourceZimmer = (((this.zimmer!= null)&&(!this.zimmer.isEmpty()))?this.getZimmer():null);
                @SuppressWarnings("unchecked")
                List<Zimmer> copyZimmer = ((List<Zimmer> ) strategy.copy(LocatorUtils.property(locator, "zimmer", sourceZimmer), sourceZimmer));
                copy.zimmer = null;
                if (copyZimmer!= null) {
                    List<Zimmer> uniqueZimmerl = copy.getZimmer();
                    uniqueZimmerl.addAll(copyZimmer);
                }
            } else {
                copy.zimmer = null;
            }
            if ((this.wohnung!= null)&&(!this.wohnung.isEmpty())) {
                List<Wohnung> sourceWohnung;
                sourceWohnung = (((this.wohnung!= null)&&(!this.wohnung.isEmpty()))?this.getWohnung():null);
                @SuppressWarnings("unchecked")
                List<Wohnung> copyWohnung = ((List<Wohnung> ) strategy.copy(LocatorUtils.property(locator, "wohnung", sourceWohnung), sourceWohnung));
                copy.wohnung = null;
                if (copyWohnung!= null) {
                    List<Wohnung> uniqueWohnungl = copy.getWohnung();
                    uniqueWohnungl.addAll(copyWohnung);
                }
            } else {
                copy.wohnung = null;
            }
            if ((this.haus!= null)&&(!this.haus.isEmpty())) {
                List<Haus> sourceHaus;
                sourceHaus = (((this.haus!= null)&&(!this.haus.isEmpty()))?this.getHaus():null);
                @SuppressWarnings("unchecked")
                List<Haus> copyHaus = ((List<Haus> ) strategy.copy(LocatorUtils.property(locator, "haus", sourceHaus), sourceHaus));
                copy.haus = null;
                if (copyHaus!= null) {
                    List<Haus> uniqueHausl = copy.getHaus();
                    uniqueHausl.addAll(copyHaus);
                }
            } else {
                copy.haus = null;
            }
            if ((this.grundstueck!= null)&&(!this.grundstueck.isEmpty())) {
                List<Grundstueck> sourceGrundstueck;
                sourceGrundstueck = (((this.grundstueck!= null)&&(!this.grundstueck.isEmpty()))?this.getGrundstueck():null);
                @SuppressWarnings("unchecked")
                List<Grundstueck> copyGrundstueck = ((List<Grundstueck> ) strategy.copy(LocatorUtils.property(locator, "grundstueck", sourceGrundstueck), sourceGrundstueck));
                copy.grundstueck = null;
                if (copyGrundstueck!= null) {
                    List<Grundstueck> uniqueGrundstueckl = copy.getGrundstueck();
                    uniqueGrundstueckl.addAll(copyGrundstueck);
                }
            } else {
                copy.grundstueck = null;
            }
            if ((this.bueroPraxen!= null)&&(!this.bueroPraxen.isEmpty())) {
                List<BueroPraxen> sourceBueroPraxen;
                sourceBueroPraxen = (((this.bueroPraxen!= null)&&(!this.bueroPraxen.isEmpty()))?this.getBueroPraxen():null);
                @SuppressWarnings("unchecked")
                List<BueroPraxen> copyBueroPraxen = ((List<BueroPraxen> ) strategy.copy(LocatorUtils.property(locator, "bueroPraxen", sourceBueroPraxen), sourceBueroPraxen));
                copy.bueroPraxen = null;
                if (copyBueroPraxen!= null) {
                    List<BueroPraxen> uniqueBueroPraxenl = copy.getBueroPraxen();
                    uniqueBueroPraxenl.addAll(copyBueroPraxen);
                }
            } else {
                copy.bueroPraxen = null;
            }
            if ((this.einzelhandel!= null)&&(!this.einzelhandel.isEmpty())) {
                List<Einzelhandel> sourceEinzelhandel;
                sourceEinzelhandel = (((this.einzelhandel!= null)&&(!this.einzelhandel.isEmpty()))?this.getEinzelhandel():null);
                @SuppressWarnings("unchecked")
                List<Einzelhandel> copyEinzelhandel = ((List<Einzelhandel> ) strategy.copy(LocatorUtils.property(locator, "einzelhandel", sourceEinzelhandel), sourceEinzelhandel));
                copy.einzelhandel = null;
                if (copyEinzelhandel!= null) {
                    List<Einzelhandel> uniqueEinzelhandell = copy.getEinzelhandel();
                    uniqueEinzelhandell.addAll(copyEinzelhandel);
                }
            } else {
                copy.einzelhandel = null;
            }
            if ((this.gastgewerbe!= null)&&(!this.gastgewerbe.isEmpty())) {
                List<Gastgewerbe> sourceGastgewerbe;
                sourceGastgewerbe = (((this.gastgewerbe!= null)&&(!this.gastgewerbe.isEmpty()))?this.getGastgewerbe():null);
                @SuppressWarnings("unchecked")
                List<Gastgewerbe> copyGastgewerbe = ((List<Gastgewerbe> ) strategy.copy(LocatorUtils.property(locator, "gastgewerbe", sourceGastgewerbe), sourceGastgewerbe));
                copy.gastgewerbe = null;
                if (copyGastgewerbe!= null) {
                    List<Gastgewerbe> uniqueGastgewerbel = copy.getGastgewerbe();
                    uniqueGastgewerbel.addAll(copyGastgewerbe);
                }
            } else {
                copy.gastgewerbe = null;
            }
            if ((this.hallenLagerProd!= null)&&(!this.hallenLagerProd.isEmpty())) {
                List<HallenLagerProd> sourceHallenLagerProd;
                sourceHallenLagerProd = (((this.hallenLagerProd!= null)&&(!this.hallenLagerProd.isEmpty()))?this.getHallenLagerProd():null);
                @SuppressWarnings("unchecked")
                List<HallenLagerProd> copyHallenLagerProd = ((List<HallenLagerProd> ) strategy.copy(LocatorUtils.property(locator, "hallenLagerProd", sourceHallenLagerProd), sourceHallenLagerProd));
                copy.hallenLagerProd = null;
                if (copyHallenLagerProd!= null) {
                    List<HallenLagerProd> uniqueHallenLagerProdl = copy.getHallenLagerProd();
                    uniqueHallenLagerProdl.addAll(copyHallenLagerProd);
                }
            } else {
                copy.hallenLagerProd = null;
            }
            if ((this.landUndForstwirtschaft!= null)&&(!this.landUndForstwirtschaft.isEmpty())) {
                List<LandUndForstwirtschaft> sourceLandUndForstwirtschaft;
                sourceLandUndForstwirtschaft = (((this.landUndForstwirtschaft!= null)&&(!this.landUndForstwirtschaft.isEmpty()))?this.getLandUndForstwirtschaft():null);
                @SuppressWarnings("unchecked")
                List<LandUndForstwirtschaft> copyLandUndForstwirtschaft = ((List<LandUndForstwirtschaft> ) strategy.copy(LocatorUtils.property(locator, "landUndForstwirtschaft", sourceLandUndForstwirtschaft), sourceLandUndForstwirtschaft));
                copy.landUndForstwirtschaft = null;
                if (copyLandUndForstwirtschaft!= null) {
                    List<LandUndForstwirtschaft> uniqueLandUndForstwirtschaftl = copy.getLandUndForstwirtschaft();
                    uniqueLandUndForstwirtschaftl.addAll(copyLandUndForstwirtschaft);
                }
            } else {
                copy.landUndForstwirtschaft = null;
            }
            if ((this.sonstige!= null)&&(!this.sonstige.isEmpty())) {
                List<Sonstige> sourceSonstige;
                sourceSonstige = (((this.sonstige!= null)&&(!this.sonstige.isEmpty()))?this.getSonstige():null);
                @SuppressWarnings("unchecked")
                List<Sonstige> copySonstige = ((List<Sonstige> ) strategy.copy(LocatorUtils.property(locator, "sonstige", sourceSonstige), sourceSonstige));
                copy.sonstige = null;
                if (copySonstige!= null) {
                    List<Sonstige> uniqueSonstigel = copy.getSonstige();
                    uniqueSonstigel.addAll(copySonstige);
                }
            } else {
                copy.sonstige = null;
            }
            if ((this.freizeitimmobilieGewerblich!= null)&&(!this.freizeitimmobilieGewerblich.isEmpty())) {
                List<FreizeitimmobilieGewerblich> sourceFreizeitimmobilieGewerblich;
                sourceFreizeitimmobilieGewerblich = (((this.freizeitimmobilieGewerblich!= null)&&(!this.freizeitimmobilieGewerblich.isEmpty()))?this.getFreizeitimmobilieGewerblich():null);
                @SuppressWarnings("unchecked")
                List<FreizeitimmobilieGewerblich> copyFreizeitimmobilieGewerblich = ((List<FreizeitimmobilieGewerblich> ) strategy.copy(LocatorUtils.property(locator, "freizeitimmobilieGewerblich", sourceFreizeitimmobilieGewerblich), sourceFreizeitimmobilieGewerblich));
                copy.freizeitimmobilieGewerblich = null;
                if (copyFreizeitimmobilieGewerblich!= null) {
                    List<FreizeitimmobilieGewerblich> uniqueFreizeitimmobilieGewerblichl = copy.getFreizeitimmobilieGewerblich();
                    uniqueFreizeitimmobilieGewerblichl.addAll(copyFreizeitimmobilieGewerblich);
                }
            } else {
                copy.freizeitimmobilieGewerblich = null;
            }
            if ((this.zinshausRenditeobjekt!= null)&&(!this.zinshausRenditeobjekt.isEmpty())) {
                List<ZinshausRenditeobjekt> sourceZinshausRenditeobjekt;
                sourceZinshausRenditeobjekt = (((this.zinshausRenditeobjekt!= null)&&(!this.zinshausRenditeobjekt.isEmpty()))?this.getZinshausRenditeobjekt():null);
                @SuppressWarnings("unchecked")
                List<ZinshausRenditeobjekt> copyZinshausRenditeobjekt = ((List<ZinshausRenditeobjekt> ) strategy.copy(LocatorUtils.property(locator, "zinshausRenditeobjekt", sourceZinshausRenditeobjekt), sourceZinshausRenditeobjekt));
                copy.zinshausRenditeobjekt = null;
                if (copyZinshausRenditeobjekt!= null) {
                    List<ZinshausRenditeobjekt> uniqueZinshausRenditeobjektl = copy.getZinshausRenditeobjekt();
                    uniqueZinshausRenditeobjektl.addAll(copyZinshausRenditeobjekt);
                }
            } else {
                copy.zinshausRenditeobjekt = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Objektart();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Objektart)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Objektart that = ((Objektart) object);
        {
            List<Zimmer> lhsZimmer;
            lhsZimmer = (((this.zimmer!= null)&&(!this.zimmer.isEmpty()))?this.getZimmer():null);
            List<Zimmer> rhsZimmer;
            rhsZimmer = (((that.zimmer!= null)&&(!that.zimmer.isEmpty()))?that.getZimmer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zimmer", lhsZimmer), LocatorUtils.property(thatLocator, "zimmer", rhsZimmer), lhsZimmer, rhsZimmer)) {
                return false;
            }
        }
        {
            List<Wohnung> lhsWohnung;
            lhsWohnung = (((this.wohnung!= null)&&(!this.wohnung.isEmpty()))?this.getWohnung():null);
            List<Wohnung> rhsWohnung;
            rhsWohnung = (((that.wohnung!= null)&&(!that.wohnung.isEmpty()))?that.getWohnung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnung", lhsWohnung), LocatorUtils.property(thatLocator, "wohnung", rhsWohnung), lhsWohnung, rhsWohnung)) {
                return false;
            }
        }
        {
            List<Haus> lhsHaus;
            lhsHaus = (((this.haus!= null)&&(!this.haus.isEmpty()))?this.getHaus():null);
            List<Haus> rhsHaus;
            rhsHaus = (((that.haus!= null)&&(!that.haus.isEmpty()))?that.getHaus():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haus", lhsHaus), LocatorUtils.property(thatLocator, "haus", rhsHaus), lhsHaus, rhsHaus)) {
                return false;
            }
        }
        {
            List<Grundstueck> lhsGrundstueck;
            lhsGrundstueck = (((this.grundstueck!= null)&&(!this.grundstueck.isEmpty()))?this.getGrundstueck():null);
            List<Grundstueck> rhsGrundstueck;
            rhsGrundstueck = (((that.grundstueck!= null)&&(!that.grundstueck.isEmpty()))?that.getGrundstueck():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grundstueck", lhsGrundstueck), LocatorUtils.property(thatLocator, "grundstueck", rhsGrundstueck), lhsGrundstueck, rhsGrundstueck)) {
                return false;
            }
        }
        {
            List<BueroPraxen> lhsBueroPraxen;
            lhsBueroPraxen = (((this.bueroPraxen!= null)&&(!this.bueroPraxen.isEmpty()))?this.getBueroPraxen():null);
            List<BueroPraxen> rhsBueroPraxen;
            rhsBueroPraxen = (((that.bueroPraxen!= null)&&(!that.bueroPraxen.isEmpty()))?that.getBueroPraxen():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bueroPraxen", lhsBueroPraxen), LocatorUtils.property(thatLocator, "bueroPraxen", rhsBueroPraxen), lhsBueroPraxen, rhsBueroPraxen)) {
                return false;
            }
        }
        {
            List<Einzelhandel> lhsEinzelhandel;
            lhsEinzelhandel = (((this.einzelhandel!= null)&&(!this.einzelhandel.isEmpty()))?this.getEinzelhandel():null);
            List<Einzelhandel> rhsEinzelhandel;
            rhsEinzelhandel = (((that.einzelhandel!= null)&&(!that.einzelhandel.isEmpty()))?that.getEinzelhandel():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einzelhandel", lhsEinzelhandel), LocatorUtils.property(thatLocator, "einzelhandel", rhsEinzelhandel), lhsEinzelhandel, rhsEinzelhandel)) {
                return false;
            }
        }
        {
            List<Gastgewerbe> lhsGastgewerbe;
            lhsGastgewerbe = (((this.gastgewerbe!= null)&&(!this.gastgewerbe.isEmpty()))?this.getGastgewerbe():null);
            List<Gastgewerbe> rhsGastgewerbe;
            rhsGastgewerbe = (((that.gastgewerbe!= null)&&(!that.gastgewerbe.isEmpty()))?that.getGastgewerbe():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gastgewerbe", lhsGastgewerbe), LocatorUtils.property(thatLocator, "gastgewerbe", rhsGastgewerbe), lhsGastgewerbe, rhsGastgewerbe)) {
                return false;
            }
        }
        {
            List<HallenLagerProd> lhsHallenLagerProd;
            lhsHallenLagerProd = (((this.hallenLagerProd!= null)&&(!this.hallenLagerProd.isEmpty()))?this.getHallenLagerProd():null);
            List<HallenLagerProd> rhsHallenLagerProd;
            rhsHallenLagerProd = (((that.hallenLagerProd!= null)&&(!that.hallenLagerProd.isEmpty()))?that.getHallenLagerProd():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hallenLagerProd", lhsHallenLagerProd), LocatorUtils.property(thatLocator, "hallenLagerProd", rhsHallenLagerProd), lhsHallenLagerProd, rhsHallenLagerProd)) {
                return false;
            }
        }
        {
            List<LandUndForstwirtschaft> lhsLandUndForstwirtschaft;
            lhsLandUndForstwirtschaft = (((this.landUndForstwirtschaft!= null)&&(!this.landUndForstwirtschaft.isEmpty()))?this.getLandUndForstwirtschaft():null);
            List<LandUndForstwirtschaft> rhsLandUndForstwirtschaft;
            rhsLandUndForstwirtschaft = (((that.landUndForstwirtschaft!= null)&&(!that.landUndForstwirtschaft.isEmpty()))?that.getLandUndForstwirtschaft():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "landUndForstwirtschaft", lhsLandUndForstwirtschaft), LocatorUtils.property(thatLocator, "landUndForstwirtschaft", rhsLandUndForstwirtschaft), lhsLandUndForstwirtschaft, rhsLandUndForstwirtschaft)) {
                return false;
            }
        }
        {
            List<Sonstige> lhsSonstige;
            lhsSonstige = (((this.sonstige!= null)&&(!this.sonstige.isEmpty()))?this.getSonstige():null);
            List<Sonstige> rhsSonstige;
            rhsSonstige = (((that.sonstige!= null)&&(!that.sonstige.isEmpty()))?that.getSonstige():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstige", lhsSonstige), LocatorUtils.property(thatLocator, "sonstige", rhsSonstige), lhsSonstige, rhsSonstige)) {
                return false;
            }
        }
        {
            List<FreizeitimmobilieGewerblich> lhsFreizeitimmobilieGewerblich;
            lhsFreizeitimmobilieGewerblich = (((this.freizeitimmobilieGewerblich!= null)&&(!this.freizeitimmobilieGewerblich.isEmpty()))?this.getFreizeitimmobilieGewerblich():null);
            List<FreizeitimmobilieGewerblich> rhsFreizeitimmobilieGewerblich;
            rhsFreizeitimmobilieGewerblich = (((that.freizeitimmobilieGewerblich!= null)&&(!that.freizeitimmobilieGewerblich.isEmpty()))?that.getFreizeitimmobilieGewerblich():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freizeitimmobilieGewerblich", lhsFreizeitimmobilieGewerblich), LocatorUtils.property(thatLocator, "freizeitimmobilieGewerblich", rhsFreizeitimmobilieGewerblich), lhsFreizeitimmobilieGewerblich, rhsFreizeitimmobilieGewerblich)) {
                return false;
            }
        }
        {
            List<ZinshausRenditeobjekt> lhsZinshausRenditeobjekt;
            lhsZinshausRenditeobjekt = (((this.zinshausRenditeobjekt!= null)&&(!this.zinshausRenditeobjekt.isEmpty()))?this.getZinshausRenditeobjekt():null);
            List<ZinshausRenditeobjekt> rhsZinshausRenditeobjekt;
            rhsZinshausRenditeobjekt = (((that.zinshausRenditeobjekt!= null)&&(!that.zinshausRenditeobjekt.isEmpty()))?that.getZinshausRenditeobjekt():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zinshausRenditeobjekt", lhsZinshausRenditeobjekt), LocatorUtils.property(thatLocator, "zinshausRenditeobjekt", rhsZinshausRenditeobjekt), lhsZinshausRenditeobjekt, rhsZinshausRenditeobjekt)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
