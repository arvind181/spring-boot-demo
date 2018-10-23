package com.hcl.meeting.room.availability.service;

import java.util.List;

import com.hcl.meeting.room.availability.model.ConferenceRoomBookingDto;
import com.hcl.meeting.room.availability.model.ConferenceRoomRequestDto;

public interface ConferenceRoomBookingService {
	
	public List<ConferenceRoomBookingDto> findAllAvailabeConferenceRoom(ConferenceRoomRequestDto  conferenceRoomAvailDto);

}



