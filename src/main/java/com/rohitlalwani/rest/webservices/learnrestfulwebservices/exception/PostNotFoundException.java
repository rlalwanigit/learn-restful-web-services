package com.rohitlalwani.rest.webservices.learnrestfulwebservices.exception;

public class PostNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PostNotFoundException(String messsge) {
		super(messsge);
	}
}