//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.12.06 a las 09:39:05 PM CET 
//


package https.courses_fit_cvut_cz.ni_am1.tutorials.web_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para booking complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="booking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="passenger" type="{https://courses.fit.cvut.cz/NI-AM1/tutorials/web-services/}passenger"/&gt;
 *         &lt;element name="departure" type="{https://courses.fit.cvut.cz/NI-AM1/tutorials/web-services/}flight"/&gt;
 *         &lt;element name="arrival" type="{https://courses.fit.cvut.cz/NI-AM1/tutorials/web-services/}flight"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "booking", propOrder = {
    "id",
    "passenger",
    "departure",
    "arrival"
})
public class Booking {

    protected int id;
    @XmlElement(required = true)
    protected Passenger passenger;
    @XmlElement(required = true)
    protected Flight departure;
    @XmlElement(required = true)
    protected Flight arrival;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad passenger.
     * 
     * @return
     *     possible object is
     *     {@link Passenger }
     *     
     */
    public Passenger getPassenger() {
        return passenger;
    }

    /**
     * Define el valor de la propiedad passenger.
     * 
     * @param value
     *     allowed object is
     *     {@link Passenger }
     *     
     */
    public void setPassenger(Passenger value) {
        this.passenger = value;
    }

    /**
     * Obtiene el valor de la propiedad departure.
     * 
     * @return
     *     possible object is
     *     {@link Flight }
     *     
     */
    public Flight getDeparture() {
        return departure;
    }

    /**
     * Define el valor de la propiedad departure.
     * 
     * @param value
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setDeparture(Flight value) {
        this.departure = value;
    }

    /**
     * Obtiene el valor de la propiedad arrival.
     * 
     * @return
     *     possible object is
     *     {@link Flight }
     *     
     */
    public Flight getArrival() {
        return arrival;
    }

    /**
     * Define el valor de la propiedad arrival.
     * 
     * @param value
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setArrival(Flight value) {
        this.arrival = value;
    }

}
