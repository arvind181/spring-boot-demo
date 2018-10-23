package com.hcl.meeting.room.availability.exception;

public class MeetingRoomGeneralException extends RuntimeException {
	
	private final String errorCode;
	
	private final String errorMessage;
	
	private final Throwable baseexp;

	public MeetingRoomGeneralException(final String errorCode, final String errorMessage, Throwable cast) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.baseexp =cast;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
}
