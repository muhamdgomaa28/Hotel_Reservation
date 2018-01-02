//package com.project.converter;
//
//
//import com.project.Models.ReservationEntity;
//import com.project.Models.ReservationResponse;
//import org.springframework.core.convert.converter.Converter;
//
//public class ReservationEntityToReservationResponseConverter implements Converter<ReservationEntity, ReservationResponse> {
//
//    @Override
//    public ReservationResponse convert(ReservationEntity source) {
//
//        ReservationResponse reservationResponse = new ReservationResponse();
//        reservationResponse.setCheckin(source.getCheckin());
//        reservationResponse.setCheckout(source.getCheckout());
//
//        if (null != source.getRoomEntity())
//            reservationResponse.setId(source.getRoomEntity().getId());
//
//        return reservationResponse;
//    }
//}