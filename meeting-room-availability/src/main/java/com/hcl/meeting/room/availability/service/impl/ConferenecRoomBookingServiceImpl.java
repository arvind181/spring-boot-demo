package com.hcl.meeting.room.availability.service.impl;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.dao.DataAccessException;
import org.springframework.format.datetime.DateFormatter;

import com.hcl.meeting.room.availability.exception.MeetingRoomGeneralException;
import com.hcl.meeting.room.availability.model.ConferenceRoomAvailDto;
import com.hcl.meeting.room.availability.model.ConferenceRoomBookingDto;
import com.hcl.meeting.room.availability.model.ConferenceRoomRequestDto;
import com.hcl.meeting.room.availability.repository.ConferenceRoomBookingRepository;
import com.hcl.meeting.room.availability.service.ConferenceRoomBooking;

public class ConferenecRoomBookingServiceImpl implements ConferenceRoomBookingService {

	@Resource
	private ConferenceRoomBookingRepository conferenceRoomBookingRepository;

	@Override
	public List<ConferenceRoomBookingDto> findAllAvailabeConferenceRoom(ConferenceRoomRequestDto conferenceRoomRequestDto){
		
		List<ConferenceRoomBookingDto> ConferenceRoomBookingDtoList =null;
		List<com.hcl.meeting.room.availability.domain.ConferenceRoomBooking>  conferenceRoomBookingList = null;
		
		try {
			
			// here we have to formate date and time from string to LocalDateTime and pass to method
			
			conferenceRoomBookingList =conferenceRoomBookingRepository.findByconferenceRoomId(startDateTime, LocalDateTime endDateTime);
			for(com.hcl.meeting.room.availability.domain.ConferenceRoomBooking conferenceRoomBooking: conferenceRoomBookingList) {
				ConferenceRoomBookingDto conferenceRoomBookingDto =new ConferenceRoomBookingDto();
				conferenceRoomBookingDto.setConferenceBookingId(conferenceRoomBooking.getConferenceBookingId());
				conferenceRoomBookingDto.setConferenceName(conferenceName);// here fetch name from conferenceRoom Repository and set name
				//set all field and return list dto to controller
				ConferenceRoomBookingDtoList.add(conferenceRoomBookingDto);
			}
			
		}catch (DataAccessException dataAccessException) {
		   
			throw new MeetingRoomGeneralException("db1", "DB record not found", dataAccessException);
		}
		return ConferenceRoomBookingDtoList;
	}

}
