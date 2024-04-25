package org.bms.bookmyshow.services;

import jakarta.transaction.Transactional;
import org.bms.bookmyshow.models.Booking;
import org.springframework.transaction.annotation.Isolation;

import java.util.List;

public class BookingService {
    @Transactional(isolation=Isolation.SERIALIZABLE)
    public Booking bookTicket(List<Integer> showSeatIds, int showId, int userId){
        return null;
    }
}
