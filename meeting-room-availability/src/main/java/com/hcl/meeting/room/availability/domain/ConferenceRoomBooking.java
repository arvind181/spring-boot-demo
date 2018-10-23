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
@Table(name = "confrence_room_booking")
public class ConferenceRoomBooking implements Serializable {
	
	private static final Long serialVersionUID= 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "conf_room_booking_generator")
	@SequenceGenerator(name = "conference_room_booking_generator", sequenceName = "conference_room_booking_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "conference_booking_id")
	private Long conferenceBookingId;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "seat_capacity")
	private Long seatCapcity;

	@Column(name = "start_date_time")
	private LocalDateTime startDateTime;

	@Column(name = "end_date_time")
	private LocalDateTime endDateTime;
	
	@Column(name="conference_Room_Id")
	private Long conferenceRoomId;

	public Long getConferenceBookingId() {
		return conferenceBookingId;
	}

	public void setConferenceBookingId(Long conferenceBookingId) {
		this.conferenceBookingId = conferenceBookingId;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
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

	public Long getConferenceRoomId() {
		return conferenceRoomId;
	}

	public void setConferenceRoomId(Long conferenceRoomId) {
		this.conferenceRoomId = conferenceRoomId;
	}

}
