package org.bms.bookmyshow.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTicketResponseDTO {
    private ResponseStatus responseStatus;
    private int bookingId;
    private int amount;

}
