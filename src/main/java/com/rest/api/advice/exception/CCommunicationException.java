package com.rest.api.advice.exception;

public class CCommunicationException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CCommunicationException(String msg, Throwable t) {
        super(msg, t);
    }

    public CCommunicationException(String msg) {
        super(msg);
    }

    public CCommunicationException() {
        super();
    }
}
