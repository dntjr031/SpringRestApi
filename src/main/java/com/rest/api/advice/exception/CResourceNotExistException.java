package com.rest.api.advice.exception;

public class CResourceNotExistException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CResourceNotExistException(String msg, Throwable t) {
        super(msg, t);
    }

    public CResourceNotExistException(String msg) {
        super(msg);
    }

    public CResourceNotExistException() {
        super();
    }
}
