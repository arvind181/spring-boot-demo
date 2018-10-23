package com.hcl.meeting.room.availability.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.meeting.room.availability.exception.MeetingRoomException;
import com.hcl.meeting.room.availability.exception.MeetingRoomGeneralException;
import com.hcl.meeting.room.availability.model.ConferenceRoomBookingDto;
import com.hcl.meeting.room.availability.model.ConferenceRoomRequestDto;
import com.hcl.meeting.room.availability.service.ConferenceRoomBookingService;

@RestController("conferenceRoomBookingController")
public class ConferenceRoomBookingController {
	
	@Autowired
	private ConferenceRoomBookingService conferenceRoomBookingService;
	
	@RequestMapping(value="/hcl/booked/conference/rooms", method =RequestMethod.GET, produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ConferenceRoomBookingDto>> findAllAvailabeConferenceRoom(@RequestBody ConferenceRoomRequestDto conferenceRoomRequestDto){
		
		List<ConferenceRoomBookingDto> ConferenceRoomBookingDtoList =null;
		try {
			ConferenceRoomBookingDtoList = conferenceRoomBookingService.findAllAvailabeConferenceRoom(conferenceRoomRequestDto);
			
		}catch(MeetingRoomGeneralException meetingRoomBaseException){
			
			throw new MeetingRoomException(meetingRoomBaseException.getErrorCode(), meetingRoomBaseException.getErrorMessage(), HttpStatus.INTERNAL_SERVER_ERROR );
		}
		
		return new ResponseEntity<List<ConferenceRoomBookingDto>>(ConferenceRoomBookingDtoList, HttpStatus.OK);
	}
}
