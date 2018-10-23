package com.hcl.meeting.room.availability.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;

public class ConferenceRoomDto implements Serializable {

	private static final Long serialVersionUID = 1L;

	private Long conferenceId;

	private String conferenceName;

	public Long getConferenceId() {
		return conferenceId;
	}

	public void setConferenceId(Long conferenceId) {
		this.conferenceId = conferenceId;
	}

	public String getConferenceName() {
		return conferenceName;
	}

	public void setConferenceName(String conferenceName) {
		this.conferenceName = conferenceName;
	}

}
