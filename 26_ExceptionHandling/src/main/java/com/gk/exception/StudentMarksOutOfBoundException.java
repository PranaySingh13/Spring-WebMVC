package com.gk.exception;

public class StudentMarksOutOfBoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String exception_Message;

	public StudentMarksOutOfBoundException(String exception_Message) {
		super();
		this.exception_Message = exception_Message;
	}

	public String getException_Message() {
		return exception_Message;
	}

	public void setException_Message(String exception_Message) {
		this.exception_Message = exception_Message;
	}

}
