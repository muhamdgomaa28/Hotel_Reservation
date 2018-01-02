package com.project.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.time.LocalDate;
//import java.util.Date;

@Entity
@Table(name = "Reservation")
public class ReservationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    // Formats output date when this DTO is passed through JSON
    @JsonFormat(pattern = "dd-MM-yyyy")
    // Allows dd/MM/yyyy date to be passed into GET request in JSON
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @NotNull
    private Date checkin;
    // Formats output date when this DTO is passed through JSON
    @JsonFormat(pattern = "dd-MM-yyyy")
    // Allows dd/MM/yyyy date to be passed into GET request in JSON
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @NotNull
    private  Date checkout;

    @ManyToOne
    private RoomEntity roomEntity;

    public ReservationEntity() {
    }

    public ReservationEntity( Date checkin,  Date checkout, RoomEntity roomEntity) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.roomEntity = roomEntity;
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

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public  Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public RoomEntity getRoomEntity() {
        return roomEntity;
    }

    public void setRoomEntity(RoomEntity roomEntity) {
        this.roomEntity = roomEntity;
    }

    @Override
    public String toString() {
        return "ReservationEntity{" +
                "id=" + id +
                ", checkin=" + checkin +
                ", checkout=" + checkout +
                ", roomEntity=" + roomEntity +
                '}';
    }
}