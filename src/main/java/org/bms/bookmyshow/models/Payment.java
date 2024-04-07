package org.bms.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment extends BaseModel{
    private int amount;
    private int refNo;
    private PaymentMode paymentMode;
    private PaymentProvider paymentProvider;
    private PaymentStatus paymentStatus;

}
