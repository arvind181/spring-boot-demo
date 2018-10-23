package com.hcl.meeting.room.availability.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;

public class ConferenceRoomBookingDto implements Serializable {

	private static final Long serialVersionUID = 1L;

	private Long conferenceBookingId;
	
	private Long conferenceRoomId;
	
	private String conferenceName;

	private Long seatCapcity;

	private LocalDateTime startDateTime;

	private LocalDateTime endDateTime;

	public Long getConferenceBookingId() {
		return conferenceBookingId;
	}

	public void setConferenceBookingId(Long conferenceBookingId) {
		this.conferenceBookingId = conferenceBookingId;
	}

	public Long getConferenceRoomId() {
		return conferenceRoomId;
	}

	public void setConferenceRoomId(Long conferenceRoomId) {
		this.conferenceRoomId = conferenceRoomId;
	}

	public String getConferenceName() {
		return conferenceName;
	}

	public void setConferenceName(String conferenceName) {
		this.conferenceName = conferenceName;
	}

	public Long getSeatCapcity() {
		return seatCapcity;
	}

	public void setSeatCapcity(Long seatCapcity) {
		this.seatCapcity = seatCapcity;
	}

	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}

	public LocalDateTime getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}
	
}
