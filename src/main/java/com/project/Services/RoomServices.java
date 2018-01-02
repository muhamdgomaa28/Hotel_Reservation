package com.project.Services;

import com.project.Dao.PageableRoomRepository;
import com.project.Dao.ReservationRepository;
import com.project.Dao.RoomRepository;
import com.project.Models.ReservationEntity;
import com.project.Models.ReservationRequest;
import com.project.Models.RoomEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * Created by muhamd gomaa on 12/25/2017.
 */

@Service
public class RoomServices {
    @Autowired
    ReservationRepository reservropo;
    @Autowired
    RoomRepository roomrepo;


    @Autowired
    RoomRepository rs;

    @Autowired
    PageableRoomRepository pgr;

    public Page<RoomEntity> findallrooms(Pageable p){

        return  pgr.findAll(p);
    }







    public RoomEntity getbyid(int id){

     return   rs.findById(id);

    }




}

