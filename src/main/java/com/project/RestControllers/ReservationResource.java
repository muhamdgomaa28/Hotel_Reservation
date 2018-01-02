package com.project.RestControllers;

import com.project.Dao.PageableRoomRepository;
import com.project.Dao.ReservationRepository;
import com.project.Dao.RoomRepository;
import com.project.Models.*;
import com.project.Services.RoomServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(ResourceConstants.ROOM_RESERVATION_V1)
@CrossOrigin
public class ReservationResource {
    @Autowired
    RoomRepository roomrepo;
    @Autowired
    ReservationRepository reservropo;
    @Autowired
    ConversionService conversionService;
    @Autowired
    PageableRoomRepository pageableRoomRepository;


    @Autowired
    RoomServices rs;

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Page<RoomEntity> getAvailableRooms(
            @RequestParam(name = "checkin")
            @DateTimeFormat(pattern = "yyyy-dd-MM")
                    Date checkin,
            @RequestParam(name = "checkout")
            @DateTimeFormat(pattern = "yyyy-dd-MM")
             Date checkout, Pageable pagable) {

              Page<RoomEntity> roomslist=  rs.findallrooms(pagable);

        return roomslist;

    }
//
//    public ResponseEntity<RoomEntity> getRoomById(
//            @PathVariable
//                    Long roomId) {
//
//        RoomEntity roomEntity = rs.getbyid(roomId);
//
//        return new ResponseEntity<>(roomEntity, HttpStatus.OK);
//    }

//    @RequestMapping(value = "/persistPerson", method = RequestMethod.POST)
//    public ResponseEntity <PersonDTO> persistPerson(@RequestBody PersonDTO p) {
//
//        // sh3ala tmam
//        System.out.println("hereeeeee");
//        return new ResponseEntity<PersonDTO>(new PersonDTO(), HttpStatus.OK);
//
//    }









    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ReservationEntity createReservation(
            @RequestBody
                    ReservationRequest reservationRequest,ReservationEntity reservationEntity) {
//

         reservationEntity.setCheckin(reservationRequest.getCheckin());
         reservationEntity.setCheckout(reservationRequest.getCheckout());



        RoomEntity roomEntity = roomrepo.findOne(reservationRequest.getRoomId());
      roomEntity.addReservationEntity(reservationEntity);
       reservationEntity.setRoomEntity(roomEntity);

        reservropo.save(reservationEntity);
       return reservationEntity;
    }



//


    @RequestMapping(path = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ReservationResponse> updateReservation(
            @RequestBody
            ReservationRequest reservationRequest) {

        return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);
    }

    @RequestMapping(path = "/{reservationId}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteReservation(
            @PathVariable
            long reservationId) {

        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
