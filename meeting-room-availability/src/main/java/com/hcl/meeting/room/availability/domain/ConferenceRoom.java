package com.hcl.meeting.room.availability.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "confrence_room")
public class ConferenceRoom implements Serializable {
	
	private static final Long serialVersionUID= 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "conference_room_generator")
	@SequenceGenerator(name = "conference_room_generator", sequenceName = "conference_room_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "conference_room_id")
	private Long conferenceRoomId;

	@Column(name = "conference_room_name")
	private String conferenceRoomName;

	public Long getConferenceRoomId() {
		return conferenceRoomId;
	}

	public void setConferenceRoomId(Long conferenceRoomId) {
		this.conferenceRoomId = conferenceRoomId;
	}

	public String getConferenceRoomName() {
		return conferenceRoomName;
	}

	public void setConferenceRoomName(String conferenceRoomName) {
		this.conferenceRoomName = conferenceRoomName;
	}

}
