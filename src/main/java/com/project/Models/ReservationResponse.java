package com.project.Models;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

//import java.util.Date;

public class ReservationResponse {

    private  int id;
    // Formats output date when this DTO is passed through JSON
    @JsonFormat(pattern = "yyyy-dd-MM")
    // Allows dd/MM/yyyy date to be passed into GET request in JSON
    @DateTimeFormat(pattern = "yyyy-dd-MM")
    private Date checkin;
    // Formats output date when this DTO is passed through JSON
    @JsonFormat(pattern = "yyyy-dd-MM")
    // Allows dd/MM/yyyy date to be passed into GET request in JSON
    @DateTimeFormat(pattern = "yyyy-dd-MM")
    private  Date checkout;

    public ReservationResponse() {
    }

    public ReservationResponse( int id,  Date checkin,  Date checkout) {
        this.id = id;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public  int getId() {
        return id;
    }

    public void setId( int id) {
        this.id = id;
    }


    public  Date getCheckin() {
        return checkin;
    }

    public void setCheckin( Date checkin) {
        this.checkin = checkin;
    }


    public  Date getCheckout() {
        return checkout;
    }

    public void setCheckout( Date checkout) {
        this.checkout = checkout;
    }
}
