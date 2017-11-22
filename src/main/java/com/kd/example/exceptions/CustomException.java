package com.kd.example.exceptions;

/**
 * This is custom exception class, this can be used to throw exceptions instead
 * java's build in exceptions. If your code is throwing this exception, compiler
 * will force you to handle or throw this exception.
 * 
 * @author kuldeep.s
 *
 */
public class CustomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5128992405344644371L;
	// This is optional parameter
	private int statusCode;

	// This is optional parameter
	private int errorCode;

	public CustomException(int statusCode, int errorCode) {
		super();
		this.statusCode = statusCode;
		this.errorCode = errorCode;
	}

	public CustomException(Throwable th, int statusCode, int errorCode) {
		super(th);
		this.statusCode = statusCode;
		this.errorCode = errorCode;
	}

	public CustomException(String msg, Throwable th, int statusCode, int errorCode) {
		super(msg, th);
		this.statusCode = statusCode;
		this.errorCode = errorCode;
	}

	public CustomException(String msg, int statusCode, int errorCode) {
		super(msg);
		this.statusCode = statusCode;
		this.errorCode = errorCode;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
}
