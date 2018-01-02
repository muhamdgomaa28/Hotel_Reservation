package com.project.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

//import java.util.Date;
public class ReservationRequest {

    private int id;
    private int roomId;
    @JsonFormat(pattern = "yyyy-dd-MM")
    @DateTimeFormat(pattern = "yyyy-dd-MM")
    private Date checkin;
    @JsonFormat(pattern = "yyyy-dd-MM")
    @DateTimeFormat(pattern = "yyyy-dd-MM")
    private Date checkout;

    public ReservationRequest() {
    }

    public ReservationRequest(int id, int roomId,  Date checkin,  Date checkout) {
        this.id = id;
        this.roomId = roomId;
        this.checkin = checkin;
        this.checkout = checkout;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
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
