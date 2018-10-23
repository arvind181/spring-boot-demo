package com.hcl.meeting.room.availability.exception;

import org.springframework.http.HttpStatus;

public class MeetingRoomException extends RuntimeException {
	
	private final String errorCode;
	
	private final String errorMessage;
	
	public MeetingRoomException(final String errorCode, final String errorMessage, HttpStatus httpStatus) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
}
