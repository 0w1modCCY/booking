package cz.cvut.fit.niam1.wsserver;

import https.courses_fit_cvut_cz.ni_am1.tutorials.web_services.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class WebServiceRepository {

    private static final List<Booking> bookings = new ArrayList<>();

    @PostConstruct
    public void initRepo(){
        Passenger p1 = new Passenger();
        p1.setId(1);
        p1.setName("victor");
        p1.setEmail("vma@vma.es");
        p1.setAge(21);

        LocalDateTime departure1 = LocalDateTime.of(2021,12,15,10,00);
        Flight f1 = new Flight();
        f1.setId(1);
        f1.setSchedule(departure1);
        f1.setAirport("PRG");

        LocalDateTime arrival1 = LocalDateTime.of(2021,12,15,12,00);
        Flight f2 = new Flight();
        f2.setId(2);
        f2.setSchedule(arrival1);
        f2.setAirport("MAD");

        LocalDateTime departure2 = LocalDateTime.of(2022,1,4,14,00);
        Flight f3 = new Flight();
        f3.setId(3);
        f3.setSchedule(departure2);
        f3.setAirport("MAD");

        LocalDateTime arrival2 = LocalDateTime.of(2022,1,4,16,00);
        Flight f4 = new Flight();
        f4.setId(4);
        f4.setSchedule(departure1);
        f4.setAirport("PRG");

        Booking b1 = new Booking();
        b1.setId(1);
        b1.setPassenger(p1);
        b1.setDeparture(f1);
        b1.setArrival(f2);

        Booking b2 = new Booking();
        b1.setId(2);
        b1.setPassenger(p1);
        b1.setDeparture(f3);
        b1.setArrival(f4);
    }


    public void addBooking(Booking booking){
        bookings.add(booking);
    }

    public List<Booking> getBookings(){
        return bookings;
    }

    public void deleteBooking(Booking booking){bookings.removeIf(b -> b.getId() == (booking.getId()));}

    public void updateBooking(Booking booking){
        bookings.remove(booking.getId());
        bookings.add(booking);

    }

}
