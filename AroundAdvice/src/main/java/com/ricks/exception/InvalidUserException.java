package com.ricks.exception;

public class InvalidUserException extends RuntimeException {
	public InvalidUserException(String msg) {
		super(msg);
	}
}
