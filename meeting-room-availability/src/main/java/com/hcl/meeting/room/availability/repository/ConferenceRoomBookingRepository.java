package com.hcl.meeting.room.availability.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.meeting.room.availability.domain.ConferenceRoom;
import com.hcl.meeting.room.availability.domain.ConferenceRoomBooking;
@Repository
public interface ConferenceRoomBookingRepository extends JpaRepository<ConferenceRoomBooking, Long>{
	
	@Query("select * from ConferenceRoomBooking where startDateTime=: startDateTime AND endDateTime=:startDateTime AND status=0" )
	List<ConferenceRoomBooking>  findByconferenceRoomId(LocalDateTime startDateTime, LocalDateTime endDateTime);

}
