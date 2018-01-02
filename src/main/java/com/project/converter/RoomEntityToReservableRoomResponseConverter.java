//package com.project.converter;
//
//import com.project.Models.Links;
//import com.project.Models.ReservableRoomResponse;
//import com.project.Models.RoomEntity;
//import com.project.Models.Self;
//import com.project.RestControllers.ResourceConstants;
//import org.springframework.core.convert.converter.Converter;
//
//
//
//public class RoomEntityToReservableRoomResponseConverter implements Converter<RoomEntity, ReservableRoomResponse<R>>{
//
//	@Override
//	public ReservableRoomResponse<R> convert(RoomEntity source) {
//		// TODO Auto-generated method stub
//
//		ReservableRoomResponse<R> reservationResponse = new ReservableRoomResponse<R>();
//		if(null != source.getId())
//			reservationResponse.setId(source.getId());
//		reservationResponse.setRoomNumber(source.getRoomNumber());
//		reservationResponse.setPrice( Integer.valueOf(source.getPrice()) );
//
//		Links links = new Links();
//		Self self = new Self();
//		self.setRef(ResourceConstants.ROOM_RESERVATION_V1 + "/" + source.getId());
//		links.setSelf(self);
//
//		reservationResponse.setLinks(links);
//
//		return reservationResponse;
//	}
//
//
//
//}
