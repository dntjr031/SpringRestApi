package com.rest.api.advice.exception;

public class CForbiddenWordException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CForbiddenWordException(String msg, Throwable t) {
        super(msg, t);
    }

    public CForbiddenWordException(String msg) {
        super(msg);
    }

    public CForbiddenWordException() {
        super();
    }
}
