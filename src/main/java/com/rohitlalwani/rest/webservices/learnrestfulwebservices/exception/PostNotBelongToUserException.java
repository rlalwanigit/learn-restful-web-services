package com.rohitlalwani.rest.webservices.learnrestfulwebservices.exception;

public class PostNotBelongToUserException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PostNotBelongToUserException(String messsge) {
		super(messsge);
	}
}