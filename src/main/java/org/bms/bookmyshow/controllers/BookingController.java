package org.bms.bookmyshow.controllers;


import org.bms.bookmyshow.dto.BookTicketRequestDTO;
import org.bms.bookmyshow.dto.BookTicketResponseDTO;
import org.bms.bookmyshow.dto.ResponseStatus;
import org.bms.bookmyshow.models.Booking;
import org.bms.bookmyshow.services.BookingService;

public class BookingController {
    private BookingService bookingService;

    BookingController (BookingService bookingService) {
        this.bookingService = bookingService;
    }
    public BookTicketResponseDTO bookticket(BookTicketRequestDTO bookTicketRequestDTO) {
        BookTicketResponseDTO response = new BookTicketResponseDTO();

        try {
            Booking booking = bookingService.bookTicket(
                    bookTicketRequestDTO.getShowSeatIds(),
                    bookTicketRequestDTO.getShowId(),
                    bookTicketRequestDTO.getUserId()
            );
            response.setBookingId(booking.getId());
            response.setAmount(booking.getAmount());
            response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch(Exception e) {
            response.setResponseStatus(ResponseStatus.SUCCESS);
        }
        return response;
    }
}
