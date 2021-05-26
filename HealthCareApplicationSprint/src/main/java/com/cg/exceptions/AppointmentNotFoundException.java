package com.cg.exceptions;

public class AppointmentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -4916479103372132864L;

	/**
	 * 
	 */
	public AppointmentNotFoundException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public AppointmentNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public AppointmentNotFoundException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public AppointmentNotFoundException(Throwable cause) {
		super(cause);
	}

	
}